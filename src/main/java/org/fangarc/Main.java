package org.fangarc;

import org.fangarc.controller.StoryController;
import org.fangarc.service.Scraper;
import org.fangarc.view.StoryView;

public class Main {
    public static void main(String[] args) {
        StoryView view = new StoryView();
        Scraper service = new Scraper();
        StoryController controller = new StoryController(view, service);

        controller.run();
    }
}