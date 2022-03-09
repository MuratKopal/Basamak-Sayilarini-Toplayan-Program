package Donguler;

import java.util.Scanner;

public class BasamakSayilariniToplayanProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = scan.nextInt();
        int numValue, result = 0;

        while (n != 0) {
            numValue = n % 10;
            n /= 10;
            result += numValue;
        }
        System.out.println(result);
    }
}
