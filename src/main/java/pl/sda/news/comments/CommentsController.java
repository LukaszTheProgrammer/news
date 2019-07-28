package pl.sda.news.comments;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommentsController {

    private final CommentsRepository commentsRepository;

    public CommentsController(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }

    @GetMapping("/comments/{articleId}")
    String listComments(@PathVariable Long articleId,  Model model) {

        model.addAttribute("comments", commentsRepository.findByArticleId(articleId));

        return "/comments/list";
    }

    @PostMapping("/comments/{articleId}")
    String addComment(@PathVariable Long articleId,
                      @RequestParam String autor,
                      @RequestParam String content,
                      Model model) {
        Comment comment = new Comment(autor, content, LocalDateTime.now(), articleId);
        commentsRepository.save(comment);


        return "redirect:/articles/"+articleId;
    }
}
