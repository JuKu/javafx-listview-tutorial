package com.jukusoft.javafx.listview.tutorial.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Justin on 01.09.2017.
 */
public class WindowController implements Initializable {

    @FXML
    protected ListView<Pane> listView;

    /**
    *
    */
    public WindowController () {
        //
    }

    /**
    * initialize window, will be called after loading fxml file
    */
    public void init(Stage stage, Scene scene, Pane pane) {
        //
    }

    /**
    * initialize window, this method isnt used in this example (only Interface Initializable is important for Code Injection --> @FXML annotation)
    */
    public void initialize(URL location, ResourceBundle resources) {
        //
    }

}
