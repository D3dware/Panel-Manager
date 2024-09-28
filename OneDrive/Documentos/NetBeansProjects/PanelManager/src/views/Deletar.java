package views;

import com.formdev.flatlaf.FlatDarculaLaf;
import dao.Painel_DAO;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author D3dware
 */
public class Deletar extends javax.swing.JFrame {

    /**
     * Creates new form Deletar
     */
    public Deletar() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        iconEXCLUIR_hemacia = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtMARCA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        iconEXCLUIR_PAINEL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLOTE = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        iconDELETAR_DB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PM - DELETAR");
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 153));

        jTabbedPane1.setBackground(new java.awt.Color(102, 0, 102));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        iconEXCLUIR_hemacia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconEXCLUIR_hemacia.setForeground(new java.awt.Color(255, 255, 255));
        iconEXCLUIR_hemacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Delete Trash.png"))); // NOI18N
        iconEXCLUIR_hemacia.setText("Excluir");
        iconEXCLUIR_hemacia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconEXCLUIR_hemacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconEXCLUIR_hemaciaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconEXCLUIR_hemacia)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iconEXCLUIR_hemacia)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Deletar Hemácia", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        txtMARCA.setBackground(new java.awt.Color(255, 255, 255));
        txtMARCA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMARCA.setForeground(new java.awt.Color(0, 0, 0));
        txtMARCA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMARCA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");

        iconEXCLUIR_PAINEL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconEXCLUIR_PAINEL.setForeground(new java.awt.Color(255, 255, 255));
        iconEXCLUIR_PAINEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Delete Trash.png"))); // NOI18N
        iconEXCLUIR_PAINEL.setText("Deletar Painel");
        iconEXCLUIR_PAINEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconEXCLUIR_PAINEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconEXCLUIR_PAINELMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lote:");

        txtLOTE.setBackground(new java.awt.Color(255, 255, 255));
        txtLOTE.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLOTE.setForeground(new java.awt.Color(0, 0, 0));
        txtLOTE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLOTE.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(iconEXCLUIR_PAINEL)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLOTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(iconEXCLUIR_PAINEL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deletar Painel", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        iconDELETAR_DB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconDELETAR_DB.setForeground(new java.awt.Color(255, 255, 255));
        iconDELETAR_DB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Delete Database.png"))); // NOI18N
        iconDELETAR_DB.setText("Deletar Banco de Dados");
        iconDELETAR_DB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconDELETAR_DB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconDELETAR_DBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(iconDELETAR_DB)
                .addGap(121, 121, 121))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(iconDELETAR_DB)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Deletar Database", jPanel3);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
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

    private void iconDELETAR_DBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDELETAR_DBMouseClicked
        //DELETAR DATABASE:
        int confirm = JOptionPane.showConfirmDialog(null, "Deseja mesmo DELETAR TODO O BANCO DE DADOS ?", "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            Painel_DAO dao1 = new Painel_DAO();
            dao1.DELETAR_DB();
            dispose();
        }
    }//GEN-LAST:event_iconDELETAR_DBMouseClicked

    private void iconEXCLUIR_hemaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconEXCLUIR_hemaciaMouseClicked
        //DELETAR HEMACIA:
        
        String id = txtID.getText();
        
        if(!txtID.getText().isEmpty()){
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja mesmo EXCLUIR esse registro ?", "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                Painel_DAO dao = new Painel_DAO();
                dao.DELETAR_AMOSTRA(id);
                dispose();
            }
        }
    }//GEN-LAST:event_iconEXCLUIR_hemaciaMouseClicked

    private void iconEXCLUIR_PAINELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconEXCLUIR_PAINELMouseClicked
        String marca = txtMARCA.getText();
        String lote = txtLOTE.getText();
        
        if(!txtLOTE.getText().isEmpty() && !txtMARCA.getText().isEmpty()){
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja mesmo EXCLUIR esse painel ?", "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                Painel_DAO dao = new Painel_DAO();
                dao.deletarPainel(lote, marca);
                dispose();
            }
        }
    }//GEN-LAST:event_iconEXCLUIR_PAINELMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //         LOOK AND FEEL           //
        FlatDarculaLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deletar().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ICON.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconDELETAR_DB;
    private javax.swing.JLabel iconEXCLUIR_PAINEL;
    private javax.swing.JLabel iconEXCLUIR_hemacia;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLOTE;
    private javax.swing.JTextField txtMARCA;
    // End of variables declaration//GEN-END:variables
}
