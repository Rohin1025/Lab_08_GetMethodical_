import javax.net.ssl.SNIServerName;
import java.util.Scanner;

public class

DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Project 1
        /* String name = "";

        name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Your name is " + name);
        */
        // Project 2

        /* int favNum = 0;

        favNum = SafeInput.getInt(in, "Enter your favorite number");

        System.out.println("Your favorite number is " + favNum); */

        // Project 3
        /* int day = 0;
        int month = 0;
        int year = 0;

        year = SafeInput.getRangedInt(in, "Enter the year you were born", 1950, 2010);

        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 30);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 29);
                break;
        }
        System.out.println("Your birthday is " + month + "/" + day + "/" + year); */

        // Project 4

        /*double totalPrice = 0.00;
        double itemPrice = 0.00;

        boolean yesOrNo = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);

            totalPrice = totalPrice + itemPrice;

            yesOrNo = SafeInput.getYNConfirm(in, "Do you have another item?");

        }while(yesOrNo);

        System.out.printf("Your total price is $%1.2f", totalPrice); */

        // Project 5


        SafeInput.prettyHeader(in);



    }
}