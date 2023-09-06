/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

public class Tas extends Nesne {
    private double katilik=2;

    public Tas(double dayaniklilik, int seviyepuani,double katilik) {
        super(dayaniklilik, seviyepuani);
        this.katilik = katilik;
    }

    Tas() {
        
    }
    
    @Override
    int nesnePuaniGoster() {
        return getSeviyepuani();
    }
    double Etk(Makas mks){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.katilik;
        payda=a*mks.getKeskinlik();
        etki=pay/payda;
        return etki;
    }
    double Etk(UstaMakas mks){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.katilik;
        payda=a*mks.getKeskinlik()*mks.getDirenc();
        etki=pay/payda;
        return etki;
    }
    double Etk(Kagit kgt){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.katilik;
        payda=(1-a)*kgt.getNufuz();
        etki=pay/payda;
        return etki;
    }
    double Etk(OzelKagit kgt){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.katilik;
        payda=(1-a)*kgt.getNufuz()*kgt.getKalinlik();
        etki=pay/payda;
        return etki;
    }
    double Etk(Tas tas){
        return 0.0;
    }
    double Etk(AgirTas tas){
        double etki,pay,payda;
        pay=this.katilik;
        payda=this.katilik*tas.getSicaklik();
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

    public double getKatilik() {
        return katilik;
    }

    public void setKatilik(double katilik) {
        this.katilik = katilik;
    }    
    
}
