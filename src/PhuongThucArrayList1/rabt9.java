package PhuongThucArrayList1;

import java.util.ArrayList;

public class rabt9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("ccc");
        list.add("ddd");

        // addAll them tat ca
        System.out.println("___ su dung phuong thuc addAll ___");
        ArrayList<String> list1 = new ArrayList<String>();
        list1.addAll(list);  // thêm các phần tử của list vào list1
        System.out.println("ket qua sau them tat ca mang cua list1: " + list1);

        // retainAll
        System.out.println("___ su dung phuong thuc retainAll ___");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("ddd");
        // xóa những phần tử không thuộc listB khỏi listA
        list1.retainAll(list2);
        System.out.println(list1);


        System.out.println("___ su dung phuong thuc removeAll ___");
        // xóa những phần tử thuộc listB  khỏi list
        list.removeAll(list2);
        System.out.print("list:");
        showList(list);
    }

    private static void showList(ArrayList<String> list) {
        for (String obj : list) {
            System.out.println("\t" + obj + ",");
        }
        System.out.println();
    }
}
