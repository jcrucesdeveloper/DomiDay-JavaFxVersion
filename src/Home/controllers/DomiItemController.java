package Home.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Home.HelperClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DomiItemController extends HBox implements Initializable {
    @FXML
    private Label lblHour;
    @FXML
    private VBox vBoxDomiContainer;



    private int numberHour;
    private String color;
    private String activity;

    public DomiItemController(int numberHour,String color) {
        this.numberHour = numberHour;
        this.color = color;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "../fxml/DomiFx.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);


        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }



    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblHour.setText(HelperClass.parseHour(numberHour));
        lblHour.setStyle("-fx-background-color: " + color);
    }

    public VBox getvBoxDomiContainer() { return vBoxDomiContainer;}


}
