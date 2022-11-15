import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text){
        this.text = text;
    }

    public boolean hasWord(String word){
        String[] words = text.split("\\P{IsAlphabetic}+");
        Set<String> wordsFromText = new HashSet<>();
        for(String wrds: words){
            wordsFromText.add(wrds);
        }
        return wordsFromText.contains(word);
    }
}
