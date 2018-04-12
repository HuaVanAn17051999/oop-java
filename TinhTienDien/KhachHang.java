package Tien_Dien;

import java.util.Scanner;

public class KhachHang {
     public String Hoten;
     public int sonha;
     public int socongto;
    
public KhachHang()   {
	
}
public KhachHang(String Hoten, int sonha, int socongto) {
	this.Hoten = Hoten;
	this.sonha = sonha;
	this.socongto = socongto;
}
void nhap() {
	Scanner key = new Scanner(System.in);
	System.out.println("Ho ten ho dan su dung dien: ");
	Hoten = key.nextLine();
	System.out.println("So nha: ");
	sonha = Integer.parseInt(key.nextLine());
	System.out.println("So cong to: ");
	socongto = Integer.parseInt(key.nextLine());
}
void In() {
	System.out.println("Ho ten ho dan: "+ Hoten);
	System.out.println("So nha: "+sonha);
	System.out.println("So cong to: "+socongto);
}
}
