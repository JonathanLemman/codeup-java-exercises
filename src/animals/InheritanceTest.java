package animals;

public class InheritanceTest {
    public static void main(String[] args) {

        Animal animalOne = new Animal(7, "feline", true);
        System.out.format("This %s is %s years old!\n", animalOne.getSpecies(), animalOne.getAge());

        Dog dogOne = new Dog(14, "dog", true, "German Shepard", "Hopper");
        System.out.format("This %s is %s years old, he is a %s and his name is %s!", dogOne.getSpecies(), dogOne.getAge(), dogOne.getBreed(), dogOne.getName());


    }
}
