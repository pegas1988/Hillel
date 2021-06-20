package HW7;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class MainClassHW7TaskOne {
    public static void main(String[] args) throws MalformedURLException {
        ArrayList<String> stringsArray = new ArrayList<>();
        ArrayList<Integer> integersArray = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : SortedMap.sortByValue(UrlScanner.readFromFile()).entrySet())
            stringsArray.add(entry.getKey());
        for (Map.Entry<String, Integer> entry : SortedMap.sortByValue(UrlScanner.readFromFile()).entrySet())
            integersArray.add(entry.getValue());

        int counter = 1;
        for (int e = stringsArray.size() - 1; e > (stringsArray.size() - 11); e--) {
            System.out.println(counter + " place is " + stringsArray.get(e) + " with total usages - " + integersArray.get(e));
            counter++;
        }
    }
}
