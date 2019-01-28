package day04;

public class Test09 {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 5, 6, 7};
        System.out.println(arr);

        //java.lang.ArrayIndexOutOfBoundsException
        int a = arr[0];
        System.out.println(a);

        double[] arr1 = {1.2, 6.1, 8.4};
        double b = arr1[0];
        System.out.println(b);

        int[] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 10;
        arr2[2] = 10;
        arr2[3] = 10;
        arr2[4] = 10;
        System.out.println("-------------------");

        int[] arr3 = {1, 23, 4, 5, 6, 7};
        for (int i = 0; i < arr3.length; i++) {
//			int k = arr3[i];

            arr3[i] = 1;
            System.out.println(arr3[i]);
        }




    }


}
