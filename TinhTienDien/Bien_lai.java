package Tien_Dien;

import java.util.Scanner;

public class Bien_lai extends KhachHang {
  
	private int somoi;
	private int socu;
	private int sotientra;
public Bien_lai() {
	
}
public Bien_lai(String Hoten, int sonha, int socongto,int somoi, int socu) {
	super(Hoten, sonha, socongto);
	this.socu = socu;
	this.somoi = somoi;
	
}
 public void nhap() {
	 Scanner key = new Scanner(System.in);
	 super.nhap();
	 System.out.println("Chi so moi: ");
	 somoi = Integer.parseInt(key.nextLine());
	 System.out.println("Chi so cu: ");
	 socu = Integer.parseInt(key.nextLine());
 }
 public void In() {
	 super.In();
	 System.out.println("Chi so moi: "+somoi);
	 System.out.println("Chi so cu: "+socu);
	 System.out.println("So tien phai tra: " + Tinhtiendien());
 }
 public int Tinhtiendien() {
	 sotientra = (somoi - socu) * 850000;
	 return sotientra;
 }
}
