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
public class DanhSach {
    private int soluong;
    private ConNguoi[] arr;
    public DanhSach() {}
    public DanhSach(int soluong, ConNguoi[] arr){
    this.soluong = soluong;
    this.arr = arr;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng: ");
        this.soluong = sc.nextInt(); 
        this.arr = new ConNguoi[soluong];
        for(int i = 0;i < soluong;i++){
            arr[i] = new ConNguoi();
            arr[i].nhap();
        }
    }
    public void Xuat(){
        for(int i = 0;i < soluong;i++)
            arr[i].xuat();
    }  
}
