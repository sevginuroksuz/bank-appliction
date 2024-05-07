package Banka;

class VadesizHesap extends BankaHesap {
    String hesapTuru;
    double vadesizBakiye;

    public VadesizHesap() {
    }

    public VadesizHesap(String hesapTuru, double vadesizBakiye) {
        this.hesapTuru = hesapTuru;
        this.vadesizBakiye = vadesizBakiye;
    }

    @Override
    public String getHesapTuru() {
        return hesapTuru;
    }

    @Override
    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }

    public double getVadesizBakiye() {
        return vadesizBakiye;
    }

    public void setVadesizBakiye(double vadesizBakiye) {
        this.vadesizBakiye = vadesizBakiye;
    }


    // Girilen hesap turunun maas veya normal hesap olamsına gore paratransferlerinde alinacak islem ucret bedeli bakiyeye yansitilir.
    public double paraTransfer(String hesapTuru, long iban, double vadesizBakiye, double islemMiktari){
        switch (hesapTuru){
            case "maas":
                vadesizBakiye = vadesizBakiye - islemMiktari;
                return vadesizBakiye;
            case "normal":
                vadesizBakiye = vadesizBakiye - islemMiktari - 8;
                return vadesizBakiye;
            default:
                return 0.0;       // Herhangi bir hesap turu secilmediginde 0 dondurur.

        }
    }


    // KrediKariBorcodeme fonksiyonunda vadesizBakiyeden guncelBorc miktari dusulur ve guncelBorc sifirlanir.
    double krediKartiBorcOdeme(double vadesizBakiye,KrediKarti guncelBorc){
        vadesizBakiye -= guncelBorc.guncelBorc;
        guncelBorc.guncelBorc=0.0f;
        return vadesizBakiye;
    }

    // Girilen krediID numarali kredinin odenecek taksit miktariyla
    double krediOdeme(int krediID, Krediler kredi, int odenecekTaksitSayisi ){
        double taksit= kredi.krediMiktari/kredi.taksitMiktari;
        kredi.taksitMiktari-=odenecekTaksitSayisi;
        kredi.krediMiktari-= taksit*kredi.taksitMiktari;
        return krediID;
    }



    public String toString() {
        String output = "Vadesiz Hesap: | ";

        output +=
                ""
                        + "hesap turu: "
                        + getHesapTuru()
                        + "\t | "
                        + "vadesiz bakiye: "
                        + getVadesizBakiye()
                        + "\t |\n";

        return output;
    }
}
