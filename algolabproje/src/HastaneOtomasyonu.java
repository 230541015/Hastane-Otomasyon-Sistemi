import java.util.Scanner;

public class HastaneOtomasyonu {
    public static void main(String[] args) {
        VeriYonetimi veriYonetimi = new VeriYonetimi();
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n----- Hastane Otomasyonu -----");
            System.out.println("1. Hasta Ekle");
            System.out.println("2. Doktor Ekle");
            System.out.println("3. Randevu Ekle");
            System.out.println("4. Hasta Listesini Görüntüle");
            System.out.println("5. Doktor Listesini Görüntüle");
            System.out.println("6. Randevu Listesini Görüntüle");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();
            scanner.nextLine(); // Yeni satır karakterini temizle

            switch (secim) {
                case 1:
                    // Hasta ekle
                    System.out.print("Hasta adı: ");
                    String hastaAd = scanner.nextLine();
                    System.out.print("Hasta soyadı: ");
                    String hastaSoyad = scanner.nextLine();
                    System.out.print("Hasta yaşı: ");
                    int hastaYas = scanner.nextInt();
                    scanner.nextLine(); // Yeni satır karakterini temizle
                    System.out.print("Hasta cinsiyeti: ");
                    String hastaCinsiyet = scanner.nextLine();
                    System.out.print("Hasta telefonu: ");
                    String hastaTelefon = scanner.nextLine();
                    Hasta yeniHasta = new Hasta(hastaAd, hastaSoyad, hastaYas, hastaCinsiyet, hastaTelefon);
                    veriYonetimi.hastaEkle(yeniHasta);
                    System.out.println("Hasta eklendi.");
                    break;

                case 2:
                    // Doktor ekle
                    System.out.print("Doktor adı: ");
                    String doktorAd = scanner.nextLine();
                    System.out.print("Doktor soyadı: ");
                    String doktorSoyad = scanner.nextLine();
                    System.out.print("Doktor uzmanlık alanı: ");
                    String doktorUzmanlik = scanner.nextLine();
                    Doktor yeniDoktor = new Doktor(doktorAd, doktorSoyad, doktorUzmanlik);
                    veriYonetimi.doktorEkle(yeniDoktor);
                    System.out.println("Doktor eklendi.");
                    break;

                case 3:
                    // Randevu ekle
                    System.out.print("Hasta numarası: ");
                    int hastaNo = scanner.nextInt();
                    scanner.nextLine(); // Yeni satır karakterini temizle
                    System.out.print("Doktor numarası: ");
                    int doktorNo = scanner.nextInt();
                    scanner.nextLine(); // Yeni satır karakterini temizle

                    System.out.print("Randevu tarihi (yyyy-mm-dd): ");
                    String tarih = scanner.nextLine();

                    if (hastaNo > 0 && hastaNo <= veriYonetimi.getHastaListesi().size() &&
                            doktorNo > 0 && doktorNo <= veriYonetimi.getDoktorListesi().size()) {
                        Hasta secilenHasta = veriYonetimi.getHastaListesi().get(hastaNo - 1);
                        Doktor secilenDoktor = veriYonetimi.getDoktorListesi().get(doktorNo - 1);
                        Randevu yeniRandevu = new Randevu(secilenHasta, secilenDoktor, tarih);
                        veriYonetimi.randevuEkle(yeniRandevu);
                        System.out.println("Randevu eklendi.");
                    } else {
                        System.out.println("Geçersiz hasta veya doktor numarası.");
                    }
                    break;

                case 4:
                    // Hasta listesini görüntüle
                    System.out.println("Hasta Listesi:");
                    for (Hasta hasta : veriYonetimi.getHastaListesi()) {
                        System.out.println(hasta);
                    }
                    break;

                case 5:
                    // Doktor listesini görüntüle
                    System.out.println("Doktor Listesi:");
                    for (Doktor doktor : veriYonetimi.getDoktorListesi()) {
                        System.out.println(doktor);
                    }
                    break;

                case 6:
                    // Randevu listesini görüntüle
                    System.out.println("Randevu Listesi:");
                    for (Randevu randevu : veriYonetimi.getRandevuListesi()) {
                        System.out.println(randevu);
                    }
                    break;

                case 0:
                    // Çıkış
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        } while (secim != 0);

        scanner.close();
    }
}
