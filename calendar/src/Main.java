import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

class Result {
    public static void findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,month-1);
        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.YEAR,year);

        Date date = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("EEEEEEEE");
        String Day = dateFormat.format(date);

        System.out.println(Day.toUpperCase());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        String[] dateArray = date.split(" ");

        int month = Integer.parseInt(dateArray[0]);
        int day = Integer.parseInt(dateArray[1]);
        int year = Integer.parseInt(dateArray[2]);

        Result.findDay(month, day, year);


    }
}