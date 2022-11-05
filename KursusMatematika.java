public class KursusMatematika extends Kursus{
    Boolean[] numb = {false, false, false, false, false};
    public int harga = 300000;
    public String namaPel;
    //Methode Overriding
    String fasilitas (){
        return "Fasilitas = ruang AC, meja, kursi, alat tulis " +hr;
    }
    public void pemesanan(){
        for(int i = 0; i<3; i++){
            if (numb[i] == false){
                System.out.println("\n======================================");
                System.out.println("no jadwal"+(i+1));
                break;
            }
        }
        System.out.println("Harga perhari = "+harga);
        System.out.println(fasilitas());
    }
}
