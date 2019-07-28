package pl.sda.news.articles;

import java.time.LocalDateTime;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticlesController {


    private final ArticleRepository articleRepository;

    public ArticlesController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/articles")
    String list(Model model) {
        model.addAttribute("articles", articleRepository.findAll());

        return "article/list";
    }

    @PostMapping(value = "/articles"
        , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String createArticle(@RequestParam String title,
                         @RequestParam String content) {

        Article article = new Article(title,
            content, LocalDateTime.now());

        articleRepository.save(article);

        return "redirect:/articles";
    }

    @GetMapping("/articles/add")
    String addArticleForm() {

        return "article/form";
    }

    @GetMapping("/articles/{id}")
    String viewArticle(@PathVariable Long id, Model model) {

        model.addAttribute("article", articleRepository.findById(id).orElse(null));
        return "article/details";
    }
}
