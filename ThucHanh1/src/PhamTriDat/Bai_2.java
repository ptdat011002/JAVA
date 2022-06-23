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
public class Bai_2 {
    public static void B2() {
        double a,b;
        Scanner reader = new Scanner(System.in);
        System.out.print("nhập a: ");
        a = reader.nextDouble();
        System.out.print("nhập b: ");
        b = reader.nextDouble();
        
        if(a == 0){
            if(b == 0){
                System.out.println("PT có vô số nghiệm");
            }else{
                System.out.println("PT vô nghiệm");
            }
        }else{
            System.out.println("PT có nghiệm x = " +(-b / a));
        }
    } 
}

