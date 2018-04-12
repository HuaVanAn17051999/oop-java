package Quanlykhachhang;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class QLKH {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Khachhang> danhsach = new  ArrayList();
       int [] Array;
	int n;
	   System.out.println("================================");
	   System.out.print("1.Nhap n khach hang: \n");
	   System.out.print("2.Hien thi thong tin danh sach khach hang: \n");
	   System.out.print("3.Hien thi khach hang co tong luong lon hon x: \n");
	   System.out.print("4.Thoat chuong trinh: \n");
	   System.out.println("================================");
	   Scanner key = new Scanner(System.in);
	   int luachon;
	   do {
		   System.out.print("Moi ban nhap vao lua chon: ");
		   
		   try {
			   luachon = Integer.parseInt(key.nextLine());
		   }catch(NumberFormatException e) {
			   luachon = 0;
			   System.out.println("Ban can nhap vao so nguyen:\n ");
		   }
		   switch(luachon) {
		   case 1: {
			   System.out.println("Nhap vao so luong khach hang: \n");
			   n = Integer.parseInt(key.nextLine());
			   Array = new int[n];//tao lap so luong phan tu trong mang
			   for (int i=0; i<Array.length; i++) {//Array la ten cua mang & lenght do dai
				   Khachhang KH = new Khachhang();
				   System.out.println("Thong tin khach hang thu: "+(i+1));
				   KH.Nhap();
				   danhsach.add(KH);//them khach hang duoc luu vao danh sach
				   
			   }
			   break;
		   }
		   case 2:{
			   System.out.println("Thong tin khach hang co trong danh sach:\n ");
			     for (int i=0; i<danhsach.size(); i++) {
			    	 System.out.println("Thong tin khach hang thu: "+(i+1));
			    	 danhsach.get(i).In();
			     }
			   break;			   
		   }
		   case 3:{
			   int x = 0;
			   System.out.print("Nhap vao tong luong:\n ");
			   for (int i=0; i<danhsach.size(); i++) {
				   if (x >= danhsach.get(i).getTongluong()) {
					   danhsach.get(i).In();
				   }
			   }
				   
			   break;
		   }
		   case 4:{
			   break;
		   }
		  }
	   }  while(luachon!=4);
		 	   
	  }
	}

		   
		   
		   
		   
		 

	   
	


