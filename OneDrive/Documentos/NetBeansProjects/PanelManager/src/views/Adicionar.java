package views;

import com.formdev.flatlaf.FlatDarculaLaf;
import dao.Painel_DAO;
import java.awt.Toolkit;
import models.painel;

/**
 *
 * @author D3dware
 */
public class Adicionar extends javax.swing.JFrame {

    /**
     * Creates new form Adicionar
     */
    public Adicionar() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        txtLOTE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMARCA = new javax.swing.JTextField();
        txtAMOSTRA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnADICIONAR = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRH = new javax.swing.JTextField();
        txtABO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rdLUA = new javax.swing.JRadioButton();
        rdLUB = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        rdM = new javax.swing.JRadioButton();
        rdN = new javax.swing.JRadioButton();
        rdS = new javax.swing.JRadioButton();
        rdS_pequeno = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        rdJKA = new javax.swing.JRadioButton();
        rdJKB = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        rdFYA = new javax.swing.JRadioButton();
        rdFYB = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        rdLEA = new javax.swing.JRadioButton();
        rdLEB = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        rdDIA = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        rdKPA = new javax.swing.JRadioButton();
        rdKPB = new javax.swing.JRadioButton();
        rdK = new javax.swing.JRadioButton();
        rdCellano = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        rdD = new javax.swing.JRadioButton();
        rdC = new javax.swing.JRadioButton();
        rdC_Pequeno = new javax.swing.JRadioButton();
        rdE = new javax.swing.JRadioButton();
        rdE_Pequeno = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        rdF = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        rdCW = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        rdCOB = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        rdXGA = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        rdJSB = new javax.swing.JRadioButton();
        rdJSA = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        rdIR_P1 = new javax.swing.JRadioButton();
        rdP1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtOBSERVACOES = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSEQUENCIA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PM - ADICIONAR");
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 153));

        txtLOTE.setBackground(new java.awt.Color(255, 255, 255));
        txtLOTE.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLOTE.setForeground(new java.awt.Color(0, 0, 0));
        txtLOTE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLOTE.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOTE:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código Amostra:");
        jLabel2.setToolTipText("");

        txtMARCA.setBackground(new java.awt.Color(255, 255, 255));
        txtMARCA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMARCA.setForeground(new java.awt.Color(0, 0, 0));
        txtMARCA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMARCA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        txtAMOSTRA.setBackground(new java.awt.Color(255, 255, 255));
        txtAMOSTRA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtAMOSTRA.setForeground(new java.awt.Color(0, 0, 0));
        txtAMOSTRA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAMOSTRA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca:");

        btnADICIONAR.setBackground(new java.awt.Color(102, 0, 102));
        btnADICIONAR.setForeground(new java.awt.Color(102, 0, 102));
        btnADICIONAR.setText("Adicionar Hemácia");
        btnADICIONAR.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnADICIONAR.setkBorderRadius(30);
        btnADICIONAR.setkEndColor(new java.awt.Color(102, 0, 102));
        btnADICIONAR.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnADICIONAR.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnADICIONAR.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnADICIONAR.setkIndicatorThickness(1);
        btnADICIONAR.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnADICIONAR.setkStartColor(new java.awt.Color(153, 0, 204));
        btnADICIONAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADICIONARActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Add.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RH:");
        jLabel5.setToolTipText("");

        txtRH.setBackground(new java.awt.Color(255, 255, 255));
        txtRH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtRH.setForeground(new java.awt.Color(0, 0, 0));
        txtRH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        txtABO.setBackground(new java.awt.Color(255, 255, 255));
        txtABO.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtABO.setForeground(new java.awt.Color(0, 0, 0));
        txtABO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtABO.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ABO:");
        jLabel6.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 1, true), "Fenotipagem:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdLUA.setBackground(new java.awt.Color(0, 0, 0));
        rdLUA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdLUA.setForeground(new java.awt.Color(255, 255, 255));
        rdLUA.setText("Lua");

        rdLUB.setBackground(new java.awt.Color(0, 0, 0));
        rdLUB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdLUB.setForeground(new java.awt.Color(255, 255, 255));
        rdLUB.setText("Lub");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdLUA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdLUB)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdLUA)
                    .addComponent(rdLUB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdM.setBackground(new java.awt.Color(0, 0, 0));
        rdM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdM.setForeground(new java.awt.Color(255, 255, 255));
        rdM.setText("M");

        rdN.setBackground(new java.awt.Color(0, 0, 0));
        rdN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdN.setForeground(new java.awt.Color(255, 255, 255));
        rdN.setText("N");

        rdS.setBackground(new java.awt.Color(0, 0, 0));
        rdS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdS.setForeground(new java.awt.Color(255, 255, 255));
        rdS.setText("S");

        rdS_pequeno.setBackground(new java.awt.Color(0, 0, 0));
        rdS_pequeno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdS_pequeno.setForeground(new java.awt.Color(255, 255, 255));
        rdS_pequeno.setText("s");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdM, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(rdS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdS_pequeno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdM)
                    .addComponent(rdN)
                    .addComponent(rdS)
                    .addComponent(rdS_pequeno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdJKA.setBackground(new java.awt.Color(0, 0, 0));
        rdJKA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdJKA.setForeground(new java.awt.Color(255, 255, 255));
        rdJKA.setText("Jka");

        rdJKB.setBackground(new java.awt.Color(0, 0, 0));
        rdJKB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdJKB.setForeground(new java.awt.Color(255, 255, 255));
        rdJKB.setText("Jkb");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdJKA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdJKB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdJKA)
                    .addComponent(rdJKB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdFYA.setBackground(new java.awt.Color(0, 0, 0));
        rdFYA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdFYA.setForeground(new java.awt.Color(255, 255, 255));
        rdFYA.setText("Fya");

        rdFYB.setBackground(new java.awt.Color(0, 0, 0));
        rdFYB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdFYB.setForeground(new java.awt.Color(255, 255, 255));
        rdFYB.setText("Fyb");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdFYA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdFYB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdFYA)
                    .addComponent(rdFYB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdLEA.setBackground(new java.awt.Color(0, 0, 0));
        rdLEA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdLEA.setForeground(new java.awt.Color(255, 255, 255));
        rdLEA.setText("Lea");

        rdLEB.setBackground(new java.awt.Color(0, 0, 0));
        rdLEB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdLEB.setForeground(new java.awt.Color(255, 255, 255));
        rdLEB.setText("Leb");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdLEA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdLEB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdLEA)
                    .addComponent(rdLEB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdDIA.setBackground(new java.awt.Color(0, 0, 0));
        rdDIA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdDIA.setForeground(new java.awt.Color(255, 255, 255));
        rdDIA.setText("Dia");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdDIA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdDIA)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdKPA.setBackground(new java.awt.Color(0, 0, 0));
        rdKPA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdKPA.setForeground(new java.awt.Color(255, 255, 255));
        rdKPA.setText("Kpa");

        rdKPB.setBackground(new java.awt.Color(0, 0, 0));
        rdKPB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdKPB.setForeground(new java.awt.Color(255, 255, 255));
        rdKPB.setText("Kpb");

        rdK.setBackground(new java.awt.Color(0, 0, 0));
        rdK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdK.setForeground(new java.awt.Color(255, 255, 255));
        rdK.setText("K");

        rdCellano.setBackground(new java.awt.Color(0, 0, 0));
        rdCellano.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdCellano.setForeground(new java.awt.Color(255, 255, 255));
        rdCellano.setText("k");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdKPA)
                .addGap(18, 18, 18)
                .addComponent(rdKPB)
                .addGap(18, 18, 18)
                .addComponent(rdK, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(rdCellano, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdKPA)
                    .addComponent(rdKPB)
                    .addComponent(rdK)
                    .addComponent(rdCellano))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdD.setBackground(new java.awt.Color(0, 0, 0));
        rdD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdD.setForeground(new java.awt.Color(255, 255, 255));
        rdD.setText("D");

        rdC.setBackground(new java.awt.Color(0, 0, 0));
        rdC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdC.setForeground(new java.awt.Color(255, 255, 255));
        rdC.setText("C");

        rdC_Pequeno.setBackground(new java.awt.Color(0, 0, 0));
        rdC_Pequeno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdC_Pequeno.setForeground(new java.awt.Color(255, 255, 255));
        rdC_Pequeno.setText("c");

        rdE.setBackground(new java.awt.Color(0, 0, 0));
        rdE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdE.setForeground(new java.awt.Color(255, 255, 255));
        rdE.setText("E");

        rdE_Pequeno.setBackground(new java.awt.Color(0, 0, 0));
        rdE_Pequeno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdE_Pequeno.setForeground(new java.awt.Color(255, 255, 255));
        rdE_Pequeno.setText("e");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdD)
                .addGap(18, 18, 18)
                .addComponent(rdC)
                .addGap(18, 18, 18)
                .addComponent(rdC_Pequeno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdE_Pequeno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdD)
                    .addComponent(rdC)
                    .addComponent(rdC_Pequeno)
                    .addComponent(rdE)
                    .addComponent(rdE_Pequeno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdF.setBackground(new java.awt.Color(0, 0, 0));
        rdF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdF.setForeground(new java.awt.Color(255, 255, 255));
        rdF.setText("f");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdCW.setBackground(new java.awt.Color(0, 0, 0));
        rdCW.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdCW.setForeground(new java.awt.Color(255, 255, 255));
        rdCW.setText("CW");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdCW, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdCW)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdCOB.setBackground(new java.awt.Color(0, 0, 0));
        rdCOB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdCOB.setForeground(new java.awt.Color(255, 255, 255));
        rdCOB.setText("Cob");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdCOB, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdCOB)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdXGA.setBackground(new java.awt.Color(0, 0, 0));
        rdXGA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdXGA.setForeground(new java.awt.Color(255, 255, 255));
        rdXGA.setText("Xga");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdXGA)
                .addGap(5, 5, 5))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdXGA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdJSB.setBackground(new java.awt.Color(0, 0, 0));
        rdJSB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdJSB.setForeground(new java.awt.Color(255, 255, 255));
        rdJSB.setText("Jsb");

        rdJSA.setBackground(new java.awt.Color(0, 0, 0));
        rdJSA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdJSA.setForeground(new java.awt.Color(255, 255, 255));
        rdJSA.setText("Jsa");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdJSA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(rdJSB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdJSB)
                    .addComponent(rdJSA))
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        rdIR_P1.setBackground(new java.awt.Color(0, 0, 0));
        rdIR_P1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdIR_P1.setForeground(new java.awt.Color(255, 255, 255));
        rdIR_P1.setText("IR P1");

        rdP1.setBackground(new java.awt.Color(0, 0, 0));
        rdP1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdP1.setForeground(new java.awt.Color(255, 255, 255));
        rdP1.setText("P1");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdP1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdIR_P1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdIR_P1)
                    .addComponent(rdP1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Observações:");
        jLabel7.setToolTipText("");

        txtOBSERVACOES.setBackground(new java.awt.Color(255, 255, 255));
        txtOBSERVACOES.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtOBSERVACOES.setForeground(new java.awt.Color(0, 0, 0));
        txtOBSERVACOES.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOBSERVACOES.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Número de Sequência:");

        txtSEQUENCIA.setBackground(new java.awt.Color(255, 255, 255));
        txtSEQUENCIA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtSEQUENCIA.setForeground(new java.awt.Color(0, 0, 0));
        txtSEQUENCIA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSEQUENCIA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 0, 204)));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnADICIONAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtAMOSTRA, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtABO, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(txtOBSERVACOES, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(txtRH, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtMARCA, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(txtSEQUENCIA))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLOTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAMOSTRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSEQUENCIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtABO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOBSERVACOES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADICIONAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14))
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

    private void btnADICIONARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADICIONARActionPerformed
        // BOTÃO ADICIONAR:
        painel obj = new painel();
        
        //INFO
        obj.setLote(txtLOTE.getText().isEmpty() ? "*" : txtLOTE.getText());
        obj.setMarca(txtMARCA.getText().isEmpty() ? "*" : txtMARCA.getText());
        obj.setAmostra(txtAMOSTRA.getText().isEmpty() ? "*" : txtAMOSTRA.getText());
        obj.setABO(txtABO.getText().isEmpty() ? "*" : txtABO.getText());
        obj.setRH(txtRH.getText().isEmpty() ? "*" : txtRH.getText());
        obj.setSequencia(txtSEQUENCIA.getText().isEmpty() ? "*" : txtSEQUENCIA.getText());
        
        //RH
        obj.setD(rdD.isSelected() ? "+" : "/-/");
        obj.setC(rdC.isSelected() ? "+" : "/-/");
        obj.setC_pequeno(rdC_Pequeno.isSelected() ? "+" : "/-/");
        obj.setE(rdE.isSelected() ? "+" : "/-/");
        obj.setE_pequeno(rdE_Pequeno.isSelected() ? "+" : "/-/");
        obj.setF(rdF.isSelected() ? "+" : "/-/");
        obj.setCW(rdCW.isSelected() ? "+" : "/-/");
        
        //KELL
        obj.setKpa(rdKPA.isSelected() ? "+" : "/-/");
        obj.setKpb(rdKPB.isSelected() ? "+" : "/-/");
        obj.setK(rdK.isSelected() ? "+" : "/-/");
        obj.setCellano(rdCellano.isSelected() ? "+" : "/-/");
        
        //JSA
        obj.setJSA(rdJSA.isSelected() ? "+" : "/-/");
        obj.setJSB(rdJSB.isSelected() ? "+" : "/-/");

        //DIEGO
        obj.setDia(rdDIA.isSelected() ? "+" : "/-/");
        
        //LUTHERAN
        obj.setLua(rdLUA.isSelected() ? "+" : "/-/");
        obj.setLub(rdLUB.isSelected() ? "+" : "/-/");

        //COB
        obj.setCob(rdCOB.isSelected() ? "+" : "/-/");

        //Xga
        obj.setXga(rdXGA.isSelected() ? "+" : "/-/");
        
        //DUFFY
        obj.setFya(rdFYA.isSelected() ? "+" : "/-/");
        obj.setFyb(rdFYB.isSelected() ? "+" : "/-/");
        
        //KIDD
        obj.setJka(rdJKA.isSelected() ? "+" : "/-/");
        obj.setJkb(rdJKB.isSelected() ? "+" : "/-/");
        
        //MNS
        obj.setM(rdM.isSelected() ? "+" : "/-/");
        obj.setN(rdN.isSelected() ? "+" : "/-/");
        obj.setS(rdS.isSelected() ? "+" : "/-/");
        obj.sets(rdS_pequeno.isSelected() ? "+" : "/-/");
        
        //PP1PK
        obj.setP1(rdP1.isSelected() ? "+" : "/-/");
        obj.setIR_P1(rdIR_P1.isSelected() ? "+" : "/-/");
        
        //LEWIS
        obj.setLea(rdLEA.isSelected() ? "+" : "/-/");
        obj.setLeb(rdLEB.isSelected() ? "+" : "/-/");
        
        //OBSERVAÇÕES
        obj.setObservacoes(txtOBSERVACOES.getText().isEmpty() ? "*" : txtOBSERVACOES.getText());
        
        Painel_DAO dao = new Painel_DAO();
        dao.add_PAINEL(obj);
        
        limparcampos();
    }//GEN-LAST:event_btnADICIONARActionPerformed

    private void limparcampos(){
        //CAMPOS
        txtAMOSTRA.setText(null);
        txtLOTE.setText(null);
        txtMARCA.setText(null);
        txtABO.setText(null);
        txtRH.setText(null);
        txtOBSERVACOES.setText(null);
        txtSEQUENCIA.setText(null);
        
        //FENOTIPAGEM:
        //RH
        rdD.setSelected(false);
        rdC.setSelected(false);
        rdC_Pequeno.setSelected(false);
        rdE.setSelected(false);
        rdE_Pequeno.setSelected(false);
        rdF.setSelected(false);
        rdCW.setSelected(false);
        
        //KELL
        rdKPA.setSelected(false);
        rdKPB.setSelected(false);
        rdK.setSelected(false);
        rdCellano.setSelected(false);
        
        //Jsa
        rdJSA.setSelected(false);
        rdJSB.setSelected(false);

        
        //DIEGO
        rdDIA.setSelected(false);
        
        //LUTHERAN
        rdLUA.setSelected(false);
        rdLUB.setSelected(false);
        
        //Cob
        rdCOB.setSelected(false);
        
        //XGA
        rdXGA.setSelected(false);
        
        //DUFFY
        rdFYA.setSelected(false);
        rdFYB.setSelected(false);
        
        //KIDD
        rdJKA.setSelected(false);
        rdJKB.setSelected(false);
        
        //LEWIS
        rdLEA.setSelected(false);
        rdLEB.setSelected(false);

        //MNS
        rdM.setSelected(false);
        rdN.setSelected(false);
        rdS.setSelected(false);
        rdS_pequeno.setSelected(false);
        
        //PP1PK
        rdP1.setSelected(false);
        rdIR_P1.setSelected(false);
          
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
                new Adicionar().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ICON.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnADICIONAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton rdC;
    private javax.swing.JRadioButton rdCOB;
    private javax.swing.JRadioButton rdCW;
    private javax.swing.JRadioButton rdC_Pequeno;
    private javax.swing.JRadioButton rdCellano;
    private javax.swing.JRadioButton rdD;
    private javax.swing.JRadioButton rdDIA;
    private javax.swing.JRadioButton rdE;
    private javax.swing.JRadioButton rdE_Pequeno;
    private javax.swing.JRadioButton rdF;
    private javax.swing.JRadioButton rdFYA;
    private javax.swing.JRadioButton rdFYB;
    private javax.swing.JRadioButton rdIR_P1;
    private javax.swing.JRadioButton rdJKA;
    private javax.swing.JRadioButton rdJKB;
    private javax.swing.JRadioButton rdJSA;
    private javax.swing.JRadioButton rdJSB;
    private javax.swing.JRadioButton rdK;
    private javax.swing.JRadioButton rdKPA;
    private javax.swing.JRadioButton rdKPB;
    private javax.swing.JRadioButton rdLEA;
    private javax.swing.JRadioButton rdLEB;
    private javax.swing.JRadioButton rdLUA;
    private javax.swing.JRadioButton rdLUB;
    private javax.swing.JRadioButton rdM;
    private javax.swing.JRadioButton rdN;
    private javax.swing.JRadioButton rdP1;
    private javax.swing.JRadioButton rdS;
    private javax.swing.JRadioButton rdS_pequeno;
    private javax.swing.JRadioButton rdXGA;
    private javax.swing.JTextField txtABO;
    private javax.swing.JTextField txtAMOSTRA;
    private javax.swing.JTextField txtLOTE;
    private javax.swing.JTextField txtMARCA;
    private javax.swing.JTextField txtOBSERVACOES;
    private javax.swing.JTextField txtRH;
    private javax.swing.JTextField txtSEQUENCIA;
    // End of variables declaration//GEN-END:variables
}
