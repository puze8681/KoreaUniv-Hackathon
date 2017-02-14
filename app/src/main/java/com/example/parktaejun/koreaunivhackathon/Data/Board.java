package com.example.parktaejun.koreaunivhackathon.Data;

/**
 * Created by parktaejun on 2017. 2. 14..
 */

public class Board {
    public String postName;
    public String postTitle;
    public String postContext;
    public String postImage;

    public Board(String postName, String postTitle, String postContext, String postImage){
        this.postName = postName;
        this.postTitle = postTitle;
        this.postContext = postContext;
        this.postImage = postImage;
    }
}
