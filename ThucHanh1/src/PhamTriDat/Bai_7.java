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
public class Bai_7 {
    public static void B7(){
        double x = 1;
        double y = 1;
        int n, i;
        Scanner sn = new Scanner(System.in);
        System.out.print("nhập số nguyên dương n: ");
        n = sn.nextInt();
            if(n % 2 == 0){
                for( i= 2;i <= n;i += 2){
                     x *= i;
                }           
                System.out.print(n + "!!= " +x);
            }
            else{
                for(i = 1;i <= n;i += 1){
                     y *= i;
                }           
                System.out.print(n + "!!= " +y);
            }
    }    
} 
