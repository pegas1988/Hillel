package HW7;

import java.util.ArrayList;

public class MyCollection<T> {

    private ArrayList arrayList = new ArrayList();

    public <T> void saveToCollection(T someObject) {
        arrayList.add(someObject);
    }

    public void deleteFromCollectionByID(int e) {
        System.out.println("Element with number " + e + " was deleted");
        arrayList.remove(e);
    }

    public T get(int e) {
        System.out.println("You have been searching item: ");
        return  (T) arrayList.get(e);
    }

    public <T> void printWholeArray(){
        System.out.println("Array contains  " + arrayList.size() + " items");
        System.out.println(arrayList);
    }


}
