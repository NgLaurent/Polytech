package com.polytech.data;

public class Story {
    private String content;

    public Story(String content){
        this.content = content;
    }

    @Override
    public String toString() {
        return this.content.toString();
    }
}
