package QuanlyHD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoDan[] danhsachHD = null;
		int luachon;
		int n;//so go dan
		Scanner key = new Scanner(System.in);
		do {
			System.out.println("----------------MENU-------------------");
			System.out.println("1.Nhap thong tin cho n ho dan: ");
			System.out.println("2.Hien thi thong tin ho dan trong khu pho: ");
			System.out.println("3.Thoat chuong trinh: ");
			System.out.println("-----------------END---------------------");
			
			System.out.print("Moi ban nhap lua chon: ");
			luachon = Integer.parseInt(key.nextLine());
		    
			switch(luachon){
			case 1:{
				System.out.print("So ho dan trong khu pho: ");
				n = Integer.parseInt(key.nextLine());
				danhsachHD = new HoDan[n];//danh sach luu tru n ho dan
				
				for (int i=0; i<danhsachHD.length; i++) {
					System.out.println("Ho dan thu: "+(i+1));
					danhsachHD[i] = new HoDan();//o luu tru
					danhsachHD[i].nhap();
				}
				break;
			}
			case 2:{
				System.out.println("------------Danh Sach Ho Dan----------");
				for (int i=0; i<danhsachHD.length;i++) {
					danhsachHD[i].In();
				}
				break;
			}
			case 3:{
				break;
			}
				
			}
		}while(luachon!=3);

	}

}
