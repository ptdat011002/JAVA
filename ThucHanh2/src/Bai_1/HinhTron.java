/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_1;

import java.util.Scanner;

/**
 *
 * @author dat
 */
public class HinhTron {
    float r;
    public void nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.print("nhập hình tròn: r = ");
    r = sc.nextFloat();
    }
    public void xuat(){
       System.out.println("hình tròn ["+r+"] ");
    }
    public float tinhC(){
        return(float)3.14 * 2 * r;
    }
    public float tinhS(){
        return (float)3.14 * r * r;
    }
}
