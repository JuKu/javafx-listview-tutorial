package com.jukusoft.javafx.listview.tutorial.model;

/**
 * Created by Justin on 01.09.2017.
 */
public class ListEntry {

    protected String title = "";
    protected String imagePath = "";

    /**
    * default constructor
     *
     * @param title title of list entry
     * @param imagePath path to icon of list entry
    */
    public ListEntry (String title, String imagePath) {
        this.title = title;
        this.imagePath = imagePath;
    }

    /**
    * return title of list entry
     *
     * @return title of list entry
    */
    public String getTitle () {
        return this.title;
    }

    /**
    * return path to icon image of list entry
     *
     * @return path to icon image of list entry
    */
    public String getImagePath () {
        return this.imagePath;
    }

}
