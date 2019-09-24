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
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String check = scanner.nextLine();
        return check.equalsIgnoreCase("yes") || check.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max){
        int userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            return getInt(min, max);
        }
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        int userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return scanner.nextDouble();
    }





}
