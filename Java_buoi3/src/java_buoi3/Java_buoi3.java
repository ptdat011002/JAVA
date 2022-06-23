/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_buoi3;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author dat
 */
public class Java_buoi3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String name = rd.readLine();
        System.out.println("xin chao "+name);
        String s_n = rd.readLine();
        int n = Integer.parseInt(s_n);
        System.out.println("n = " + n);
        System.out.println("hello world");
        
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println("f = " + f);
      
        // TODO code application logic here
    }
    
}
