package Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DemoCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // them cac phan tu vao list
        list.add("java");
        list.add("python");

        // hien thi cac phan tu cua list
        System.out.println("cac phan tu co trong list la: " + list);

        // su dung vong lap for i - hien thi cac phan tu cau list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for i: " + list.get(i));
        }

        // su dung foreach - hien thi cac phan tu
        for (String str : list) {
            System.out.println("foreach: " + str);
        }

        // su dung Iterator - hiển thị các phần tử của list
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }

        // --------------------------------------  //
        Collection<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.addAll(new ArrayList<>());

        System.out.println("kich thuoc cua collection " + arrayList.size());
        System.out.println(arrayList.isEmpty() ? " collection dang trong" : " khong trong");
        System.out.println(arrayList.contains(1) ? "collection co chua phan tu 1 " : "khong chua phan tu 1");

        Collection<Integer> searchCollections = new ArrayList<>();
        searchCollections.add(5);
        searchCollections.add(6);
        searchCollections.add(7);

        List<Integer> retainedList = new ArrayList<>();
        retainedList.add(5);
        retainedList.add(6);
        searchCollections.retainAll(retainedList);
        searchCollections.clear();

        if (arrayList.containsAll(searchCollections)) {
            System.out.println("trong collections co chua cac phan tu sau: ");
//            for (Integer e : searchCollections) {
//                System.out.println("+" + e);
//            }
            for (int i = 0; i < searchCollections.size(); i++) {
                System.out.println("+" + ((ArrayList<Integer>) searchCollections).get(i));
            }
        }
        arrayList.clear();
        System.out.println(arrayList.size() == 0 ? "da giai phong giu lieu collection" : "chua giai phong du lieu");
    }
}