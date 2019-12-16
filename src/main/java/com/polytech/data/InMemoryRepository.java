package com.polytech.data;

import java.util.ArrayList;

public class InMemoryRepository implements StoryRepository {

    private ArrayList<Story> memList;

    public InMemoryRepository(){
        this.memList = new ArrayList<Story>();
    }

    public void save(Story story) {
        this.memList.add(story);
    }

    public String findAll(){
        return this.memList.toString();
    }
}
