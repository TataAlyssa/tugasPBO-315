import java.util.Scanner;
import java.util.Arrays;

public class Main {
    Main(){
        System.out.println("\n\tProgram Pendaftaran Kursus");
        System.out.println("======================================");
    }
        public static void main(String[] args) {
            int pilih = 1;
            Petugas petugas = new Petugas();
            Main tta = new Main();
            KursusMatematika mtk = new KursusMatematika();
            KursusFisika fisika = new KursusFisika();
            Pelanggan cust = new Pelanggan();
            Scanner in = new Scanner(System.in);
            petugas.setNama("Tata Alyssa");
            while (pilih != 3) {
                Kursus kursus = new Kursus();
                System.out.println("Wellcome : ");
                System.out.println("1. Pelanggan\n2. Pelanggan");
                System.out.println("Masukkan pilihan : ");
                pilih = in.nextInt();
                if (pilih == 1) {
                    cust.daftar();
                } else {
                    System.out.println("\nSelamat Datang, Kursus pada mode Admin " + petugas.getNama());
                    petugas.namaPel = cust.getNama();
                    petugas.idPel = cust.getIdPel();
                    petugas.nohp = cust.getNohp();
                    petugas.inputPendaftaran();
                    break;
                }
            }
        }
    }