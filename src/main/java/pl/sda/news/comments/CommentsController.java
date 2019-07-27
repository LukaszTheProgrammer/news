package pl.sda.news.comments;

import static java.time.LocalDateTime.now;
import static java.time.temporal.ChronoUnit.DAYS;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentsController {

    @GetMapping("/comments")
    List<Comment> listComments() {
        Comment c1 = new Comment(1L, "Jim Beam", "Super Fajnie",
            now(), 1L);

        Comment c2 = new Comment(1L, "John Doe",
            "Nie kumam",
            now().minus(4, DAYS), 1L);

        Comment c3 = new Comment(1L, "Bill Kill", "Yaiks",
            now().minus(2, DAYS), 2L);

        return Arrays.asList(c1, c2, c3);
    }
}
