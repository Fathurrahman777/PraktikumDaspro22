import java.util.Scanner;

public class StudiKasus222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int dokumen, peringkat;

        System.out.print("Nama mahasiswa  : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = sc.nextLine().trim();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("Mandiri")) {              // tingkat 1
            System.out.print("Jumlah dokumen  : ");
            dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {                  
                if (dokumen >= 4) {                                  
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + peringkat + ").");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        }  else if (jenis.equalsIgnoreCase("PKM")) {                  // tingkat 1
            System.out.print("Jumlah dokumen  : ");
            dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPkm = sc.nextInt();

            if (statusPkm == 1) {                                    
                if (dokumen >= 4) {                                  
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        } else {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }
        sc.close();
    }
}