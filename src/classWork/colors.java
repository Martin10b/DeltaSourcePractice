package classWork;

import java.util.ArrayList;
import java.util.Scanner;

public class colors {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Purple");
        list.add("Yellow");
        for (String colour: list) {
            System.out.println(colour);
        }
    }
}
