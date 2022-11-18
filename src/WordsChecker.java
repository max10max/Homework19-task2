import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;
    private Set<String> wordsFromText = new HashSet<>();

    public WordsChecker(String text){
        this.text = text;
        String[] words = text.split("\\P{IsAlphabetic}+");
        for(String wrds: words){
            wordsFromText.add(wrds);
        }
    }

    public boolean hasWord(String word){
        return wordsFromText.contains(word);
    }
}
