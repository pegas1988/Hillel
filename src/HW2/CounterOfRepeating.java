package HW2;

public class CounterOfRepeating implements StringWorker {
    @Override
    public int execute(String sentence, String word) {
        int count = 0;
        String tempString = sentence;
        while (tempString.contains(word)) {
            tempString = tempString.replaceFirst(word, "");
            count++;
        }
        return count;
    }


}
