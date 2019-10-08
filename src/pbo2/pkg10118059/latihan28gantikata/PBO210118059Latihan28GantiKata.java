/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan28gantikata;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("====PROGRAM MENGGANTI KATA====");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        String kata1 = input.next();
        System.out.print("Menjadi Kata : ");
        String kata2 = input .next();
        
        //ganti kata 
        String kalimat2 = kalimat.replace(kata1, kata2);
        System.out.println("");
        System.out.println("===Hasil Formatting===");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru : " + kalimat2);
    }
    
}
