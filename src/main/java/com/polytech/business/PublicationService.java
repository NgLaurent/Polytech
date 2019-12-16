package com.polytech.business;

import com.polytech.data.Story;
import com.polytech.data.StoryRepository;

public class PublicationService {
    private StoryRepository storyRepository;


    public PublicationService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public void save(Story newstory){
        this.storyRepository.save(newstory);
    }

    public String fetchAll(){
        return this.storyRepository.findAll();
    }
}
