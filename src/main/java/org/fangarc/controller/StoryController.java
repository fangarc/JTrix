package org.fangarc.controller;

import org.fangarc.model.Story;
import org.fangarc.service.Scraper;
import org.fangarc.view.StoryView;

import java.io.IOException;

public class StoryController {
    private final StoryView view;
    private final Scraper scraperService;

    public StoryController(StoryView view, Scraper scraperService) {
        this.view = view;
        this.scraperService = scraperService;
    }

    public void run(){
        String url = view.getUserInput();
        try {
            Story story = scraperService.fetchStoryDetail(url);
            view.displayStoryDetails(story);
        } catch (IOException e) {
            view.displayError(e.getMessage());
        }
    }
}
