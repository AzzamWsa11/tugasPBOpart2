/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Azzam Wildan
 */
public class MatematikaCanggih extends Matematika {
    void modulus(double a, double b) {
        if (b != 0) {
            double hasil = a % b;
            System.out.println("Hasil modulus (double): " + hasil);
        } else {
            System.out.println("Error: Pembagi tidak boleh nol.");
        }
    }
    
    @Override
    void pertambahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.println("Hasil pertambahan (double, 3 parameter): " + hasil);
    }

    double operasiTigaBilangan(double a, double b, double c) {
        return a * b + c;
    }
}


    

