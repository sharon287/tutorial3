package mod1;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        int even = 0;
        int odd = 0;

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();

            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of even elements = " + even);
        System.out.println("Number of odd elements = " + odd);

        sc.close();
    }
}
