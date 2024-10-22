package org.fangarc.view;

import org.fangarc.model.Story;

import java.util.Scanner;

public class StoryView {
    private final Scanner scanner;

    public StoryView() {
        this.scanner = new Scanner(System.in);
    }

    public String getUserInput(){
        System.out.print("Enter story URL: ");
        return scanner.nextLine();
    }

    public void displayStoryDetails(Story story){
        System.out.println("URL: " + story.getUrl());
        System.out.println("Title: " + story.getTitle());
    }

    public void displayError(String errorMsg){
        System.err.println("Error: " + errorMsg);
    }
}
