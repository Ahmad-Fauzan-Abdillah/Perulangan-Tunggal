/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprogram;
import java.util.Scanner;
/**
 *
 * @fauzann
 */
public class Tugas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //deklarasi variabel
        int pilih,jumlah;
        double harga = 0, uangMasuk = 0, uangKembalian = 0, total = 0;
        //proses
        do{
            System.out.println("==========================================================");
            System.out.println("MINI BAKERY ");
            System.out.println("==========================================================");
            System.out.println("Produk Tersedia :");
            System.out.println("(1) Brownies Keju\n(2) Banana Cake\n(3) Japanese Cheese Cake\n(4) Butter Croisant\n(5) Cromboloni Chocolate");
            System.out.println("(6) Selesai");
            System.out.print("Piilih menu sesuai nomor yang disediakan (1/2/3/4/5/6): ");
            pilih=sc.nextInt();
            System.out.println("==========================================================");
            switch(pilih){
                case 1:
                    System.out.println("Brownies Keju");
                    System.out.println("Harga : Rp 98.000,-");
                    System.out.print("Jumlah : ");
                    jumlah=sc.nextInt();
                    total = 98000*jumlah;
                    System.out.println("Total Belanja : "+total);
                    harga = harga + total;
                    break;
                case 2:
                    System.out.println("Banana Cake");
                    System.out.println("Harga : Rp 68.000,-");
                    System.out.print("Jumlah : ");
                    jumlah=sc.nextInt();
                    total = 68000*jumlah;
                    System.out.println("Total Belanja : "+total);
                    harga = harga + total;
                    break;
                case 3:
                    System.out.println("Japanese Cheese Cake");
                    System.out.println("Harga : Rp 47.000,-");
                    System.out.print("Jumlah : ");
                    jumlah=sc.nextInt();
                    total = 47000*jumlah;
                    System.out.println("Total Belanja : "+total);
                    harga = harga + total;
                    break;
                case 4:
                    System.out.println("Butter Croisant");
                    System.out.println("Harga : Rp 18.000,-");
                    System.out.print("Jumlah : ");
                    jumlah=sc.nextInt();
                    total = 18000*jumlah;
                    System.out.println("Total Belanja : "+total);
                    harga = harga + total;
                    break; 
                case 5:
                    System.out.println("Cromboloni Cocolate");
                    System.out.println("Harga : Rp 21.000,-");
                    System.out.print("Jumlah : ");
                    jumlah=sc.nextInt();
                    total = 21000*jumlah;
                    System.out.println("Total Belanja : "+total);
                    harga = harga + total;
                    break; 
                case 6:
                    System.out.println("Pesanan anda akan segera diproses");
                    break;
                default: System.out.println("Pilihan Zonk!");      
            }
        }while(pilih!=6);
        System.out.println("Grand Total : "+harga);   
        System.out.println("==========================================================");      
        //uang pembayaran
         System.out.print("Masukkan nominal pembayaran : ");
        uangMasuk = sc.nextDouble();
     
        if(uangMasuk > total){
            uangKembalian = uangMasuk-total;
            System.out.println("Uang Kembalian : Rp " + uangKembalian); 
        }
        else if(uangMasuk == total){
            System.out.println("Uang Pas");
        }
        else{
            uangKembalian = uangMasuk-total;
            System.out.println("Maaf uang anda kurang : Rp " + uangKembalian); 
        }
        System.out.println("Terimakasih Sudah Berbelanja");
        System.out.println("==========================================================");
    }
}  
