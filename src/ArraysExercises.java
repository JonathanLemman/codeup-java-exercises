import java.util.Arrays;

public class ArraysExercises {

//    static Person[] people = new Person[3];

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3]; // array of person objects
        people[0] = new Person("Lemon");
        people[1] = new Person("Ryan");
        people[2] = new Person("Matt");

        people = addPerson(people, new Person("izzy"));

        for(Person person : people) {
            System.out.println(person.getName());
        }


    }



    public static Person[] addPerson(Person[] arrayOfPersons,Person person ){
        Person[] newArray = Arrays.copyOf(arrayOfPersons, arrayOfPersons.length + 1);
        newArray[arrayOfPersons.length] = person;
        return newArray;
    }


//    String[] newLangs = Arrays.copyOf(languages, languages.length+1);
//    newLangs[4] = "groovy";
//
//        Arrays.sort(newLangs);
//
//        for (String lang : newLangs){
//        System.out.println("lang = " + lang);
//    }



}
