package Home;

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
        if (hour < 10){
            return "0" + Integer.toString(hour) + ":00";
        }else{
            return Integer.toString(hour) + ":00";
        }


    }
}
