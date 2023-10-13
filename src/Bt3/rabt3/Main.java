package Bt3.rabt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("mang hien tai la: " + list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("mang sau khi sap xep theo thu tu giam dan la: " + list);
    }
}
