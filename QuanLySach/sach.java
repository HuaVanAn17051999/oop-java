package QuanLySach;

import java.util.Scanner;

public class sach {
   private String tensach;
   private String tentacgia;
   private int namxb;
   
 public sach() {
	 
 }
 public sach(String tensach,String tentacgia,int namxb ) {
	 this.tensach = tensach;
	 this.tentacgia = tentacgia;
	 this.namxb = namxb;
 }
 
 public String getTensach() {
	return tensach;
}
public void setTensach(String tensach) {
	this.tensach = tensach;
}
public String getTentacgia() {
	return tentacgia;
}
public void setTentacgia(String tentacgia) {
	this.tentacgia = tentacgia;
}
public int getNamxb() {
	return namxb;
}
public void setNamxb(int namxb) {
	this.namxb = namxb;
}
void nhap() {
	 Scanner key = new Scanner(System.in);
	 System.out.println("Ten sach: ");
	 tensach = key.nextLine();
	 System.out.println("Ten tac gia: ");
	 tentacgia = key.nextLine();
	 System.out.println("Nam xuat ban: ");
	 namxb = Integer.parseInt(key.nextLine());
 }
void In() {
	System.out.println("Ten sach: "+tensach);
	System.out.println("Ten tac gia: "+tentacgia);
	System.out.println("Nam xuat ban: "+namxb);
	System.out.println("============================");
}
}
