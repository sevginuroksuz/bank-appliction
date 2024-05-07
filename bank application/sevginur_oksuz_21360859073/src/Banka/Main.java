package Banka;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        int musteriNumarasi= (int) (Math.random()%1000 +1);
        int tcno= (int) (Math.random()%1000 +1);
        int personelID = (int) (Math.random()%1000 +1);
        int kartNumrasi=(int) (Math.random()%1000 +1);
        long iban = (long) (Math.random()%1000 +1);

        BankaPersonel personel = new BankaPersonel("Selami","Yilmaz","selamiylmz@gmail.com",567234120);
        personel.setPersonelID(2);
       // System.out.println(personel);

        Musteri musteri = new Musteri("Selin", "Aydin","slinaydn@gmail.com", 4562378,1236);
        musteri.setEmail("slinaydn@gmail.com");
        musteri.setTcKimlikNo(789);
       // System.out.println(musteri);

        // hesapEkle ve hesapSill fonksiyonu
        //BankaHesap musterihesap = new BankaHesap();
       // musterihesap.iban=iban;

       // musteri.hesapEkle("vadeli",musterihesap);
      //  musteri.hesapSil(musterihesap.iban,musterihesap.toplamBakiye,musterihesap.hesapBilgisi);

        // hesapGoruntule fonksiyonu
        //BankaHesap hesap = new BankaHesap(iban,234.98,"vadesiz");
       // hesap.hesapGoruntuleme(musteriNumarasi,"zeynep","yaz",iban, 234.98,"vadesiz");

        // krediKartiEkle
        KrediKarti krediKarti = new KrediKarti(kartNumrasi,1123.89,123.0,1000.89);
        krediKarti.kredikartiEkle(kartNumrasi,1123.89);



















    }
}