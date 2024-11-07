/**
 * Kelas Calculator menyediakan fungsi dasar kalkulator seperti
 * penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class Calculator {

    /**
     * Menjumlahkan dua bilangan.
     *
     * @param bil_pertama bilangan pertama yang akan dijumlahkan
     * @param bil_kedua bilangan kedua yang akan dijumlahkan
     * @return hasil penjumlahan dari bil_pertama dan bil_kedua
     */
    public double add(double bil_pertama, double bil_kedua) {
        return bil_pertama + bil_kedua;
    }

    /**
     * Mengurangi bilangan kedua dari bilangan pertama.
     *
     * @param bil_pertama bilangan pertama
     * @param bil_kedua bilangan kedua yang akan dikurangi dari bil_pertama
     * @return hasil pengurangan dari bil_pertama dan bil_kedua
     */
    public double subtract(double bil_pertama, double bil_kedua) {
        return bil_pertama - bil_kedua;
    }

    /**
     * Mengalikan dua bilangan.
     *
     * @param bil_pertama bilangan pertama yang akan dikalikan
     * @param bil_kedua bilangan kedua yang akan dikalikan
     * @return hasil perkalian dari bil_pertama dan bil_kedua
     */
    public double multiply(double bil_pertama, double bil_kedua) {
        return bil_pertama * bil_kedua;
    }

    /**
     * Membagi bilangan pertama dengan bilangan kedua.
     *
     * @param bil_pertama bilangan pertama (pembilang)
     * @param bil_kedua bilangan kedua (penyebut)
     * @return hasil pembagian dari bil_pertama dan bil_kedua
     * @throws ArithmeticException jika bil_kedua sama dengan nol
     */
    public double divide(double bil_pertama, double bil_kedua) throws ArithmeticException {
        if (bil_kedua == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol");
        }
        return bil_pertama / bil_kedua;
    }

    /**
     * Metode utama untuk menjalankan kalkulator.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Penjumlahan: " + calculator.add(num1, num2));
        System.out.println("Pengurangan: " + calculator.subtract(num1, num2));
        System.out.println("Perkalian: " + calculator.multiply(num1, num2));
        
        try {
            System.out.println("Pembagian: " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
