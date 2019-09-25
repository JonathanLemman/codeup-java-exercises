package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input userInput = new Input();

        Circle userCircle = new Circle(userInput.getDouble("Provide the radius of your circle: "));


        System.out.println(userCircle.getArea());
        System.out.println(userCircle.getCircumference());

        System.out.println("Would you like to enter a new radius? Y/N");

        userInput.yesNo();





    }
}
