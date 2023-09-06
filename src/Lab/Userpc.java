
package Lab;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Userpc extends javax.swing.JFrame {
    Kullanici kullanici1=new Kullanici();
    
    String[] secilennesne=new String[5];
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
    static ArrayList<Integer> sayac1=new ArrayList<Integer>();
    int a=0;
    static int hamlesayisi=10;
    
    
    
    
    /**
     * Creates new form Oyun
     */
    public Userpc() {
        initComponents();
    }
    void my_uptade(Kullanici kullanici) {
        this.kullanici1=kullanici;
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
        jLabel23.setText(""+hamlesayisi);

    }
    public void oyuncuid(String oyuncuadi,String oyuncuid){
        jLabel21.setText(oyuncuadi);
        jLabel22.setText(oyuncuid);
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OynaButonu = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taş Kağıt Makas");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel2İnputMethodTextChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 255));

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 255));

        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 51, 51));

        jLabel12.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 0, 0));

        jLabel14.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        jLabel1.setText("VS");

        OynaButonu.setText("Oyna");
        OynaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OynaButonuActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel21.setText("jLabel21");

        jLabel22.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel22.setText("jLabel22");

        jLabel23.setFont(new java.awt.Font("Montserrat Black", 0, 14)); // NOI18N
        jLabel23.setText("jLabel23");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(OynaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OynaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2İnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel2İnputMethodTextChanged

    }//GEN-LAST:event_jLabel2İnputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel12.setText(jLabel2.getText());
        a=1;
        if(jLabel2.getText().equals("Taş1")){
           jLabel7.setText("Dayanıklılık:"+tas.get(0).getDayaniklilik()); 
           jLabel13.setText(tas.get(0).getDayaniklilik()+"");
        }
        if(jLabel2.getText().equals("Kağıt1")){
           jLabel7.setText("Dayanıklılık:"+kagit.get(0).getDayaniklilik());
           jLabel13.setText(kagit.get(0).getDayaniklilik()+"");
        }
        if(jLabel2.getText().equals("Makas1")){
            jLabel7.setText("Dayanıklılık:"+makas.get(0).getDayaniklilik());
            jLabel13.setText(makas.get(0).getDayaniklilik()+"");
        }
        if(jLabel2.getText().equals("Ağır Taş1")){
           jLabel7.setText("Dayanıklılık:"+agirtas.get(0).getDayaniklilik()); 
           jLabel13.setText(agirtas.get(0).getDayaniklilik()+"");
        }
        if(jLabel2.getText().equals("Ozel Kağıt1")){
           jLabel7.setText("Dayanıklılık:"+ozelkagit.get(0).getDayaniklilik());
           jLabel13.setText(ozelkagit.get(0).getDayaniklilik()+"");
        }
        if(jLabel2.getText().equals("Usta Makas1")){
            jLabel7.setText("Dayanıklılık:"+ustamakas.get(0).getDayaniklilik());
            jLabel13.setText(ustamakas.get(0).getDayaniklilik()+"");
        }
        if(jLabel2.getText().equals(" "))
            a=0;
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel12.setText(jLabel3.getText());
        a=1;
        if(jLabel3.getText().equals("Taş2")){
           jLabel8.setText("Dayanıklılık:"+tas.get(1).getDayaniklilik()); 
           jLabel13.setText(tas.get(1).getDayaniklilik()+"");
        }
        if(jLabel3.getText().equals("Kağıt2")){
           jLabel8.setText("Dayanıklılık:"+kagit.get(1).getDayaniklilik());
           jLabel13.setText(kagit.get(1).getDayaniklilik()+"");
        }
        if(jLabel3.getText().equals("Makas2")){
            jLabel8.setText("Dayanıklılık:"+makas.get(1).getDayaniklilik());
            jLabel13.setText(makas.get(1).getDayaniklilik()+"");
        }
        if(jLabel3.getText().equals("Ağır Taş2")){
           jLabel8.setText("Dayanıklılık:"+agirtas.get(1).getDayaniklilik()); 
           jLabel13.setText(agirtas.get(1).getDayaniklilik()+"");
        }
        if(jLabel3.getText().equals("Ozel Kağıt2")){
           jLabel8.setText("Dayanıklılık:"+ozelkagit.get(1).getDayaniklilik());
           jLabel13.setText(ozelkagit.get(1).getDayaniklilik()+"");
        }
        if(jLabel3.getText().equals("Usta Makas2")){
            jLabel8.setText("Dayanıklılık:"+ustamakas.get(1).getDayaniklilik());
            jLabel13.setText(ustamakas.get(1).getDayaniklilik()+"");
        }
        if(jLabel3.getText().equals(" "))
            a=0;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabel12.setText(jLabel4.getText());

        a=1;
        if(jLabel4.getText().equals("Taş3")){
           jLabel9.setText("Dayanıklılık:"+tas.get(2).getDayaniklilik()); 
           jLabel13.setText(tas.get(2).getDayaniklilik()+"");
        }
        if(jLabel4.getText().equals("Kağıt3")){
           jLabel9.setText("Dayanıklılık:"+kagit.get(2).getDayaniklilik());
           jLabel13.setText(kagit.get(2).getDayaniklilik()+"");
        }
        if(jLabel4.getText().equals("Makas3")){
            jLabel9.setText("Dayanıklılık:"+makas.get(2).getDayaniklilik());
            jLabel13.setText(makas.get(2).getDayaniklilik()+"");
        }
        if(jLabel4.getText().equals("Ağır Taş3")){
           jLabel9.setText("Dayanıklılık:"+agirtas.get(2).getDayaniklilik()); 
           jLabel13.setText(agirtas.get(2).getDayaniklilik()+"");
        }
        if(jLabel4.getText().equals("Ozel Kağıt3")){
           jLabel9.setText("Dayanıklılık:"+ozelkagit.get(2).getDayaniklilik());
           jLabel13.setText(ozelkagit.get(2).getDayaniklilik()+"");
        }
        if(jLabel4.getText().equals("Usta Makas3")){
            jLabel9.setText("Dayanıklılık:"+ustamakas.get(2).getDayaniklilik());
            jLabel13.setText(ustamakas.get(2).getDayaniklilik()+"");
        }
        if(jLabel4.getText().equals(" "))
            a=0;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabel12.setText(jLabel5.getText());
        a=1;
        if(jLabel5.getText().equals("Taş4")){
           jLabel10.setText("Dayanıklılık:"+tas.get(3).getDayaniklilik()); 
           jLabel13.setText(tas.get(3).getDayaniklilik()+"");
        }
        if(jLabel5.getText().equals("Kağıt4")){
           jLabel10.setText("Dayanıklılık:"+kagit.get(3).getDayaniklilik());
           jLabel13.setText(kagit.get(3).getDayaniklilik()+"");
        }
        if(jLabel5.getText().equals("Makas4")){
            jLabel10.setText("Dayanıklılık:"+makas.get(3).getDayaniklilik());
            jLabel13.setText(makas.get(3).getDayaniklilik()+"");
        }
        if(jLabel5.getText().equals("Ağır Taş4")){
           jLabel10.setText("Dayanıklılık:"+agirtas.get(3).getDayaniklilik()); 
           jLabel13.setText(agirtas.get(3).getDayaniklilik()+"");
        }
        if(jLabel5.getText().equals("Ozel Kağıt4")){
           jLabel10.setText("Dayanıklılık:"+ozelkagit.get(3).getDayaniklilik());
           jLabel13.setText(ozelkagit.get(3).getDayaniklilik()+"");
        }
        if(jLabel5.getText().equals("Usta Makas4")){
            jLabel10.setText("Dayanıklılık:"+ustamakas.get(3).getDayaniklilik());
            jLabel13.setText(ustamakas.get(3).getDayaniklilik()+"");
        }
        if(jLabel5.getText().equals(" "))
            a=0;
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jLabel12.setText(jLabel6.getText());
        a=1;
        if(jLabel6.getText().equals("Taş5")){
           jLabel11.setText("Dayanıklılık:"+tas.get(4).getDayaniklilik()); 
           jLabel13.setText(tas.get(4).getDayaniklilik()+"");
        }
        if(jLabel6.getText().equals("Kağıt5")){
           jLabel11.setText("Dayanıklılık:"+kagit.get(4).getDayaniklilik());
           jLabel13.setText(kagit.get(4).getDayaniklilik()+"");
        }
        if(jLabel6.getText().equals("Makas5")){
            jLabel11.setText("Dayanıklılık:"+makas.get(4).getDayaniklilik());
            jLabel13.setText(makas.get(4).getDayaniklilik()+"");
        }
        if(jLabel6.getText().equals("Ağır Taş5")){
           jLabel11.setText("Dayanıklılık:"+agirtas.get(4).getDayaniklilik()); 
           jLabel13.setText(agirtas.get(4).getDayaniklilik()+"");
        }
        if(jLabel6.getText().equals("Ozel Kağıt5")){
           jLabel11.setText("Dayanıklılık:"+ozelkagit.get(4).getDayaniklilik());
           jLabel13.setText(ozelkagit.get(4).getDayaniklilik()+"");
        }
        if(jLabel6.getText().equals("Usta Makas5")){
            jLabel11.setText("Dayanıklılık:"+ustamakas.get(4).getDayaniklilik());
            jLabel13.setText(ustamakas.get(4).getDayaniklilik()+"");
        }
        if(jLabel6.getText().equals(" "))
            a=0;
    }//GEN-LAST:event_jButton5ActionPerformed
    
    
    
   
    
    private void OynaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OynaButonuActionPerformed
       if(a==1){
           jLabel23.setText(""+hamlesayisi);
           if(hamlesayisi==0){
               JOptionPane.showMessageDialog(this, "Oyun sona erdi.");
               setVisible(false);
               System.exit(0);
           }
           hamlesayisi--;
           
           Random rastgele = new Random();
           Bilgisayar bilgisayar1=new Bilgisayar();
           int[] pcnesne=new int[5];

           String[] secilennesnepc=bilgisayar1.NesneSec(pcnesne);
           int i = rastgele.nextInt(5);
           int gecici;
           int k=0;
           int kmp=0;
           while(kmp==5){
               if(i==0){
               gecici=i;
               if(secilennesnepc[0].equalsIgnoreCase("Taş")){
                   if(tas0.get(0).getDayaniklilik()<=0.0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
                       
               }
               if(secilennesnepc[0].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(0).getDayaniklilik()<=0.0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[0].equalsIgnoreCase("Makas")){
                   if(makas0.get(0).getDayaniklilik()<=0.0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[0].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(0).getDayaniklilik()<=0.0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[0].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(0).getDayaniklilik()<=0.0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[0].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(0).getDayaniklilik()<=0.0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }              
           }
           if(i==1){
               gecici=i;
               if(secilennesnepc[1].equalsIgnoreCase("Taş")){
                   if(tas0.get(1).getDayaniklilik()<=0.0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(1).getDayaniklilik()<=0.0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Makas")){
                   if(makas0.get(1).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(1).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(1).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[1].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(1).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
           }
           if(i==2){
               gecici=i;
               if(secilennesnepc[2].equalsIgnoreCase("Taş")){
                   if(tas0.get(2).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(2).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Makas")){
                   if(makas0.get(2).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(2).getDayaniklilik()<=0){
                     
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(2).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[2].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(2).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
           }
           if(i==3){
               gecici=i;
               if(secilennesnepc[3].equalsIgnoreCase("Taş")){
                   if(tas0.get(3).getDayaniklilik()<=0){
                     
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(3).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Makas")){
                   if(makas0.get(3).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(3).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(3).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[3].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(3).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
           }
           if(i==4){
               gecici=i;
               if(secilennesnepc[4].equalsIgnoreCase("Taş")){
                   if(tas0.get(4).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Kağıt")){
                   if(kagit0.get(4).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Makas")){
                   if(makas0.get(4).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Ağır Taş")){
                   if(agirtas0.get(4).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Usta Makas")){
                   if(ustamakas0.get(4).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
               if(secilennesnepc[4].equalsIgnoreCase("Ozel Kağıt")){
                   if(ozelkagit0.get(4).getDayaniklilik()<=0){
                      
                   }
                   else{
                       sayac1.add(i);
                       
                       kmp++;
                       break;
                   }
               }
           }
           }
          
               if(secilennesnepc[i].equalsIgnoreCase("Taş")){
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt1")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = kagit.get(0).etkiHesapla(tas0.get(i));
                       pcetki = tas0.get(i).etkiHesapla(kagit.get(0));
                       kagit.get(0).setDayaniklilik(kagit.get(0).getDayaniklilik() - pcetki);
                       tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(0).setSeviyepuani(kagit.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (kagit.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                       if (kagit.get(0).getSeviyepuani() >= 30) {
                           jLabel2.setText("Ozel Kağıt1");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt2")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=kagit.get(1).etkiHesapla(tas0.get(i));
                       pcetki=tas0.get(i).etkiHesapla(kagit.get(1));
                       kagit.get(1).setDayaniklilik(kagit.get(1).getDayaniklilik()-pcetki);
                       tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik()-kullanicietki);
                       
                       jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(1).setSeviyepuani(kagit.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[0] = "Ağır Taş";
                       }
                       if (kagit.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                       if (kagit.get(1).getSeviyepuani() >= 30) {
                           jLabel3.setText("Ozel Kağıt2");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt3")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=kagit.get(2).etkiHesapla(tas0.get(i));
                       pcetki=tas0.get(i).etkiHesapla(kagit.get(2));
                       
                        kagit.get(2).setDayaniklilik(kagit.get(2).getDayaniklilik() - pcetki);
                        tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(2).setSeviyepuani(kagit.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (kagit.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                       if (kagit.get(2).getSeviyepuani() >= 30) {
                           jLabel4.setText("Ozel Kağıt3");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt4")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=kagit.get(3).etkiHesapla(tas0.get(i));
                       pcetki=tas0.get(i).etkiHesapla(kagit.get(3));
                       kagit.get(3).setDayaniklilik(kagit.get(3).getDayaniklilik() - pcetki);
                       tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(3).setSeviyepuani(kagit.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (kagit.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                       if (kagit.get(3).getSeviyepuani() >= 30) {
                           jLabel5.setText("Ozel Kağıt4");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt5")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=kagit.get(4).etkiHesapla(tas0.get(i));
                       pcetki=tas0.get(i).etkiHesapla(kagit.get(4));
                        kagit.get(4).setDayaniklilik(kagit.get(4).getDayaniklilik()-kullanicietki);
                        tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik()-pcetki);
                       
                      jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(4).setSeviyepuani(kagit.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (kagit.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                       if (kagit.get(4).getSeviyepuani() >= 30) {
                           jLabel6.setText("Ozel Kağıt5");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Makas1")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=makas.get(0).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(makas.get(0));
                      makas.get(0).setDayaniklilik(makas.get(0).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(0).setSeviyepuani(makas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (makas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                       if (makas.get(0).getSeviyepuani() >= 30) {
                           jLabel2.setText("Usta Makas1");
                       }
                       
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Makas2")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=makas.get(1).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(makas.get(1));
                      makas.get(1).setDayaniklilik(makas.get(1).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(1).setSeviyepuani(makas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (makas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                       if (makas.get(1).getSeviyepuani() >= 30) {
                           jLabel3.setText("Usta Makas2");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Makas3")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=makas.get(2).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(makas.get(2));
                      makas.get(2).setDayaniklilik(makas.get(2).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(2).setSeviyepuani(makas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (makas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                       if (makas.get(2).getSeviyepuani() >= 30) {
                           jLabel4.setText("Usta Makas3");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Makas4")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=makas.get(3).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(makas.get(3));
                      makas.get(3).setDayaniklilik(makas.get(3).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(3).setSeviyepuani(makas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (makas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                       if (makas.get(3).getSeviyepuani() >= 30) {
                           jLabel5.setText("Usta Makas4");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Makas5")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=makas.get(4).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(makas.get(4));
                      makas.get(4).setDayaniklilik(makas.get(4).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(4).setSeviyepuani(makas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (makas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                       if (makas.get(3).getSeviyepuani() >= 30) {
                           jLabel6.setText("Usta Makas5");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Usta Makas1")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(0).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(ustamakas.get(0));
                      ustamakas.get(0).setDayaniklilik(ustamakas.get(0).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(0).setSeviyepuani(ustamakas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ustamakas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                    }
                   if(jLabel12.getText().equalsIgnoreCase("Usta Makas2")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(1).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(ustamakas.get(1));
                      ustamakas.get(1).setDayaniklilik(ustamakas.get(1).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(1).setSeviyepuani(ustamakas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ustamakas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                    }
                   if(jLabel12.getText().equalsIgnoreCase("Usta Makas3")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(2).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(ustamakas.get(2));
                      ustamakas.get(2).setDayaniklilik(ustamakas.get(2).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(2).setSeviyepuani(ustamakas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ustamakas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                    }
                   if(jLabel12.getText().equalsIgnoreCase("Usta Makas4")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(3).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(ustamakas.get(3));
                      ustamakas.get(3).setDayaniklilik(ustamakas.get(3).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(3).setSeviyepuani(ustamakas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ustamakas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                    }
                   if(jLabel12.getText().equalsIgnoreCase("Usta Makas5")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(4).etkiHesapla(tas0.get(i));
                      pcetki=tas0.get(i).etkiHesapla(ustamakas.get(4));
                      ustamakas.get(4).setDayaniklilik(ustamakas.get(4).getDayaniklilik() - pcetki);
                      tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(4).setSeviyepuani(ustamakas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ustamakas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                    }
                if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt1")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(0).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(ozelkagit.get(0));
                    ozelkagit.get(0).setDayaniklilik(ozelkagit.get(0).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(0).setSeviyepuani(ozelkagit.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ozelkagit.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                }
                if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt2")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(1).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(ozelkagit.get(1));
                    ozelkagit.get(1).setDayaniklilik(ozelkagit.get(1).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(1).setSeviyepuani(ozelkagit.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ozelkagit.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt3")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(2).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(ozelkagit.get(2));
                    ozelkagit.get(2).setDayaniklilik(ozelkagit.get(2).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(2).setSeviyepuani(ozelkagit.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ozelkagit.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt4")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(3).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(ozelkagit.get(3));
                    ozelkagit.get(3).setDayaniklilik(ozelkagit.get(3).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(3).setSeviyepuani(ozelkagit.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ozelkagit.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt5")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(4).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(ozelkagit.get(4));
                    ozelkagit.get(4).setDayaniklilik(ozelkagit.get(4).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(4).setSeviyepuani(ozelkagit.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (ozelkagit.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş1")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(0).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(agirtas.get(0));
                    agirtas.get(0).setDayaniklilik(agirtas.get(0).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(0).setSeviyepuani(agirtas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş2")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(1).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(agirtas.get(1));
                    agirtas.get(1).setDayaniklilik(agirtas.get(1).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(1).setSeviyepuani(agirtas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş3")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(2).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(agirtas.get(2));
                    agirtas.get(2).setDayaniklilik(agirtas.get(2).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(2).setSeviyepuani(agirtas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş4")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(3).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(agirtas.get(3));
                    agirtas.get(3).setDayaniklilik(agirtas.get(3).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(3).setSeviyepuani(agirtas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş5")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(4).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(agirtas.get(4));
                    agirtas.get(4).setDayaniklilik(agirtas.get(4).getDayaniklilik() - pcetki);
                    tas0.get(i).setDayaniklilik(tas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(4).setSeviyepuani(agirtas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           tas0.get(i).setSeviyepuani(tas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(tas0.get(i).getDayaniklilik() + "");
                       if (tas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }   
                }
                if(jLabel12.getText().contains("Taş")){
                    if(jLabel12.getText().length()==4){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=tas.get(0).etkiHesapla(tas0.get(i));
                    pcetki=tas0.get(i).etkiHesapla(tas.get(0));
                    if(kullanicietki==0.0 && pcetki==0.0){
                        JOptionPane.showMessageDialog(this, "Bu round Berabere");
                        jLabel12.setText(" ");
                    }    
                    }
                }
                
               }
               if(secilennesnepc[i].equalsIgnoreCase("Makas")){
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt1")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=kagit.get(0).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(kagit.get(0));
                       kagit.get(0).setDayaniklilik(kagit.get(0).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(0).setSeviyepuani(kagit.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (kagit.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                       if (kagit.get(0).getSeviyepuani() >= 30) {
                           jLabel2.setText("Ozel Kağıt1");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt2")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=kagit.get(1).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(kagit.get(1));
                       kagit.get(1).setDayaniklilik(kagit.get(1).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(1).setSeviyepuani(kagit.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (kagit.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                       if (kagit.get(1).getSeviyepuani() >= 30) {
                           jLabel3.setText("Ozel Kağıt2");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt3")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=kagit.get(2).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(kagit.get(2));
                       kagit.get(2).setDayaniklilik(kagit.get(2).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(2).setSeviyepuani(kagit.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (kagit.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                       if (kagit.get(2).getSeviyepuani() >= 30) {
                           jLabel4.setText("Ozel Kağıt3");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt4")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=kagit.get(3).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(kagit.get(3));
                       kagit.get(3).setDayaniklilik(kagit.get(3).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(3).setSeviyepuani(kagit.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (kagit.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                       if (kagit.get(3).getSeviyepuani() >= 30) {
                           jLabel5.setText("Ozel Kağıt4");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Kağıt5")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=kagit.get(4).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(kagit.get(4));
                       kagit.get(4).setDayaniklilik(kagit.get(4).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                      if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(4).setSeviyepuani(kagit.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (kagit.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                       if (kagit.get(4).getSeviyepuani() >= 30) {
                           jLabel6.setText("Ozel Kağıt5");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Taş1")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=tas.get(0).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(tas.get(0));
                       tas.get(0).setDayaniklilik(tas.get(0).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(0).setSeviyepuani(tas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (tas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                       if (tas.get(0).getSeviyepuani() >= 30) {
                           jLabel2.setText("Ağır Taş1");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Taş2")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=tas.get(1).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(tas.get(1));
                       tas.get(1).setDayaniklilik(tas.get(1).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(1).setSeviyepuani(tas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (tas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                       if (tas.get(1).getSeviyepuani() >= 30) {
                           jLabel3.setText("Ağır Taş2");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Taş3")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=tas.get(2).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(tas.get(2));
                       tas.get(2).setDayaniklilik(tas.get(2).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(2).setSeviyepuani(tas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (tas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                       if (tas.get(2).getSeviyepuani() >= 30) {
                           jLabel4.setText("Ağır Taş3");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Taş4")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=tas.get(3).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(tas.get(3));
                       tas.get(3).setDayaniklilik(tas.get(3).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(3).setSeviyepuani(tas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (tas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                       if (tas.get(3).getSeviyepuani() >= 30) {
                           jLabel5.setText("Ağır Taş4");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Taş5")){
                       double kullanicietki;
                       double pcetki;
                       kullanicietki=tas.get(4).etkiHesapla(makas0.get(i));
                       pcetki=makas0.get(i).etkiHesapla(tas.get(4));
                       tas.get(4).setDayaniklilik(tas.get(4).getDayaniklilik() - pcetki);
                       makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                       jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(4).setSeviyepuani(tas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (tas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                       if (tas.get(4).getSeviyepuani() >= 30) {
                           jLabel6.setText("Ağır Taş5");
                       }
                   }
                   if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt1")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(0).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(ozelkagit.get(0));
                    ozelkagit.get(0).setDayaniklilik(ozelkagit.get(0).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(0).setSeviyepuani(ozelkagit.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ozelkagit.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt2")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(1).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(ozelkagit.get(1));
                    ozelkagit.get(1).setDayaniklilik(ozelkagit.get(1).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(1).setSeviyepuani(ozelkagit.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ozelkagit.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt3")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(2).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(ozelkagit.get(2));
                    ozelkagit.get(2).setDayaniklilik(ozelkagit.get(2).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(2).setSeviyepuani(ozelkagit.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ozelkagit.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt4")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(3).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(ozelkagit.get(3));
                    ozelkagit.get(3).setDayaniklilik(ozelkagit.get(3).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(3).setSeviyepuani(ozelkagit.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ozelkagit.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }   
                }
                if(jLabel12.getText().equalsIgnoreCase("Ozel Kağıt5")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=ozelkagit.get(4).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(ozelkagit.get(4));
                    ozelkagit.get(4).setDayaniklilik(ozelkagit.get(4).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(4).setSeviyepuani(ozelkagit.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ozelkagit.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş1")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(0).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(agirtas.get(0));
                    agirtas.get(0).setDayaniklilik(agirtas.get(0).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(0).setSeviyepuani(agirtas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş2")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(1).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(agirtas.get(1));
                    agirtas.get(1).setDayaniklilik(agirtas.get(1).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(1).setSeviyepuani(agirtas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş3")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(2).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(agirtas.get(2));
                    agirtas.get(2).setDayaniklilik(agirtas.get(2).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(2).setSeviyepuani(agirtas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş4")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(3).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(agirtas.get(3));
                    agirtas.get(3).setDayaniklilik(agirtas.get(3).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(3).setSeviyepuani(agirtas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                }
                if(jLabel12.getText().equalsIgnoreCase("Ağır Taş5")){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=agirtas.get(4).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(agirtas.get(4));
                    agirtas.get(4).setDayaniklilik(agirtas.get(4).getDayaniklilik() - pcetki);
                    makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                    
                    jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(4).setSeviyepuani(agirtas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ağır Taş";
                       }
                       if (agirtas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                }
                if(jLabel12.getText().equalsIgnoreCase("Usta Makas1")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(0).etkiHesapla(makas0.get(i));
                      pcetki=makas0.get(i).etkiHesapla(ustamakas.get(0));
                      ustamakas.get(0).setDayaniklilik(ustamakas.get(0).getDayaniklilik() - pcetki);
                      makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(0).setSeviyepuani(ustamakas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ustamakas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                    }
                if(jLabel12.getText().equalsIgnoreCase("Usta Makas2")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(1).etkiHesapla(makas0.get(i));
                      pcetki=makas0.get(i).etkiHesapla(ustamakas.get(1));
                      ustamakas.get(1).setDayaniklilik(ustamakas.get(1).getDayaniklilik() - pcetki);
                      makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(1).setSeviyepuani(ustamakas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ustamakas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                    }
                if(jLabel12.getText().equalsIgnoreCase("Usta Makas3")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(2).etkiHesapla(makas0.get(i));
                      pcetki=makas0.get(i).etkiHesapla(ustamakas.get(2));
                      ustamakas.get(2).setDayaniklilik(ustamakas.get(2).getDayaniklilik() - pcetki);
                      makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(2).setSeviyepuani(ustamakas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ustamakas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                }
                if(jLabel12.getText().equalsIgnoreCase("Usta Makas4")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(3).etkiHesapla(makas0.get(i));
                      pcetki=makas0.get(i).etkiHesapla(ustamakas.get(3));
                      ustamakas.get(3).setDayaniklilik(ustamakas.get(3).getDayaniklilik() - pcetki);
                      makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(3).setSeviyepuani(ustamakas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ustamakas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                }
                if(jLabel12.getText().equalsIgnoreCase("Usta Makas5")){
                      double kullanicietki;
                      double pcetki;
                      kullanicietki=ustamakas.get(4).etkiHesapla(makas0.get(i));
                      pcetki=makas0.get(i).etkiHesapla(ustamakas.get(4));
                      ustamakas.get(4).setDayaniklilik(ustamakas.get(4).getDayaniklilik() - pcetki);
                      makas0.get(i).setDayaniklilik(makas0.get(i).getDayaniklilik() - kullanicietki);
                       
                      jLabel14.setText("Makas");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(4).setSeviyepuani(ustamakas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           makas0.get(i).setSeviyepuani(makas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(makas0.get(i).getDayaniklilik() + "");
                       if (makas0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Usta Makas";
                       }
                       if (ustamakas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                }
                if(jLabel12.getText().contains("Makas")){
                    if(jLabel12.getText().length()==6){
                    double kullanicietki;
                    double pcetki;
                    kullanicietki=makas.get(0).etkiHesapla(makas0.get(i));
                    pcetki=makas0.get(i).etkiHesapla(makas.get(0));
                    if(kullanicietki==0.0 && pcetki==0.0){
                        JOptionPane.showMessageDialog(this, "Bu round Berabere");
                        jLabel12.setText(" ");
                    }    
                    }
                }
                 
               }
               //--------------------------------------------------------------------
               if (secilennesnepc[i].equalsIgnoreCase("Kağıt")) {
                   if (jLabel12.getText().equalsIgnoreCase("Taş1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(0).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(tas.get(0));
                       tas.get(0).setDayaniklilik(tas.get(0).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(0).setSeviyepuani(tas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (tas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                       if (tas.get(0).getSeviyepuani() >= 30) {
                           jLabel2.setText("Ağır Taş1");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Taş2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(1).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(tas.get(1));
                       tas.get(1).setDayaniklilik(tas.get(1).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(1).setSeviyepuani(tas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (tas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                       if (tas.get(1).getSeviyepuani() >= 30) {
                           jLabel3.setText("Ağır Taş2");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Taş3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(2).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(tas.get(2));
                       tas.get(2).setDayaniklilik(tas.get(2).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(2).setSeviyepuani(tas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (tas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                       if (tas.get(2).getSeviyepuani() >= 30) {
                           jLabel4.setText("Ağır Taş3");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Taş4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(3).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(tas.get(3));
                       tas.get(3).setDayaniklilik(tas.get(3).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(3).setSeviyepuani(tas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (tas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                       if (tas.get(3).getSeviyepuani() >= 30) {
                           jLabel5.setText("Ağır Taş4");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Taş5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(4).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(tas.get(4));
                       tas.get(4).setDayaniklilik(tas.get(4).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(4).setSeviyepuani(tas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (tas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                       if (tas.get(4).getSeviyepuani() >= 30) {
                           jLabel6.setText("Ağır Taş5");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(0).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(makas.get(0));
                       makas.get(0).setDayaniklilik(makas.get(0).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(0).setSeviyepuani(makas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (makas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                       if (makas.get(0).getSeviyepuani() >= 30) {
                           jLabel2.setText("Usta Makas1");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(1).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(makas.get(1));
                       makas.get(1).setDayaniklilik(makas.get(1).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(1).setSeviyepuani(makas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (makas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                       if (makas.get(1).getSeviyepuani() >= 30) {
                           jLabel3.setText("Usta Makas2");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(2).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(makas.get(2));
                       makas.get(2).setDayaniklilik(makas.get(2).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(2).setSeviyepuani(makas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (makas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                       if (makas.get(2).getSeviyepuani() >= 30) {
                           jLabel4.setText("Usta Makas3");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(3).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(makas.get(3));
                       makas.get(3).setDayaniklilik(makas.get(3).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(3).setSeviyepuani(makas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (makas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                       if (makas.get(3).getSeviyepuani() >= 30) {
                           jLabel5.setText("Usta Makas4");

                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(4).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(makas.get(4));
                       makas.get(4).setDayaniklilik(makas.get(4).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(4).setSeviyepuani(makas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (makas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                       if (makas.get(4).getSeviyepuani() >= 30) {
                           jLabel6.setText("Usta Makas5");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ağır Taş1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = agirtas.get(0).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(kagit0.get(0));
                       agirtas.get(0).setDayaniklilik(agirtas.get(0).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(0).setSeviyepuani(agirtas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (agirtas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ağır Taş2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = agirtas.get(1).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(kagit0.get(1));
                       agirtas.get(1).setDayaniklilik(agirtas.get(1).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(1).setSeviyepuani(agirtas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (agirtas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ağır Taş3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = agirtas.get(2).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(kagit0.get(2));
                       agirtas.get(2).setDayaniklilik(agirtas.get(2).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(2).setSeviyepuani(agirtas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (agirtas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ağır Taş4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = agirtas.get(3).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(kagit0.get(3));
                       agirtas.get(3).setDayaniklilik(agirtas.get(3).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(3).setSeviyepuani(agirtas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (agirtas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ağır Taş5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = agirtas.get(4).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(kagit0.get(4));
                       agirtas.get(4).setDayaniklilik(agirtas.get(4).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           agirtas.get(4).setSeviyepuani(agirtas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (agirtas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(0).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ustamakas.get(0));
                       ustamakas.get(0).setDayaniklilik(ustamakas.get(0).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(0).setSeviyepuani(ustamakas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ustamakas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(1).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ustamakas.get(1));
                       ustamakas.get(1).setDayaniklilik(ustamakas.get(1).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(1).setSeviyepuani(ustamakas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ustamakas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(2).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ustamakas.get(2));
                       ustamakas.get(2).setDayaniklilik(ustamakas.get(2).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(2).setSeviyepuani(ustamakas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ustamakas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(3).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ustamakas.get(3));
                       ustamakas.get(3).setDayaniklilik(ustamakas.get(3).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(3).setSeviyepuani(ustamakas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ustamakas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(4).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ustamakas.get(4));
                       ustamakas.get(4).setDayaniklilik(ustamakas.get(4).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(4).setSeviyepuani(ustamakas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ustamakas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(0).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ozelkagit.get(0));
                       ozelkagit.get(0).setDayaniklilik(ozelkagit.get(0).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(0).setSeviyepuani(ozelkagit.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ozelkagit.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(1).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ozelkagit.get(1));
                       ozelkagit.get(1).setDayaniklilik(ozelkagit.get(1).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(1).setSeviyepuani(ozelkagit.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ozelkagit.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(2).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ozelkagit.get(2));
                       ozelkagit.get(2).setDayaniklilik(ozelkagit.get(2).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(2).setSeviyepuani(ozelkagit.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ozelkagit.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(3).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ozelkagit.get(3));
                       ozelkagit.get(3).setDayaniklilik(ozelkagit.get(3).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(3).setSeviyepuani(ozelkagit.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ozelkagit.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(4).etkiHesapla(kagit0.get(i));
                       pcetki = kagit0.get(i).etkiHesapla(ozelkagit.get(4));
                       ozelkagit.get(4).setDayaniklilik(ozelkagit.get(4).getDayaniklilik() - pcetki);
                       kagit0.get(i).setDayaniklilik(kagit0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Kağıt");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(4).setSeviyepuani(ozelkagit.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           kagit0.get(i).setSeviyepuani(kagit0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(kagit0.get(i).getDayaniklilik() + "");
                       if (kagit0.get(i).getSeviyepuani() >= 30) {
                           secilennesnepc[i] = "Ozel Kağıt";
                       }
                       if (ozelkagit.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                   }
                   if (jLabel12.getText().contains("Kağıt")) {
                       if (jLabel12.getText().length() == 6) {
                           double kullanicietki;
                           double pcetki;
                           kullanicietki = kagit.get(0).etkiHesapla(kagit0.get(i));
                           pcetki = kagit0.get(i).etkiHesapla(kagit.get(0));
                           if (kullanicietki == 0.0 && pcetki == 0.0) {
                               JOptionPane.showMessageDialog(this, "Bu round Berabere");
                               jLabel12.setText(" ");
                           }
                       }
                   }
                   
               }
               //-------------------------------------------------------------------
               if (secilennesnepc[i].equalsIgnoreCase("Ağır Taş")) {
                   if (jLabel12.getText().equalsIgnoreCase("Taş1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(0).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(tas.get(0));
                       tas.get(0).setDayaniklilik(tas.get(0).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(0).setSeviyepuani(tas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (tas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                       if (tas.get(0).getSeviyepuani() >= 30) {
                           jLabel2.setText("Ağır Taş1");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Taş2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(1).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(tas.get(1));
                       tas.get(1).setDayaniklilik(tas.get(1).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(1).setSeviyepuani(tas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (tas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                       if (tas.get(1).getSeviyepuani() >= 30) {
                           jLabel3.setText("Ağır Taş2");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Taş3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(2).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(tas.get(2));
                       tas.get(2).setDayaniklilik(tas.get(2).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(2).setSeviyepuani(tas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (tas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                       if (tas.get(2).getSeviyepuani() >= 30) {
                           jLabel4.setText("Ağır Taş3");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Taş4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(3).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(tas.get(3));
                       tas.get(3).setDayaniklilik(tas.get(3).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(3).setSeviyepuani(tas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (tas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                       if (tas.get(3).getSeviyepuani() >= 30) {
                           jLabel5.setText("Ağır Taş4");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Taş5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = tas.get(4).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(tas.get(4));
                       tas.get(4).setDayaniklilik(tas.get(4).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           tas.get(4).setSeviyepuani(tas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (tas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                       if (tas.get(4).getSeviyepuani() >= 30) {
                           jLabel6.setText("Ağır Taş5");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Kağıt1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = kagit.get(0).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(kagit.get(0));
                       kagit.get(0).setDayaniklilik(kagit.get(0).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(4).setSeviyepuani(kagit.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (kagit.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                       if (kagit.get(0).getSeviyepuani() >= 30) {
                           jLabel2.setText("Ozel Kağıt1");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Kağıt2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = kagit.get(1).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(kagit.get(1));
                       kagit.get(1).setDayaniklilik(kagit.get(1).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(1).setSeviyepuani(kagit.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (kagit.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                       if (kagit.get(1).getSeviyepuani() >= 30) {
                           jLabel3.setText("Ozel Kağıt2");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Kağıt3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = kagit.get(2).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(kagit.get(2));
                       kagit.get(2).setDayaniklilik(kagit.get(2).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(2).setSeviyepuani(kagit.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (kagit.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                       if (kagit.get(2).getSeviyepuani() >= 30) {
                           jLabel4.setText("Ozel Kağıt3");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Kağıt4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = kagit.get(3).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(kagit.get(3));
                       kagit.get(3).setDayaniklilik(kagit.get(3).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(3).setSeviyepuani(kagit.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (kagit.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                       if (kagit.get(3).getSeviyepuani() >= 30) {
                           jLabel5.setText("Ozel Kağıt4");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Kağıt5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = kagit.get(4).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(kagit.get(4));
                       kagit.get(4).setDayaniklilik(kagit.get(4).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           kagit.get(4).setSeviyepuani(kagit.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (kagit.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                       if (kagit.get(4).getSeviyepuani() >= 30) {
                           jLabel6.setText("Ozel Kağıt5");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(0).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(makas.get(0));
                       makas.get(0).setDayaniklilik(makas.get(0).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(4).setSeviyepuani(makas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (makas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                       if (makas.get(0).getSeviyepuani() >= 30) {
                           jLabel2.setText("Usta Makas1");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(1).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(makas.get(1));
                       makas.get(1).setDayaniklilik(makas.get(1).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(1).setSeviyepuani(makas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (makas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                       if (makas.get(1).getSeviyepuani() >= 30) {
                           jLabel3.setText("Usta Makas2");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(2).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(makas.get(2));
                       makas.get(2).setDayaniklilik(makas.get(2).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(2).setSeviyepuani(makas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (makas.get(2).getDayaniklilik() <=0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                       if (makas.get(2).getSeviyepuani() >= 30) {
                           jLabel4.setText("Usta Makas3");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(3).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(makas.get(3));
                       makas.get(3).setDayaniklilik(makas.get(3).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(3).setSeviyepuani(makas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (makas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                       if (makas.get(3).getSeviyepuani() >= 30) {
                           jLabel5.setText("Usta Makas4");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Makas5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = makas.get(4).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(makas.get(4));
                       makas.get(4).setDayaniklilik(makas.get(4).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);

                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           makas.get(4).setSeviyepuani(makas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (makas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                       if (makas.get(4).getSeviyepuani() >= 30) {
                           jLabel6.setText("Usta Makas5");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(0).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ozelkagit.get(0));
                       ozelkagit.get(0).setDayaniklilik(ozelkagit.get(0).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(0).setSeviyepuani(ozelkagit.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ozelkagit.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(1).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ozelkagit.get(1));
                       ozelkagit.get(1).setDayaniklilik(ozelkagit.get(1).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(1).setSeviyepuani(ozelkagit.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ozelkagit.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(2).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ozelkagit.get(2));
                       ozelkagit.get(2).setDayaniklilik(ozelkagit.get(2).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(2).setSeviyepuani(ozelkagit.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ozelkagit.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(3).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ozelkagit.get(3));
                       ozelkagit.get(3).setDayaniklilik(ozelkagit.get(3).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(3).setSeviyepuani(ozelkagit.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ozelkagit.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ozelkagit.get(4).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ozelkagit.get(4));
                       ozelkagit.get(4).setDayaniklilik(ozelkagit.get(4).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ozelkagit.get(4).setSeviyepuani(ozelkagit.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ozelkagit.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas1")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(0).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ustamakas.get(0));
                       ustamakas.get(0).setDayaniklilik(ustamakas.get(0).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(0).setSeviyepuani(ustamakas.get(0).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ustamakas.get(0).getDayaniklilik() <= 0.0) {
                           jLabel2.setText(" ");
                           jLabel7.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas2")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(1).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ustamakas.get(1));
                       ustamakas.get(1).setDayaniklilik(ustamakas.get(1).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(1).setSeviyepuani(ustamakas.get(1).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ustamakas.get(1).getDayaniklilik() <= 0.0) {
                           jLabel3.setText(" ");
                           jLabel8.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas3")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(2).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ustamakas.get(2));
                       ustamakas.get(2).setDayaniklilik(ustamakas.get(2).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(2).setSeviyepuani(ustamakas.get(2).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ustamakas.get(2).getDayaniklilik() <= 0.0) {
                           jLabel4.setText(" ");
                           jLabel9.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas4")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(3).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ustamakas.get(3));
                       ustamakas.get(3).setDayaniklilik(ustamakas.get(3).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(3).setSeviyepuani(ustamakas.get(3).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ustamakas.get(3).getDayaniklilik() <= 0.0) {
                           jLabel5.setText(" ");
                           jLabel10.setText(" ");
                       }
                   }
                   if (jLabel12.getText().equalsIgnoreCase("Usta Makas5")) {
                       double kullanicietki;
                       double pcetki;
                       kullanicietki = ustamakas.get(4).etkiHesapla(agirtas0.get(i));
                       pcetki = agirtas0.get(i).etkiHesapla(ustamakas.get(4));
                       ustamakas.get(4).setDayaniklilik(ustamakas.get(4).getDayaniklilik() - pcetki);
                       agirtas0.get(i).setDayaniklilik(agirtas0.get(i).getDayaniklilik() - kullanicietki);
                       jLabel14.setText("Ağır Taş");
                       if (kullanicietki > pcetki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                           ustamakas.get(4).setSeviyepuani(ustamakas.get(4).getSeviyepuani() + 20);
                       } else if (pcetki > kullanicietki) {
                           JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                           agirtas0.get(i).setSeviyepuani(agirtas0.get(i).getSeviyepuani() + 20);
                       }
                       jLabel15.setText(agirtas0.get(i).getDayaniklilik() + "");
                       if (ustamakas.get(4).getDayaniklilik() <= 0.0) {
                           jLabel6.setText(" ");
                           jLabel11.setText(" ");
                       }
                   }
                   if (jLabel12.getText().contains("Ağır Taş")) {
                       if (jLabel12.getText().length() == 9) {
                           double kullanicietki;
                           double pcetki;
                           kullanicietki = agirtas.get(0).etkiHesapla(agirtas0.get(i));
                           pcetki = agirtas0.get(i).etkiHesapla(agirtas.get(0));
                           if (kullanicietki == 0.0 && pcetki == 0.0) {
                               JOptionPane.showMessageDialog(this, "Bu round Berabere");
                               jLabel12.setText(" ");
                           }
                       }
                   }

           }
               //--------------------------------------------------------------------
            if(secilennesnepc[i].equalsIgnoreCase("Ozel Kağıt")){
                if (jLabel12.getText().equalsIgnoreCase("Taş1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(0).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(tas.get(0));
                    tas.get(0).setDayaniklilik(tas.get(0).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(0).setSeviyepuani(tas.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (tas.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                    if (tas.get(0).getSeviyepuani() >= 30) {
                        jLabel2.setText("Ağır Taş1");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Taş2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(1).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(tas.get(1));
                    tas.get(1).setDayaniklilik(tas.get(1).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(1).setSeviyepuani(tas.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (tas.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                    if (tas.get(1).getSeviyepuani() >= 30) {
                        jLabel3.setText("Ağır Taş2");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Taş3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(2).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(tas.get(2));
                    tas.get(2).setDayaniklilik(tas.get(2).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(2).setSeviyepuani(tas.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (tas.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                    if (tas.get(2).getSeviyepuani() >= 30) {
                        jLabel4.setText("Ağır Taş3");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Taş4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(3).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(tas.get(3));
                    tas.get(3).setDayaniklilik(tas.get(3).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(3).setSeviyepuani(tas.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (tas.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                    if (tas.get(3).getSeviyepuani() >= 30) {
                        jLabel5.setText("Ağır Taş4");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Taş5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(4).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(tas.get(4));
                    tas.get(4).setDayaniklilik(tas.get(4).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(4).setSeviyepuani(tas.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (tas.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                    if (tas.get(4).getSeviyepuani() >= 30) {
                        jLabel6.setText("Ağır Taş5");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(0).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(kagit.get(0));
                    kagit.get(0).setDayaniklilik(kagit.get(0).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(0).setSeviyepuani(kagit.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (kagit.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                    if (kagit.get(0).getSeviyepuani() >= 30) {
                        jLabel2.setText("Ozel Kağıt1");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(1).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(kagit.get(1));
                    kagit.get(1).setDayaniklilik(kagit.get(1).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(1).setSeviyepuani(kagit.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (kagit.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                    if (kagit.get(1).getSeviyepuani() >= 30) {
                        jLabel3.setText("Ozel Kağıt2");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(2).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(kagit.get(2));
                    kagit.get(2).setDayaniklilik(kagit.get(2).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(2).setSeviyepuani(kagit.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (kagit.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                    if (kagit.get(2).getSeviyepuani() >= 30) {
                        jLabel4.setText("Ozel Kağıt3");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(3).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(kagit.get(3));
                    kagit.get(3).setDayaniklilik(kagit.get(3).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(3).setSeviyepuani(kagit.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (kagit.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                    if (kagit.get(3).getSeviyepuani() >= 30) {
                        jLabel5.setText("Ozel Kağıt4");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(4).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(kagit.get(4));
                    kagit.get(4).setDayaniklilik(kagit.get(4).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(4).setSeviyepuani(kagit.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (kagit.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                    if (kagit.get(4).getSeviyepuani() >= 30) {
                        jLabel6.setText("Ozel Kağıt5");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(0).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(makas.get(0));
                    makas.get(0).setDayaniklilik(makas.get(0).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(0).setSeviyepuani(makas.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (makas.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                    if (makas.get(0).getSeviyepuani() >= 30) {
                        jLabel2.setText("Usta Makas1");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(1).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(makas.get(1));
                    makas.get(1).setDayaniklilik(makas.get(1).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(1).setSeviyepuani(makas.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (makas.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                    if (makas.get(1).getSeviyepuani() >= 30) {
                        jLabel3.setText("Usta Makas2");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(2).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(makas.get(2));
                    makas.get(2).setDayaniklilik(makas.get(2).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(2).setSeviyepuani(makas.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (makas.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                    if (makas.get(2).getSeviyepuani() >= 30) {
                        jLabel4.setText("Usta Makas3");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(3).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(makas.get(3));
                    makas.get(3).setDayaniklilik(makas.get(3).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(3).setSeviyepuani(makas.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (makas.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                    if (makas.get(3).getSeviyepuani() >= 30) {
                        jLabel5.setText("Usta Makas4");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(4).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(makas.get(4));
                    makas.get(4).setDayaniklilik(makas.get(4).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(4).setSeviyepuani(makas.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (makas.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                    if (makas.get(4).getSeviyepuani() >= 30) {
                        jLabel6.setText("Usta Makas5");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(0).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(agirtas.get(0));
                    agirtas.get(0).setDayaniklilik(agirtas.get(0).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(0).setSeviyepuani(agirtas.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(1).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(agirtas.get(1));
                    agirtas.get(1).setDayaniklilik(agirtas.get(1).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(1).setSeviyepuani(agirtas.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(2).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(agirtas.get(2));
                    agirtas.get(2).setDayaniklilik(agirtas.get(2).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(2).setSeviyepuani(agirtas.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(3).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(agirtas.get(3));
                    agirtas.get(3).setDayaniklilik(agirtas.get(3).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(3).setSeviyepuani(agirtas.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(4).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(agirtas.get(4));
                    agirtas.get(4).setDayaniklilik(agirtas.get(4).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(4).setSeviyepuani(agirtas.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Usta Makas1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ustamakas.get(0).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(ustamakas.get(0));
                    ustamakas.get(0).setDayaniklilik(ustamakas.get(0).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ustamakas.get(0).setSeviyepuani(ustamakas.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (ustamakas.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Usta Makas2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ustamakas.get(1).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(ustamakas.get(1));
                    ustamakas.get(1).setDayaniklilik(ustamakas.get(1).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ustamakas.get(1).setSeviyepuani(ustamakas.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (ustamakas.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Usta Makas3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ustamakas.get(2).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(ustamakas.get(2));
                    ustamakas.get(2).setDayaniklilik(ustamakas.get(2).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ustamakas.get(2).setSeviyepuani(ustamakas.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (ustamakas.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Usta Makas4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ustamakas.get(3).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(ustamakas.get(3));
                    ustamakas.get(3).setDayaniklilik(ustamakas.get(3).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ustamakas.get(3).setSeviyepuani(ustamakas.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (ustamakas.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Usta Makas5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ustamakas.get(4).etkiHesapla(ozelkagit0.get(i));
                    pcetki = ozelkagit0.get(i).etkiHesapla(ustamakas.get(4));
                    ustamakas.get(4).setDayaniklilik(ustamakas.get(4).getDayaniklilik() - pcetki);
                    ozelkagit0.get(i).setDayaniklilik(ozelkagit0.get(i).getDayaniklilik() - kullanicietki);
                    jLabel14.setText("Ozel Kağıt");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ustamakas.get(4).setSeviyepuani(ustamakas.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ozelkagit0.get(i).setSeviyepuani(ozelkagit0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ozelkagit0.get(i).getDayaniklilik() + "");
                    if (ustamakas.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                }
                if (jLabel12.getText().contains("Ozel Kağıt")) {
                    if (jLabel12.getText().length() == 11) {
                        double kullanicietki;
                        double pcetki;
                        kullanicietki = ozelkagit.get(0).etkiHesapla(ozelkagit0.get(i));
                        pcetki = ozelkagit0.get(i).etkiHesapla(ozelkagit.get(0));
                        if (kullanicietki == 0.0 && pcetki == 0.0) {
                            JOptionPane.showMessageDialog(this, "Bu round Berabere");
                            jLabel12.setText(" ");
                        }
                    }
                }
              }
            //-------------------------------------------------------------------------
            if(secilennesnepc[i].equalsIgnoreCase("Usta Makas")){
                if (jLabel12.getText().equalsIgnoreCase("Taş1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(0).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(tas.get(0));
                    tas.get(0).setDayaniklilik(tas.get(0).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(0).setSeviyepuani(tas.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (tas.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                    if (tas.get(0).getSeviyepuani() >= 30) {
                        jLabel2.setText("Ağır Taş1");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Taş2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(1).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(tas.get(1));
                    tas.get(1).setDayaniklilik(tas.get(1).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(1).setSeviyepuani(tas.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (tas.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                    if (tas.get(1).getSeviyepuani() >= 30) {
                        jLabel3.setText("Ağır Taş2");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Taş3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(2).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(tas.get(2));
                    tas.get(2).setDayaniklilik(tas.get(2).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(2).setSeviyepuani(tas.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (tas.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                    if (tas.get(2).getSeviyepuani() >= 30) {
                        jLabel4.setText("Ağır Taş3");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Taş4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(3).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(tas.get(3));
                    tas.get(3).setDayaniklilik(tas.get(3).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(3).setSeviyepuani(tas.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (tas.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                    if (tas.get(3).getSeviyepuani() >= 30) {
                        jLabel5.setText("Ağır Taş4");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Taş5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = tas.get(4).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(tas.get(4));
                    tas.get(4).setDayaniklilik(tas.get(4).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        tas.get(4).setSeviyepuani(tas.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (tas.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                    if (tas.get(4).getSeviyepuani() >= 30) {
                        jLabel6.setText("Ağır Taş5");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(0).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(kagit.get(0));
                    kagit.get(0).setDayaniklilik(kagit.get(0).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(0).setSeviyepuani(kagit.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (kagit.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                    if (kagit.get(0).getSeviyepuani() >= 30) {
                        jLabel2.setText("Ozel Kağıt1");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(1).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(kagit.get(1));
                    kagit.get(1).setDayaniklilik(kagit.get(1).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(1).setSeviyepuani(kagit.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (kagit.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                    if (kagit.get(1).getSeviyepuani() >= 30) {
                        jLabel3.setText("Ozel Kağıt2");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(2).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(kagit.get(2));
                    kagit.get(2).setDayaniklilik(kagit.get(2).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(2).setSeviyepuani(kagit.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (kagit.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                    if (kagit.get(2).getSeviyepuani() >= 30) {
                        jLabel4.setText("Ozel Kağıt3");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(3).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(kagit.get(3));
                    kagit.get(3).setDayaniklilik(kagit.get(3).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(3).setSeviyepuani(kagit.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (kagit.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                    if (kagit.get(3).getSeviyepuani() >= 30) {
                        jLabel5.setText("Ozel Kağıt4");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Kağıt5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = kagit.get(4).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(kagit.get(4));
                    kagit.get(4).setDayaniklilik(kagit.get(4).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        kagit.get(4).setSeviyepuani(kagit.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (kagit.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                    if (kagit.get(4).getSeviyepuani() >= 30) {
                        jLabel6.setText("Ozel Kağıt5");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(0).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(makas.get(0));
                    makas.get(0).setDayaniklilik(makas.get(0).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(0).setSeviyepuani(makas.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (makas.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                    if (makas.get(0).getSeviyepuani() >= 30) {
                        jLabel2.setText("Usta Makas1");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(1).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(makas.get(1));
                    makas.get(1).setDayaniklilik(makas.get(1).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(1).setSeviyepuani(makas.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (makas.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                    if (makas.get(1).getSeviyepuani() >= 30) {
                        jLabel3.setText("Usta Makas2");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(2).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(makas.get(2));
                    makas.get(2).setDayaniklilik(makas.get(2).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(2).setSeviyepuani(makas.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (makas.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                    if (makas.get(2).getSeviyepuani() >= 30) {
                        jLabel4.setText("Usta Makas3");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(3).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(makas.get(3));
                    makas.get(3).setDayaniklilik(makas.get(3).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(3).setSeviyepuani(makas.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (makas.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                    if (makas.get(3).getSeviyepuani() >= 30) {
                        jLabel5.setText("Usta Makas4");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Makas5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = makas.get(4).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(makas.get(4));
                    makas.get(4).setDayaniklilik(makas.get(4).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        makas.get(4).setSeviyepuani(makas.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (makas.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                    if (makas.get(4).getSeviyepuani() >= 30) {
                        jLabel6.setText("Usta Makas5");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(0).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(agirtas.get(0));
                    agirtas.get(0).setDayaniklilik(agirtas.get(0).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(0).setSeviyepuani(agirtas.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(1).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(agirtas.get(1));
                    agirtas.get(1).setDayaniklilik(agirtas.get(1).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(1).setSeviyepuani(agirtas.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(2).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(agirtas.get(2));
                    agirtas.get(2).setDayaniklilik(agirtas.get(2).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(2).setSeviyepuani(agirtas.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(3).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(agirtas.get(3));
                    agirtas.get(3).setDayaniklilik(agirtas.get(3).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(3).setSeviyepuani(agirtas.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ağır Taş5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = agirtas.get(4).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(agirtas.get(4));
                    agirtas.get(4).setDayaniklilik(agirtas.get(4).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        agirtas.get(4).setSeviyepuani(agirtas.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (agirtas.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt1")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ozelkagit.get(0).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(ozelkagit.get(0));
                    ozelkagit.get(0).setDayaniklilik(ozelkagit.get(0).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ozelkagit.get(0).setSeviyepuani(ozelkagit.get(0).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (ozelkagit.get(0).getDayaniklilik() <= 0.0) {
                        jLabel2.setText(" ");
                        jLabel7.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt2")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ozelkagit.get(1).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(ozelkagit.get(1));
                    ozelkagit.get(1).setDayaniklilik(ozelkagit.get(1).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ozelkagit.get(1).setSeviyepuani(ozelkagit.get(1).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (ozelkagit.get(1).getDayaniklilik() <= 0.0) {
                        jLabel3.setText(" ");
                        jLabel8.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt3")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ozelkagit.get(2).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(ozelkagit.get(2));
                    ozelkagit.get(2).setDayaniklilik(ozelkagit.get(2).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ozelkagit.get(2).setSeviyepuani(ozelkagit.get(2).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (ozelkagit.get(2).getDayaniklilik() <= 0.0) {
                        jLabel4.setText(" ");
                        jLabel9.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt4")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ozelkagit.get(3).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(ozelkagit.get(3));
                    ozelkagit.get(3).setDayaniklilik(ozelkagit.get(3).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ozelkagit.get(3).setSeviyepuani(ozelkagit.get(3).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (ozelkagit.get(3).getDayaniklilik() <= 0.0) {
                        jLabel5.setText(" ");
                        jLabel10.setText(" ");
                    }
                }
                if (jLabel12.getText().equalsIgnoreCase("Ozel Kağıt5")) {
                    double kullanicietki;
                    double pcetki;
                    kullanicietki = ozelkagit.get(4).etkiHesapla(ustamakas0.get(i));
                    pcetki = ustamakas0.get(i).etkiHesapla(ozelkagit.get(4));
                    ozelkagit.get(4).setDayaniklilik(ozelkagit.get(4).getDayaniklilik() - pcetki);
                    ustamakas0.get(i).setDayaniklilik(ustamakas0.get(i).getDayaniklilik() - kullanicietki);

                    jLabel14.setText("Usta Makas");
                    if (kullanicietki > pcetki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Kullanici kazandı");
                        ozelkagit.get(4).setSeviyepuani(ozelkagit.get(4).getSeviyepuani() + 20);
                    } else if (pcetki > kullanicietki) {
                        JOptionPane.showMessageDialog(this, "Bu roundu Bilgisayar kazandı");
                        ustamakas0.get(i).setSeviyepuani(ustamakas0.get(i).getSeviyepuani() + 20);
                    }
                    jLabel15.setText(ustamakas0.get(i).getDayaniklilik() + "");
                    if (ozelkagit.get(4).getDayaniklilik() <= 0.0) {
                        jLabel6.setText(" ");
                        jLabel11.setText(" ");
                    }
                }
                if (jLabel12.getText().contains("Usta Makas")) {
                    if (jLabel12.getText().length() == 11) {
                        double kullanicietki;
                        double pcetki;
                        kullanicietki = ustamakas.get(0).etkiHesapla(ustamakas0.get(i));
                        pcetki = ustamakas0.get(i).etkiHesapla(ustamakas.get(0));
                        if (kullanicietki == 0.0 && pcetki == 0.0) {
                            JOptionPane.showMessageDialog(this, "Bu round Berabere");
                            jLabel12.setText(" ");
                        }
                    }
                }
        }
            for(int b=0;b<secilennesne.length;b++){
                if(tas0.get(b).getDayaniklilik()<=0.0)
                    secilennesne[b]="Boş";
                if(makas0.get(b).getDayaniklilik()<=0.0)
                    secilennesne[b]="Boş";
                if(kagit0.get(b).getDayaniklilik()<=0.0)
                    secilennesne[b]="Boş";
                if(agirtas0.get(b).getDayaniklilik()<=0.0)
                    secilennesne[b]="Boş";
                if(ustamakas0.get(b).getDayaniklilik()<=0.0)
                    secilennesne[b]="Boş";
                if(ozelkagit0.get(b).getDayaniklilik()<=0.0)
                    secilennesne[b]="Boş";
            }
            
            if(jLabel2.getText().equals("Taş1")){
           jLabel7.setText("Dayanıklılık:"+tas.get(0).getDayaniklilik()); 
        }
        if(jLabel2.getText().equals("Kağıt1")){
           jLabel7.setText("Dayanıklılık:"+kagit.get(0).getDayaniklilik());
        }
        if(jLabel2.getText().equals("Makas1")){
            jLabel7.setText("Dayanıklılık:"+makas.get(0).getDayaniklilik());
        }
        if(jLabel2.getText().equals("Ağır Taş1")){
           jLabel7.setText("Dayanıklılık:"+agirtas.get(0).getDayaniklilik()); 
        }
        if(jLabel2.getText().equals("Ozel Kağıt1")){
           jLabel7.setText("Dayanıklılık:"+ozelkagit.get(0).getDayaniklilik());
        }
        if(jLabel2.getText().equals("Usta Makas1")){
            jLabel7.setText("Dayanıklılık:"+ustamakas.get(0).getDayaniklilik());
        }
        if(jLabel3.getText().equals("Taş2")){
           jLabel8.setText("Dayanıklılık:"+tas.get(1).getDayaniklilik()); 
        }
        if(jLabel3.getText().equals("Kağıt2")){
           jLabel8.setText("Dayanıklılık:"+kagit.get(1).getDayaniklilik());
        }
        if(jLabel3.getText().equals("Makas2")){
            jLabel8.setText("Dayanıklılık:"+makas.get(1).getDayaniklilik());
        }
        if(jLabel3.getText().equals("Ağır Taş2")){
           jLabel8.setText("Dayanıklılık:"+agirtas.get(1).getDayaniklilik()); 
        }
        if(jLabel3.getText().equals("Ozel Kağıt2")){
           jLabel8.setText("Dayanıklılık:"+ozelkagit.get(1).getDayaniklilik());
        }
        if(jLabel3.getText().equals("Usta Makas2")){
            jLabel8.setText("Dayanıklılık:"+ustamakas.get(1).getDayaniklilik());
        }
        if(jLabel4.getText().equals("Taş3")){
           jLabel9.setText("Dayanıklılık:"+tas.get(2).getDayaniklilik()); 
        }
        if(jLabel4.getText().equals("Kağıt3")){
           jLabel9.setText("Dayanıklılık:"+kagit.get(2).getDayaniklilik());
        }
        if(jLabel4.getText().equals("Makas3")){
            jLabel9.setText("Dayanıklılık:"+makas.get(2).getDayaniklilik());
        }
        if(jLabel4.getText().equals("Ağır Taş3")){
           jLabel9.setText("Dayanıklılık:"+agirtas.get(2).getDayaniklilik()); 
        }
        if(jLabel4.getText().equals("Ozel Kağıt3")){
           jLabel9.setText("Dayanıklılık:"+ozelkagit.get(2).getDayaniklilik());
        }
        if(jLabel4.getText().equals("Usta Makas3")){
            jLabel9.setText("Dayanıklılık:"+ustamakas.get(2).getDayaniklilik());
        }
        if(jLabel5.getText().equals("Taş4")){
           jLabel10.setText("Dayanıklılık:"+tas.get(3).getDayaniklilik()); 
        }
        if(jLabel5.getText().equals("Kağıt4")){
           jLabel10.setText("Dayanıklılık:"+kagit.get(3).getDayaniklilik());
        }
        if(jLabel5.getText().equals("Makas4")){
            jLabel10.setText("Dayanıklılık:"+makas.get(3).getDayaniklilik());
        }
        if(jLabel5.getText().equals("Ağır Taş4")){
           jLabel10.setText("Dayanıklılık:"+agirtas.get(3).getDayaniklilik()); 
        }
        if(jLabel5.getText().equals("Ozel Kağıt4")){
           jLabel10.setText("Dayanıklılık:"+ozelkagit.get(3).getDayaniklilik());
        }
        if(jLabel5.getText().equals("Usta Makas4")){
            jLabel10.setText("Dayanıklılık:"+ustamakas.get(3).getDayaniklilik());
        }
        if(jLabel6.getText().equals("Taş5")){
           jLabel11.setText("Dayanıklılık:"+tas.get(4).getDayaniklilik()); 
        }
        if(jLabel6.getText().equals("Kağıt5")){
           jLabel11.setText("Dayanıklılık:"+kagit.get(4).getDayaniklilik());
        }
        if(jLabel6.getText().equals("Makas5")){
            jLabel11.setText("Dayanıklılık:"+makas.get(4).getDayaniklilik());
        }
        if(jLabel6.getText().equals("Ağır Taş5")){
           jLabel11.setText("Dayanıklılık:"+agirtas.get(4).getDayaniklilik()); 
        }
        if(jLabel6.getText().equals("Ozel Kağıt5")){
           jLabel11.setText("Dayanıklılık:"+ozelkagit.get(4).getDayaniklilik());
        }
        if(jLabel6.getText().equals("Usta Makas5")){
            jLabel11.setText("Dayanıklılık:"+ustamakas.get(4).getDayaniklilik());
        }
            
            
            
            
           
           
       }
       else if(a==0)
           JOptionPane.showMessageDialog(this, "Herhangi Bir Nesne Seçmediniz... \nLütfen Nesne Seçin");
           
    }//GEN-LAST:event_OynaButonuActionPerformed
    
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
            java.util.logging.Logger.getLogger(Userpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userpc().setVisible(true);
                
                
            }
        });
    }

    
    
    
    
    
    

    

    
    public Kullanici getKullanici1() {
        return kullanici1;
    }

    public void setKullanici1(Kullanici kullanici1) {
        this.kullanici1 = kullanici1;
    }

    public String[] getSecilennesne() {
        return secilennesne;
    }

    public void setSecilennesne(String[] secilennesne) {
        this.secilennesne = secilennesne;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public ArrayList<Tas> getTas() {
        return tas;
    }

    public void setTas(ArrayList<Tas> tas) {
        this.tas = tas;
    }

    public ArrayList<Kagit> getKagit() {
        return kagit;
    }

    public void setKagit(ArrayList<Kagit> kagit) {
        this.kagit = kagit;
    }

    public ArrayList<Makas> getMakas() {
        return makas;
    }

    public void setMakas(ArrayList<Makas> makas) {
        this.makas = makas;
    }

    public ArrayList<OzelKagit> getOzelkagit() {
        return ozelkagit;
    }

    public void setOzelkagit(ArrayList<OzelKagit> ozelkagit) {
        this.ozelkagit = ozelkagit;
    }

    public ArrayList<UstaMakas> getUstamakas() {
        return ustamakas;
    }

    public void setUstamakas(ArrayList<UstaMakas> ustamakas) {
        this.ustamakas = ustamakas;
    }

    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OynaButonu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
