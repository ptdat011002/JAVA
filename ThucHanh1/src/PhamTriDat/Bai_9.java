/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhamTriDat;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author dat
 */
public class Bai_9 {
    public static void B9(){
        int n, X;
        Scanner sn = new Scanner(System.in);        
        do {
            System.out.print("Nhập vào số phần tử của mảng: ");
            n = sn.nextInt();
        } while (n < 0);
         
        int array[] = new int[n];        
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = sn.nextInt();
        }
        // a) Xuất giá trị các phần tử của mảng
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        // b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("\ngiá trị nhỏ nhất trong mảng: " +min);
        System.out.println("giá trị lớn nhất trong mảng: " +max);
        // c) Đếm số phần tử là số chẵn
        System.out.print("các phần tử chẵn trong mảng là: ");
	for(int i = 0;i < n; i++){
            if(array[i] % 2 == 0) {
		System.out.print(array[i] + " ");
            }
        }
        // d) Tìm các phần tử là số nguyên tố
        
        // e) Sắp xếp mảng tăng dần
        Arrays.sort(array);
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        // f) Tìm phần tử X
        System.out.println("\nNhập vào giá trị cần kiểm tra trong mảng");
        X = sn.nextInt();
        for (int i = 0; i < n; i++)
        {
            if (array[i] == X)
            {
                System.out.println(X+" Đang tồn tại ở vị trí "+(i+1));
                break;
            }
            if (i == n)
            System.out.println(X + " Không tồn tại trong mảng.");
        }        
    }  
}
