/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi4.model;

/**
 *
 * @author dat
 */
public class NewClass {
    public static void main(String[] args) {
        shape sh = new shape();
        sh.nhap();
        sh.xuat();
        System.out.println("S = " +sh.tinhS());
        
        square sq = new square();
        sq.nhap();
        sq.xuat();
        System.out.println("S = " +sq.tinhS());
        
        circle cr = new circle();
        cr.nhap();
        cr.xuat();
        System.out.println("S = " +cr.tinhS());

        rectangle rt = new rectangle();
        rt.nhap();
        rt.xuat();
        System.out.println("S = " +rt.tinhS());

    } 
}
