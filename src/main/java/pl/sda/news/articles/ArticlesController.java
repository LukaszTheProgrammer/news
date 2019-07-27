package pl.sda.news.articles;

import static java.time.LocalDateTime.now;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticlesController {

    private final static Map<Long, Article> articleRepo = new HashMap<>();

    static {
        Article a1 = new Article(1L, "Marsz równości", "...", now());
        Article a2 = new Article(2L, "Grafen wciąż nierentowny", "...",
            now().minus(2, ChronoUnit.DAYS));
        articleRepo.put(a1.getId(), a1);
        articleRepo.put(a2.getId(), a2);
    }

    @GetMapping("/articles")
    String list(Model model) {
        model.addAttribute("articles", articleRepo.values());

        return "article/list";
    }

    @PostMapping(value = "/articles"
        , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String createArticle(@RequestParam String title,
                          @RequestParam String content) {
        Long nextId = articleRepo.keySet().stream()
            .max(Long::compareTo)
            .map(maxId -> maxId + 1)
            .orElse(1L);

        Article article = new Article(nextId, title,
            content, LocalDateTime.now());

        articleRepo.put(article.getId(), article);

        return "redirect:/articles";
    }

    @GetMapping("/articles/add")
    String addArticleForm() {

        return "article/form";
    }
}
