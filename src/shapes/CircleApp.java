package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input userInput = new Input();

        System.out.println("Provide the radius of your circle: ");
        Circle userCircle = new Circle(userInput.getDouble());

        System.out.println(userCircle.getArea());
        System.out.println(userCircle.getCircumference());

        System.out.println("Would you like to enter a new radius? Y/N");
        userInput.getString();
        userInput.yesNo();


    }
}
