package homework;

import java.util. Scanner;

public class sum_of_seconds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int racer1 = sc.nextInt();
        int racer2 = sc.nextInt();
        int racer3 = sc.nextInt();
        if (racer1 > 50 || racer2 > 50 || racer3 > 50)
        {
            System.out.println("One of the racers has time bigget than 50.");
            return;
        }
        int sum = racer1 + racer2 + racer3;
        int minutes = sum / 60;
        int seconds = sum % 60;
        String str = String.format("%d:%02d", minutes, seconds);
        System.out.println(str);
    }

}