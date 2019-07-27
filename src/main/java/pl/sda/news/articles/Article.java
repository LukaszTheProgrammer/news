package pl.sda.news.articles;

import java.time.LocalDateTime;

public class Article {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime publishDate;

    public Article(Long id, String title, String content,
                   LocalDateTime publishDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publishDate = publishDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }
}
