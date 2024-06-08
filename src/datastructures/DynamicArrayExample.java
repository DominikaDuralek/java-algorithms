package datastructures;

import java.util.ArrayList;

public class DynamicArrayExample {
    public static void main(String[] args) {
        System.out.println("DynamicArray example");

        // DynamicArray - an array with a resizable capacity if more room is needed
        // - in Java, those are ArrayLists
        // - it can perform random access of elements (O(1))
        // - easily inserted/deleted data at the end
        // - shifting the elements is more time-consuming (O(n))
        // - expanding/shrinking the array is also time-consuming (O(n))

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Dynamic array empty: " + arrayList.isEmpty());
        System.out.println("Current dynamic array: " + arrayList);
        System.out.println("Size of the dynamic array: " + arrayList.size());

        // Adding items
        arrayList.add("item1");
        arrayList.add("item2");
        arrayList.add("item3");
        arrayList.add("item4");
        System.out.println("\nAdded items: item1, item2, item3, item4");
        System.out.println("Dynamic array empty: " + arrayList.isEmpty());
        System.out.println("Current dynamic array: " + arrayList);
        System.out.println("Size of the dynamic array: " + arrayList.size());

        // Removing items
        System.out.println("\nRemoved items: item1, item2");
        arrayList.remove("item1");
        arrayList.remove("item2");
        System.out.println("Current dynamic array: " + arrayList);
        System.out.println("Size of the dynamic array: " + arrayList.size());

        // Setting the value of an item
        System.out.println("\nSetting new values of items");
        arrayList.set(0, "itemA");
        arrayList.set(1, "itemB");
        System.out.println("Current dynamic array: " + arrayList);

        System.out.println("\nIndex of 'itemA': " + arrayList.indexOf("itemA"));
        System.out.println("Index of 'itemB': " + arrayList.indexOf("itemB"));
        System.out.println("Index of an unknown item: " + arrayList.indexOf("item0"));
    }
}
