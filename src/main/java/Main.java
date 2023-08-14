import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Build a scanner



        //Added individual input methods

        //Prompt and store double amount
        double amount = dataAmountInput();
        //Prompt and store String unit
        String unit = unitInput();
        //Prompt and store download speed (in megabits
        double speed = speedInput();
        //Build a Data object with these three values
        Data data = new Data (amount, unit, speed);


        //Print out the data Object with your toString();
        System.out.println(data);
    }

    // download speed input method
    public static double speedInput() {
        System.out.println(" Enter your download speed (in megabits) : ");
        return scanner.nextDouble();
    }


    // unit type input method
    public static String unitInput() {
        System.out.println("Enter the Unit (bytes, kilobytes, megabytes, gigabytes): ");
        return scanner.next();
    }


    // data amount input method
    public static double dataAmountInput() {
        System.out.println("Enter the amount of data: ");
        return scanner.nextDouble();
    }
}
