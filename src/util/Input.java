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
        return 0;
    }


    public static void main(String[] args){
        Input userInput = new Input();
        System.out.println(userInput.getString());
        System.out.println("type yes or no");
        System.out.println(userInput.yesNo());
        System.out.println(userInput.getInt(1, 10));
        System.out.println(userInput.getInt());
        System.out.println(userInput.getDouble(1, 10));

    }


}
