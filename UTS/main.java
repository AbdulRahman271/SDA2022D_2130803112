package UTS;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //Soal no.2
        // Mengunakan squential Searching
        int [] arraysatu= {77, 99, 44, 55, 22, 88, 11, 0, 66, 33} ;
        int cari=66;//Data yang di cari
        int i=0;
        boolean ditemukan= false;
        for(i=0; i<arraysatu.length; i++) // display items
        System.out.print(arraysatu[i] + " ");
        System.out.println("");
        for(i=0; 1<arraysatu.length; i++){
        if (arraysatu[i]==cari){
                ditemukan=true;
                break;
             }    
        }
         if (ditemukan){
            System.out.println("Found:"+cari + " Ditemukan pada index ke:"+ i +".");
        }
        else {
            System.out.println("Can't find");
        }}}