package com.jukusoft.javafx.listview.tutorial.controller;

import com.jukusoft.javafx.listview.tutorial.model.ListEntry;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Justin on 01.09.2017.
 */
public class RowController implements Initializable {

    @FXML
    protected Label titleLabel;

    @FXML
    protected ImageView imageView;

    /**
     * initialize window, will be called after loading fxml file
     */
    public void init(ListEntry entry) {
        // load the image
        Image image = new Image(entry.getImagePath());

        //set title and image (icon)
        this.titleLabel.setText(entry.getTitle());
        this.imageView.setImage(image);
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

}
