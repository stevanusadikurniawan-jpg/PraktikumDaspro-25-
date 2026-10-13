import java.util.Scanner;
public class StudiKasus125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaPercup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, Kurang;

        System.out.print("Masukkan jumlah Cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("masukkan uang bayar :");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPercup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga : Rp " + totalHarga);
        System.out.println("Diskon : Rp " + diskon);
        System.out.println("total Bayar : Rp " + totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembaalian : Rp " + kembalian);
        } else {
            Kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang : Rp " + Kurang);
        }
        sc.close();

    }


    }
    
}
