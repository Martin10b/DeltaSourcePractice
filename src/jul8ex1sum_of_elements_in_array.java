public class jul8ex1sum_of_elements_in_array {

    public static void main(String[] args) {

        int[] arr = new int[] {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] / 10;
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}

