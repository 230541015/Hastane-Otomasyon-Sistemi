public class Randevu {
    private Hasta hasta;
    private Doktor doktor;
    private String tarih;

    // Constructor
    public Randevu(Hasta hasta, Doktor doktor, String tarih) {
        this.hasta = hasta;
        this.doktor = doktor;
        this.tarih = tarih;
    }

    // Getter ve Setter metodları
    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "Randevu{" +
                "hasta=" + hasta +
                ", doktor=" + doktor +
                ", tarih='" + tarih + '\'' +
                '}';
    }
}
