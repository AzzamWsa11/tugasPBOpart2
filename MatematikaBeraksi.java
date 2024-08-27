/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Azzam Wildan Shidqii Al-Afghani NIM 09040623054
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat instance dari MatematikaCanggih
        MatematikaCanggih matematika = new MatematikaCanggih();
        
        // Uji metode modulus
        matematika.modulus(10, 3); // Output: Hasil modulus (int): 1
        matematika.modulus(10.5, 3.2); // Output: Hasil modulus (double): 1.1

        // Uji overloading pertambahan
        matematika.pertambahan(12.5, 28.7, 14.2); // Output: Hasil pertambahan (double, 3 parameter): 55.4
        matematika.pertambahan(12, 28, 14); // Output: Hasil pertambahan (int, 3 parameter): 54
        matematika.pertambahan(23, 34); // Output: Hasil pertambahan (int, 2 parameter): 57
        matematika.pertambahan(3.4, 4.9); // Output: Hasil pertambahan (double, 2 parameter): 8.3

        // Uji metode tambahan
        double hasilOperasi = matematika.operasiTigaBilangan(2.5, 4.0, 3.0);
        System.out.println("Hasil operasi tiga bilangan: " + hasilOperasi); // Output: Hasil operasi tiga bilangan: 11.0
    }
}

    

