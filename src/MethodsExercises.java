import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

    // *************** Main **************************

//        System.out.println(returnAddition(3,5));
//        System.out.println(returnSubtraction(5,2));
//        System.out.println(returnMultiplication(3,5));
//        System.out.println(returnDivision(10,2));
//        System.out.println(returnModulus(10,3));
//        getInt(1, 10);
        System.out.println("Please enter a number between 1 and 10: ");
        System.out.println(factorial());


    }

    // **************** Methods ***********************
//    public static double returnAddition(double num1, double num2) {
//        return num1 + num2;
//    }
//
//    public static double returnSubtraction(double num1, double num2) {
//        return num1 - num2;
//    }

    // Basic Multi with *
//    public static double returnMultiplication(double num1, double num2) {
//        return num1 * num2;
//    }
    // Multi with Loop
//    public static double returnMultiplication(double num1, double num2) {
//        double total = 0;
//        for(double i = 0; i < num1; i++) {
//            total += num2;
//        }
//        return total;
//    }
    // Multi with Recursion
//    public static double returnMultiplication(double num1, double num2) {
//        if((num1 == 0) || (num2 == 0)) {
//            return 0;
//        }
//        return (num1 + returnMultiplication(num1, num2 - 1));
//    }
//
//    public static double returnDivision(double num1, double num2) {
//        return num1 / num2;
//    }
//
//    public static double returnModulus(double num1, double num2) {
//        return num1 % num2;
//    }


//    public static int getInteger(int min, int max) {
//        // Scanner
//        Scanner input = new Scanner(System.in);
//        // Ask Question
//        System.out.print("Enter a number between 1 and 10: ");
//        // Checks if the input is a Integer
//        if(input.hasNextInt()){
//            // If its a Integer Store input in variable
//            int userinput = input.nextInt();
//            // Checks if users input is between 1 and 10
//            if(userinput >= 1 && userinput <= 10){
//                System.out.print("Yes you did it!");
//            } else {
//                return getInteger(min,max);
//            }
//        } else {
//            return getInteger(min, max);
//        }
//        return 0;
//    };

//    public static int getInt(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) {
//            int usernum = sc.nextInt();
//            if(usernum >= min && usernum <= max) {
//                return usernum;
//            } else {
//                System.out.println("invalid range!");
//                return getInt(min,max);
//            }
//        } else {
//            System.out.println("Invalid Input!");
//            return getInt(min,max);
//        }
//    }

    public static int factorial() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 1;
        for(int i = 1; i <= input; i++) {
            count *= i;
        }
        return count;
    }







}
