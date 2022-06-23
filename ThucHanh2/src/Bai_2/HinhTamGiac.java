/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_2;
import java.util.Scanner;
/**
 *
 * @author dat
 */
public class HinhTamGiac{
    int ma, mb, mc;
    public HinhTamGiac(){
        ma = mb = mc = 0;
    }
    public HinhTamGiac(int a,int b,int c){
        if(a<0){
            System.out.println("cạnh phải >0");
            ma = 0;
            return;
        }
        if(b<0){
            System.out.println("cạnh phải >0");
            mb = 0;
            return;
        }
        if(c<0){
            System.out.println("cạnh phải >0");
            mc = 0;
            return;
        }
        if(a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("không phải hình tam giác");
            ma = mb = mc = 0;
            return;
        }
        ma = a;
        mb = b;
        mc = c;
    }
    public int getCanhA(){
        return ma;
    }
    public int getCanhB(){
        return mb;
    }
    public int getCanhC(){
        return mc;
    }
    public void setCanhA(int a){
        ma = a;
    }
    public void setCanhB(int b){
        mb = b;
    }
    public void setCanhC(int c){
        mc = c;
    }
    public boolean laTamGiac(){
        return(ma + mb > mc && ma + mc > mb && mb + mc > ma);
    }
    public boolean laTamGiac(int a,int b,int c){
        return(a + b > c && a + c > b && b + c > a);
    }
    public int getChuvi(){
        return ma + mb + mc;
    }
    public double getDienTich(){
        double p = (double)(ma + mb + mc)/2;
        return p*(p - ma)*(p - mb)*(p - mc);
    }     
}
