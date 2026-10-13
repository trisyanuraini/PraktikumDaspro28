import java.util.Scanner;
public class StudiKasus128 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 18000;

        System.out.print("Masukkan jumlah cup: ");
        int jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar: Rp");
        int uangBayar = input.nextInt();
        int totalHarga = jumlahCup * hargaPerCup;
        int diskon = 0;
        
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        int totalBayar = totalHarga - diskon;
        int kembalian = uangBayar - totalBayar;
        int kurang = totalBayar - uangBayar;
        System.out.println("Total harga: Rp" + totalHarga);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total bayar: Rp" + totalBayar);
        
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
        input.close();
        }
    }
