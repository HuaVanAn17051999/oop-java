package Quanlykhachhang;

import java.util.Scanner;

public class Khachhang {
   private String Makh;
   private String Hoten;
   private int Namsinh;
   private int Tongluong;
   
   public Khachhang() {
	   
   }
   public Khachhang(String Khachhang) {
	   this.Makh = Makh;
   }
   public Khachhang(String Makh,  String Hoten, int Namsinh ,  int Tongluong ) {
	   this.Makh = Makh;
	   this.Hoten = Hoten;
	   this.Namsinh = Namsinh;
	   this.Tongluong = Tongluong;
   }
public String getMakh() {
	return Makh;
}
public void setMakh(String makh) {
	Makh = makh;
}
public String getHoten() {
	return Hoten;
}
public void setHoten(String hoten) {
	Hoten = hoten;
}
public int getNamsinh() {
	return Namsinh;
}
public void setNamsinh(int namsinh) {
	Namsinh = namsinh;
}
public int getTongluong() {
	return Tongluong;
}
public void setTongluong(int tongluong) {
	Tongluong = tongluong;
}
public void Nhap() {
	   Scanner key = new Scanner(System.in);
	   System.out.print("Nhap MKH: ");
	   Makh = key.nextLine();
	   System.out.print("Ho ten: \n");
	   Makh = key.nextLine();
	   System.out.print("Nam sinh: \n");
	   Namsinh = Integer.parseInt(key.nextLine());
	   System.out.print("Tong luong: \n");
	   Tongluong = Integer.parseInt(key.nextLine());
}
public void In() {
	   System.out.println("Ma khach hang: " + Makh+"\n");
	   System.out.println("Ho ten: " + Hoten+"\n");
	   System.out.println("Nam sinh: " + Namsinh+"\n");
	   System.out.print("Tongluong: "+Tongluong+"\n");
   

   }
}
 
   
	


