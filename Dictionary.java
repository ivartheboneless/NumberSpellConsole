import java.util.*;
import java.io.*;

class Dictionary {
  private Set<String> mDictionaryWords;

  public Dictionary(){
    try {
      Scanner scanner = new Scanner(new File("wordList.txt"));
      mDictionaryWords = new HashSet<>();
      mDictionaryWords.clear();
      while (scanner.hasNext()){
          mDictionaryWords.add(scanner.next());
      }
      scanner.close();
    } catch(FileNotFoundException ex) {
      System.out.println("File not found.");
      System.exit(0);
    }
  }

  public Set<String> getDictionaryWordList(){
    return mDictionaryWords;
  }
}
