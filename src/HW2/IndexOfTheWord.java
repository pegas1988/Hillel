package HW2;

public class IndexOfTheWord implements StringWorker {
    @Override
    public int execute(String sentence, String word) {
        int indexOfFirstMeeting;
        indexOfFirstMeeting = sentence.indexOf(word);
        return indexOfFirstMeeting;
    }
}
