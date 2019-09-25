public class ServerNameGenerator {

   static String[] adj = {"good", "new", "first", "last", "long", "great", "little", "own", "other", "old"};
   static String[] nouns = {"time", "person", "year", "way", "day", "thing", "man", "world", "life", "hand"};

    public static void main(String[] args) {

        System.out.println("Here is your server name:\n" + randomWord(adj) + "-" + randomWord(nouns));


    }

    public static String randomWord(String[] arrOfStrings) {
        return arrOfStrings[(int)(Math.random() * arrOfStrings.length)];
    }
}
