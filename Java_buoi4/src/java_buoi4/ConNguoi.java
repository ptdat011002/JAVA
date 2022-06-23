/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi4;
import java.util.Scanner;
/**
 *
 * @author dat
 */
public class ConNguoi {
    protected String CMND;
    protected String hoten;
    protected int namsinh;
    public ConNguoi(){}
    public ConNguoi(String CMND, String hoten, int namsinh){
        this.CMND = CMND;
        this.hoten = hoten;
        this.namsinh = namsinh;
    }
public void nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập CMND: ");
    this.CMND = sc.nextLine();
    System.out.print("Nhập họ tên: ");
    this.hoten = sc.nextLine();
    System.out.print("Nhập năm sinh: ");
    this.namsinh = sc.nextInt();
    }
public void xuat(){
    System.out.println("CMND: "+CMND);
    System.out.println("Họ tên: "+hoten);
    System.out.println("Năm Sinh: "+namsinh);
    }
}

