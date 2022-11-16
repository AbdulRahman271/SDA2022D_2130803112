package UTS;

import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        int[] data = {45, 12, 30, 54, 22, 89, 21, 15, 67, 77};
        int i,j,N;
        N=10;

        //Mencetak Array sebelum terurut
        System.out.println("Data Awal");
        for (i=0;i<N;i++){
        System.out.print(data[i]+ " ");
        }
        System.out.println();
        System.out.println("Data setelah di selection");
        for (i = 0; i < N; i++) {
        int min = data[i];
        int posisi = i;
        
        for (j = i; j < N; j++) {
        /* Cari nilai yang terkecil */
        if (data[j] < min) {
        min = data[j];
        posisi = j;
        }}

        /* Tukar nilai terkecil ke array[i] jika pos tdk sama i */
        if(i!=posisi) {
        int temp = data[i];
        data[i] = data[posisi];
        data[posisi] = temp;
        } }
        for(i=0; i<10; i++){ 
        System.out.print(data[i]+" ");
        }}}
       
    