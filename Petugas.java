import java.util.Scanner;
public class Petugas {
    private String nama;
    public int pilih;

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public int getPilih() {

        return pilih;
    }

    public void setPilih(int pilih) {
        this.pilih = pilih;
    }
    public char data;
    Scanner in = new Scanner(System.in);
    public String namaPel;
    public int idPel;
    public int nohp;
    public int I = 0;
    KursusMatematika mtk = new KursusMatematika();
    KursusFisika fisika = new KursusFisika();

    public void inputPendaftaran(){
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Daftar Data Pelanggan");
        System.out.println("[1] nama : "+namaPel);
        System.out.println("    id   : "+idPel);
        System.out.println("    npHp : "+nohp);
        if (I == 1){
            System.out.println("pelanggan "+namaPel+" Memesan Jadwal Kursus Matematika...");
        }
        else {
            System.out.println("pelanggan "+namaPel+" Memesan Jadwal Kursus Fisika...");
        }
        System.out.println("\nMasukkan data ? [Y/T]");
        data = in.next().charAt(0);
        if (data == 'Y' || data == 'y'){
            if (I == 1){
                mtk.pemesanan();
            }
            else {
                fisika.pemesanan();
            }
        }
        else {
            System.out.println("\t...Good Luck...");
        }
    }
}
