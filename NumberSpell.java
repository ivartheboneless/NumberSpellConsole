import java.util.*;
import java.io.Console;

public class NumberSpell {
  public static void main(String[] args) {
    //Loading the dictionary
    Dictionary dictionary = new Dictionary();

    //Welcome message + instructions
    System.out.println("Welcome to NumberSpell!");
    System.out.println("Find out what memorable word your number spells.");
    System.out.println("Take advantage of this app to never forget an important number again!\n");

    //prompting users
    Console console = System.console();
    String numberEntered = console.readLine("Enter a number: ");

    //Generating phonewords
    CombinationsGenerator generator = new CombinationsGenerator(numberEntered);
    List<String> phonewords = new ArrayList<>();
    phonewords = generator.getPhonewords();

    //parsing valid phonewords
    List<String> validPhonewords = new ArrayList<>(phonewords);
    for(String w : phonewords) {
      if(!dictionary.getDictionaryWordList().contains(w)) {
        validPhonewords.remove(w);
      }
    }

    //printing all valid phonewords
    for(String word : validPhonewords) {
      System.out.println(word);
    }

  }
}
