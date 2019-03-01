/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOBuku {

    public static void NewBuku() {
        try (FileOutputStream file = new FileOutputStream("addressbook.dat", true)) {
            Scanner Buku = new Scanner(System.in);

            System.out.print("Masukan Nama : ");
            String nama = Buku.nextLine() + "\t";

            System.out.print("Masukan Alamat: ");
            String alamat = Buku.nextLine() + "\t";

            System.out.print("Masukan Telepon: ");
            String hp = Buku.nextLine() + "\t";

            System.out.print("Masukan Email: ");
            String email = Buku.nextLine() + "\n";

            file.write(nama.getBytes());
            file.write(alamat.getBytes());
            file.write(hp.getBytes());
            file.write(email.getBytes());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("     <3 Selamat Datang Di Kota Tua <3       ");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("");
            System.out.println("1. Buat Data Buku");
            System.out.println("2. Tampilkan Data Buku ");
            System.out.println("3. Keluar Dari Program");
            System.out.println("");
            System.out.print("Masukan pilihan Anda : ");
            int opsi = s.nextInt();
            switch (opsi) {
                case 1:
                    NewBuku();
                    break;
                case 2:
                    openFile();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" Pilihan anda salah !!! ");
                    break;
            }
            System.out.println();
            System.out.println();
        } while (true);
    }

    public static void openFile() throws IOException {
        try (FileInputStream i = new FileInputStream("addressbook.dat")) {

            int data;

            while ((data = i.read()) != -1) {
                System.out.print((char) data);
            }

            i.close();
        } catch (FileNotFoundException e) {
            System.out.println("Data Belum Di Input");
        }
    }

}

