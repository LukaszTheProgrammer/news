package pl.sda.news.views;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewStatisticsController {

    @GetMapping("/viewStatistics")
    public List<ViewStatistics> viewStatistics() {
        return Arrays.asList(
            new ViewStatistics(1L, 5L, 1L),
            new ViewStatistics(2L, 3L, 2L)
        );
    }

}
