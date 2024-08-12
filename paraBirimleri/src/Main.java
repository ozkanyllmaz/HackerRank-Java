import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.*;
import java.util.Locale;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        Formatter formatter = new Formatter();



        //US
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: "+ nf.format(num));

        //INDIA
        Locale indiaLocale = new Locale("en","INDIA");

        DecimalFormatSymbols customSymbols = new DecimalFormatSymbols(indiaLocale);
        customSymbols.setCurrencySymbol("Rs.");

        DecimalFormat currencyFormatter = (DecimalFormat) NumberFormat.getCurrencyInstance(indiaLocale);
        currencyFormatter.setDecimalFormatSymbols(customSymbols);

        String formattedCurrency = currencyFormatter.format(num);
        System.out.println("India: "+formattedCurrency);

        //CHINA
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: "+nf3.format(num));

        //FRENCH



        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: "+nf4.format(num));








    }


}
