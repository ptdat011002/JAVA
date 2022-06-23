/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import java.util.Scanner;
import Bai_2.HinhTamGiac;
import Bai_3.NhanVien;
import Bai_4.DichVuNhaKhoa;
/**
 *
 * @author dat
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//        Bai_1.HinhTron HT = new Bai_1.HinhTron();
//        HT.nhap();
//        HT.xuat();
//        System.out.println("chu vi hình tròn = " +HT.tinhC());
//        System.out.println("diện tích hình tròn = " +HT.tinhS());
        
        
//        System.out.println("nhập 3 cạnh của hình tam giác");
        Scanner sc = new Scanner(System.in);
//        int ma = sc.nextInt();
//        int mb = sc.nextInt();
//        int mc = sc.nextInt();
//        HinhTamGiac HTC = new HinhTamGiac(ma ,mb ,mc);
//        if(HTC.laTamGiac()){
//            System.out.println("Chu vi: "+HTC.getChuvi());
//            System.out.println("Diện tích: "+HTC.getDienTich());
//        }
        
//        System.out.print("Nhập số nhân viên: ");
//        int SL = sc.nextInt();
//        NhanVien[] nv = new NhanVien[SL];
//        for(int i = 0;i < SL;i++){
//            nv[i] = new NhanVien();
//            nv[i].nhap();
//        }
//        NhanVien XTD = new NhanVien();
//        XTD.XuatTieuDe();
//        for(int i = 0;i < SL;i++){
//            System.out.println(nv[i].toString());
//        }

        System.out.print("Nhập số lượng khách hàng : ");
                    int slkh = sc.nextInt();
                    DichVuNhaKhoa[] arrKH = new DichVuNhaKhoa[slkh];
                    for (int i = 0; i < slkh; i++) {
                        arrKH[i] = new DichVuNhaKhoa();
                        arrKH[i].nhap();
                    }
                    System.out.println("Danh sách : ");
                    for (int i = 0; i < slkh; i++) {
                        arrKH[i].xuat();
                    }

                    for (int i = 0; i < slkh - 1; i++) {
                        for (int j = 0; j < slkh - i - 1; j++) {
                            if (arrKH[j].tongTien() < arrKH[j + 1].tongTien()) {
                                DichVuNhaKhoa temp = new DichVuNhaKhoa();
                                temp = arrKH[j];
                                arrKH[j] = arrKH[j + 1];
                                arrKH[j + 1] = temp;
                            }
                        }
                    }
    }
}
