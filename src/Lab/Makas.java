/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author Victus
 */
public class Makas extends Nesne{
    private double keskinlik=2;

    public Makas() {
    }

    public Makas(double keskinlik, double dayaniklilik, int seviyepuani) {
        super(dayaniklilik, seviyepuani);
        this.keskinlik = keskinlik;
    }

    @Override
    int nesnePuaniGoster() {
        return getSeviyepuani();
    }
    double Etk(Kagit kgt){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.keskinlik;
        payda=a*kgt.getNufuz();
        etki=pay/payda;
        return etki;
    }
    double Etk(OzelKagit kgt){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.keskinlik;
        payda=a*kgt.getNufuz()*kgt.getKalinlik();
        etki=pay/payda;
        return etki;
    }
    double Etk(Tas tas){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.keskinlik;
        payda=(1-a)*tas.getKatilik();
        etki=pay/payda;
        return etki;
    }
    double Etk(AgirTas tas){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.keskinlik;
        payda=(1-a)*tas.getKatilik()*tas.getSicaklik();
        etki=pay/payda;
        return etki;
    }
    double Etk(Makas mks){
        return 0.0;
    }
    double Etk(UstaMakas mks){
        double etki,pay,payda;
        pay=this.keskinlik;
        payda=this.keskinlik*mks.getDirenc();
        etki=pay/payda;
        return etki;
    }

    @Override
    double etkiHesapla(Tas obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(Makas obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(Kagit obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(AgirTas obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(UstaMakas obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(OzelKagit obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    void durumGuncelle(double etk) {
        double yenday;
        yenday=getDayaniklilik();
        yenday=yenday-etk;
        setDayaniklilik(yenday);
    }

    public double getKeskinlik() {
        return keskinlik;
    }

    public void setKeskinlik(double keskinlik) {
        this.keskinlik = keskinlik;
    }
    
    
}

