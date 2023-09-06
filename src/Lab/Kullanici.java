package Lab;

public class Kullanici extends Oyuncu {
    private double toplam;
    
    public Kullanici() {
    }

    public Kullanici(String oyuncuID, String oyuncuAdi, double skor, Nesne[] nesneler) {
        super(oyuncuID, oyuncuAdi, skor, nesneler);
    }

    @Override
    public double SkorGoster(double dayiniklilik) {
        toplam=toplam+dayiniklilik;
        setToplam(toplam);
        return getToplam();
    }

    @Override
    public String[] NesneSec(int[] dizi){
        String[] secilennesneler=new String[5];
        for (int i = 0; i < 5; i++) {
            if(dizi[i]==1){
                secilennesneler[i]="Taş";
            } else if (dizi[i]==2)
                secilennesneler[i]="Kağıt";
            else if (dizi[i]==3)
                secilennesneler[i]="Makas";
        }
        return secilennesneler;
    }

    public double getToplam() {
        return toplam;
    }

    public void setToplam(double toplam) {
        this.toplam = toplam;
    }
   
}
