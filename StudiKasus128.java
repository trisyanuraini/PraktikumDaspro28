import java.util.Scanner;
public class StudiKasus128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    String namaMahasiswa, jenisKegiatan;
    int jumlahDokumen, peringkatJuara, statusPendanaan;
    // Input data mahasiswa
    System.out.print("Masukkan nama mahasiswa: ");
    namaMahasiswa = sc.nextLine();

    System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
    jenisKegiatan = sc.nextLine();
    // Proses dan output status pendanaan
    if (jenisKegiatan.equalsIgnoreCase("Belmawa") || jenisKegiatan.equalsIgnoreCase("Bakorma") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

        System.out.print("Masukkan peringkat juara: ");
        peringkatJuara = sc.nextInt();

        if (peringkatJuara >= 1 && peringkatJuara <= 3) {
            System.out.print("Masukkan jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();

            if (jumlahDokumen >= 4) {
                System.out.println("Status : " + "Jumlah doukumen lengkap, Berhak memperoleh pendanaan");
                statusPendanaan = sc.nextInt();
            } else {
                System.out.println("Status : " + "Jumlah doukumen tidak lengkap (kurang " + (4 - jumlahDokumen) + "), Tidak berhak memperoleh pendanaan");
                
            }
        } else {
            System.out.println("Pendanaan hanya diberikan kepada juara 1, 2, dan 3. Tidak berhak memperoleh pendanaan.");
        }
        // Proses dan output status pendanaan untuk kegiatan PKM
    } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
        System.out.print("Status pendanaan PKM (1=lolos, 0=tidak lolos) ");
        statusPendanaan = sc.nextInt();

        if (statusPendanaan == 1) {
            System.out.print("Masukkan jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            if (jumlahDokumen >= 4) {
                System.out.println("Status : " + "Berhak memperoleh pendanaan. Kegiatan PKM dengan jumlah dokumen yang lengkap.");
                
            } else {
                System.out.println("Status : " + "Tidak berhak memperoleh pendanaan. Kegiatan PKM tetapi jumlah dokumen tidak lengkap, kurang " + (4 - jumlahDokumen));
                
            }
        } else {
            System.out.println("Status : " + "Tidak berhak memperoleh pendanaan. Kegiatan PKM tetapi jumlah dokumen tidak lengkap, kurang ");
           
        }
        // Proses dan output status pendanaan untuk kegiatan lainnya
    } else if (jenisKegiatan.equalsIgnoreCase("Lainnya")) {
         System.out.print("Masukkan jumlah dokumen: ");
        jumlahDokumen = sc.nextInt();

        } else {
        System.out.print("Status : " + "Tidak berhak memperoleh pendanaan. Jenis kegiatan tidak termasuk dalam kategori yang berhak memperoleh pendanaan.");
       
    sc.close();
} 
} 
}




