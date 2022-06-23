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
public class Bai_5 {
    public static void B5(){
    int n;
    double tong = 0;
    Scanner sn = new Scanner(System.in);
    System.out.print("nhập giá trị nguyên dương của n: ");
    n = sn.nextInt();
    for(int i = 1;i <= n;i++){
        tong +=(float)1/i;
    }
    System.out.print("tổng: " + tong);
    }
}
