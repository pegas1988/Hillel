package HW2;

public class WriterToConsole implements Writer {
    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
