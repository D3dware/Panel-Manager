package views;

import com.formdev.flatlaf.FlatDarculaLaf;
import dao.Painel_DAO;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.painel;

/**
 * @author D3dware
 */
public class Pesquisar extends javax.swing.JFrame {
    private String secret;
    
    public Pesquisar() {
        initComponents();
        setIcon();
        this.secret = new jdbc.DatabaseCreation().crypt();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        iconLIMPAR = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPESQUISAR = new javax.swing.JTable();
        txtPESQUISA = new javax.swing.JTextField();
        btnPESQUISAR = new com.k33ptoo.components.KButton();
        iconLISTAR_TUDO = new javax.swing.JLabel();
        iconGENOTIPAGEM = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnANALISAR = new com.k33ptoo.components.KButton();
        jPanel6 = new javax.swing.JPanel();
        ck1 = new javax.swing.JCheckBox();
        ck5 = new javax.swing.JCheckBox();
        ck6 = new javax.swing.JCheckBox();
        ck2 = new javax.swing.JCheckBox();
        ck9 = new javax.swing.JCheckBox();
        ck3 = new javax.swing.JCheckBox();
        ck4 = new javax.swing.JCheckBox();
        ck10 = new javax.swing.JCheckBox();
        ck14 = new javax.swing.JCheckBox();
        ck11 = new javax.swing.JCheckBox();
        ck12 = new javax.swing.JCheckBox();
        ck13 = new javax.swing.JCheckBox();
        ck7 = new javax.swing.JCheckBox();
        ck8 = new javax.swing.JCheckBox();
        ck15 = new javax.swing.JCheckBox();
        ck16 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMARCA = new javax.swing.JTextField();
        txtLOTE = new javax.swing.JTextField();
        iconLIMPAR_2 = new javax.swing.JLabel();
        iconGENOTIPAGEM1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbANALIZAR = new javax.swing.JTable();
        txtRESULTADO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PM - PESQUISAR");
        setMaximumSize(new java.awt.Dimension(1090, 700));
        setMinimumSize(new java.awt.Dimension(1070, 625));
        setPreferredSize(new java.awt.Dimension(1075, 660));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        jTabbedPane1.setBackground(new java.awt.Color(102, 0, 102));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        iconLIMPAR.setForeground(new java.awt.Color(255, 255, 255));
        iconLIMPAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Broom_1.png"))); // NOI18N
        iconLIMPAR.setText("Limpar ");
        iconLIMPAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconLIMPAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLIMPARMouseClicked(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setAutoscrolls(true);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tbPESQUISAR.setBackground(new java.awt.Color(255, 255, 255));
        tbPESQUISAR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbPESQUISAR.setForeground(new java.awt.Color(0, 0, 0));
        tbPESQUISAR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "LOTE", "MARCA", "AMOSTRA", "OBSERVAÇÕES", "ABO", "RH", "D", "C", "c", "E", "e", "f", "CW", "Kpa", "Kpb", "Kell", "k", "Jsa", "Jsb", "Dia", "Lua", "Lub", "Cob", "Xga", "Fya", "Fyb", "Jka", "Jkb", "M", "N", "S", "s", "P1", "IR P1", "Lea", "Leb", "Núm. Sequencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPESQUISAR.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbPESQUISAR.setColumnSelectionAllowed(false);
        tbPESQUISAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbPESQUISAR.setGridColor(new java.awt.Color(0, 0, 0));
        tbPESQUISAR.setShowGrid(true);
        tbPESQUISAR.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbPESQUISAR);
        if (tbPESQUISAR.getColumnModel().getColumnCount() > 0) {
            tbPESQUISAR.getColumnModel().getColumn(1).setPreferredWidth(180);
            tbPESQUISAR.getColumnModel().getColumn(2).setPreferredWidth(180);
            tbPESQUISAR.getColumnModel().getColumn(3).setPreferredWidth(180);
            tbPESQUISAR.getColumnModel().getColumn(4).setPreferredWidth(180);
            tbPESQUISAR.getColumnModel().getColumn(37).setPreferredWidth(100);
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

        iconLISTAR_TUDO.setForeground(new java.awt.Color(255, 255, 255));
        iconLISTAR_TUDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Refresh.png"))); // NOI18N
        iconLISTAR_TUDO.setText("Listar Painel");
        iconLISTAR_TUDO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconLISTAR_TUDO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLISTAR_TUDOMouseClicked(evt);
            }
        });

        iconGENOTIPAGEM.setForeground(new java.awt.Color(255, 255, 255));
        iconGENOTIPAGEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/DNA Helix_1.png"))); // NOI18N
        iconGENOTIPAGEM.setText("Genotipagem");
        iconGENOTIPAGEM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconGENOTIPAGEM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconGENOTIPAGEMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtPESQUISA, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconLISTAR_TUDO)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(iconLIMPAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconGENOTIPAGEM)
                        .addGap(64, 64, 64))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPESQUISA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconLISTAR_TUDO))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iconLIMPAR)
                    .addComponent(iconGENOTIPAGEM))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pesquisar Amostra", jPanel5);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnANALISAR.setBackground(new java.awt.Color(102, 0, 102));
        btnANALISAR.setForeground(new java.awt.Color(102, 0, 102));
        btnANALISAR.setText("Analisar");
        btnANALISAR.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnANALISAR.setkBorderRadius(30);
        btnANALISAR.setkEndColor(new java.awt.Color(102, 0, 102));
        btnANALISAR.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnANALISAR.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnANALISAR.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        btnANALISAR.setkIndicatorThickness(1);
        btnANALISAR.setkPressedColor(new java.awt.Color(255, 51, 255));
        btnANALISAR.setkStartColor(new java.awt.Color(153, 0, 204));
        btnANALISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANALISARActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 102)), "Teste em Bancada:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ck1.setBackground(new java.awt.Color(0, 0, 0));
        ck1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck1.setForeground(new java.awt.Color(255, 255, 255));
        ck1.setText("1");
        ck1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck5.setBackground(new java.awt.Color(0, 0, 0));
        ck5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck5.setForeground(new java.awt.Color(255, 255, 255));
        ck5.setText("5");
        ck5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck6.setBackground(new java.awt.Color(0, 0, 0));
        ck6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck6.setForeground(new java.awt.Color(255, 255, 255));
        ck6.setText("6");
        ck6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck2.setBackground(new java.awt.Color(0, 0, 0));
        ck2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck2.setForeground(new java.awt.Color(255, 255, 255));
        ck2.setText("2");
        ck2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck9.setBackground(new java.awt.Color(0, 0, 0));
        ck9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck9.setForeground(new java.awt.Color(255, 255, 255));
        ck9.setText("9");
        ck9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck3.setBackground(new java.awt.Color(0, 0, 0));
        ck3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck3.setForeground(new java.awt.Color(255, 255, 255));
        ck3.setText("3");
        ck3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck4.setBackground(new java.awt.Color(0, 0, 0));
        ck4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck4.setForeground(new java.awt.Color(255, 255, 255));
        ck4.setText("4");
        ck4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck10.setBackground(new java.awt.Color(0, 0, 0));
        ck10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck10.setForeground(new java.awt.Color(255, 255, 255));
        ck10.setText("10");
        ck10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck14.setBackground(new java.awt.Color(0, 0, 0));
        ck14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck14.setForeground(new java.awt.Color(255, 255, 255));
        ck14.setText("14");
        ck14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck11.setBackground(new java.awt.Color(0, 0, 0));
        ck11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck11.setForeground(new java.awt.Color(255, 255, 255));
        ck11.setText("11");
        ck11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck12.setBackground(new java.awt.Color(0, 0, 0));
        ck12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck12.setForeground(new java.awt.Color(255, 255, 255));
        ck12.setText("12");
        ck12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck13.setBackground(new java.awt.Color(0, 0, 0));
        ck13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck13.setForeground(new java.awt.Color(255, 255, 255));
        ck13.setText("13");
        ck13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck7.setBackground(new java.awt.Color(0, 0, 0));
        ck7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck7.setForeground(new java.awt.Color(255, 255, 255));
        ck7.setText("7");
        ck7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck8.setBackground(new java.awt.Color(0, 0, 0));
        ck8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck8.setForeground(new java.awt.Color(255, 255, 255));
        ck8.setText("8");
        ck8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck15.setBackground(new java.awt.Color(0, 0, 0));
        ck15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck15.setForeground(new java.awt.Color(255, 255, 255));
        ck15.setText("15");
        ck15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ck16.setBackground(new java.awt.Color(0, 0, 0));
        ck16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ck16.setForeground(new java.awt.Color(255, 255, 255));
        ck16.setText("16");
        ck16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lote:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Marca:");

        txtMARCA.setBackground(new java.awt.Color(255, 255, 255));
        txtMARCA.setForeground(new java.awt.Color(0, 0, 0));
        txtMARCA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtLOTE.setBackground(new java.awt.Color(255, 255, 255));
        txtLOTE.setForeground(new java.awt.Color(0, 0, 0));
        txtLOTE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ck1)
                            .addComponent(ck9))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ck2)
                            .addComponent(ck10))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(ck3))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(ck11)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(ck4))
                            .addComponent(ck12)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ck5)
                            .addComponent(ck13))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ck6)
                            .addComponent(ck14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ck7)
                            .addComponent(ck15))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ck8)
                            .addComponent(ck16))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLOTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ck7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ck16))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ck8)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ck5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ck13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ck6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ck14)
                            .addComponent(ck15)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ck4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ck12))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(ck3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ck11))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(ck2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ck10))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(ck1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ck9)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconLIMPAR_2.setForeground(new java.awt.Color(255, 255, 255));
        iconLIMPAR_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Broom_1.png"))); // NOI18N
        iconLIMPAR_2.setText("Limpar ");
        iconLIMPAR_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconLIMPAR_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLIMPAR_2MouseClicked(evt);
            }
        });

        iconGENOTIPAGEM1.setForeground(new java.awt.Color(255, 255, 255));
        iconGENOTIPAGEM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/DNA Helix_1.png"))); // NOI18N
        iconGENOTIPAGEM1.setText("Genotipagem");
        iconGENOTIPAGEM1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconGENOTIPAGEM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconGENOTIPAGEM1MouseClicked(evt);
            }
        });

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setAutoscrolls(true);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tbANALIZAR.setBackground(new java.awt.Color(255, 255, 255));
        tbANALIZAR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbANALIZAR.setForeground(new java.awt.Color(0, 0, 0));
        tbANALIZAR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Núm. Sequência", "LOTE", "MARCA", "AMOSTRA", "OBSERVAÇÕES", "ABO", "RH", "D", "C", "c", "E", "e", "f", "CW", "Kpa", "Kpb", "Kell", "k", "Jsa", "Jsb", "Dia", "Lua", "Lub", "Cob", "Xga", "Fya", "Fyb", "Jka", "Jkb", "M", "N", "S", "s", "P1", "IR P1", "Lea", "Leb"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbANALIZAR.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbANALIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbANALIZAR.setGridColor(new java.awt.Color(0, 0, 0));
        tbANALIZAR.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbANALIZAR.setShowGrid(true);
        tbANALIZAR.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbANALIZAR);
        if (tbANALIZAR.getColumnModel().getColumnCount() > 0) {
            tbANALIZAR.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbANALIZAR.getColumnModel().getColumn(2).setPreferredWidth(180);
            tbANALIZAR.getColumnModel().getColumn(3).setPreferredWidth(180);
            tbANALIZAR.getColumnModel().getColumn(4).setPreferredWidth(180);
            tbANALIZAR.getColumnModel().getColumn(5).setPreferredWidth(180);
        }

        txtRESULTADO.setEditable(false);
        txtRESULTADO.setBackground(new java.awt.Color(0, 0, 0));
        txtRESULTADO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRESULTADO.setForeground(new java.awt.Color(255, 255, 255));
        txtRESULTADO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRESULTADO.setAutoscrolls(false);
        txtRESULTADO.setFocusable(false);
        txtRESULTADO.setRequestFocusEnabled(false);
        txtRESULTADO.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Possível Resultado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(iconGENOTIPAGEM1)
                        .addGap(95, 95, 95)
                        .addComponent(iconLIMPAR_2)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtRESULTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnANALISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(399, 399, 399)
                                .addComponent(iconGENOTIPAGEM1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconLIMPAR_2)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRESULTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnANALISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(239, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Analisar Resultados", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 1060, 630);

        jPanel1.add(jPanel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnANALISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANALISARActionPerformed
        // BOTÃO ANALISAR:
        Painel_DAO dao = new Painel_DAO();

        if (!txtMARCA.getText().isEmpty() && !txtLOTE.getText().isEmpty()) {
            String marca = txtMARCA.getText();
            String lote = txtLOTE.getText();
            
            List<String> sequenciasPositivas = new ArrayList<>();

            // Verificar quais deram positivo
            if (ck1.isSelected()) {
                sequenciasPositivas.add("1");
            }
            if (ck2.isSelected()) {
                sequenciasPositivas.add("2");
            }
            if (ck3.isSelected()) {
                sequenciasPositivas.add("3");
            }
            if (ck4.isSelected()) {
                sequenciasPositivas.add("4");
            }
            if (ck5.isSelected()) {
                sequenciasPositivas.add("5");
            }
            if (ck6.isSelected()) {
                sequenciasPositivas.add("6");
            }
            if (ck7.isSelected()) {
                sequenciasPositivas.add("7");
            }
            if (ck8.isSelected()) {
                sequenciasPositivas.add("8");
            }
            if (ck9.isSelected()) {
                sequenciasPositivas.add("9");
            }
            if (ck10.isSelected()) {
                sequenciasPositivas.add("10");
            }
            if (ck11.isSelected()) {
                sequenciasPositivas.add("11");
            }
            if (ck12.isSelected()) {
                sequenciasPositivas.add("12");
            }
            if (ck13.isSelected()) {
                sequenciasPositivas.add("13");
            }
            if (ck14.isSelected()) {
                sequenciasPositivas.add("14");
            }
            if (ck15.isSelected()) {
                sequenciasPositivas.add("15");
            }
            if (ck16.isSelected()) {
                sequenciasPositivas.add("16");
            }
            
            List<String> antigenosPositivos = dao.analisarTestesEmBancada(marca, lote, sequenciasPositivas);
            listarlote();
            // Exibir o resultado
            txtRESULTADO.setText(antigenosPositivos.stream().collect(Collectors.joining("; ")));
            
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos de marca e lote.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnANALISARActionPerformed

    private void btnPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPESQUISARActionPerformed
        //BOTÃO PESQUISAR:
        String pesquisa = txtPESQUISA.getText();
        Painel_DAO dao = new Painel_DAO();
        List<painel> resultados = dao.buscarRegistros(pesquisa);

        // Atualizar a JTable com os resultados
        DefaultTableModel model = (DefaultTableModel) tbPESQUISAR.getModel();
        model.setRowCount(0); // Limpar a tabela

        for (painel p : resultados) {
            model.addRow(new Object[]{
                p.getId(),
                p.getLote(),
                p.getMarca(),
                p.getAmostra(),
                p.getObservacoes(),
                p.getABO(),
                p.getRH(),
                p.getD(),
                p.getC(),
                p.getC_pequeno(),
                p.getE(),
                p.getE_pequeno(),
                p.getF(),
                p.getCW(),
                p.getKpa(),
                p.getKpb(),
                p.getK(),
                p.getCellano(),
                p.getJSA(),
                p.getJSB(),
                p.getDia(),
                p.getLua(),
                p.getLub(),
                p.getCob(),
                p.getXga(),
                p.getFya(),
                p.getFyb(),
                p.getJka(),
                p.getJkb(),
                p.getM(),
                p.getN(),
                p.getS(),
                p.gets(),
                p.getP1(),
                p.getIR_P1(),
                p.getLea(),
                p.getLeb(),
                p.getSequencia()
            });}    
    }//GEN-LAST:event_btnPESQUISARActionPerformed

    private void iconLISTAR_TUDOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLISTAR_TUDOMouseClicked
        //botão LISTAR TUDO:
        listarTudo();
    }//GEN-LAST:event_iconLISTAR_TUDOMouseClicked

    private void iconLIMPARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLIMPARMouseClicked
        //BOTÃO LIMPAR:
        limparPESQUISAR();
    }//GEN-LAST:event_iconLIMPARMouseClicked

    private void iconLIMPAR_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLIMPAR_2MouseClicked
        //BOTÃO LIMPAR 2:
        limparANALIZAR();
    }//GEN-LAST:event_iconLIMPAR_2MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTudo();
    }//GEN-LAST:event_formWindowActivated

    private void iconGENOTIPAGEMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconGENOTIPAGEMMouseClicked
        //botão GENOTIPAGEM:
        new Geno().setVisible(true);
    }//GEN-LAST:event_iconGENOTIPAGEMMouseClicked

    private void iconGENOTIPAGEM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconGENOTIPAGEM1MouseClicked
        new Geno().setVisible(true);
    }//GEN-LAST:event_iconGENOTIPAGEM1MouseClicked

    private void listarTudo(){
        Painel_DAO dao = new Painel_DAO();
        List<painel> listaAmostra = dao.listar_PAINEL();

        // Limpe os dados existentes na tabela (se necessário)
        DefaultTableModel modelo = (DefaultTableModel) tbPESQUISAR.getModel();
        modelo.setRowCount(0);
        
        // Adicione os dados da lista de amostras à tabela
        for (painel amostra : listaAmostra) {
            Object[] linha = {
                //info
                amostra.getId(),
                amostra.getLote(),
                amostra.getMarca(),
                amostra.getAmostra(),
                amostra.getObservacoes(),
                amostra.getABO(),
                amostra.getRH(),
                
                //RH
                amostra.getD(),
                amostra.getC(),
                amostra.getC_pequeno(),
                amostra.getE(),
                amostra.getE_pequeno(),
                amostra.getF(),
                amostra.getCW(),
                
                //KELL
                amostra.getKpa(),
                amostra.getKpb(),
                amostra.getK(),
                amostra.getCellano(),
                
                //JSA
                amostra.getJSA(),
                amostra.getJSB(),
                
                //DIEGO
                amostra.getDia(),
                
                //LUTHERAN
                amostra.getLua(),
                amostra.getLub(),
                
                //Colt
                amostra.getCob(),
                
                //Xg
                amostra.getXga(),
                
                //DUFFY
                amostra.getFya(),
                amostra.getFyb(),
                
                //KIDD
                amostra.getJka(),
                amostra.getJkb(),
                
                //MNS
                amostra.getM(),
                amostra.getN(),
                amostra.getS(),
                amostra.gets(),
                
                //PP1PK
                amostra.getP1(),
                amostra.getIR_P1(),
                
                //LEWIS
                amostra.getLea(),
                amostra.getLeb(),
                amostra.getSequencia()
                
            };
            modelo.addRow(linha);
        }
    }
    
    private void listarlote(){
        Painel_DAO dao = new Painel_DAO();
        
        String lote = main.AESUtil.encrypt(txtLOTE.getText(), secret);
        String marca = main.AESUtil.encrypt(txtMARCA.getText(), secret);
        
        List<painel> listaAmostra = dao.Listar_LOTE_MARCA(lote, marca);

        // Limpe os dados existentes na tabela (se necessário)
        DefaultTableModel modelo = (DefaultTableModel) tbANALIZAR.getModel();
        modelo.setRowCount(0);
        
        // Adicione os dados da lista de amostras à tabela
        for (painel amostra : listaAmostra) {
            Object[] linha = {
                //info
                amostra.getId(),
                amostra.getSequencia(),
                amostra.getLote(),
                amostra.getMarca(),
                amostra.getAmostra(),
                amostra.getObservacoes(),
                amostra.getABO(),
                amostra.getRH(),
                
                //RH
                amostra.getD(),
                amostra.getC(),
                amostra.getC_pequeno(),
                amostra.getE(),
                amostra.getE_pequeno(),
                amostra.getF(),
                amostra.getCW(),
                
                //KELL
                amostra.getKpa(),
                amostra.getKpb(),
                amostra.getK(),
                amostra.getCellano(),
                
                //JSA
                amostra.getJSA(),
                amostra.getJSB(),
                
                //DIEGO
                amostra.getDia(),
                
                //LUTHERAN
                amostra.getLua(),
                amostra.getLub(),
                
                //Colt
                amostra.getCob(),
                
                //Xg
                amostra.getXga(),
                
                //DUFFY
                amostra.getFya(),
                amostra.getFyb(),
                
                //KIDD
                amostra.getJka(),
                amostra.getJkb(),
                
                //MNS
                amostra.getM(),
                amostra.getN(),
                amostra.getS(),
                amostra.gets(),
                
                //PP1PK
                amostra.getP1(),
                amostra.getIR_P1(),
                
                //LEWIS
                amostra.getLea(),
                amostra.getLeb()                
            };
            modelo.addRow(linha);
        }
    }
    
    private void limparPESQUISAR(){
        // Limpe os dados existentes na tabela
        DefaultTableModel modelo = (DefaultTableModel) tbPESQUISAR.getModel();
        modelo.setRowCount(0);
        
        txtPESQUISA.setText(null);
        txtPESQUISA.requestFocus();
    }
    
    private void limparANALIZAR(){
        // Limpe os dados existentes na tabela
        DefaultTableModel modelo = (DefaultTableModel) tbANALIZAR.getModel();
        modelo.setRowCount(0);
        
        //limpar hemacias
        ck1.setSelected(false);
        ck2.setSelected(false);
        ck3.setSelected(false);
        ck4.setSelected(false);
        ck5.setSelected(false);
        ck6.setSelected(false);
        ck7.setSelected(false);
        ck8.setSelected(false);
        ck9.setSelected(false);
        ck10.setSelected(false);
        ck11.setSelected(false);
        ck12.setSelected(false);
        ck13.setSelected(false);
        ck14.setSelected(false);
        ck15.setSelected(false);
        ck16.setSelected(false);
        
        //limpar dados
        txtMARCA.setText(null);
        txtLOTE.setText(null);
        txtRESULTADO.setText(null);
        
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
                new Pesquisar().setVisible(true);
            }
        });
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ICON.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnANALISAR;
    private com.k33ptoo.components.KButton btnPESQUISAR;
    private javax.swing.JCheckBox ck1;
    private javax.swing.JCheckBox ck10;
    private javax.swing.JCheckBox ck11;
    private javax.swing.JCheckBox ck12;
    private javax.swing.JCheckBox ck13;
    private javax.swing.JCheckBox ck14;
    private javax.swing.JCheckBox ck15;
    private javax.swing.JCheckBox ck16;
    private javax.swing.JCheckBox ck2;
    private javax.swing.JCheckBox ck3;
    private javax.swing.JCheckBox ck4;
    private javax.swing.JCheckBox ck5;
    private javax.swing.JCheckBox ck6;
    private javax.swing.JCheckBox ck7;
    private javax.swing.JCheckBox ck8;
    private javax.swing.JCheckBox ck9;
    private javax.swing.JLabel iconGENOTIPAGEM;
    private javax.swing.JLabel iconGENOTIPAGEM1;
    private javax.swing.JLabel iconLIMPAR;
    private javax.swing.JLabel iconLIMPAR_2;
    private javax.swing.JLabel iconLISTAR_TUDO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbANALIZAR;
    private javax.swing.JTable tbPESQUISAR;
    private javax.swing.JTextField txtLOTE;
    private javax.swing.JTextField txtMARCA;
    private javax.swing.JTextField txtPESQUISA;
    private javax.swing.JTextField txtRESULTADO;
    // End of variables declaration//GEN-END:variables
}
