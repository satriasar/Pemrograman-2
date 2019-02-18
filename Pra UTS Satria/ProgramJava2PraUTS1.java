/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.java.pkg2.pra.uts.pkg1;

import java.util.Scanner;

/**
 *
 * @author fujitsu
 */
public class ProgramJava2PraUTS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Tuliskan = new Scanner(System.in);
        
        System.out.println("Dibawah ini adalah Lingkaran C1: ");
       
        System.out.print("Input Nilai X1 : ");
        int x1 = Tuliskan.nextInt();
        System.out.print("Input Nilai y1 : ");
        int y1 = Tuliskan.nextInt();
        System.out.print("");
        
        System.out.println("\nDibawah ini adalah Lingkaran C2: ");
        
        System.out.print("Input Nilai X2 : ");
        int x2 = Tuliskan.nextInt();
        System.out.print("Input Nilai y2 : ");
        int y2 = Tuliskan.nextInt();
        
        int r1 = (x1 + y1) / 2;  
        int r2 = (x2 + y2) / 2;
        
        String c1, c2;
        
        if(x1 > 0 && y1 > 0){
            c1 = "Ruangan I";
        } 
        
        else if(x1 < 0 && y1 > 0){
            c1 = "Ruangan II";
        } 
        
        else if(x1 < 0 && y1 < 0){
            c1 = "Ruangan III";
        } 
        
        else {
            c1 = "Ruangan IV";
        }
               
        System.out.print("\n");
       
        if(x2 > 0 && y2 > 0){
            c2 = "Ruangan I";
        }
        
        else if( x2 < 0 && y2 > 0){
            c2 = "Ruangan II";
        }
        
        else if(x2 < 0 && y2 < 0){
            c2 = "Ruangan III";
        }
        
        else {
            c2 = "Ruangan IV";
        }
        
        
        if ("Ruangan I".equals(c2) && "Ruangan I".equals(c1) && x1 <= x2 && y1 <= y2) {
            System.out.println("C1 ada di dalam C2");
        }
        
        else if ("Ruangan II".equals(c2) && "Ruangan II".equals(c1) && x1 <= x2 && y1 <= y2) {
            System.out.println("C1 ada di dalam C2");
        }
        
        else if ("Ruangan III".equals(c2) && "Ruangan III".equals(c1) && x1 <= x2 && y1 <= y2) {
            System.out.println("C1 ada di dalam C2");
        }
        
        else if ("Ruangan IV".equals(c2) && "Ruangan IV".equals(c1) && x1 <= x2 && y1 <= y2) {
            System.out.println("C1 ada di dalam C2");
        }        
        
        else if ("Ruangan I".equals(c2) && "Ruangan I".equals(c1) && x2 <= x1 && y2 <= y1){
            System.out.println("C2 ada di dalam C1");
        }
        
        else if ("Ruangan II".equals(c2) && "Ruangan II".equals(c1) && x2 <= x1 && y2 <= y1){
            System.out.println("C2 ada di dalam C1");
        }
        
        else if ("Ruangan III".equals(c2) && "Ruangan III".equals(c1) && x2 <= x1 && y2 <= y1){
            System.out.println("C2 ada di dalam C1");
        }
         
        else if ("Titik IV".equals(c2) && "Ruangan IV".equals(c1) && x2 <= x1 && y2 <= y1){
            System.out.println("C2 ada di dalam C1");
        }        
        
        else if ("Ruangan II".equals(c2) && "Ruangan I".equals(c1) && x1 > x2 && y1 < y2) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Ruangan IV".equals(c2) && "Ruangan I".equals(c1) && x1 > x2 && y1 < y2) {
            System.out.println("C1 dan C2 Beririsan");
        }
         
        else if ("Ruangan III".equals(c2) && "Ruangan II".equals(c1) && x1 > x2 && y1 < y2) {
            System.out.println("C1 dan C2 Beririsan");
        }
                
        else if ("Ruangan IV".equals(c2) && "TRuangan III".equals(c1) && x1 > x2 && y1 < y2) {
            System.out.println("C1 dan C2 Beririsan");
        }
   
        else if ("Ruangan I".equals(c2) && "Ruangan IV".equals(c1) && x1 > x2 && y1 < y2) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Ruangan II".equals(c1) && "Ruangan I".equals(c2) && x2 > x1 && y2 < y1) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Ruangan IV".equals(c1) && "Ruangan II".equals(c2) && x2 > x1 && y2 < y1) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Ruangan III".equals(c1) && "Ruangan II".equals(c2) && x2 > x1 && y2 < y1) {
            System.out.println("C1 dan C2 Beririsan");
        }
         
        else if ("Ruangan IV".equals(c1) && "Ruangan III".equals(c2) && x2 > x1 && y2 < y1) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Ruangan I".equals(c1) && "Ruangan IV".equals(c2) && x2 > x1 && y2 < y1) {
            System.out.println("C1 dan C2 Beririsan");
        }
         
        else {
            System.out.println("C2 dan C1 Saling Lepas");
        
        }
        
        System.out.println("Lingkaran C1 Berjari - jari: " + r1 + "\ndan Lingkaran C2 Berjari - jari: " + r2 );
           
    }

}
           
 