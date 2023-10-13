package Bt7.rabt7;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("ruby");
        list.add("python");

        // sử dụng Iterator - hiển thị các phần tử của list
        Iterator<String> integer = list.iterator();
        System.out.println("cac phan tu co trong list la: ");
        while (integer.hasNext()) System.out.println((String) integer.next());
    }
}
