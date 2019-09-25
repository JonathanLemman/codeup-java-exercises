
public class Person {

    private String name;


    //************** Constructor *********
    public Person(String name) {
        setName(name);
//        this.name = name;
    }



    //************* Methods *************
    // returns the person's name
    public String getName(){
        return this.name;
    }
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.format("Hello, %s!", this.getName());
    }




    public static void main(String[] args){

//        Person lemon = new Person("Lemon");
//        System.out.println(lemon.getName());
//        lemon.setName("Jonathan");
//        lemon.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // True *** True
//        System.out.println(person1 == person2);// True *** False

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }


}
