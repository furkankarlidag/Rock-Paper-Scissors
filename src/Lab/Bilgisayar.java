package Lab;

import java.util.ArrayList;
import java.util.Random;

public class Bilgisayar extends Oyuncu {
    
    private double toplam;

    public Bilgisayar() {
    }

    public Bilgisayar(double toplam, String oyuncuID, String oyuncuAdi, double skor, Nesne[] nesneler) {
        setOyuncuID("00000");
        setOyuncuAdi("Bilgisayar");
        setSkor(skor);
        setNesneler(nesneler);
        this.toplam = toplam;
    }




    @Override
    public double SkorGoster(double dayiniklilik) {
        toplam=toplam+dayiniklilik;
        setToplam(toplam);
        return getToplam();
    }


    @Override
    public String[] NesneSec(int[] dizi) {
        int[] secilennesne=new int[5];
        Random rastgele = new Random();
        for (int i = 0; i < 5; i++) {
            int rastgeleSayi = rastgele.nextInt(3)+1;
                switch (rastgeleSayi){
                    case 1:
                        secilennesne[i]=1;
                        break;
                    case 2:
                        secilennesne[i]=2;
                        break;
                    case 3:
                        secilennesne[i]=3;
                        break;
                }
        }
        String[] nesneismi=new String[5];
        for (int i = 0; i < 5; i++) {
            if(secilennesne[i]==1)
                nesneismi[i]="Taş";
            else if (secilennesne[i]==2)
                nesneismi[i]="Kağıt";
            else if (secilennesne[i]==3)
                nesneismi[i]="Makas";
        }
        return nesneismi;
    }

    public double getToplam() {
        return toplam;
    }

    public void setToplam(double toplam) {
        this.toplam = toplam;
    }  
}
