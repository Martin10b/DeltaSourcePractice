package classWork;

import java.util.Arrays;

public class sravnqvaneNaMasivi {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1, 2, 3, 4};

        boolean check = true;

        if (arr1.length == arr2.length) {

            System.out.println("daljinite sa endakvi");

            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] == arr2[i]) {
                    System.out.printf("%d and %d are equal.\n", arr1[i], arr2[i]);
                } else {
                    System.out.printf("%d and %d are NOT equal.\n", arr1[i], arr2[i]);
                    check = false;
                }
            }
        } else {

            System.out.println("ne sa ednakvi");
        }

    }
}



