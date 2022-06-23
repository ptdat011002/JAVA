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
public class circle extends shape{
    private float r;
    public circle(){}
    @Override
    public void nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.print("nhập hình tròn: r = ");
    r = sc.nextFloat();
    }
    @Override
    public void xuat(){
       System.out.println("hình tròn ["+r+"] ");
    }
    @Override
    public float tinhS(){
        return (float)3.14 * r * r;
    }
}
