/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.java.pkg2.pra.uts.pkg2;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class ProgramJava2PraUTS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int Isi = 8;
        Scanner input = new Scanner(System.in);

        int[] Data_Data = new int[Isi];

        System.out.println("");
        for (int i = 0; i < Isi; i++) {
            System.out.printf("Masukkan data ke-%d: ", (i + 1));
            Data_Data[i] = input.nextInt();
        }

        for (int R = 0; R < Isi - 1; R++) {
            for (int a = 0; a < Isi - 1; a++) {
                if (Data_Data[a] < Data_Data[a + 1]) {
                    int j = Data_Data[a];
                    Data_Data[a] = Data_Data[a + 1];
                    Data_Data[a + 1] = j;
                }
            }
        }
        System.out.println("");
        System.out.println("Hasil pengurutan bilangan: ");
        for (int b = 0; b < Isi; b++) {
            System.out.print(Data_Data[b] + "  ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("*************************************************");
  
    }
}