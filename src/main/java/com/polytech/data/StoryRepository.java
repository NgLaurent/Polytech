package com.polytech.data;

public interface StoryRepository {
    void save (Story story);
    String findAll();
}
