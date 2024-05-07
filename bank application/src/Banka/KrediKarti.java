package Banka;



class KrediKarti extends Musteri{

    private int kartNumarasi;
    double limit;
    double guncelBorc;

    double kullanilabilirLimit;

    public KrediKarti() {}

    public KrediKarti(int kartNumarasi, double limit, double guncelBorc, double kullanilabilirLimit){
        this.kartNumarasi=kartNumarasi;
        this.limit=limit;
        this.guncelBorc=guncelBorc;
        this.kullanilabilirLimit=limit-guncelBorc;
    }

    public int getKartNumarasi() {
        return kartNumarasi;
    }

    public void setKartNumarasi(int kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getGuncelBorc() {
        return guncelBorc;
    }

    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }

    public double getKullanilabilirLimit() {
        return kullanilabilirLimit;
    }

    public void setKullanilabilirLimit(double kullanilabilirLimit) {
        this.kullanilabilirLimit = kullanilabilirLimit;
    }

    public void kredikartiEkle(int kartNumarasi, double limit){
        KrediKarti krediKarti = null;
        krediKarti.kartNumarasi = kartNumarasi;
        krediKarti.limit=limit;
        krediKartlari.add(krediKarti);

    }

    public void krediKartiSil(int kartNumarasi, double limit,double guncelBorc){
        KrediKarti krediKarti = null;
        krediKarti.kartNumarasi=kartNumarasi;
        krediKarti.limit=limit;
        krediKarti.guncelBorc=guncelBorc;
        if(krediKarti.guncelBorc==0){
            krediKartlari.remove(krediKarti);

        }
        else{
            System.out.println("Lutfen oncelikle borc odemesi yapiniz. \n");
        }
    }

    public double kullanilabilirLimit(int kartNumarasi, double guncelBorc){
        KrediKarti krediKarti=null;
        assert krediKarti != null;
        krediKarti.kartNumarasi=kartNumarasi;
        krediKarti.guncelBorc=guncelBorc;

        return krediKarti.kullanilabilirLimit;
    }

    public String toString() {
        String output = "Kredi karti: | ";

        output +=
                "#"
                        + getKartNumarasi()
                        + "\t | "
                        + "limit: "
                        + getLimit()
                        + "\t | "
                        + "guncel borc: "
                        + getGuncelBorc()
                        + "\t | "
                        + "kullanilabilir limit: "
                        + getKullanilabilirLimit()
                        + "\t |\n";

        return output;
    }

}