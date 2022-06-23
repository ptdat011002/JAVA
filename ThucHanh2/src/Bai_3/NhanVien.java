/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_3;

import java.util.Scanner;

/**
 *
 * @author dat
 */
public class NhanVien {
    String maNV;
    int soSP;
    double dongia, luong;
    public NhanVien(){
        this.maNV = "";
        this.soSP = 0;
    }
    public NhanVien(String maNV, int soSP){
        this.maNV = maNV;
        this.soSP = soSP;
    }
    public String getMaNV(){
        return maNV;
    }
    public int getSoSP(){
        return soSP;
    }
    public void setMaNV(String MaNV){
        this.maNV = maNV;
    }
    public void setSP(int soSP){
        this.soSP = soSP;
        if(soSP < 0){
            soSP = 0;
        } 
    }
    public boolean coVuotChuan(){
        return this.soSP > 500; 
    }
    public String getTongKet(){
        String TK = "";
        if(this.coVuotChuan())
            TK = "Vượt";
        return TK;
    }
    public double getLuong(){
        if (soSP >= 1 && soSP <= 500) {
            dongia = 20000;
            luong = (double)soSP * dongia;
        } else{
            dongia = 30000;
            luong = (double)((soSP - 500) * dongia) + (500 * 20000);
        }       
        return luong;
    }
    public void XuatTieuDe(){
        System.out.println("mã nhân viên \t| số sản phẩm \t| lương \t| tổng kết \t|");
    }
    public String toString() {
        return  this.maNV +"\t\t|" + this.soSP +"\t\t|" + this.getLuong()+"\t\t|"+this.getTongKet()+"\t\t|";
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("nhập sô sản phẩm: ");
        soSP = sc.nextInt();
    }
}
