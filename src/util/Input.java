package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;



    // Constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }




    //Methods
    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String check = this.scanner.nextLine();
        return check.equalsIgnoreCase("yes") || check.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max){
        System.out.println("Give me a number: ");
        int userInput = Integer.parseInt(this.scanner.nextLine());
        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            System.out.println("Out of range");
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Give me a number: ");
        return Integer.parseInt(this.scanner.nextLine());
    }

    public double getDouble(double min, double max){
        System.out.println("Give me a decimal: ");
        double userInput = Double.parseDouble(this.scanner.nextLine());
        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            System.out.println("Out of range");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Give me a decimal: ");
        return Double.parseDouble(this.scanner.nextLine());
    }





}
