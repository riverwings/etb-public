package com.emptybeer.etb.entities.bbs;

import java.util.Date;
import java.util.Objects;

public class BasicArticleLikeEntity {
    private String userEmail;
    private String boardId;
    private int articleIndex;
    private Date createdOn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicArticleLikeEntity that = (BasicArticleLikeEntity) o;
        return articleIndex == that.articleIndex && Objects.equals(userEmail, that.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEmail, articleIndex);
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public int getArticleIndex() {
        return articleIndex;
    }

    public void setArticleIndex(int articleIndex) {
        this.articleIndex = articleIndex;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
