package Bt1.rabt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            //  tạo ngẫu nhiên một List số nguyên có tối đa 10 phần tử
            list.add((int) (Math.random() * 10));
        }

        System.out.println("mang so nguyen hien tai la: " + list);
        int maxNumber = Collections.max(list);
        int minNumber = Collections.min(list);
        System.out.println("phan tu lon nhat la: " + maxNumber);
        System.out.println("phan tu nho nhat la: " + minNumber);
    }
}
