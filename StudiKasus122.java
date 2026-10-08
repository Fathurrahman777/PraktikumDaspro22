import java.util.Scanner;
public class StudiKasus122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPercup = 18000;
        int jumlahPercup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahPercup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPercup * jumlahPercup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        }
        else {
            totalBayar = totalHarga - diskon;
        }
        System.out.println("Total Harga = Rp. " + totalHarga);
        System.out.println("Diskon = Rp. " + diskon);
        System.out.println("Total Bayar = Rp. " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian = Rp. " + kembalian);
        }
        else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang  Rp. " + kurang);

        }
    }
}