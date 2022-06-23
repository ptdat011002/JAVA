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
public class SinhVien extends ConNguoi {
    private String masv;
    private float dtb;
    public SinhVien(){}
    public SinhVien(String masv, String CMND, String hoten, int namsinh, float dtb){
        super(CMND, hoten, namsinh);
        this.masv = masv;
        this.dtb = dtb;
    }
    public void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã SV: ");
        this.masv = sc.nextLine();
        super.nhap();
        System.out.print("Nhập điểm TB: ");
        this.dtb = sc.nextFloat();
    }
    public void xuatDS(){
        System.out.println("Mã sinh viên: " +this.masv);
        super.xuat();
        System.out.println("Điểm TB: " +this.dtb); 
    }
}