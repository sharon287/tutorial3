package mod1;
import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
