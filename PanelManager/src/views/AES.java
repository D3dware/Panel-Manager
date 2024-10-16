package views;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author D3dware
 */
public class AES extends javax.swing.JFrame {

    /**
     * Creates new form AES
     */
    public AES() {
        initComponents();
        addPasswordListener();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSALVAR = new com.k33ptoo.components.KButton();
        txtPASS = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBYTES = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PM - AES-key");
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha Criptografia:");

        btnSALVAR.setBackground(new java.awt.Color(102, 0, 102));
        btnSALVAR.setForeground(new java.awt.Color(102, 0, 102));
        btnSALVAR.setText("Salvar");
        btnSALVAR.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnSALVAR.setkBorderRadius(30);
        btnSALVAR.setkEndColor(new java.awt.Color(102, 0, 102));
        btnSALVAR.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnSALVAR.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSALVAR.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnSALVAR.setkIndicatorThickness(1);
        btnSALVAR.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnSALVAR.setkStartColor(new java.awt.Color(153, 0, 204));
        btnSALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALVARActionPerformed(evt);
            }
        });

        txtPASS.setBackground(new java.awt.Color(255, 255, 255));
        txtPASS.setForeground(new java.awt.Color(0, 0, 0));
        txtPASS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPASS.setCaretColor(new java.awt.Color(0, 0, 0));
        txtPASS.setSelectionColor(new java.awt.Color(204, 0, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("( Uma senha forte deve ter EXATAMENTE 16, 24 ou 32 Bytes, incluindo Letras Maiúsculas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("e Minúsculas, Números e Caracteres Especiais. )");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bytes:");

        txtBYTES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBYTES.setForeground(new java.awt.Color(255, 255, 255));
        txtBYTES.setText("0");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBYTES))
                            .addComponent(txtPASS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSALVAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(47, 47, 47))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSALVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBYTES))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALVARActionPerformed
        String Crypt = txtPASS.getText().isEmpty() ? null : txtPASS.getText();
                    
        if(!Crypt.isEmpty()){
        try{
            File diretorio = new File("C:/Panel_Manager/AutoUpdate/");
            if(!diretorio.exists()){
                diretorio.mkdirs();
            }
            
            PrintWriter out = new PrintWriter("C:/Panel_Manager/AutoUpdate/Conf.ini");
            
            out.println(Crypt);
            out.close();
            
            JOptionPane.showMessageDialog(null, "Chave AES salva com Sucesso!", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR);
        }
        
        txtPASS.setText(null);
        }
    }//GEN-LAST:event_btnSALVARActionPerformed

    private void addPasswordListener() {
        txtPASS.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateByteCount();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateByteCount();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateByteCount();
            }
        });
    }

    private void updateByteCount() {
        String password = new String(txtPASS.getPassword());
        String byteCount = Integer.toString(password.getBytes(StandardCharsets.UTF_8).length);
        txtBYTES.setText(byteCount);
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
                new AES().setVisible(true);
            }
        });
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ICON.png")));    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnSALVAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel txtBYTES;
    private javax.swing.JPasswordField txtPASS;
    // End of variables declaration//GEN-END:variables
}
