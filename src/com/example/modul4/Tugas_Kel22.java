package com.example.modul4;
import java.util.Scanner;

/*
    Kelompok: 22
    Shift: 2
    Anggota Kelompok:
    1. Salsabila Rafifah Handifa-21120121130042
    2. Lina Silfiyah-21120121120027
    3. Shinta Nurrohmah-21120121140093
    4. Fadillah Hamdi Wanadi-21120120120025
    */

public class Tugas_Kel22 {

        public static int pulsa = 50000;
        public static int harga1 = 85000;
        public static int harga2 = 65000;
        public static int harga3 = 40000;
        public static int harga4 = 30000;

        public static void menu() {
            System.out.println("################################################");
            System.out.println("Sisa pulsa Anda Rp " + pulsa);
            System.out.println("Aktif s.d. 09/09/2099");
            System.out.println("################################################");
            System.out.println(" ");
            System.out.println("Paket Internet Bulanan");
            System.out.println(" ");
            System.out.println("1. 35GB/1Bln        Rp 85.000");
            System.out.println("2. 15GB/1Bln        Rp 65.000");
            System.out.println("3. 5GB/1Bln         Rp 40.000");
            System.out.println("4. 3GB/1Bln         Rp 30.000");
            System.out.println("5. Keluar");
            System.out.println(" ");
            System.out.println("################################################");
        }

        public static void ulang(){
            Scanner input = new Scanner(System.in);
            int pilihan;
            System.out.println("Apakah ingin melakukan transaksi lagi? (1/0)");
            System.out.println("1. Ya");
            System.out.println("0. Tidak");
            pilihan = Integer.parseInt(input.next());

            if (pilihan == 1){
                System.out.println();
                menu();
            }
            else if (pilihan == 0){
                System.out.println("Terima kasih");
                System.exit(0);
            }
            else {
                System.out.println("Mohon maaf pilihan Anda tidak tersedia");
                System.exit(0);
            }
        }

