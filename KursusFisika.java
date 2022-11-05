public class KursusFisika extends Kursus{
    Boolean[] no_jdwl = {false, false, false, false, false};
    public int harga = 150000;
    String fasilitas (){
        return "Fasilitas = ruang AC, meja, kursi, alat tulis "+hr;
    }
    public void pemesanan(){
        for(int i = 0; i<5; i++){
            if (no_jdwl[i] == false){
                System.out.println("\n======================================================");
                System.out.println("\tno jadwal "+(i+1));
                break;
            }
        }
        System.out.println("\tHarga perhari : "+harga);
        System.out.println(fasilitas());
    }
}
