package com.polytech;

import com.polytech.business.PublicationService;
import com.polytech.data.InMemoryRepository;
import com.polytech.data.StoryRepository;
import com.polytech.rest.StoryController;

public class Main {
    public static void main(String[] args) {
        StoryRepository storyRepository = new InMemoryRepository();
        PublicationService publicationService = new PublicationService(storyRepository);
        StoryController storyControl = new StoryController(publicationService);

        storyControl.share("chris");
        storyControl.share("paf");
        storyControl.share("valere");

        storyControl.displayAll();
    }
}
