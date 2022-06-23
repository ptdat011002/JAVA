/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhamTriDat;
import java.util.Scanner;
/**
 *
 * @author dat
 */
public class Bai_8 {
    public static void B8(){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a = ");
        a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        b = scanner.nextInt();
        System.out.println("UCLN của " + a + " và " + b + " là: " + UCLN(a, b));
        System.out.println("BCNN của " + a + " và " + b + " là: " + BCNN(a, b));
    }
     public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}

