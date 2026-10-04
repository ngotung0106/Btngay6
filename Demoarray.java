package ngay6;

import java.util.Scanner;

public class Demoarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Enter number " + (i+1));
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Array numbers: ");
        for (int j = 0; j < size; j++){
            System.out.println(numbers[j]);
        }
        scanner.close();
    }
}
