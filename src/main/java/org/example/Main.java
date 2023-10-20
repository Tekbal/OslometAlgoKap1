package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Dizi boş veya null.");
        }

        int max = arr[0]; // İlk elemanı maksimum olarak varsayalım

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Daha büyük bir değer bulunduğunda maksimumu güncelle
            }
        }

        return max;
    }

    public static int findmin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Dizi bos veya null");
        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }


    public static void main(String[] args) {
        int[] dizi = {15, 85, 45, 65};
        int enBuyukDeger = findMax(dizi);
        int enKucukDeger = findmin(dizi);
        System.out.println("Dizinin en kucuk degeri :" + enKucukDeger);
        System.out.println("Dizinin en büyük değeri: " + enBuyukDeger);

    }
    //yukarıdaki kod, findMax adlı bir fonksiyon içerir. Bu fonksiyon, verilen bir tam sayı dizisindeki en
    // büyük değeri bulur. Ardından, main fonksiyonu bu fonksiyonu kullanarak ve verilen [15, 25, 45, 65] dizisi için
    // en büyük değeri bulur ve ekrana yazdırır.





}