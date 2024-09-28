package views;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Toolkit;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import jdbc.DatabaseCreation;

/**
 *
 * @author D3dware
 */
public class main extends javax.swing.JFrame {
    private static SecretKeySpec secretKey;
    private static byte[] key;
    
    public class AESUtil {

    private static SecretKeySpec secretKey;
    private static IvParameterSpec ivParameterSpec;

    public static void setKey(String myKey) {
        try {
            byte[] key = myKey.getBytes(StandardCharsets.UTF_8);
            secretKey = new SecretKeySpec(key, "AES");
            ivParameterSpec = new IvParameterSpec(key);
        } catch (Exception e) {
            System.out.println("Erro ao implementar a chave: " + e.toString());
        }
    }

    public static String encrypt(String strToEncrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
            return null;
        }
    }

    public static String decrypt(String strToDecrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)), StandardCharsets.UTF_8);
            
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
            return null;
        }
    }}
    

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        setIcon();
        
        DatabaseCreation bancoDeDados = new DatabaseCreation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPESQUISAR = new com.k33ptoo.components.KButton();
        btnADICIONAR = new com.k33ptoo.components.KButton();
        btnEDITAR = new com.k33ptoo.components.KButton();
        btnDELETAR = new com.k33ptoo.components.KButton();
        iconDB = new javax.swing.JLabel();
        btnGENOTIPAGEM = new com.k33ptoo.components.KButton();
        iconCLOSE = new javax.swing.JLabel();
        iconMINIMIZE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PANEL MANAGER - by: @D3dware (Github)");
        setMaximumSize(new java.awt.Dimension(765, 618));
        setMinimumSize(new java.awt.Dimension(765, 555));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(765, 555));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 153));

        jLabel1.setFont(new java.awt.Font("Dubai", 3, 88)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Manager");

        jLabel2.setFont(new java.awt.Font("Dubai", 3, 88)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Panel");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kelvin Santos Dmitruk (@D3dware - Github)");

        jPanel3.setBackground(new java.awt.Color(7, 7, 7));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- Menu Principal -");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Home.png"))); // NOI18N

        btnPESQUISAR.setBackground(new java.awt.Color(102, 0, 102));
        btnPESQUISAR.setForeground(new java.awt.Color(102, 0, 102));
        btnPESQUISAR.setText("Pesquisar");
        btnPESQUISAR.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnPESQUISAR.setkBorderRadius(30);
        btnPESQUISAR.setkEndColor(new java.awt.Color(102, 0, 102));
        btnPESQUISAR.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnPESQUISAR.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnPESQUISAR.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnPESQUISAR.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnPESQUISAR.setkStartColor(new java.awt.Color(153, 0, 204));
        btnPESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPESQUISARActionPerformed(evt);
            }
        });

        btnADICIONAR.setBackground(new java.awt.Color(102, 0, 102));
        btnADICIONAR.setForeground(new java.awt.Color(102, 0, 102));
        btnADICIONAR.setText("Adicionar");
        btnADICIONAR.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnADICIONAR.setkBorderRadius(30);
        btnADICIONAR.setkEndColor(new java.awt.Color(102, 0, 102));
        btnADICIONAR.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnADICIONAR.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnADICIONAR.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnADICIONAR.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnADICIONAR.setkStartColor(new java.awt.Color(153, 0, 204));
        btnADICIONAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADICIONARActionPerformed(evt);
            }
        });

        btnEDITAR.setBackground(new java.awt.Color(102, 0, 102));
        btnEDITAR.setForeground(new java.awt.Color(102, 0, 102));
        btnEDITAR.setText("Editar Painel");
        btnEDITAR.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEDITAR.setkBorderRadius(30);
        btnEDITAR.setkEndColor(new java.awt.Color(102, 0, 102));
        btnEDITAR.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnEDITAR.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEDITAR.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnEDITAR.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnEDITAR.setkStartColor(new java.awt.Color(153, 0, 204));
        btnEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDITARActionPerformed(evt);
            }
        });

        btnDELETAR.setBackground(new java.awt.Color(102, 0, 102));
        btnDELETAR.setForeground(new java.awt.Color(102, 0, 102));
        btnDELETAR.setText("Deletar");
        btnDELETAR.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnDELETAR.setkBorderRadius(30);
        btnDELETAR.setkEndColor(new java.awt.Color(102, 0, 102));
        btnDELETAR.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnDELETAR.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnDELETAR.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnDELETAR.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnDELETAR.setkStartColor(new java.awt.Color(153, 0, 204));
        btnDELETAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETARActionPerformed(evt);
            }
        });

        iconDB.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        iconDB.setForeground(new java.awt.Color(255, 255, 255));
        iconDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Data Encryption.png"))); // NOI18N
        iconDB.setText("Database");
        iconDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconDBMouseClicked(evt);
            }
        });

        btnGENOTIPAGEM.setBackground(new java.awt.Color(102, 0, 102));
        btnGENOTIPAGEM.setForeground(new java.awt.Color(102, 0, 102));
        btnGENOTIPAGEM.setText("Adicionar Genotipagem");
        btnGENOTIPAGEM.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnGENOTIPAGEM.setkBorderRadius(30);
        btnGENOTIPAGEM.setkEndColor(new java.awt.Color(102, 0, 102));
        btnGENOTIPAGEM.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnGENOTIPAGEM.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnGENOTIPAGEM.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnGENOTIPAGEM.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnGENOTIPAGEM.setkStartColor(new java.awt.Color(153, 0, 204));
        btnGENOTIPAGEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGENOTIPAGEMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(339, 339, 339))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPESQUISAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnADICIONAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEDITAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDELETAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGENOTIPAGEM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(iconDB)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnADICIONAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGENOTIPAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDELETAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(iconDB)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        iconCLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Close.png"))); // NOI18N
        iconCLOSE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconCLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconCLOSEMouseClicked(evt);
            }
        });

        iconMINIMIZE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Minimize.png"))); // NOI18N
        iconMINIMIZE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconMINIMIZE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMINIMIZEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 116, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(iconMINIMIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconCLOSE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27))))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconCLOSE)
                            .addComponent(iconMINIMIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 396, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 126, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );

        jPanel1.add(kGradientPanel1, "card3");

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPESQUISARActionPerformed
        new Pesquisar().setVisible(true);
    }//GEN-LAST:event_btnPESQUISARActionPerformed

    private void btnADICIONARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADICIONARActionPerformed
        new Adicionar().setVisible(true);
    }//GEN-LAST:event_btnADICIONARActionPerformed

    private void btnEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDITARActionPerformed
        new Editar().setVisible(true);
    }//GEN-LAST:event_btnEDITARActionPerformed

    private void btnDELETARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETARActionPerformed
        new Deletar().setVisible(true);
    }//GEN-LAST:event_btnDELETARActionPerformed

    private void iconCLOSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconCLOSEMouseClicked
        System.exit(0);
    }//GEN-LAST:event_iconCLOSEMouseClicked

    private void iconMINIMIZEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMINIMIZEMouseClicked
        this.setState(main.ICONIFIED);
    }//GEN-LAST:event_iconMINIMIZEMouseClicked

    private void iconDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDBMouseClicked
        new AES().setVisible(true);
    }//GEN-LAST:event_iconDBMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        verificaKEY();
    }//GEN-LAST:event_formWindowOpened

    private void btnGENOTIPAGEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGENOTIPAGEMActionPerformed
        new Geno().setVisible(true);
    }//GEN-LAST:event_btnGENOTIPAGEMActionPerformed

    private void verificaKEY(){
        // Verifique o arquivo
        File file2 = new File("C:/Panel_Manager/AutoUpdate/Conf.ini");

        if(file2.exists() && file2.length() == 0) {
            JOptionPane.showMessageDialog(null, "Chave AES não encontrada!", "AES-Key ERROR", JOptionPane.ERROR_MESSAGE);
            new AES().setVisible(true);
            dispose();
            
        }else if(!file2.exists()){
            new AES().setVisible(true);
            dispose();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //         LOOK AND FEEL           //
        FlatDarculaLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ICON.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnADICIONAR;
    private com.k33ptoo.components.KButton btnDELETAR;
    private com.k33ptoo.components.KButton btnEDITAR;
    private com.k33ptoo.components.KButton btnGENOTIPAGEM;
    private com.k33ptoo.components.KButton btnPESQUISAR;
    private javax.swing.JLabel iconCLOSE;
    private javax.swing.JLabel iconDB;
    private javax.swing.JLabel iconMINIMIZE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
