

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
    
    private Label lblOutput;

    @Override
    public void start(Stage stgMain){
        
        /////////////////////////////////////  MAIN MENU
        
        MenuBar mbMain = new MenuBar();
        
        Menu mnFile = new Menu("File");
        MenuItem miNew = new MenuItem("New");
        MenuItem miOpen = new MenuItem("Open");
        MenuItem miSave = new MenuItem("Save");
        Menu more = new Menu("more");
        MenuItem stuff = new MenuItem("stuff");
        
        more.getItems().addAll(stuff);
        
        mnFile.getItems().addAll(miNew, miOpen, miSave, more);
        
        mbMain.getMenus().addAll(mnFile);
        
        
        
        //////////////////////////////////  TOOLBAR
        Button btnNew = new Button("new");
        //btnNew.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("new.png"))));
        btnNew.setOnAction(bc ->{
            System.out.println(bc);
            sayHi();
        });
        
        Button btnSave = new Button("open");
        btnSave.setOnContextMenuRequested(contextMenuEvent -> {
            System.out.println(contextMenuEvent);
            sayHi();
            System.out.println(contextMenuEvent.getTarget());
        });
        //btnSave.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("open.png"))));
        
        Button btnOpen = new Button("save");
        //btnOpen.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("save.png"))));
        btnOpen.setOnMouseEntered(e -> {
            System.out.println(e);
            sayHi();
        });
        
        
        
        HBox hbxToolbar = new HBox();
        hbxToolbar.getChildren().addAll(btnNew, btnSave, btnOpen);
        
        VBox vbxMainControls = new VBox();
        vbxMainControls.getChildren().addAll(mbMain, hbxToolbar);
        
        //////////////////////////////////  MAIN CONTENT
        
        lblOutput = new Label("");
        
        
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
        bpMain.setCenter(lblOutput);
        bpMain.setBottom(hbxStatus);
        Scene scnMain = new Scene(bpMain, 720, 480);
        
        stgMain.setScene(scnMain);
        stgMain.setTitle("class example: " + file.getName() );
        stgMain.show();
    }
    
    
    
    public void sayHi(){
        if(lblOutput.getText() == ""){
            lblOutput.setText("Hello World");
        }
        else{
            lblOutput.setText("");
        }
    }
    
    
    
    public static void main(String[] args){
        Application.launch(args);
    }
    
    

}