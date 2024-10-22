package org.fangarc.model;

import java.util.List;

public class Story {
    private String url;
    private String title;
    private String author;
    private String summary;
    private Tag fandom;
    private List<Tag> relationship;
    private List<Tag> freeformTags;
    private String language;
    private int chapterCount;

    public Story(String url, String title){
        this.url = url;
        this.title = title;
    }

    public Story(String url, String title, String author, String summary, Tag fandom, List<Tag> relationship, List<Tag> freeformTags, String language, int chapterCount) {
        this.url = url;
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.fandom = fandom;
        this.relationship = relationship;
        this.freeformTags = freeformTags;
        this.language = language;
        this.chapterCount = chapterCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Tag getFandom() {
        return fandom;
    }

    public void setFandom(Tag fandom) {
        this.fandom = fandom;
    }

    public List<Tag> getRelationship() {
        return relationship;
    }

    public void setRelationship(List<Tag> relationship) {
        this.relationship = relationship;
    }

    public List<Tag> getFreeformTags() {
        return freeformTags;
    }

    public void setFreeformTags(List<Tag> freeformTags) {
        this.freeformTags = freeformTags;
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    @Override
    public String toString() {
        return title;
    }
}
