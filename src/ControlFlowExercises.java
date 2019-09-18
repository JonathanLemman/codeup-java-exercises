import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
        // Refactor of Above Code
//        for(int i = 5; i <= 15;i++) {
//            System.out.println(i);
//        }


//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);
        // Refactor of Above Code
//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }


//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);
        // Refactor of Above Code
//        for(long i = 2; i <= 1000000;i *= i) {
//            System.out.println(i);
//        }

        // Fizz Buzz
//        for(int i = 1; i <= 100; i++) {
//            if((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            }else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            }else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            }else {
//                System.out.println(i);
//            }
//        }

        System.out.println("What number would you like to go up to?");
        int inputNum = Integer.parseInt(input.nextLine());
        System.out.println("Here is your table!");

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for(int i = 1; i <= inputNum; i++) {
            System.out.println(String.format("%-6d | %-7d | %-6d", i,(int) Math.pow(i, 2),(int) Math.pow(i, 3)));
        }







    }
}
