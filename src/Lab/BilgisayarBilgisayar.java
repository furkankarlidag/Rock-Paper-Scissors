/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Victus
 */
public class BilgisayarBilgisayar extends javax.swing.JFrame {
    Bilgisayar bilgisayar1= new Bilgisayar();
    Bilgisayar bilgisayar2= new Bilgisayar();
    ArrayList<Tas> tas=new  ArrayList<Tas>();
    ArrayList<Kagit> kagit=new  ArrayList<Kagit>();
    ArrayList<Makas> makas=new  ArrayList<Makas>();
    ArrayList<AgirTas> agirtas=new  ArrayList<AgirTas>();
    ArrayList<OzelKagit> ozelkagit=new  ArrayList<OzelKagit>();
    ArrayList<UstaMakas> ustamakas=new  ArrayList<UstaMakas>();
    ArrayList<Tas> tas0=new  ArrayList<Tas>();
    ArrayList<Kagit> kagit0=new  ArrayList<Kagit>();
    ArrayList<Makas> makas0=new  ArrayList<Makas>();
    ArrayList<AgirTas> agirtas0=new  ArrayList<AgirTas>();
    ArrayList<OzelKagit> ozelkagit0=new  ArrayList<OzelKagit>();
    ArrayList<UstaMakas> ustamakas0=new  ArrayList<UstaMakas>();
    String[] secilennesnepc=new String[5];
    String[] secilennesnepc1=new String[5];
    static ArrayList<Integer> sayac1=new ArrayList<Integer>();
    static ArrayList<Integer> sayac2=new ArrayList<Integer>();
    
