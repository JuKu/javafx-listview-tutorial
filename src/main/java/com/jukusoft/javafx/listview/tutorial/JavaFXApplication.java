package com.jukusoft.javafx.listview.tutorial;

import com.jukusoft.javafx.listview.tutorial.controller.WindowController;
import com.jukusoft.javafx.listview.tutorial.model.ListEntry;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Justin on 01.09.2017.
 */
public class JavaFXApplication extends Application {

    //path to window fxml file
    protected static final String FXML_PATH = "./data/fxml/window.fxml";

    //JavaFX stage (window)
    protected Stage stage = null;

    //JavaFX scene
    protected Scene scene = null;

    //JavaFX root pane (AnchorPane)
    protected Pane rootPane = null;

    //JavaFX window controller (MVC principle)
    protected WindowController controller = null;

    //list with all list entries
    protected List<ListEntry> entryList = new ArrayList<>();

    public void start(Stage primaryStage) throws Exception {
        //create new stage (window)
        this.stage = new Stage();

        //set title, width and height
        this.stage.setTitle("JavaFX Custom ListView");
        this.stage.setWidth(600);
        this.stage.setHeight(440);

        //create some list entries
        entryList.add(new ListEntry("Title 1", "file:data/icon/questions.png"));
        entryList.add(new ListEntry("Title 2", "file:data/icon/questions.png"));
        entryList.add(new ListEntry("Title 3", "file:data/icon/questions.png"));
        entryList.add(new ListEntry("Title 4", "file:data/icon/questions.png"));

        // load fxml file
        try {
            FXMLLoader loader = new FXMLLoader(new File(FXML_PATH).toURI().toURL());

            //create and set controller
            this.controller = new WindowController(this.entryList);
            loader.setController(this.controller);

            //load and get root pane (AnchorPane)
            this.rootPane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        //create new scene with root Pane (AnchorPane)
        this.scene = new Scene(this.rootPane);

        //set scene to stage (window)
        stage.setScene(scene);

        //initialize controller
        controller.init(stage, scene, rootPane);

        //set window position to center and focus window
        this.stage.centerOnScreen();
        this.stage.requestFocus();

        //set window visible
        stage.show();
    }

}
