public class Doktor {
    private String ad;
    private String soyad;
    private String uzmanlik;

    // Constructor
    public Doktor(String ad, String soyad, String uzmanlik) {
        this.ad = ad;
        this.soyad = soyad;
        this.uzmanlik = uzmanlik;
    }

    // Getter ve Setter metodları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUzmanlik() {
        return uzmanlik;
    }

    public void setUzmanlik(String uzmanlik) {
        this.uzmanlik = uzmanlik;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", uzmanlik='" + uzmanlik + '\'' +
                '}';
    }
}
