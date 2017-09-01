package com.jukusoft.javafx.listview.tutorial.controller;

import com.jukusoft.javafx.listview.tutorial.model.ListEntry;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Justin on 01.09.2017.
 */
public class WindowController implements Initializable {

    protected static final String ROW1_FXML = "./data/fxml/row1.fxml";
    protected static final String ROW2_FXML = "./data/fxml/row2.fxml";

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
    * initialize window, will be called after loading fxml file
    */
    public void init(Stage stage, Scene scene, Pane pane) {
        int counter = 0;

        //create rows
        for (ListEntry entry : this.list) {
            addRow(entry, (counter % 2 == 0 ? ROW2_FXML : ROW1_FXML));

            //increment counter
            counter++;
        }
    }

    protected void addRow (ListEntry entry, String fxmlPath) {
        // load fxml
        try {
            FXMLLoader loader = new FXMLLoader(new File(fxmlPath).toURI().toURL());

            //set controller
            RowController rowController = new RowController();
            loader.setController(rowController);

            Pane rootPane = loader.load();//FXMLLoader.load(new File(fxmlPath).toURI().toURL());

            //initialize tab controller
            rowController.init(entry);

            this.listView.getItems().add(rootPane);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
    * initialize window, this method isnt used in this example (only Interface Initializable is important for Code Injection --> @FXML annotation)
    */
    public void initialize(URL location, ResourceBundle resources) {
        //
    }

}
