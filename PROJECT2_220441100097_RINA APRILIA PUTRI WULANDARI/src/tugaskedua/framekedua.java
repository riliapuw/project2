/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package tugaskedua;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class framekedua extends javax.swing.JFrame {
    String menu;
    int harga,Pesanan,total,jumlah;
    /** Creates new form framekedua */
    public framekedua() {
        initComponents();
        jumlah = 0;
        eJumang.setText("" + jumlah);
        eTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jumlah++;
                eJumang.setText(Integer.toString(jumlah));
            }
        });
         eKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jumlah > 0) {
                    jumlah--;
                    eJumang.setText(Integer.toString(jumlah));
                }
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aturbttn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nasgor = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        kerang = new javax.swing.JRadioButton();
        kepiting = new javax.swing.JRadioButton();
        lobster = new javax.swing.JRadioButton();
        udang = new javax.swing.JRadioButton();
        gurame = new javax.swing.JRadioButton();
        soka = new javax.swing.JRadioButton();
        bandeng = new javax.swing.JRadioButton();
        cumi = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        eJumang = new javax.swing.JTextField();
        eTambah = new javax.swing.JButton();
        eKurang = new javax.swing.JButton();
        eBeli = new javax.swing.JButton();
        eHapus = new javax.swing.JButton();
        eTampilkan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ePesanan = new javax.swing.JTextField();
        eJumlah = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        eHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        eTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 24)); // NOI18N
        jLabel1.setText("WARUNG SEANA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 25, 231, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaskedua/gambarkedua.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 0, 78, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaskedua/gambarkeduaa2.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 86, 60));

        jLabel11.setBackground(new java.awt.Color(204, 255, 255));
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaskedua/bg1.jpg"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 470, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aturbttn.add(nasgor);
        nasgor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nasgor.setText("Nasi Goreng seafood");
        jPanel3.add(nasgor, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 34, -1, -1));

        jLabel2.setFont(new java.awt.Font("STCaiyun", 3, 14)); // NOI18N
        jLabel2.setText("MENU YANG TERSEDIA");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 12, 160, -1));

        aturbttn.add(kerang);
        kerang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        kerang.setText("Kerang saos padang");
        jPanel3.add(kerang, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 61, -1, -1));

        aturbttn.add(kepiting);
        kepiting.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        kepiting.setText("Kepiting saos padang");
        jPanel3.add(kepiting, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 88, -1, -1));

        aturbttn.add(lobster);
        lobster.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lobster.setText("Lobster saus padang");
        lobster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lobsterActionPerformed(evt);
            }
        });
        jPanel3.add(lobster, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 34, -1, -1));

        aturbttn.add(udang);
        udang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        udang.setText("Udang goreng tepung");
        udang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udangActionPerformed(evt);
            }
        });
        jPanel3.add(udang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 61, -1, -1));

        aturbttn.add(gurame);
        gurame.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gurame.setText("Gurame asam manis");
        jPanel3.add(gurame, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 88, -1, -1));

        aturbttn.add(soka);
        soka.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        soka.setText("Soka saus tiram");
        jPanel3.add(soka, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 34, -1, -1));

        aturbttn.add(bandeng);
        bandeng.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bandeng.setText("Bandeng bakar");
        jPanel3.add(bandeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 61, -1, -1));

        aturbttn.add(cumi);
        cumi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cumi.setText("Cumi saus thailand");
        jPanel3.add(cumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 88, -1, -1));

        jLabel4.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        jLabel4.setText("JUMLAH PEMBELIAN");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        eJumang.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        eJumang.setText("0");
        jPanel3.add(eJumang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 41, -1));

        eTambah.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        eTambah.setText("+");
        jPanel3.add(eTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        eKurang.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        eKurang.setText("-");
        jPanel3.add(eKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        eBeli.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        eBeli.setText("BELI");
        eBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBeliActionPerformed(evt);
            }
        });
        jPanel3.add(eBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 81, -1));

        eHapus.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        eHapus.setText("HAPUS");
        eHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eHapusActionPerformed(evt);
            }
        });
        jPanel3.add(eHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        eTampilkan.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        eTampilkan.setText("TAMPILKAN");
        eTampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eTampilkanActionPerformed(evt);
            }
        });
        jPanel3.add(eTampilkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        jLabel5.setText("PESANAN ANDA");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));
        jPanel3.add(ePesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 300, -1));
        jPanel3.add(eJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 80, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Harga Pesanan");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));
        jPanel3.add(eHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 110, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Pesanan Anda");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 37));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Jumlah Pesanan");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Total Harga");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));
        jPanel3.add(eTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 300, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaskedua/bag1.jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 470, 410));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBeliActionPerformed
         if (nasgor.isSelected()){
            menu = "Nasi Goreng Seafood";
            harga = 15000;
        }else if (kerang.isSelected()){
            menu = "Kerang saus padang";
            harga = 15000;
        }else if(kepiting.isSelected()){
            menu = "Kepiting saus padang";
            harga = 40000;
        }else if(lobster.isSelected()){
            menu = "Lobster saus padang";
            harga = 40000;
        }else if(udang.isSelected()){
            menu = "Udang goreng tepung";
            harga = 10000;
        }else if(gurame.isSelected()){
            menu = "Gurame asam manis";
            harga = 65000;
        }else if(soka.isSelected()){
            menu = "Soka saus tiram";
            harga = 30000;
        }else if(bandeng.isSelected()){
            menu = "Bandeng bakar";
            harga = 25000;
        }else if(cumi.isSelected()){
            menu = "Cumi saus thailand";
            harga = 45000;
        }
        
        jumlah = Integer.parseInt(eJumang.getText());
        total = jumlah * harga;
        ePesanan.setText("" + menu);
        eJumlah.setText("" + jumlah);
        eHarga.setText("" + harga);
        eTotal.setText("" + total);
    }//GEN-LAST:event_eBeliActionPerformed

    private void eHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eHapusActionPerformed
        aturbttn.clearSelection();
        jumlah = 0;
        eJumang.setText(Integer.toString(jumlah));
        ePesanan.setText("");
        eJumlah.setText("");
        eHarga.setText("");
        eTotal.setText("");
    }//GEN-LAST:event_eHapusActionPerformed

    private void eTampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eTampilkanActionPerformed
        JOptionPane.showMessageDialog(this,
            "Pesanan Anda        : " + menu +
            "\nJumlah Pesanan    : " + jumlah+
            "\nHarga Pesanan     : Rp. " + harga+
            "\nTotal Harga       : Rp. " + total);
        
        aturbttn.clearSelection();
        jumlah = 0;
        eJumang.setText(Integer.toString(jumlah));
        ePesanan.setText("");
        eJumlah.setText("");
        eHarga.setText("");
        eTotal.setText("");
    }//GEN-LAST:event_eTampilkanActionPerformed

    private void udangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_udangActionPerformed

    private void lobsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lobsterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lobsterActionPerformed

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
            java.util.logging.Logger.getLogger(framekedua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framekedua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framekedua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framekedua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framekedua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup aturbttn;
    private javax.swing.JRadioButton bandeng;
    private javax.swing.JRadioButton cumi;
    private javax.swing.JButton eBeli;
    private javax.swing.JButton eHapus;
    private javax.swing.JTextField eHarga;
    private javax.swing.JTextField eJumang;
    private javax.swing.JTextField eJumlah;
    private javax.swing.JButton eKurang;
    private javax.swing.JTextField ePesanan;
    private javax.swing.JButton eTambah;
    private javax.swing.JButton eTampilkan;
    private javax.swing.JTextField eTotal;
    private javax.swing.JRadioButton gurame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton kepiting;
    private javax.swing.JRadioButton kerang;
    private javax.swing.JRadioButton lobster;
    private javax.swing.JRadioButton nasgor;
    private javax.swing.JRadioButton soka;
    private javax.swing.JRadioButton udang;
    // End of variables declaration//GEN-END:variables

}