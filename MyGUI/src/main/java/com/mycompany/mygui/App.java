

package com.mycompany.mygui;

import java.io.File;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    
    private File file = new File("testFile.sdev");

    @Override
    public void start(Stage stgMain){
        
        /////////////////////////////////////  MAIN MENU
        
        MenuBar mbMain = new MenuBar();
        
        Menu mnFile = new Menu("File");
        MenuItem miNew = new MenuItem("New");
        MenuItem miOpen = new MenuItem("Open");
        MenuItem miSave = new MenuItem("Save");
        
        mnFile.getItems().addAll(miNew, miOpen, miSave);
        
        mbMain.getMenus().addAll(mnFile);
        
        
        
        //////////////////////////////////  TOOLBAR
        Button btnNew = new Button("new");
        //btnNew.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("new.png"))));
        
        Button btnSave = new Button("save");
        //btnSave.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("open.png"))));
        
        Button btnOpen = new Button("open");
        //btnOpen.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("save.png"))));
        
        
        HBox hbxToolbar = new HBox();
        hbxToolbar.getChildren().addAll(btnNew, btnSave, btnOpen);
        
        VBox vbxMainControls = new VBox();
        vbxMainControls.getChildren().addAll(mbMain, hbxToolbar);
        
        //////////////////////////////////  MAIN CONTENT
        
        
        
        ///////////////////////////////////  STATUS
        
        Label lblLeftStatus = new Label("Status: Ready...");
        Label lblMiddleStatus = new Label("Progress: nothing yet");
        Label lblRightStatus = new Label("Configurations: Default");
        
        HBox hbxStatus = new HBox();
        hbxStatus.setPadding(new Insets(12, 4, 4, 12));
        hbxStatus.setSpacing(50);
        hbxStatus.getChildren().addAll(lblLeftStatus, lblMiddleStatus, lblRightStatus);
        
        BorderPane bpMain = new BorderPane();
        bpMain.setTop(vbxMainControls);
        bpMain.setBottom(hbxStatus);
        Scene scnMain = new Scene(bpMain, 720, 480);
        
        stgMain.setScene(scnMain);
        stgMain.setTitle("class example: " + file.getName() );
        stgMain.show();
    }
    
    
    
    public static void main(String[] args){
        Application.launch(args);
    }
    
    

}