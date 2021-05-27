package HW2;

public class IndexOfTheWord implements StringWorker {
    @Override
    public int execute(String sentence, String word) {
        return sentence.indexOf(word);
    }
}
