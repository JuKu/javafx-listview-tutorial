package com.jukusoft.javafx.listview.tutorial.controller;

import com.jukusoft.javafx.listview.tutorial.model.ListEntry;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Justin on 01.09.2017.
 */
public class WindowController implements Initializable {

    protected List<ListEntry> list = null;

    /**
    * default constructor
     *
     * @param list list with entries of ListView
    */
    public WindowController (List<ListEntry> list) {
        this.list = list;
    }

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
