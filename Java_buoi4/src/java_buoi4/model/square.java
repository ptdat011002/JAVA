/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi4.model;
import java.util.Scanner;
/**
 *
 * @author dat
 */
public class square extends shape {
    private float a;
    public square(){}
    @Override
    public void nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.print("nhập hình vuông: a = ");
    a = sc.nextFloat();
    }
    @Override
    public void xuat(){
       System.out.println("hình vuông ["+a+"] ");
    }
    @Override
    public float tinhS(){
        return a * a;
    }
}
