package HW7;

public class MainClassHW7TaskTwo {
    public static void main(String[] args) {
        MyCollection stringCollection = new MyCollection();
        MyCollection integerCollection = new MyCollection();

        stringCollection.saveToCollection("hello");
        stringCollection.saveToCollection("people");
        stringCollection.saveToCollection("I");
        stringCollection.saveToCollection("Like");
        stringCollection.saveToCollection("Java");

        integerCollection.saveToCollection(1);
        integerCollection.saveToCollection(2);
        integerCollection.saveToCollection(3);
        integerCollection.saveToCollection(4);
        integerCollection.saveToCollection(5);

        System.out.println(stringCollection.get(4));
        System.out.println(integerCollection.get(4));

        stringCollection.printWholeArray();
        integerCollection.printWholeArray();

        stringCollection.deleteFromCollectionByID(3);
        integerCollection.deleteFromCollectionByID(2);
    }


}
