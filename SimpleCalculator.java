import java.util.Scanner;

/**
 * <img src="images/logo.png" alt="Logo Kalkulator" width="200">
 *
 * <h1>Kalkulator Sederhana</h1>
 * <p>Kelas <b>SimpleCalculator</b> ini menyediakan operasi dasar aritmatika seperti 
 * penjumlahan, pengurangan, perkalian, dan pembagian untuk dua angka. Kelas ini
 * ditujukan untuk memudahkan operasi matematis sederhana dalam proyek Java Anda.</p>
 *
 * <h2>Contoh Penggunaan:</h2>
 * <pre>
 * SimpleCalculator calc = new SimpleCalculator();
 * double result = calc.add(5, 3); // Hasilnya adalah 8
 * </pre>
 *
 * <h2>Fitur</h2>
 * <ul>
 * <li>Penjumlahan dua angka</li>
 * <li>Pengurangan dua angka</li>
 * <li>Perkalian dua angka</li>
 * <li>Pembagian dua angka</li>
 * </ul>
 */

public class SimpleCalculator {

    /**
     * Konstruktor default untuk kelas SimpleCalculator.
     */
    public SimpleCalculator() {
        // Konstruktor kosong
    }

    /**
     * Menambahkan dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil penjumlahan dari a dan b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Mengurangi dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil pengurangan dari a dan b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Mengalikan dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil perkalian dari a dan b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Membagi dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil pembagian dari a dan b
     * @throws ArithmeticException jika b adalah 0
     */
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol");
        }
        return a / b;
    }

    /**
     * Program utama yang meminta pengguna untuk memilih operasi dan memasukkan angka.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih operasi: ");
        System.out.println("1 - Penjumlahan");
        System.out.println("2 - Pengurangan");
        System.out.println("3 - Perkalian");
        System.out.println("4 - Pembagian");

        int choice = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        try {
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Hasil: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Hasil: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Hasil: " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println("Hasil: " + result);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
