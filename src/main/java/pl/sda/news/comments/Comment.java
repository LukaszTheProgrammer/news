package pl.sda.news.comments;

import java.time.LocalDateTime;

public class Comment {

    private Long id;
    private String autor;
    private String content;
    private LocalDateTime creationDate;
    private Long articleId;

    public Comment(Long id, String autor, String content, LocalDateTime creationDate, Long articleId) {
        this.id = id;
        this.autor = autor;
        this.content = content;
        this.creationDate = creationDate;
        this.articleId = articleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
}
