package Lecture_12;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> stringsLinkedList = new LinkedList<>();
        MyLinkedList<String> myStringsLinkedList = new MyLinkedList<>();
        System.out.println("stringsLinkedList: " + stringsLinkedList);
        stringsLinkedList.addFirst("First");
        System.out.println("stringsLinkedList.addFirst(\"First\"): " + stringsLinkedList);
        stringsLinkedList.addLast("Middle");
        System.out.println("stringsLinkedList.addLast(\"Middle\"): " + stringsLinkedList);
        stringsLinkedList.addLast("Last");
        System.out.println("stringsLinkedList.addLast(\"Last\"): " + stringsLinkedList);
        System.out.println("myStringsLinkedList: " + myStringsLinkedList);
        myStringsLinkedList.addFirst("First");
        System.out.println("myStringsLinkedList.addFirst(\"First\"): " + myStringsLinkedList);
        myStringsLinkedList.addLast("Middle");
        System.out.println("myStringsLinkedList.addLast(\"Middle\"): " + myStringsLinkedList);
        myStringsLinkedList.addLast("Last");
        System.out.println("myStringsLinkedList.addLast(\"Last\"): " + myStringsLinkedList);
        System.out.println("stringsLinkedList.size(): " + stringsLinkedList.size());
        System.out.println("myStringsLinkedList.size(): " + myStringsLinkedList.size());
        String string = stringsLinkedList.get(1);
        System.out.println("get(1): stringsLinkedList element by index 1: " + string);
        String myString = myStringsLinkedList.getElementByIndex(1);
        System.out.println("getElementByIndex(1): myStringsLinkedList element by index 1: " + myString);
        stringsLinkedList.remove(0);
        System.out.println("remove(0): Removed element with index 0 from stringsLinkedList: " + stringsLinkedList);
        myStringsLinkedList.removeElementByIndex(0);
        System.out.println("removeElementByIndex(0): Removed element with index 0 from myStringsLinkedList: " + myStringsLinkedList);
        stringsLinkedList.add(1, "afterFirst");
        System.out.println("add(1, \"afterFirst\"): Added element to stringsLinkedList by index 1: " + stringsLinkedList);
        myStringsLinkedList.addElementByIndex(1, "afterFirst");
        System.out.println("addElementByIndex(1, \"afterFirst\"): Added element to myStringsLinkedList by index 1: " + myStringsLinkedList);
    }
}
