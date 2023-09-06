package Lab;

abstract public class Nesne {
    private double dayaniklilik=20;
    private int seviyepuani=0;

    public Nesne(){
    }
    public Nesne(double dayaniklilik, int seviyepuani) {
        this.dayaniklilik = dayaniklilik;
        this.seviyepuani = seviyepuani;
    }
    abstract int nesnePuaniGoster();

    abstract double etkiHesapla(Tas obj);
    abstract double etkiHesapla(Makas obj);
    abstract double etkiHesapla(Kagit obj);
    abstract double etkiHesapla(AgirTas obj);
    abstract double etkiHesapla(UstaMakas obj);
    abstract double etkiHesapla(OzelKagit obj);
    

    abstract void durumGuncelle(double etk);

    public double getDayaniklilik() {
        return dayaniklilik;
    }

    public void setDayaniklilik(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }

    public int getSeviyepuani() {
        return seviyepuani;
    }

    public void setSeviyepuani(int seviyepuani) {
        this.seviyepuani = seviyepuani;
    }
}
