package com.example.kiemthu1;

public class tinhTong {
    public static int tong(int[] arr){
       int tong = 0;
       for (int i: arr){
           tong +=i;
       }
       return tong;
    }
}
