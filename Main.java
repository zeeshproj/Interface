/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        
        // membuat objek HP
        Phone RogPhone5 = new ROG();

        // membuat objek user
        PhoneUser zee = new PhoneUser(RogPhone5);

        // kita coba nyalakan HP-nya
        zee.turnOnThePhone();
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                zee.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                zee.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                zee.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                zee.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}

