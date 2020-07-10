package sap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SortingDates {

    public List<String> sortDates(List<String> dates) {
        ArrayList<Date> actualDate = stringToDate(dates);
        sortDates(actualDate);
        return dateToString(actualDate);
    }

    private ArrayList<Date> stringToDate(List<String> dates) {
        ArrayList<Date> actualDate = new ArrayList<>();
        for (String currentDate : dates) {
            Date date = null;
            try {
                date = new SimpleDateFormat("dd MMM yyyy").parse(currentDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            actualDate.add(date);
        }
        return actualDate;
    }

    private ArrayList<String> dateToString(ArrayList<Date> actualDate) {
        ArrayList<String> returnDate = new ArrayList<>();
        for (Date date : actualDate) {
            returnDate.add(new SimpleDateFormat("dd MMM yyyy").format(date));
        }
        return returnDate;
    }

    private void sortDates(ArrayList<Date> actualDate) {
        actualDate.sort((date, t1) -> {
            if (date.before(t1)) {
                return -1;
            } else if (date.after(t1)) {
                return 1;
            } else {
                return 0;
            }
        });
    }

}
