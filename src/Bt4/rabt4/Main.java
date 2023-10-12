package Bt4.rabt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputString = "Rekkei Academy       để nông dân biết code";
        List<String> string = new ArrayList<>(Arrays.asList(inputString.split(" ")));

        System.out.println("chuoi hien tai la: " + inputString);
        System.out.println("chuoi co 3 phan tu la: ");
        for (String str : string) {
            if (str.length() > 3) {
                System.out.println(str);
            }
        }
    }
}