    public void NesneleriİlkSet(){
        Makas makas1=new Makas();
        Makas makas2=new Makas();
        Makas makas3=new Makas();
        Makas makas4=new Makas();
        Makas makas5=new Makas();
        makas.add(makas1);
        makas.add(makas2);
        makas.add(makas3);
        makas.add(makas4);
        makas.add(makas5);
        Tas tas1=new Tas();
        Tas tas2=new Tas();
        Tas tas3=new Tas();
        Tas tas4=new Tas();
        Tas tas5=new Tas();
        tas.add(tas1);
        tas.add(tas2);
        tas.add(tas3);
        tas.add(tas4);
        tas.add(tas5);
        Kagit kagit1=new Kagit();
        Kagit kagit2=new Kagit();
        Kagit kagit3=new Kagit();
        Kagit kagit4=new Kagit();
        Kagit kagit5=new Kagit();
        kagit.add(kagit1);
        kagit.add(kagit2);
        kagit.add(kagit3);
        kagit.add(kagit4);
        kagit.add(kagit5);
        AgirTas agirtas1=new AgirTas();
        AgirTas agirtas2=new AgirTas();
        AgirTas agirtas3=new AgirTas();
        AgirTas agirtas4=new AgirTas();
        AgirTas agirtas5=new AgirTas();
        agirtas.add(agirtas1);
        agirtas.add(agirtas2);
        agirtas.add(agirtas3);
        agirtas.add(agirtas4);
        agirtas.add(agirtas5);
        UstaMakas ustamakas1=new UstaMakas();
        UstaMakas ustamakas2=new UstaMakas();
        UstaMakas ustamakas3=new UstaMakas();
        UstaMakas ustamakas4=new UstaMakas();
        UstaMakas ustamakas5=new UstaMakas();
        ustamakas.add(ustamakas1);
        ustamakas.add(ustamakas2);
        ustamakas.add(ustamakas3);
        ustamakas.add(ustamakas4);
        ustamakas.add(ustamakas5);
        OzelKagit ozelkagit1=new OzelKagit();
        OzelKagit ozelkagit2=new OzelKagit();
        OzelKagit ozelkagit3=new OzelKagit();
        OzelKagit ozelkagit4=new OzelKagit();
        OzelKagit ozelkagit5=new OzelKagit();
        ozelkagit.add(ozelkagit1);
        ozelkagit.add(ozelkagit2);
        ozelkagit.add(ozelkagit3);
        ozelkagit.add(ozelkagit4);
        ozelkagit.add(ozelkagit5); 
    }
    public void BilgisayarNesneİlkSet(){
        Makas makas1=new Makas();
        Makas makas2=new Makas();
        Makas makas3=new Makas();
        Makas makas4=new Makas();
        Makas makas5=new Makas();
        makas0.add(makas1);
        makas0.add(makas2);
        makas0.add(makas3);
        makas0.add(makas4);
        makas0.add(makas5);
        Tas tas1=new Tas();
        Tas tas2=new Tas();
        Tas tas3=new Tas();
        Tas tas4=new Tas();
        Tas tas5=new Tas();
        tas0.add(tas1);
        tas0.add(tas2);
        tas0.add(tas3);
        tas0.add(tas4);
        tas0.add(tas5);
        Kagit kagit1=new Kagit();
        Kagit kagit2=new Kagit();
        Kagit kagit3=new Kagit();
        Kagit kagit4=new Kagit();
        Kagit kagit5=new Kagit();
        kagit0.add(kagit1);
        kagit0.add(kagit2);
        kagit0.add(kagit3);
        kagit0.add(kagit4);
        kagit0.add(kagit5);
        AgirTas agirtas1=new AgirTas();
        AgirTas agirtas2=new AgirTas();
        AgirTas agirtas3=new AgirTas();
        AgirTas agirtas4=new AgirTas();
        AgirTas agirtas5=new AgirTas();
        agirtas0.add(agirtas1);
        agirtas0.add(agirtas2);
        agirtas0.add(agirtas3);
        agirtas0.add(agirtas4);
        agirtas0.add(agirtas5);
        UstaMakas ustamakas1=new UstaMakas();
        UstaMakas ustamakas2=new UstaMakas();
        UstaMakas ustamakas3=new UstaMakas();
        UstaMakas ustamakas4=new UstaMakas();
        UstaMakas ustamakas5=new UstaMakas();
        ustamakas0.add(ustamakas1);
        ustamakas0.add(ustamakas2);
        ustamakas0.add(ustamakas3);
        ustamakas0.add(ustamakas4);
        ustamakas0.add(ustamakas5);
        OzelKagit ozelkagit1=new OzelKagit();
        OzelKagit ozelkagit2=new OzelKagit();
        OzelKagit ozelkagit3=new OzelKagit();
        OzelKagit ozelkagit4=new OzelKagit();
        OzelKagit ozelkagit5=new OzelKagit();
        ozelkagit0.add(ozelkagit1);
        ozelkagit0.add(ozelkagit2);
        ozelkagit0.add(ozelkagit3);
        ozelkagit0.add(ozelkagit4);
        ozelkagit0.add(ozelkagit5);
    }
    void ilkdayaniklilik(double dayaniklilik){
        jLabel7.setText("Dayanıklılık:"+dayaniklilik);
        jLabel8.setText("Dayanıklılık:"+dayaniklilik);
        jLabel9.setText("Dayanıklılık:"+dayaniklilik);
        jLabel10.setText("Dayanıklılık:"+dayaniklilik);
        jLabel11.setText("Dayanıklılık:"+dayaniklilik);
        jLabel17.setText("Dayanıklılık:"+dayaniklilik);
        jLabel18.setText("Dayanıklılık:"+dayaniklilik);
        jLabel19.setText("Dayanıklılık:"+dayaniklilik);
        jLabel20.setText("Dayanıklılık:"+dayaniklilik);
        jLabel21.setText("Dayanıklılık:"+dayaniklilik);
    }
    void goster(String[] secilennesne){
        if(secilennesne[0].equalsIgnoreCase("Taş")){
            jLabel2.setText("Taş1");
        }
        if(secilennesne[1].equalsIgnoreCase("Taş")){
            jLabel3.setText("Taş2");
        }
        if(secilennesne[2].equalsIgnoreCase("Taş")){
            jLabel4.setText("Taş3");
        }
        if(secilennesne[3].equalsIgnoreCase("Taş")){
            jLabel5.setText("Taş4");
        }
        if(secilennesne[4].equalsIgnoreCase("Taş")){
            jLabel6.setText("Taş5");
        }
        if(secilennesne[0].equalsIgnoreCase("Kağıt")){
            jLabel2.setText("Kağıt1");
        }
        if(secilennesne[1].equalsIgnoreCase("Kağıt")){
            jLabel3.setText("Kağıt2");
        }
        if(secilennesne[2].equalsIgnoreCase("Kağıt")){
            jLabel4.setText("Kağıt3");
        }
        if(secilennesne[3].equalsIgnoreCase("Kağıt")){
            jLabel5.setText("Kağıt4"); 
        }
        if(secilennesne[4].equalsIgnoreCase("Kağıt")){
            jLabel6.setText("Kağıt5");
        }
        if(secilennesne[0].equalsIgnoreCase("Makas")){
            jLabel2.setText("Makas1");
        }
        if(secilennesne[1].equalsIgnoreCase("Makas")){
            jLabel3.setText("Makas2");
        }
        if(secilennesne[2].equalsIgnoreCase("Makas")){
            jLabel4.setText("Makas3");
        }
        if(secilennesne[3].equalsIgnoreCase("Makas")){
            jLabel5.setText("Makas4");
        }
        if(secilennesne[4].equalsIgnoreCase("Makas")){
            jLabel6.setText("Makas5");
        }
    }
    void goster1(String[] secilennesne){
        if(secilennesne[0].equalsIgnoreCase("Taş")){
            jLabel12.setText("Taş1");
        }
        if(secilennesne[1].equalsIgnoreCase("Taş")){
            jLabel13.setText("Taş2");
        }
        if(secilennesne[2].equalsIgnoreCase("Taş")){
            jLabel14.setText("Taş3");
        }
        if(secilennesne[3].equalsIgnoreCase("Taş")){
            jLabel15.setText("Taş4");
        }
        if(secilennesne[4].equalsIgnoreCase("Taş")){
            jLabel16.setText("Taş5");
        }
        if(secilennesne[0].equalsIgnoreCase("Kağıt")){
            jLabel12.setText("Kağıt1");
        }
        if(secilennesne[1].equalsIgnoreCase("Kağıt")){
            jLabel13.setText("Kağıt2");
        }
        if(secilennesne[2].equalsIgnoreCase("Kağıt")){
            jLabel14.setText("Kağıt3");
        }
        if(secilennesne[3].equalsIgnoreCase("Kağıt")){
            jLabel15.setText("Kağıt4"); 
        }
        if(secilennesne[4].equalsIgnoreCase("Kağıt")){
            jLabel16.setText("Kağıt5");
        }
        if(secilennesne[0].equalsIgnoreCase("Makas")){
            jLabel12.setText("Makas1");
        }
        if(secilennesne[1].equalsIgnoreCase("Makas")){
            jLabel13.setText("Makas2");
        }
        if(secilennesne[2].equalsIgnoreCase("Makas")){
            jLabel14.setText("Makas3");
        }
        if(secilennesne[3].equalsIgnoreCase("Makas")){
            jLabel15.setText("Makas4");
        }
        if(secilennesne[4].equalsIgnoreCase("Makas")){
            jLabel16.setText("Makas5");
        }
    }
    
    

