package Banka;

class Krediler extends Musteri{

    private int krediID;
    double krediMiktari;
    int taksitMiktari;

    public Krediler() {}

    public Krediler(int krediID, double krediMiktari, int taksitMiktari){
        this.krediID=krediID;
        this.krediMiktari=krediMiktari;
        this.taksitMiktari=taksitMiktari;
    }

    public int getKrediID() {
        return krediID;
    }

    public void setKrediID(int krediID) {
        this.krediID = krediID;
    }

    public double getKrediMiktari() {
        return krediMiktari;
    }

    public void setKrediMiktari(double krediMiktari) {

        this.krediMiktari = krediMiktari;
    }

    public double getTaksitMiktari() {
        return taksitMiktari;
    }

    public void setTaksitMiktari(int taksitMiktari) {
        this.taksitMiktari = taksitMiktari;
    }

    public void Kampanya(KrediKarti limit){

    }

    public String toString() {
        String output = "Kredi: | ";

        output +=
                ""
                        + "kredi ID "
                        + getKrediID()
                        + "\t | "
                        + "kredi miktari: "
                        + getKrediMiktari()
                        + "\t | "
                        + "taksit sayisi: "
                        + getTaksitMiktari()
                        + "\t |\n";

        return output;
    }
}
