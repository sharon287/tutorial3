package mod1;
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int maximum = array[0];
        int minimum = array[0];

        for (int i = 1; i < n; i++) {

            if (array[i] > maximum) {
                maximum = array[i];
            }

            if (array[i] < minimum) {
                minimum = array[i];
            }
        }

        System.out.println("Maximum value = " + maximum);
        System.out.println("Minimum value = " + minimum);

        sc.close();
    }
}