    /**
     * Creates new form BilgisayarBilgisayar
     */
    public BilgisayarBilgisayar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taş Kağıt Makas");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));

        jLabel12.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel12.setText("jLabel12");

        jLabel17.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel17.setText("jLabel17");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 204, 0));

        jLabel2.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel7.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));

        jLabel13.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel13.setText("jLabel13");

        jLabel18.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel18.setText("jLabel18");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 204, 0));

        jLabel3.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel8.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 204, 0));

        jLabel14.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel19.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel19.setText("jLabel19");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(51, 204, 0));

        jLabel4.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel9.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(51, 204, 0));

        jLabel15.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel20.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(51, 204, 0));

        jLabel5.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel10.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(51, 204, 0));

        jLabel16.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel16.setText("jLabel16");

        jLabel21.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel21.setText("jLabel21");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(51, 204, 0));

        jLabel6.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel11.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(51, 153, 0));

        jLabel22.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel22.setText("jLabel22");

        jLabel24.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel24.setText("jLabel24");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(51, 153, 0));

        jLabel23.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel23.setText("jLabel23");

        jLabel25.setFont(new java.awt.Font("Montserrat Black", 0, 10)); // NOI18N
        jLabel25.setText("jLabel25");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("OYNA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           int[] pcnesne=new int[5];
           Nesne nesne=new Tas();
           secilennesnepc=bilgisayar1.NesneSec(pcnesne);
           secilennesnepc1=bilgisayar2.NesneSec(pcnesne);
           goster(secilennesnepc);
           goster1(secilennesnepc1);
           ilkdayaniklilik(nesne.getDayaniklilik());
           
           Random rastgele = new Random();
           int i = rastgele.nextInt(5)+1;
           int[] sayac=new int[5];
           int gecici;
           int k=0;
           while(i<6 && k!=5){
               if(i==1){
               gecici=i;
               if(secilennesnepc1[0].equalsIgnoreCase("Taş")){
                   if(tas0.get(0).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
                       
               }
               if(secilennesnepc1[0].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(0).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[0].equalsIgnoreCase("Makas")){
                   if(makas0.get(0).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[0].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(0).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[0].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(0).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[0].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(0).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }              
           }
           if(i==2){
               gecici=i;
               if(secilennesnepc1[1].equalsIgnoreCase("Taş")){
                   if(tas0.get(1).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[1].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(1).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[1].equalsIgnoreCase("Makas")){
                   if(makas0.get(1).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5); 
                      while(i!=gecici){
                          i = rastgele.nextInt(5);
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[1].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(1).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(1).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[1].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(1).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
           }
           if(i==3){
               gecici=i;
               if(secilennesnepc1[2].equalsIgnoreCase("Taş")){
                   if(tas0.get(2).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[2].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(2).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[2].equalsIgnoreCase("Makas")){
                   if(makas0.get(2).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[2].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(2).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[2].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(2).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[2].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(2).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
           }
           if(i==4){
               gecici=i;
               if(secilennesnepc1[3].equalsIgnoreCase("Taş")){
                   if(tas0.get(3).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[3].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(3).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[3].equalsIgnoreCase("Makas")){
                   if(makas0.get(3).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[3].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(3).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[3].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(3).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[3].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(3).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
           }
           if(i==5){
               gecici=i;
               if(secilennesnepc1[4].equalsIgnoreCase("Taş")){
                   if(tas0.get(4).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[4].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(4).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[4].equalsIgnoreCase("Makas")){
                   if(makas0.get(4).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[4].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(4).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[4].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(4).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc1[4].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(4).getDayaniklilik()<=0){
                      i = rastgele.nextInt(5)+1; 
                      while(i!=gecici){
                          i = rastgele.nextInt(5)+1;
                      }
                      sayac[k]=i;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[k]){
                               while(i!=sayac[j]){
                                    i = rastgele.nextInt(5)+1;
                                }
                               sayac[k]=i;
                           }
                       }
                       k++;
                       for(int m=0;m<k-1;m++){
                           if(sayac[m]==sayac[k-1]){
                               k--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(i);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==i){
                             while(i!=sayac1.get(j)){
                                    i = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(i);
                           } 
                        } 
                       }
                       break;
                   }
               }
           }
           }
           if(k==5){
               JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar1 kazandı");
           }
           if(sayac1.size()==5){
               sayac1.remove(4);
               sayac1.remove(3);
               sayac1.remove(2);
               sayac1.remove(1);
               sayac1.remove(0);
           }
           int z = rastgele.nextInt(5)+1;
           int[] sayac3=new int[5];
           int tmp;
           int kl=0;
           while(z<6 && kl!=5){
               if(z==1){
               tmp=z;
               if(secilennesnepc[0].equalsIgnoreCase("Taş")){
                   if(tas.get(0).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
                       
               }
               if(secilennesnepc[0].equalsIgnoreCase("Kağıt")){
                   if(kagit.get(0).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[0].equalsIgnoreCase("Makas")){
                   if(makas.get(0).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
                }
               
               if(secilennesnepc[0].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas.get(0).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
                }
               
               if(secilennesnepc[0].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas.get(0).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }   
               
               if(secilennesnepc[0].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit.get(0).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac1.add(z);
                       if(sayac1.size()>1){
                          for (int j = 0; j < sayac1.size(); j++) {
                           if(sayac1.get(j)==z){
                             while(z!=sayac1.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac1.remove(j);
                             sayac1.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }              
           }    
           if(z==2){
               tmp=z;
               if(secilennesnepc[1].equalsIgnoreCase("Taş")){
                   if(tas.get(1).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Kağıt")){
                   if(kagit.get(1).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Makas")){
                   if(makas.get(1).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas.get(1).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas.get(1).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit.get(1).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
           }
           if(z==3){
               tmp=z;
               if(secilennesnepc[2].equalsIgnoreCase("Taş")){
                   if(tas.get(2).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Kağıt")){
                   if(kagit.get(2).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Makas")){
                   if(makas.get(2).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas.get(2).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas.get(2).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit.get(2).getDayaniklilik()<=0){
                     z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
           }
           if(z==4){
               tmp=z;
               if(secilennesnepc[3].equalsIgnoreCase("Taş")){
                   if(tas0.get(3).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Kağıt")){
                   if(kagit.get(3).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Makas")){
                   if(makas.get(3).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas.get(3).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas.get(3).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit.get(3).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
           }
           if(z==5){
               tmp=z;
               if(secilennesnepc[4].equalsIgnoreCase("Taş")){
                   if(tas.get(4).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Kağıt")){
                   if(kagit.get(4).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Makas")){
                   if(makas.get(4).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas.get(4).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas.get(4).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit.get(4).getDayaniklilik()<=0){
                      z = rastgele.nextInt(5)+1; 
                      while(z!=tmp){
                          z = rastgele.nextInt(5)+1;
                      }
                      sayac[kl]=z;
                       for (int j = 0; j <k; j++) {
                           if(sayac[j]==sayac[kl]){
                               while(z!=sayac[j]){
                                    z = rastgele.nextInt(5)+1;
                                }
                               sayac[kl]=z;
                           }
                       }
                       kl++;
                       for(int m=0;m<kl-1;m++){
                           if(sayac[m]==sayac[kl-1]){
                               kl--;
                               break;
                           }
                       }
                   }
                   else{
                       sayac2.add(z);
                       if(sayac2.size()>1){
                          for (int j = 0; j < sayac2.size(); j++) {
                           if(sayac2.get(j)==z){
                             while(z!=sayac2.get(j)){
                                    z = rastgele.nextInt(5)+1;
                                }
                             sayac2.remove(j);
                             sayac2.add(z);
                           } 
                        } 
                       }
                       break;
                   }
               }
           }
           }
           if(kl==5){
               JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar2 kazandı");
           }
           if(sayac2.size()==5){
               sayac2.remove(4);
               sayac2.remove(3);
               sayac2.remove(2);
               sayac2.remove(1);
               sayac2.remove(0);
           }
           
           
           
           
           
           
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BilgisayarBilgisayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BilgisayarBilgisayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BilgisayarBilgisayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BilgisayarBilgisayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BilgisayarBilgisayar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
