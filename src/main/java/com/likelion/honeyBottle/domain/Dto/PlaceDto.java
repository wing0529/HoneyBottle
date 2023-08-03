package com.likelion.honeyBottle.domain.Dto;

import java.util.Objects;

public class PlaceDto {
    private Long id;
    private String title;
    private String content;
    private String state;
    private String address;
    private String url;
    private String mapUrl;

    // 기본 생성자
    public PlaceDto() {
    }

    // 필수 필드를 갖는 생성자
    public PlaceDto(Long id, String title, String content, String state, String address, String url, String mapUrl) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.state = state;
        this.address = address;
        this.url = url;
        this.mapUrl = mapUrl;
    }

    // 게터와 세터
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    // toString, equals, hashCode 등의 메서드도 추가할 수 있습니다.
    @Override
    public String toString() {
        return "ActivityDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", url='" + url + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceDto that = (PlaceDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content) &&
                Objects.equals(state, that.state) &&
                Objects.equals(address, that.address) &&
                Objects.equals(url, that.url) &&
                Objects.equals(mapUrl, that.mapUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, state, address, url, mapUrl);
    }
}
