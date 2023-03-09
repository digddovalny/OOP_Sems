package Sem3Dz3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        NewLinkedList list = new NewLinkedList();
        list.add("param1");
        list.add("param2");

        list.add(1, "param1_1");
        list.add(1, "param2_1");
        list.add(1, "param3_1");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
