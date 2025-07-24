package com.example.retrofit1;

public interface RetrofitInterface {
    // getter
    String getBody();
    int getId();
    String getTitle();
    int getUserId();

    // setter
    void setBody(String body);
    void setId(int id);
    void setTitle(String title);
    void setUserId(int userId);
}
