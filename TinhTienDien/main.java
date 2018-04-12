package Tien_Dien;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner key = new Scanner(System.in);
    int luachon,n;
    Bien_lai[] danhsachHD = null;
    System.out.println("1.Nhap thong tin n ho dan: ");
    System.out.println("2.Hien thi thong tin ho dan: ");
    System.out.println("3.Thoat chuong trinh: ");
    do {
    	System.out.println("Moi ban chon lua chon: ");
    	luachon = Integer.parseInt(key.nextLine());
    	if(luachon<1 || luachon>3) {
    		System.out.println("Su lua chon khong hop le, vui long moi ban nhap lai: ");
    	}
    	switch(luachon) {
    	case 1:{
    		System.out.println("Nhap vao so luong ho dan: ");
    		n = Integer.parseInt(key.nextLine());
    		
    		danhsachHD = new Bien_lai[n];
    		
    		for (int i=0; i<danhsachHD.length; i++) {
    			System.out.println("Thong tin ho dan thu: "+(i+1));
    			danhsachHD[i] = new Bien_lai();
    			danhsachHD[i].nhap();
    			
    		}
    		break;
    	}
    	case 2:{
    		System.out.println("Thong tin ho dan: ");
    		
    		for (int i=0; i<danhsachHD.length; i++) {
    			System.out.println("Thong tin ho dan thu: "+(i+1));
    			danhsachHD[i].In();
    		}
    		break;
    	}
    	case 3:{
    		break;
    	}
    	}
    }while(luachon !=3);
	}

}
