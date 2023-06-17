package ru.faang.school.hashmap.task_5.ver1;

public class WebPage {

    private String url;

    private String title;

    private String content;


    public WebPage(String url, String title, String content) {
        this.url = url;
        this.title = title;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }


    public String getContent() {
        return content;
    }

}
