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
public class Bai_6 {
  public static void B6(){
     double x = 1;
     int n;
     Scanner sn = new Scanner(System.in);
     System.out.print("nhập số nguyên dương n: ");
     n = sn.nextInt();
     if(n>1){
         for (int i = 2;i <= n;i++){
             x *= i;
         }
     }
     System.out.print(n + "!= " +x);
  }   
}
