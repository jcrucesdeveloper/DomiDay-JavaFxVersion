package Home;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DomiItem {
    private StringProperty strActivity = new SimpleStringProperty(this,"strActivity","");
    private IntegerProperty numberHour = new SimpleIntegerProperty(this,"numberHour",-1 );

    private DomiItem() {}
    public DomiItem(String strActivity, Integer numberHour){
        this.strActivity.setValue(strActivity);
        this.numberHour.setValue(numberHour);
    }

    public String getStrHour(){
        return HelperClass.parseHour(numberHour.getValue());
    }

    public String getStrActivity() {
        return strActivity.get();
    }

    public StringProperty strActivityProperty() {
        return strActivity;
    }

    public void setStrActivity(String strActivity) {
        this.strActivity.set(strActivity);
    }

    public int getNumberHour() {
        return numberHour.get();
    }

    public IntegerProperty numberHourProperty() {
        return numberHour;
    }

    public void setNumberHour(int numberHour) {
        this.numberHour.set(numberHour);
    }
}
