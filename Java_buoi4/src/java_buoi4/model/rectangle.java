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
public class rectangle extends shape {
    private float x;
    private float y;
    public rectangle(){}
    @Override
    public void nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.print("nhập hình chữ nhật: x = ");
    x = sc.nextFloat();
    System.out.print("nhập hình chữ nhật: y = ");
    y = sc.nextFloat();
    }
    @Override
    public void xuat(){
       System.out.println("hình chữ nhật ["+x+","+y+"] ");
    }
    @Override
    public float tinhS(){
        return x * y;
    }
}
