package mod1;
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (array[i] == search) {

                System.out.println("Number found at position " + (i + 1));

                found = true;

                break;
            }
        }

        if (found == false) {
            System.out.println("Number not found");
        }

        sc.close();
    }
}
