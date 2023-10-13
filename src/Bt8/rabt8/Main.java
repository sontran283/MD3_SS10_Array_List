package Bt8.rabt8;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("alobalo");

        // sử dụng ListIterator - hiển thị các phần tử của list
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
