package it.test.eventlog.event.model;

import javax.mvc.RedirectScoped;

import java.io.Serializable;

@RedirectScoped
public class Event implements Serializable {
    private String date;

    private String type;

    private String category;

    private String tags;

    private String text;

    public void setType(String type) {
        this.type = type;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getTags() {
        return tags;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
