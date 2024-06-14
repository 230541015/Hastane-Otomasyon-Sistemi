import java.util.ArrayList;
import java.util.List;

public class VeriYonetimi {
    private List<Hasta> hastaListesi;
    private List<Doktor> doktorListesi;
    private List<Randevu> randevuListesi;

    public VeriYonetimi() {
        this.hastaListesi = new ArrayList<>();
        this.doktorListesi = new ArrayList<>();
        this.randevuListesi = new ArrayList<>();
    }

    // Hasta ekleme
    public void hastaEkle(Hasta hasta) {
        hastaListesi.add(hasta);
    }

    // Doktor ekleme
    public void doktorEkle(Doktor doktor) {
        doktorListesi.add(doktor);
    }

    // Randevu ekleme
    public void randevuEkle(Randevu randevu) {
        randevuListesi.add(randevu);
    }

    // Hasta listesi
    public List<Hasta> getHastaListesi() {
        return hastaListesi;
    }

    // Doktor listesi
    public List<Doktor> getDoktorListesi() {
        return doktorListesi;
    }

    // Randevu listesi
    public List<Randevu> getRandevuListesi() {
        return randevuListesi;
    }
}
