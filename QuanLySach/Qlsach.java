package QuanLySach;

import java.util.ArrayList;
import java.util.Scanner;

public class Qlsach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<sach> danhsach = new ArrayList<>();
		int n, luachon, Array[] = null;
		 Scanner key = new Scanner(System.in);
		System.out.println("_________________________________________");
		System.out.println("|   1.Nhap vao n quyen sach.            | ");
		System.out.println("|   2.Hien thi tat ca quyen sach.       |");
		System.out.println("|   3.Liet ke sach xuat ban truoc nam n.| ");
		System.out.println("|   4.Thoat chuong trinh.               |");
	    System.out.println("|_______________________________________|");
		do {
			try {
				System.out.println("Moi ban nhap vao lua chon: ");
				luachon = Integer.parseInt(key.nextLine());
				
			}catch(NumberFormatException e) {
				System.out.println("Ban can nhap so nguyen: ");
				luachon=0;
			}
			
			
			switch(luachon){
			case 1:{
				System.out.println("So luong sach: ");
				n = Integer.parseInt(key.nextLine());
				Array = new int[n]; //mang luu tru n quyen sach
				for (int i=0; i<Array.length; i++) {
					System.out.println("Loai sach thu: "+(i+1));
					sach s = new sach();
					s.nhap();
					danhsach.add(s);
				}
				break;
			}
			case 2:{
			  
				for (int i=0; i<danhsach.size(); i++) {
					System.out.println("Loai sach thu: "+(i+1));
					danhsach.get(i).In();
				}
				break;
			}
			case 3:{
				int nam=1, dem=0;
				while(true) {
				try {
					System.out.println("Nhap vao namxb: ");
					nam = Integer.parseInt(key.nextLine());
					break;
				
				}catch(NumberFormatException e) {
					System.out.println("Ban can nhap so nguyen duong: ");
				}
				}
				
				for (int i=0; i<danhsach.size(); i++) {
					if (nam > danhsach.get(i).getNamxb()) {
					danhsach.get(i).In();
					dem++;
					}
				}
				if (dem==0) {
					System.out.println("Khong co quyen sach nao lon hon XB truoc nam: "+nam);
				}
				
				break;
			}
			case 4:{
				break;
			}
			}
		}while(luachon!=4);
	}
    
}
