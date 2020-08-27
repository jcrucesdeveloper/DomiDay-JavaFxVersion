package Home.controllers;

import Home.DomiItem;
import Home.HelperClass;
import Home.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    private HelperClass helper  = new HelperClass();



    @FXML
    private Button btnAction;
    @FXML
    private Label lblDayOfWeek;

    @FXML
    private ListView<DomiItem> listViewDomi;

    @FXML
    private ChoiceBox<String> choiceBoxHour;
    @FXML
    private Button btnAddActivity;
    @FXML
    private TextField txtFieldActivity;



    @FXML
    public void handleBtnExit(){
        Platform.exit();
    }
    @FXML


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Put the day in the program when start
        lblDayOfWeek.setText(helper.getDay());
        helper.initializeChoiceBox(choiceBoxHour);
        txtFieldActivity.setFocusTraversable(false);


        ObservableList<DomiItem> domiItems = FXCollections.observableArrayList();
        domiItems.add(new DomiItem("Corerr", 2));
        domiItems.add(new DomiItem("Hacer caca", 4));
        listViewDomi.setItems(domiItems);
        listViewDomi.setCellFactory(param -> new ListCell<DomiItem>(){
            @Override
            protected void updateItem(DomiItem item, boolean empty){
                super.updateItem(item,empty);

                if(empty || item == null){
                    setText(null);
                }else{
                    setText(item.getStrHour() + ": " +item.getStrActivity() );
                }
            }
        });








    }















}
