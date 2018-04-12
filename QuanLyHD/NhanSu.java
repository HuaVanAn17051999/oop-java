package QuanlyHD;

import java.util.Scanner;

public class NhanSu {
    private String hovaten;
    private int tuoi;
    private int namsinh;
    private String nghenghiep;
    
public NhanSu() {
	
}
public NhanSu(String hovaten,int tuoi, int namsinh, String nghenghiep  ) {
	this.hovaten = hovaten;
	this.tuoi = tuoi;
	this.namsinh = namsinh;
	this.nghenghiep = nghenghiep;
}
void nhap() {
	Scanner key = new Scanner(System.in);
	System.out.print("Ho va ten: ");
	hovaten = key.nextLine();
	System.out.print("Tuoi: ");
	tuoi = Integer.parseInt(key.nextLine());
	System.out.print("Nam sinh: ");
	namsinh = Integer.parseInt(key.nextLine());
	System.out.print("Nghe Nghiep: ");
	nghenghiep = key.nextLine();
}
void In() {
	System.out.println("Ho va ten thanh vien: "+hovaten);
	System.out.println("Tuoi: "+tuoi);
	System.out.println("Nam sinh: "+namsinh);
	System.out.println("Nghe Nghiep: "+nghenghiep);
	
}
}
