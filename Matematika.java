/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Azzam Wildan
 */
public class Matematika {
    void pertambahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil pertambahan (int, 2 parameter): " + hasil);
    }
    
    void pertambahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.println("Hasil pertambahan (double, 3 parameter): " + hasil);
    }
    
    void pertambahan(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil pertambahan (double, 2 parameter): " + hasil);
    }
    
    void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil perkalian: " + hasil);
    }
    
    void pembagian(int a, int b) {
        if (b != 0) {
            double hasil = (double) a / b;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            System.out.println("Error: Pembagi tidak boleh nol.");
        }
    }

    void modulus(int a, int b) {
        if (b != 0) {
            int hasil = a % b;
            System.out.println("Hasil modulus: " + hasil);
        } else {
            System.out.println("Error: Pembagi tidak boleh nol.");
        }
    }
}

