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
public class Bai_3 {
    public static void B3(){
    double a, b, c, x1, x2, X;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a (a # 0): ");
        a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        System.out.println("Phương trình bậc hai: " + a + "x^2 + " + b + "x + " + c + " = 0");
        X = Math.pow(b, 2) - 4 * a * c;
        if (X < 0){
            System.out.println("Phương trình vô nghiệm!");
        } else if (X == 0){
            x1 = -b / (2 * a);
            System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
        } else{
            x1 = (-b + Math.sqrt(X)) / (2 * a);
            x2 = (-b - Math.sqrt(X)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + " và x2 = " + x2);
        }
    }
}
    
