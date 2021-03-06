package com.dstym.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private int id;
    private String username;
    private String title;
    private String textBox;
    private Date date;

    public Post(int id, String username, String title, String textBox, Date date) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.textBox = textBox;
        this.date = date;
    }

    public Post(String username, String title, String textBox) {
        this.username = username;
        this.title = title;
        this.textBox = textBox;
    }

    public Post(int id, String title, String textBox) {
        this.id = id;
        this.title = title;
        this.textBox = textBox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextBox() {
        return textBox;
    }

    public void setTextBox(String textBox) {
        this.textBox = textBox;
    }

    public Date getDate() {
        return date;
    }

    public String getDateAsText() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(date).substring(0, 16);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @java.lang.Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", textBox='" + textBox + '\'' +
                ", date='" + getDateAsText() + '\'' +
                '}';
    }
}
