/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_buoi5;
import java.util.Scanner;
/**
 *
 * @author dat
 */
public class Java_buoi5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int a = 0, b = 1;
            Scanner sc = new Scanner(System.in);
            System.out.print("nhập a: ");
            a = sc.nextInt();
            System.out.print("nhập b: ");
            b = sc.nextInt();
            float x = -b / a;
            System.out.print("nghiệm x = " +x);
            x = sc.nextFloat();
        }
        catch(Exception ex) {
            System.out.println("lỗi: " +ex.getMessage());
        }
        // TODO code application logic here
    }
}
