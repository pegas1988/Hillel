package HW2;

public class SentenceWthoutWord implements StringWorker {

    @Override
    public int execute(String sentence, String word) {
        String tempString = sentence;
        while (tempString.contains(word)) {
            tempString = tempString.replaceAll(word, "");
        }
        return tempString.length();
    }
}
