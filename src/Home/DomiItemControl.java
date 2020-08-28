package Home;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DomiItemControl extends HBox implements Initializable {
    @FXML private Label lblHour;

    private int numberHour;
    private String activity;

    public DomiItemControl(int numberHour) {
        this.numberHour = numberHour;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "fxml/DomiFx.fxml"));
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
    }
}
