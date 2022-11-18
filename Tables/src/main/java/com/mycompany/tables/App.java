package com.mycompany.tables;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;





public class App extends Application {

    private Pane pnMain;
    private TableView<Person> tblPeople = new TableView<>();
    
    private TextField txtName = new TextField();
    private TextField txtAge = new TextField();
    private TextField txtTown = new TextField();
    
    private Button btnAdd = new Button("Add");
    private Button btnRemove = new Button("Remove");
    
    
    
    @Override
    public void start(Stage stgMain) {
        pnMain = new Pane();

        TableColumn<Person, String> clmName = new TableColumn<>("NAME");
        clmName.setMinWidth(200);
        clmName.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumn<Person, Integer> clmAge = new TableColumn<>("AGE");
        clmAge.setMinWidth(100);
        clmAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        
        TableColumn<Person, String> clmTown = new TableColumn<>("TOWN");
        clmTown.setMinWidth(200);
        clmTown.setCellValueFactory(new PropertyValueFactory<>("town"));
        
        
        tblPeople.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tblPeople.setItems(getPeople());
        tblPeople.getColumns().addAll(clmName, clmAge, clmTown);
        
        
        btnAdd.setOnAction(a -> {
            addPerson();
        });
        btnRemove.setOnAction(r -> {
            removePerson();
        });
        HBox hbxButtons = new HBox(btnAdd, btnRemove);
        txtName.setPromptText("Name");
        txtAge.setPromptText("Age");
        txtTown.setPromptText("Town");
        VBox vbxInputs = new VBox(txtName, txtAge, txtTown, hbxButtons);
        
        HBox hbxEverything = new HBox(tblPeople, vbxInputs);
        pnMain.getChildren().addAll(hbxEverything);
        Scene scnMain = new Scene(pnMain, 777, 444);
        stgMain.setScene(scnMain);
        stgMain.show();
    }
    
    
    public void addPerson(){
        Person p = new Person();
        p.setName(txtName.getText());
        p.setAge(Integer.parseInt(txtAge.getText()));
        p.setTown(txtTown.getText());
        
        tblPeople.getItems().addAll(p);
    }
    
    
    public void removePerson(){
        ObservableList<Person> allPeople = tblPeople.getItems();
        ObservableList<Person> selectedPeople = tblPeople.getSelectionModel().getSelectedItems();
        selectedPeople.forEach(s -> {
            allPeople.remove(s);
        });
    }
     
    public ObservableList<Person> getPeople(){
        ObservableList<Person> folks = FXCollections.observableArrayList();
        folks.add(new Person("Sally", 32, "Salem"));
        folks.add(new Person("Lonnie", 58, "Lanesville"));
        folks.add(new Person("Alan", 14, "New Albany"));
        folks.add(new Person("Shelly", 31, "Sellersburg"));
        
        return folks;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}