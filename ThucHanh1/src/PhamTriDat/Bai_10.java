/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhamTriDat;
import java.util.Scanner;
/**
 *
 * @author dat
 */
public class Bai_10{
    public static void B10(){
        int m;  
        int n;
        Scanner sn = new Scanner(System.in);   
        // a) Nhập ma trận
        do {
            System.out.println("Nhập vào số dòng của ma trận:");
            m = sn.nextInt();
            System.out.println("Nhập vào số cột của ma trận:");
            n = sn.nextInt();
        } while (m < 1 || n < 1);
        int A[][] = new int[m][n];
         System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = sn.nextInt();
            }
        }
        // b) In ma trận
        System.out.println("Ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // c) Tìm phần tử nhỏ nhất
        int min = A[0][0];        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min > A[i][j]) {
                    min = A[i][j];
                }
            }
        }
        System.out.println("\nphần tử nhỏ nhất trong mảng: " +min);
        // d) Tìm phần tử lẻ lớn nhất
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] % 2 == 1) {
                    max = A[i][j];
                    break;
                }
            }
        }       
        if(max != 0){
            System.out.println("Phần tử lẻ lớn nhất : " + max);
        }
        else{
            System.out.println("Không có phần tử lẻ nào trong mảng");
        }
        // e) Tìm dòng có tổng lớn nhất
        int vitri = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += A[i][j];
            }
            if(sum >= max){
               max = sum;
               vitri = i;
            }
        }
        System.out.println("Dòng có tổng lớn nhất : " + max + " - dòng này ở vị trí : " + vitri);
    }
}
    

