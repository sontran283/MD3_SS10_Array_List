package Bt5.rabt5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "hello world im fine              thank you and you";
        List<String> strings = new ArrayList<>(Arrays.asList(input.trim().split(" ")));
        String shortestString = strings.get(0);
        for (String str : strings) {
            if (!str.isEmpty()) {
                if (shortestString.length() > str.length()) {
                    shortestString = str;
                }
            }
        }
        System.out.println("chu ngan nhat la: " + shortestString);
    }
}
