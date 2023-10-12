package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println("duyet mang for each");
        for (Integer i : integerList) {
            System.out.println(i);
        }

        System.out.println("duyet bang Iterator");
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
