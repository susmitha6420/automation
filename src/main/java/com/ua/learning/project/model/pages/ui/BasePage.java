package com.ua.learning.project.model.pages.ui;

public class BasePage {
    private String pageURL ;

    public BasePage(String url){
        pageURL = url;
    }

    public void openWindow(){
        System.out.println(pageURL);
    }
}
