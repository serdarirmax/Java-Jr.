package com.serdarirmax.week_02;

import java.util.Scanner;

public class examples01 {
    public static void main(String[] args) {
        /*
        1.  Kullanıcının Verdiği pozitif bir sayıya kadar toplamını yapan hesaplayan Algoritma ?
        Şartlar - 1 : Kullanıcı eğer sayı olarak  100  fazla sayı girerse 100 kadar toplasın. (break)
        Şartlar - 2 : Kullanıcı verdiği sayılar içinde eğer 47 varsa bunu toplamaya dahil etmesin.(continue)
        */
        System.out.println("Lütfen bir sayı giriniz");
        Scanner scanner=new Scanner(System.in);
        int number= Math.abs(scanner.nextInt());
        int sum=0;
        for (int i = 0; i < number; i++) {
            if (number == 47) {
                continue;
            }
            if (i > 100){
                break;
            }
            sum+=i;
            System.out.println("Yoplam:"+sum);
            if (sum%2==0){
                System.out.println("Çift sayidir.");
            }
            else{
                System.out.println("Tek sayidir");
            }
        }
    }
}
