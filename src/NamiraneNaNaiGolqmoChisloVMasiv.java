public class NamiraneNaNaiGolqmoChisloVMasiv {
    public static void main(String[] args) {
        System.out.println(largest());
    }

           static int arr[] = {10,20,30,40,50,60,70,80,90,100};
        static int largest()
        {
            int i;
            int max = arr[0];
            for (i = 1; i < arr.length; i++)
                if (arr[i] > max)
                    max = arr[i];

            return max;
        }


    }

