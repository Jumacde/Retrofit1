package com.example.retrofit1;

import com.google.gson.annotations.SerializedName;

public class ResponseData implements RetrofitInterface{

    @SerializedName("body")
    private String body;
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("userId")
    private int userId;

    public ResponseData(String body, int id, String title, int userId) {
        this.body = body;
        this.id = id;
        this.title = title;
        this.userId = userId;
    }

    // getter
    @Override
    public String getBody() {
        return body;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getUserId() {
        return userId;
    }

    // setter
    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
