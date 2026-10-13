import java.util.Scanner;

public class StudiKasus225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================================
        // 1. INPUT DATA UTAMA
        // ==========================================
        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        System.out.println("-----------------------------------------------------------------");

        // ==========================================
        // 2. LOGIKA PEMILIHAN BERSARANG (NESTED IF)
        // ==========================================
        
        // --- CABANG 1: LOMBA (BELMAWA / BAKORMA / MANDIRI) ---
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        // --- CABANG 2: PKM ---
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPKM = sc.nextInt();
            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        // --- CABANG 3: LAINNYA ---
        } else {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }
        System.out.println("-----------------------------------------------------------------");

        sc.close();
    }
}

        
