public class MethodsExercises {
    public static void main(String[] args) {
    // *************** Main **************************

        System.out.println(returnAddition(3,5));
        System.out.println(returnSubtraction(5,2));
        System.out.println(returnMultiplication(3,5));
        System.out.println(returnDivision(10,0));
        System.out.println(returnModulus(10,3));

    }

    // **************** Methods ***********************
    public static int returnAddition(int num1, int num2) {
        return num1 + num2;
    }

    public static int returnSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int returnMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int returnDivision(int num1, int num2) {
        return num1 / num2;
    }

    public static int returnModulus(int num1, int num2) {
        return num1 % num2;
    }






}
