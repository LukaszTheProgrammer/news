package pl.sda.news.views;

public class ViewStatistics {

    private Long id;
    private Long viewCount;
    private Long articleId;

    public ViewStatistics(Long id, Long viewCount, Long articleId) {
        this.id = id;
        this.viewCount = viewCount;
        this.articleId = articleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
}
