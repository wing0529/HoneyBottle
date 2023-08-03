package com.likelion.honeyBottle.domain;

import jakarta.persistence.*;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;

    @Column
    private String content;
    @Column
    private String state;
    @Column
    private String address;
    @Column(name = "url", length = 2000)
    private String url;
    @Column
    private String mapUrl;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getState() {
        return state;
    }

    public String getAddress() {
        return address;
    }

    public String getUrl() {
        return url;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    // Constructors, Getters, Setters, etc.
}
