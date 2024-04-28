package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];//we create an array
        for (int i = 0; i < arr.length; i++) {//We initialize the array
            System.out.println("Введите число: ");
            int value = scanner.nextInt();
            if (i==0){ arr[i] = value;}
            for (int j = 0; j < i; j++) {//create a loop to check the array for the same numbers
                if (value == arr[j]) {
                    while (value == arr[j]) {
                        System.out.println("Таке число вже є,введите повторно число: ");
                        value = scanner.nextInt();
                        arr[i] = value;
                    }}else{ arr[i] = value;}
            }}
        for (int i = 0; i < arr.length; i++) {
            System.out.println("число: " + arr[i]);
        }
        System.out.println();
        boolean fal = false;
        int number;
        while (!fal) {
            fal = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    fal = false;

                    number = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = number;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("число: " + arr[i]);
        }
    }
}