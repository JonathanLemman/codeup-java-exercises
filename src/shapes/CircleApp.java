package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input userInput = new Input();

        System.out.println("Provide the radius of your circle: ");
        double userRadius = userInput.getDouble();

        Circle userCircle = new Circle(userRadius);

        System.out.println(userCircle.getArea());
        System.out.println(userCircle.getCircumference());

    }
}
