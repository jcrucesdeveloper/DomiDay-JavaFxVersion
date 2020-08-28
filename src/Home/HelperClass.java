package Home;

import javafx.scene.control.ChoiceBox;

import java.util.Calendar;
import java.util.GregorianCalendar;

public  class HelperClass {

    private GregorianCalendar gcal = new GregorianCalendar();

    public String getDay(){
        return parseDayOfWeek(gcal.get(Calendar.DAY_OF_WEEK)) + " " + gcal.get(Calendar.DAY_OF_MONTH) + " " + parseMonth(gcal.get(Calendar.MONTH));
    }


    public static String parseDayOfWeek(int numberDay){
        String dayOfWeekString;
        switch (numberDay){
            case 1: dayOfWeekString = "Sunday"; break;
            case 2: dayOfWeekString = "Monday"; break;
            case 3: dayOfWeekString = "Tuesday"; break;
            case 4: dayOfWeekString = "Wednesday"; break;
            case 5: dayOfWeekString = "Thursday"; break;
            case 6: dayOfWeekString = "Friday"; break;
            case 7: dayOfWeekString = "Saturday"; break;
            default: throw new IllegalStateException("Unexpected value " + numberDay);
        }
        return dayOfWeekString;
    }

    public static String parseMonth(int numberMonth){
        String strMonth;
        switch (numberMonth){
            case 0: strMonth = "January"; break;
            case 1: strMonth = "February"; break;
            case 2: strMonth = "March"; break;
            case 3: strMonth = "April"; break;
            case 4: strMonth = "May"; break;
            case 5: strMonth = "June"; break;
            case 6: strMonth = "July"; break;
            case 7: strMonth = "August"; break;
            case 8: strMonth = "September"; break;
            case 9: strMonth = "October"; break;
            case 10: strMonth = "November"; break;
            case 11: strMonth = "December"; break;
            default:
                throw new IllegalStateException("Unexpected value: " + numberMonth);
        }
        return strMonth;
    }

    public static String parseHour(int hour){
        String strHour = "";
        if (hour < 10) strHour+= "0";
        strHour+= Integer.toString(hour) + ": 00";
        if (hour > 12) strHour+= " PM";
        else strHour+= " AM";

        return strHour;

    }

    public void initializeChoiceBox(ChoiceBox<String> choiceBoxHour){
        choiceBoxHour.setValue("01:00 AM");
        choiceBoxHour.getItems().addAll("01:00 AM",
                "01:00 AM",
                "02:00 AM",
                "03:00 AM",
                "04:00 AM",
                "05:00 AM",
                "06:00 AM",
                "07:00 AM",
                "08:00 AM",
                "09:00 AM",
                "10:00 AM",
                "11:00 AM",
                "12:00 PM",
                "13:00 PM",
                "14:00 PM",
                "15:00 PM",
                "16:00 PM",
                "17:00 PM",
                "18:00 PM",
                "19:00 PM",
                "20:00 PM",
                "22:00 PM",
                "23:00 PM",
                "24:00 PM");

    }
}
