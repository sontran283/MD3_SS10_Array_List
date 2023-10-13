package Bt2.rabt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("danh sach hien tai la: ");
        for (Integer in : list) {
            System.out.print(in + " ");
        }

        // ko dung reverse
        System.out.println();
        System.out.println("danh sach dao nguoc khong dung reverse la: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        // dung reverse
        System.out.println();
        Collections.reverse(list);
        System.out.println("danh sach dao nguoc dung reverse la: ");
        for (Integer in : list) {
            System.out.print(in + " ");
        }
    }
}
