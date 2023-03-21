import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    String text;

    public WordsChecker(String text){
        this.text = text;
    }
    public boolean hasWord(String searchWord){
        String[] words = text.split(" ");
        Set<String> set = new HashSet<>();
        for (String word : words){
            set.add(word);
        }
        boolean search = set.contains(searchWord);
        return search;
    }
}
