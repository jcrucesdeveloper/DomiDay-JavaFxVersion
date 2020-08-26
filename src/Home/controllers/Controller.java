package Home.controllers;

import Home.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.application.Platform;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    private GregorianCalendar gcal = new GregorianCalendar();


    @FXML
    private Button btnAction;
    @FXML
    private Label lblDayOfWeek;

    @FXML
    public void handleBtnPrintDate(){
    }
    @FXML
    public void handleBtnExit(){
        Platform.exit();
    }
    @FXML
    public void handleBtnMinimize(){
        Main.minimizeWindow();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String strDate;
        strDate = parseDayOfWeek(gcal.get(Calendar.DAY_OF_WEEK)) + " " + gcal.get(Calendar.DAY_OF_MONTH);
        lblDayOfWeek.setText(strDate);

    }





    public String parseDayOfWeek(int numberDay){
        String dayOfWeekString;
        switch (numberDay){
            case 1: dayOfWeekString = "Sunday"; break;
            case 2: dayOfWeekString = "Monday"; break;
            case 3: dayOfWeekString = "Tuesday"; break;
            case 4: dayOfWeekString = "Wednesday"; break;
            case 5: dayOfWeekString = "Thrusday"; break;
            case 6: dayOfWeekString = "Friday"; break;
            case 7: dayOfWeekString = "Saturday"; break;
            default: dayOfWeekString="Error"; break;
        }
        return dayOfWeekString;
    }






}
