import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set<String> set = new HashSet<>();;

    public WordsChecker(String text){
        String[] words = text.split(" ");
        set.addAll(Arrays.asList(words));

    }
    public boolean hasWord(String searchWord){
        boolean search = set.contains(searchWord);
        return search;
    }
}
