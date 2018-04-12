package QuanlyHD;

import java.util.Scanner;

public class HoDan extends NhanSu {
    private int sothanhvien;
    private String sonha;
    
 public HoDan() {
	 
 }
 public HoDan(String hovaten,int tuoi, int namsinh, String nghenghiep,int sothanhvien, String sonha ) {
	 super(hovaten, tuoi,  namsinh, nghenghiep );
	 this.sothanhvien = sothanhvien;
	 this.sonha = sonha;
 }
 
 NhanSu[] danhsach = null;
 void nhap() {
	 Scanner key = new Scanner(System.in);
	 danhsach = new NhanSu[sothanhvien];
	 System.out.print("So thanh vien trong gia dinh: ");
	 sothanhvien = Integer.parseInt(key.nextLine());
	 System.out.print("So nha: ");
	 sonha = key.nextLine();
	 for (int i=0; i<danhsach.length; i++) {
		 System.out.println("Thong tin thanh vien thu:"+(i+1));
		 danhsach[i] = new NhanSu();
		 super.nhap();
	 }
 }
 void In() {
	 System.out.println("So thanh vien: "+sothanhvien);
	 System.out.println("So nha: "+sonha);
	 for (int i=0; i<danhsach.length; i++) {
		 System.out.println("Thong tin thanh vien thu:"+(i+1));
		 super.In();
	 }
	
	
 }
}

