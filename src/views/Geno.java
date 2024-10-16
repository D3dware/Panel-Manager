package views;

import com.formdev.flatlaf.FlatDarculaLaf;
import dao.Painel_DAO;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import jdbc.DatabaseCreation;
import models.painel;

/**
 *
 * @author D3dware
 */
public class Geno extends javax.swing.JFrame {
    private String ID;
    private String marca;
    private String lote;
    private String amostra;
    private String secret;

    /**
     * Creates new form Geno
     */
    public Geno() {
        initComponents();
        setIcon();
        this.secret = new DatabaseCreation().crypt();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        iconLIMPAR = new javax.swing.JLabel();
        btnSALVAR = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGeno = new javax.swing.JTable();
        txtPESQUISA = new javax.swing.JTextField();
        btnPESQUISAR = new com.k33ptoo.components.KButton();
        ckPESQUISAR = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PM - GENOTIPAGEM ERITROCITÁRIA");
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 153));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        iconLIMPAR.setForeground(new java.awt.Color(255, 255, 255));
        iconLIMPAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Broom_1.png"))); // NOI18N
        iconLIMPAR.setText("Limpar ");
        iconLIMPAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconLIMPAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLIMPARMouseClicked(evt);
            }
        });

        btnSALVAR.setBackground(new java.awt.Color(102, 0, 102));
        btnSALVAR.setForeground(new java.awt.Color(102, 0, 102));
        btnSALVAR.setText("SALVAR\n");
        btnSALVAR.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnSALVAR.setkBorderRadius(30);
        btnSALVAR.setkEndColor(new java.awt.Color(102, 0, 102));
        btnSALVAR.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnSALVAR.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSALVAR.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnSALVAR.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnSALVAR.setkStartColor(new java.awt.Color(153, 0, 204));
        btnSALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALVARActionPerformed(evt);
            }
        });

        tbGeno.setBackground(new java.awt.Color(255, 255, 255));
        tbGeno.setForeground(new java.awt.Color(0, 0, 0));
        tbGeno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MARCA", "LOTE", "Doador", "Fenotipo", "Tipagem Extendida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGeno.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbGeno.setCellSelectionEnabled(true);
        tbGeno.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbGeno.setShowGrid(true);
        tbGeno.getTableHeader().setReorderingAllowed(false);
        tbGeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGenoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGeno);
        if (tbGeno.getColumnModel().getColumnCount() > 0) {
            tbGeno.getColumnModel().getColumn(1).setPreferredWidth(180);
            tbGeno.getColumnModel().getColumn(2).setPreferredWidth(180);
            tbGeno.getColumnModel().getColumn(3).setPreferredWidth(180);
            tbGeno.getColumnModel().getColumn(4).setPreferredWidth(250);
            tbGeno.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        txtPESQUISA.setBackground(new java.awt.Color(0, 0, 0));
        txtPESQUISA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPESQUISA.setForeground(new java.awt.Color(255, 255, 255));
        txtPESQUISA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPESQUISA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));
        txtPESQUISA.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPESQUISA.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        btnPESQUISAR.setBackground(new java.awt.Color(102, 0, 102));
        btnPESQUISAR.setForeground(new java.awt.Color(102, 0, 102));
        btnPESQUISAR.setText("Pesquisar");
        btnPESQUISAR.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnPESQUISAR.setkBorderRadius(30);
        btnPESQUISAR.setkEndColor(new java.awt.Color(102, 0, 102));
        btnPESQUISAR.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnPESQUISAR.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnPESQUISAR.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnPESQUISAR.setkIndicatorThickness(1);
        btnPESQUISAR.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnPESQUISAR.setkStartColor(new java.awt.Color(153, 0, 204));
        btnPESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPESQUISARActionPerformed(evt);
            }
        });

        ckPESQUISAR.setText("Marca, Lote ou Doador (desmarque para ID)");
        ckPESQUISAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ckPESQUISAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconLIMPAR)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPESQUISA, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(btnSALVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 381, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPESQUISA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckPESQUISAR)
                    .addComponent(iconLIMPAR))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSALVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void btnSALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALVARActionPerformed
        //BOTÃO SALVAR:
        
        int tb = tbGeno.getSelectedRow();
        String feno = tbGeno.getValueAt(tb, 4).toString();
        String geno = tbGeno.getValueAt(tb, 5).toString();


        Painel_DAO dao = new Painel_DAO();
        dao.add_GENO(marca, lote, amostra, ID, feno, geno);
        
    }//GEN-LAST:event_btnSALVARActionPerformed

    private void btnPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPESQUISARActionPerformed
        //BOTÃO PESQUISAR:
        String texto = txtPESQUISA.getText();
        Painel_DAO dao = new Painel_DAO();
        if (ckPESQUISAR.isSelected()){
            List<painel> listaAmostra = dao.buscar_PAINEL_GENO(texto);
            
            // Limpe os dados existentes na tabela (se necessário)
            DefaultTableModel modelo = (DefaultTableModel) tbGeno.getModel();
            modelo.setRowCount(0);

            // Adicione os dados da lista de amostras à tabela
            for (painel amostra : listaAmostra) {
                Object[] linha = {
                    //info
                    amostra.getId(),
                    amostra.getMarca(),
                    amostra.getLote(),
                    amostra.getAmostra(),
                    amostra.getRH(),
                    amostra.getGenotipagem()

                };
                modelo.addRow(linha);
            }
        }else{
            List<painel> listaAmostra = dao.buscar_PAINEL_POR_ID(texto);
            
            // Limpe os dados existentes na tabela (se necessário)
            DefaultTableModel modelo = (DefaultTableModel) tbGeno.getModel();
            modelo.setRowCount(0);

            // Adicione os dados da lista de amostras à tabela
            for (painel amostra : listaAmostra) {
                Object[] linha = {
                    //info
                    amostra.getId(),
                    amostra.getMarca(),
                    amostra.getLote(),
                    amostra.getAmostra(),
                    amostra.getRH(),
                    amostra.getGenotipagem()

                };
                modelo.addRow(linha);
            }
        }
        
    }//GEN-LAST:event_btnPESQUISARActionPerformed

    private void iconLIMPARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLIMPARMouseClicked
        //BOTÃO LIMPAR:

        limparPESQUISAR();
    }//GEN-LAST:event_iconLIMPARMouseClicked

    private void tbGenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGenoMouseClicked
        //tabela usuarios:
        if (evt.getClickCount() == 1) {
            int tb = tbGeno.getSelectedRow();
            String id = tbGeno.getValueAt(tb, 0).toString();
            String marca = tbGeno.getValueAt(tb, 1).toString();
            String lote = tbGeno.getValueAt(tb, 2).toString();
            String amostra = tbGeno.getValueAt(tb, 3).toString();
            
            this.ID = id;
            this.marca = marca;
            this.lote = lote;
            this.amostra = amostra;
        }
    }//GEN-LAST:event_tbGenoMouseClicked

    private void limparPESQUISAR(){
        // Limpe os dados existentes na tabela
        DefaultTableModel modelo = (DefaultTableModel) tbGeno.getModel();
        modelo.setRowCount(0);
        
        txtPESQUISA.setText(null);
        txtPESQUISA.requestFocus();
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
                new Geno().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ICON.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnPESQUISAR;
    private com.k33ptoo.components.KButton btnSALVAR;
    private javax.swing.JCheckBox ckPESQUISAR;
    private javax.swing.JLabel iconLIMPAR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tbGeno;
    private javax.swing.JTextField txtPESQUISA;
    // End of variables declaration//GEN-END:variables
}
