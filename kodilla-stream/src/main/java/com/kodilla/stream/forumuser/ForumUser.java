package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int forumUserId;
    private final String forumUserName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsQuantity;

    public ForumUser(final int forumUserId, final String forumUserName, final char sex, final LocalDate dateOfBirth, final int postsQuantity) {
        this.forumUserId = forumUserId;
        this.forumUserName = forumUserName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsQuantity = postsQuantity;
    }

    public int getForumUserId() {
        return forumUserId;
    }

    public String getForumUserName() {
        return forumUserName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "forumUserId=" + forumUserId +
                ", forumUserName='" + forumUserName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
