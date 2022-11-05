import java.util.Scanner;

public class Pelanggan {
    Scanner in = new Scanner(System.in);
    Petugas petugas = new Petugas();
    public int idpel;
    private String nama;
    public int nohp, pilih;

    // dibaawah ini merupakan getter & setter
    public int getIdPel() {
        return idpel;
    }

    public void setIdPel(int idpel) {

        this.idpel = Pelanggan.this.idpel;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public int getNohp() {
        return nohp;
    }

    public void setNohp(int nohp) {

        this.nohp = nohp;
    }
//getter
    public int getPilih() {

        return pilih;
    }
//setter
    public void setPilih(int pilih) {

        this.pilih = pilih;
    }

    public void daftar(){

        System.out.println("Silahkan masukkan nama anda : ");
        setNama(in.next());
        System.out.println("Silahkan masukkan id anda : ");
        setIdPel(in.nextInt());
        System.out.println("Masukkan No telepon anda : ");
        setNohp(in.nextInt());
        System.out.println("Silahkan pilih Mata Pelajaran yang anda tuju : ");
        System.out.println("1. Matematika\n2. Fisika");
        pilih = in.nextInt();
        if(pilih == 1){
            petugas.I = 1;
            System.out.println("Terimakasih, data anda sudah terdaftar di kursus Matematika");
        }
        else {
            petugas.I = 2;
            System.out.println("Terimakasih, data anda sudah terdaftar di kursus Fisika");
        }
    }
}
