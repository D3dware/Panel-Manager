package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdbc.DatabaseCreation;
import models.painel;

/**
 * @author D3dware
 */
public class Painel_DAO {
 
    private String secretKey;

    //construtor
    public Painel_DAO(){
        this.secretKey = new DatabaseCreation().crypt();
    }

    // Verificar se os dados já existem no banco de dados
    private boolean dataExists(Connection connection, String lote, String marca, String amostra, String ABO, String RH) throws SQLException {
        String query = "SELECT COUNT(*) FROM painel WHERE lote = ? AND marca = ? AND amostra = ? AND ABO = ? AND RH = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, views.main.AESUtil.decrypt(lote, secretKey));
            statement.setString(2, views.main.AESUtil.decrypt(marca, secretKey));
            statement.setString(3, views.main.AESUtil.decrypt(amostra, secretKey));
            statement.setString(4, views.main.AESUtil.decrypt(ABO, secretKey));
            statement.setString(5, views.main.AESUtil.decrypt(RH, secretKey));
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(1) > 0;
                }}}
        return false;
    }
    
    private boolean dataExists_2(Connection connection, String lote, String marca, String amostra, String RH) throws SQLException {
        String query = "SELECT COUNT(*) FROM painel WHERE lote = ? AND marca = ? AND amostra = ? AND RH = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, views.main.AESUtil.encrypt(lote, secretKey));
            statement.setString(2, views.main.AESUtil.encrypt(marca, secretKey));
            statement.setString(3, views.main.AESUtil.encrypt(amostra, secretKey));
            statement.setString(4, views.main.AESUtil.encrypt(RH, secretKey));
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(1) > 0;
                }}}
        return false;
    }
    
    // Adicionar novo obj
    public void add_PAINEL(painel obj) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            if (!dataExists(connection, obj.getLote(), obj.getMarca(), obj.getAmostra(), obj.getABO(), obj.getRH())) {
                String sql = "INSERT INTO painel (lote, marca, amostra, ABO, RH, sequencia, D, C, c_pequeno, E, e_pequeno, f, CW, kpa, kpb, K, cellano, JSA, JSB, dia, lua, lub, Cob, Xga, fya, fyb, jka, jkb, m, n, S, s_pequeno, p1, IR_P1, lea, leb, genotipagem, observacoes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    preparedStatement.setString(1, views.main.AESUtil.encrypt(obj.getLote(), secretKey));
                    preparedStatement.setString(2, views.main.AESUtil.encrypt(obj.getMarca(), secretKey));
                    preparedStatement.setString(3, views.main.AESUtil.encrypt(obj.getAmostra(), secretKey));
                    preparedStatement.setString(4, views.main.AESUtil.encrypt(obj.getABO(), secretKey));
                    preparedStatement.setString(5, views.main.AESUtil.encrypt(obj.getRH(), secretKey));
                    preparedStatement.setString(6, views.main.AESUtil.encrypt(obj.getSequencia(), secretKey));
                    preparedStatement.setString(7, views.main.AESUtil.encrypt(obj.getD(), secretKey));
                    preparedStatement.setString(8, views.main.AESUtil.encrypt(obj.getC(), secretKey));
                    preparedStatement.setString(9, views.main.AESUtil.encrypt(obj.getC_pequeno(), secretKey));
                    preparedStatement.setString(10, views.main.AESUtil.encrypt(obj.getE(), secretKey));
                    preparedStatement.setString(11, views.main.AESUtil.encrypt(obj.getE_pequeno(), secretKey));
                    preparedStatement.setString(12, views.main.AESUtil.encrypt(obj.getF(), secretKey));
                    preparedStatement.setString(13, views.main.AESUtil.encrypt(obj.getCW(), secretKey));
                    preparedStatement.setString(14, views.main.AESUtil.encrypt(obj.getKpa(), secretKey));
                    preparedStatement.setString(15, views.main.AESUtil.encrypt(obj.getKpb(), secretKey));
                    preparedStatement.setString(16, views.main.AESUtil.encrypt(obj.getK(), secretKey));
                    preparedStatement.setString(17, views.main.AESUtil.encrypt(obj.getCellano(), secretKey));
                    preparedStatement.setString(18, views.main.AESUtil.encrypt(obj.getJSA(), secretKey));
                    preparedStatement.setString(19, views.main.AESUtil.encrypt(obj.getJSB(), secretKey));
                    preparedStatement.setString(20, views.main.AESUtil.encrypt(obj.getDia(), secretKey));
                    preparedStatement.setString(21, views.main.AESUtil.encrypt(obj.getLua(), secretKey));
                    preparedStatement.setString(22, views.main.AESUtil.encrypt(obj.getLub(), secretKey));
                    preparedStatement.setString(23, views.main.AESUtil.encrypt(obj.getCob(), secretKey));
                    preparedStatement.setString(24, views.main.AESUtil.encrypt(obj.getXga(), secretKey));
                    preparedStatement.setString(25, views.main.AESUtil.encrypt(obj.getFya(), secretKey));
                    preparedStatement.setString(26, views.main.AESUtil.encrypt(obj.getFyb(), secretKey));
                    preparedStatement.setString(27, views.main.AESUtil.encrypt(obj.getJka(), secretKey));
                    preparedStatement.setString(28, views.main.AESUtil.encrypt(obj.getJkb(), secretKey));
                    preparedStatement.setString(29, views.main.AESUtil.encrypt(obj.getM(), secretKey));
                    preparedStatement.setString(30, views.main.AESUtil.encrypt(obj.getN(), secretKey));
                    preparedStatement.setString(31, views.main.AESUtil.encrypt(obj.getS(), secretKey));
                    preparedStatement.setString(32, views.main.AESUtil.encrypt(obj.gets(), secretKey));
                    preparedStatement.setString(33, views.main.AESUtil.encrypt(obj.getP1(), secretKey));
                    preparedStatement.setString(34, views.main.AESUtil.encrypt(obj.getIR_P1(), secretKey));
                    preparedStatement.setString(35, views.main.AESUtil.encrypt(obj.getLea(), secretKey));
                    preparedStatement.setString(36, views.main.AESUtil.encrypt(obj.getLeb(), secretKey));
                    preparedStatement.setString(37, views.main.AESUtil.encrypt(obj.getGenotipagem(), secretKey));
                    preparedStatement.setString(38, views.main.AESUtil.encrypt(obj.getObservacoes(), secretKey));

                    preparedStatement.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Amostra Adicionada com Sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Amostra JÁ EXISTENTE no banco de dados!", "DUPLICATA", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //LISTAR DATABASE
    public List<painel> listar_PAINEL() {
        List<painel> lista = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            String sql = "SELECT * FROM painel";
            try (PreparedStatement stmt = con.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    painel obj = new painel();
                    obj.setId(rs.getString("id"));
                    obj.setLote(views.main.AESUtil.decrypt(rs.getString("lote"), secretKey));
                    obj.setMarca(views.main.AESUtil.decrypt(rs.getString("marca"), secretKey));
                    obj.setAmostra(views.main.AESUtil.decrypt(rs.getString("amostra"), secretKey));
                    obj.setABO(views.main.AESUtil.decrypt(rs.getString("ABO"), secretKey));
                    obj.setRH(views.main.AESUtil.decrypt(rs.getString("RH"), secretKey));
                    obj.setSequencia(views.main.AESUtil.decrypt(rs.getString("sequencia"), secretKey));
                    obj.setD(views.main.AESUtil.decrypt(rs.getString("D"), secretKey));
                    obj.setC(views.main.AESUtil.decrypt(rs.getString("C"), secretKey));
                    obj.setC_pequeno(views.main.AESUtil.decrypt(rs.getString("c_pequeno"), secretKey));
                    obj.setE(views.main.AESUtil.decrypt(rs.getString("E"), secretKey));
                    obj.setE_pequeno(views.main.AESUtil.decrypt(rs.getString("e_pequeno"), secretKey));
                    obj.setF(views.main.AESUtil.decrypt(rs.getString("f"), secretKey));
                    obj.setCW(views.main.AESUtil.decrypt(rs.getString("CW"), secretKey));
                    obj.setKpa(views.main.AESUtil.decrypt(rs.getString("kpa"), secretKey));
                    obj.setKpb(views.main.AESUtil.decrypt(rs.getString("kpb"), secretKey));
                    obj.setK(views.main.AESUtil.decrypt(rs.getString("K"), secretKey));
                    obj.setCellano(views.main.AESUtil.decrypt(rs.getString("cellano"), secretKey));
                    obj.setJSA(views.main.AESUtil.decrypt(rs.getString("JSA"), secretKey));
                    obj.setJSB(views.main.AESUtil.decrypt(rs.getString("JSB"), secretKey));
                    obj.setDia(views.main.AESUtil.decrypt(rs.getString("dia"), secretKey));
                    obj.setLua(views.main.AESUtil.decrypt(rs.getString("lua"), secretKey));
                    obj.setLub(views.main.AESUtil.decrypt(rs.getString("lub"), secretKey));
                    obj.setCob(views.main.AESUtil.decrypt(rs.getString("Cob"), secretKey));
                    obj.setXga(views.main.AESUtil.decrypt(rs.getString("Xga"), secretKey));
                    obj.setFya(views.main.AESUtil.decrypt(rs.getString("fya"), secretKey));
                    obj.setFyb(views.main.AESUtil.decrypt(rs.getString("fyb"), secretKey));
                    obj.setJka(views.main.AESUtil.decrypt(rs.getString("jka"), secretKey));
                    obj.setJkb(views.main.AESUtil.decrypt(rs.getString("jkb"), secretKey));
                    obj.setM(views.main.AESUtil.decrypt(rs.getString("m"), secretKey));
                    obj.setN(views.main.AESUtil.decrypt(rs.getString("n"), secretKey));
                    obj.setS(views.main.AESUtil.decrypt(rs.getString("S"), secretKey));
                    obj.sets(views.main.AESUtil.decrypt(rs.getString("s_pequeno"), secretKey));
                    obj.setP1(views.main.AESUtil.decrypt(rs.getString("p1"), secretKey));
                    obj.setIR_P1(views.main.AESUtil.decrypt(rs.getString("IR_P1"), secretKey));
                    obj.setLea(views.main.AESUtil.decrypt(rs.getString("lea"), secretKey));
                    obj.setLeb(views.main.AESUtil.decrypt(rs.getString("leb"), secretKey));
                    obj.setGenotipagem(views.main.AESUtil.decrypt(rs.getString("genotipagem"), secretKey));
                    obj.setObservacoes(views.main.AESUtil.decrypt(rs.getString("observacoes"), secretKey));

                    lista.add(obj);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
    //LISTAR POR ID
    public List<painel> buscar_PAINEL_POR_ID(String id) {
        List<painel> lista = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            String sql = "SELECT * FROM painel WHERE id = ?";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        painel obj = new painel();
                        obj.setId(rs.getString("id"));
                        obj.setLote(views.main.AESUtil.decrypt(rs.getString("lote"), secretKey));
                        obj.setMarca(views.main.AESUtil.decrypt(rs.getString("marca"), secretKey));
                        obj.setAmostra(views.main.AESUtil.decrypt(rs.getString("amostra"), secretKey));
                        obj.setABO(views.main.AESUtil.decrypt(rs.getString("ABO"), secretKey));
                        obj.setRH(views.main.AESUtil.decrypt(rs.getString("RH"), secretKey));
                        obj.setSequencia(views.main.AESUtil.decrypt(rs.getString("sequencia"), secretKey));
                        obj.setD(views.main.AESUtil.decrypt(rs.getString("D"), secretKey));
                        obj.setC(views.main.AESUtil.decrypt(rs.getString("C"), secretKey));
                        obj.setC_pequeno(views.main.AESUtil.decrypt(rs.getString("c_pequeno"), secretKey));
                        obj.setE(views.main.AESUtil.decrypt(rs.getString("E"), secretKey));
                        obj.setE_pequeno(views.main.AESUtil.decrypt(rs.getString("e_pequeno"), secretKey));
                        obj.setF(views.main.AESUtil.decrypt(rs.getString("f"), secretKey));
                        obj.setCW(views.main.AESUtil.decrypt(rs.getString("CW"), secretKey));
                        obj.setKpa(views.main.AESUtil.decrypt(rs.getString("kpa"), secretKey));
                        obj.setKpb(views.main.AESUtil.decrypt(rs.getString("kpb"), secretKey));
                        obj.setK(views.main.AESUtil.decrypt(rs.getString("K"), secretKey));
                        obj.setCellano(views.main.AESUtil.decrypt(rs.getString("cellano"), secretKey));
                        obj.setJSA(views.main.AESUtil.decrypt(rs.getString("JSA"), secretKey));
                        obj.setJSB(views.main.AESUtil.decrypt(rs.getString("JSB"), secretKey));
                        obj.setDia(views.main.AESUtil.decrypt(rs.getString("dia"), secretKey));
                        obj.setLua(views.main.AESUtil.decrypt(rs.getString("lua"), secretKey));
                        obj.setLub(views.main.AESUtil.decrypt(rs.getString("lub"), secretKey));
                        obj.setCob(views.main.AESUtil.decrypt(rs.getString("Cob"), secretKey));
                        obj.setXga(views.main.AESUtil.decrypt(rs.getString("Xga"), secretKey));
                        obj.setFya(views.main.AESUtil.decrypt(rs.getString("fya"), secretKey));
                        obj.setFyb(views.main.AESUtil.decrypt(rs.getString("fyb"), secretKey));
                        obj.setJka(views.main.AESUtil.decrypt(rs.getString("jka"), secretKey));
                        obj.setJkb(views.main.AESUtil.decrypt(rs.getString("jkb"), secretKey));
                        obj.setM(views.main.AESUtil.decrypt(rs.getString("m"), secretKey));
                        obj.setN(views.main.AESUtil.decrypt(rs.getString("n"), secretKey));
                        obj.setS(views.main.AESUtil.decrypt(rs.getString("S"), secretKey));
                        obj.sets(views.main.AESUtil.decrypt(rs.getString("s_pequeno"), secretKey));
                        obj.setP1(views.main.AESUtil.decrypt(rs.getString("p1"), secretKey));
                        obj.setIR_P1(views.main.AESUtil.decrypt(rs.getString("IR_P1"), secretKey));
                        obj.setLea(views.main.AESUtil.decrypt(rs.getString("lea"), secretKey));
                        obj.setLeb(views.main.AESUtil.decrypt(rs.getString("leb"), secretKey));
                        obj.setGenotipagem(views.main.AESUtil.decrypt(rs.getString("genotipagem"), secretKey));
                        obj.setObservacoes(views.main.AESUtil.decrypt(rs.getString("observacoes"), secretKey));

                        lista.add(obj);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar amostra: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
    //LISTAR POR outras Strings (GENOTIPAGEM)
    public List<painel> buscar_PAINEL_GENO(String txt) {
        List<painel> lista = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            String sql = "SELECT * FROM painel WHERE marca = ? OR lote = ? OR amostra = ?";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, views.main.AESUtil.encrypt(txt, secretKey));
                stmt.setString(2, views.main.AESUtil.encrypt(txt, secretKey));
                stmt.setString(3, views.main.AESUtil.encrypt(txt, secretKey));
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        painel obj = new painel();
                        obj.setId(rs.getString("id"));
                        obj.setLote(views.main.AESUtil.decrypt(rs.getString("lote"), secretKey));
                        obj.setMarca(views.main.AESUtil.decrypt(rs.getString("marca"), secretKey));
                        obj.setAmostra(views.main.AESUtil.decrypt(rs.getString("amostra"), secretKey));
                        obj.setRH(views.main.AESUtil.decrypt(rs.getString("RH"), secretKey));
                        obj.setGenotipagem(views.main.AESUtil.decrypt(rs.getString("genotipagem"), secretKey));

                        lista.add(obj);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar amostra: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
    //ADICIONAR GENOTIPAGEM
    public void add_GENO(String marca, String lote, String amostra, String ID, String feno, String extendida){
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            if (dataExists_2(connection, lote, marca, amostra, feno)) {
                String sql = "UPDATE painel SET RH = ?, genotipagem = ? WHERE id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    preparedStatement.setString(1, views.main.AESUtil.encrypt(feno, secretKey));
                    preparedStatement.setString(2, views.main.AESUtil.encrypt(extendida, secretKey));
                    preparedStatement.setString(3, ID);

                    preparedStatement.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Genotipagem Adicionada com Sucesso para a amostra " + ID + "!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Amostra/Doador não registrada no Banco de Dados!", "NÃO ENCONTRADA", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //EDITAR PAINEL
    public void ATUALIZAR_AMOSTRA(painel obj, String id) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            if (!dataExists(connection, obj.getLote(), obj.getMarca(), obj.getAmostra(), obj.getABO(), obj.getRH())) {
                String sql = "UPDATE painel SET lote = ?, marca = ?, amostra = ?, ABO = ?, RH = ?, sequencia = ?, D = ?, C = ?, c_pequeno = ?, E = ?, e_pequeno = ?, f = ?, CW = ?, kpa = ?, kpb = ?, K = ?, cellano = ?, JSA = ?, JSB = ?, dia = ?, lua = ?, lub = ?, Cob = ?, Xga = ?, fya = ?, fyb = ?, jka = ?, jkb = ?, m = ?, n = ?, S = ?, s_pequeno = ?, p1 = ?, IR_P1 = ?, lea = ?, leb = ?, observacoes = ? WHERE id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    preparedStatement.setString(1, views.main.AESUtil.encrypt(obj.getLote(), secretKey));
                    preparedStatement.setString(2, views.main.AESUtil.encrypt(obj.getMarca(), secretKey));
                    preparedStatement.setString(3, views.main.AESUtil.encrypt(obj.getAmostra(), secretKey));
                    preparedStatement.setString(4, views.main.AESUtil.encrypt(obj.getABO(), secretKey));
                    preparedStatement.setString(5, views.main.AESUtil.encrypt(obj.getRH(), secretKey));
                    preparedStatement.setString(6, views.main.AESUtil.encrypt(obj.getSequencia(), secretKey));
                    preparedStatement.setString(7, views.main.AESUtil.encrypt(obj.getD(), secretKey));
                    preparedStatement.setString(8, views.main.AESUtil.encrypt(obj.getC(), secretKey));
                    preparedStatement.setString(9, views.main.AESUtil.encrypt(obj.getC_pequeno(), secretKey));
                    preparedStatement.setString(10, views.main.AESUtil.encrypt(obj.getE(), secretKey));
                    preparedStatement.setString(11, views.main.AESUtil.encrypt(obj.getE_pequeno(), secretKey));
                    preparedStatement.setString(12, views.main.AESUtil.encrypt(obj.getF(), secretKey));
                    preparedStatement.setString(13, views.main.AESUtil.encrypt(obj.getCW(), secretKey));
                    preparedStatement.setString(14, views.main.AESUtil.encrypt(obj.getKpa(), secretKey));
                    preparedStatement.setString(15, views.main.AESUtil.encrypt(obj.getKpb(), secretKey));
                    preparedStatement.setString(16, views.main.AESUtil.encrypt(obj.getK(), secretKey));
                    preparedStatement.setString(17, views.main.AESUtil.encrypt(obj.getCellano(), secretKey));
                    preparedStatement.setString(18, views.main.AESUtil.encrypt(obj.getJSA(), secretKey));
                    preparedStatement.setString(19, views.main.AESUtil.encrypt(obj.getJSB(), secretKey));
                    preparedStatement.setString(20, views.main.AESUtil.encrypt(obj.getDia(), secretKey));
                    preparedStatement.setString(21, views.main.AESUtil.encrypt(obj.getLua(), secretKey));
                    preparedStatement.setString(22, views.main.AESUtil.encrypt(obj.getLub(), secretKey));
                    preparedStatement.setString(23, views.main.AESUtil.encrypt(obj.getCob(), secretKey));
                    preparedStatement.setString(24, views.main.AESUtil.encrypt(obj.getXga(), secretKey));
                    preparedStatement.setString(25, views.main.AESUtil.encrypt(obj.getFya(), secretKey));
                    preparedStatement.setString(26, views.main.AESUtil.encrypt(obj.getFyb(), secretKey));
                    preparedStatement.setString(27, views.main.AESUtil.encrypt(obj.getJka(), secretKey));
                    preparedStatement.setString(28, views.main.AESUtil.encrypt(obj.getJkb(), secretKey));
                    preparedStatement.setString(29, views.main.AESUtil.encrypt(obj.getM(), secretKey));
                    preparedStatement.setString(30, views.main.AESUtil.encrypt(obj.getN(), secretKey));
                    preparedStatement.setString(31, views.main.AESUtil.encrypt(obj.getS(), secretKey));
                    preparedStatement.setString(32, views.main.AESUtil.encrypt(obj.gets(), secretKey));
                    preparedStatement.setString(33, views.main.AESUtil.encrypt(obj.getP1(), secretKey));
                    preparedStatement.setString(34, views.main.AESUtil.encrypt(obj.getIR_P1(), secretKey));
                    preparedStatement.setString(35, views.main.AESUtil.encrypt(obj.getLea(), secretKey));
                    preparedStatement.setString(36, views.main.AESUtil.encrypt(obj.getLeb(), secretKey));
                    preparedStatement.setString(37, views.main.AESUtil.encrypt(obj.getObservacoes(), secretKey));
                    preparedStatement.setString(38, id);

                    preparedStatement.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Amostra Atualizada com Sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Amostra não encontrada no banco de dados!\nDigite um ID válido e tente novamente.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //DELETAR PAINEL INTEIRO
    public void DELETAR_DB() {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            String sql = "DELETE FROM painel";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "BANCO DE DADOS DELETADO com SUCESSO!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Tabela: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //DELETAR ID
    public void DELETAR_AMOSTRA(String id) {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            String sql = "DELETE FROM painel WHERE id = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, id);
                int affectedRows = ps.executeUpdate();
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(null, "Amostra DELETADA com Sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma amostra encontrada com o ID fornecido!\nDigite um ID válido e tente novamente.", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir amostra: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //DELETAR PAINEL + LOTE expecifico
    public boolean deletarPainel(String lote, String marca) {
        String sqlSelect = "SELECT id, lote, marca FROM painel";
        String sqlDelete = "DELETE FROM painel WHERE id = ?";
        String dado = marca + " - " + lote;
        
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Panels.db");
             PreparedStatement pstmtSelect = connection.prepareStatement(sqlSelect);
             PreparedStatement pstmtDelete = connection.prepareStatement(sqlDelete)) {

            ResultSet rs = pstmtSelect.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                String decryptedLote = views.main.AESUtil.decrypt(rs.getString("lote"), secretKey);
                String decryptedMarca = views.main.AESUtil.decrypt(rs.getString("marca"), secretKey);

                if (decryptedLote.equals(lote) && decryptedMarca.equals(marca)) {
                    pstmtDelete.setString(1, id);
                    pstmtDelete.executeUpdate();
                }}
            JOptionPane.showMessageDialog(null, "Painel " + dado + " excluído com Sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar registro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    //PESQUISAR PELAS HEMACIAS POSITIVAS NO RESULTADO
    public List<String> analisarTestesEmBancada(String marca, String lote, List<String> sequenciasPositivas) {
        List<String> antigenosPositivos = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            // Criptografar as sequências fornecida
            List<String> sequenciasCriptografadas = sequenciasPositivas.stream()
                .map(seq -> views.main.AESUtil.encrypt(seq, secretKey))
                .collect(Collectors.toList());

            //consulta
            String sql = "SELECT * FROM painel WHERE lote = ? AND marca = ? AND sequencia IN (" + 
                         sequenciasCriptografadas.stream().map(s -> "?").collect(Collectors.joining(",")) + ")";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, views.main.AESUtil.encrypt(lote, secretKey));
                stmt.setString(2, views.main.AESUtil.encrypt(marca, secretKey));

                // Definir os parâmetros das sequências criptografadas
                for (int i = 0; i < sequenciasCriptografadas.size(); i++) {
                    stmt.setString(3 + i, sequenciasCriptografadas.get(i));
                }

                try (ResultSet rs = stmt.executeQuery()) {
                    Map<String, Integer> antigenoCount = new HashMap<>();
                    int totalHemacias = sequenciasPositivas.size();

                    while (rs.next()) {
                        for (String coluna : getAntigenColumns()) {
                            String antigeno = views.main.AESUtil.decrypt(rs.getString(coluna), secretKey);
                            if ("+".equals(antigeno)) {
                                antigenoCount.put(coluna, antigenoCount.getOrDefault(coluna, 0) + 1);
                            }}}

                    for (Map.Entry<String, Integer> entry : antigenoCount.entrySet()) {
                        if (entry.getValue() == totalHemacias) {
                            antigenosPositivos.add(entry.getKey());
                        }}}}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao analisar testes: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return antigenosPositivos;
    }

    private List<String> getAntigenColumns() {
        return Arrays.asList("D", "C", "c_pequeno", "E", "e_pequeno", "f", "CW", "kpa", "kpb", "K", "cellano", "JSA", "JSB", "dia", "lua", "lub", "Cob", "Xga", "fya", "fyb", "jka", "jkb", "m", "n", "S", "s_pequeno", "p1", "IR_P1", "lea", "leb");
    }
    
    //LISTAR por LOTE E MARCA
    public List<painel> Listar_LOTE_MARCA(String lote, String marca) {
        List<painel> lista = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            // Adicionar ORDER BY na consulta SQL para ordenar pela coluna "sequencia"
            String sql = "SELECT * FROM painel WHERE lote = ? AND marca = ? ORDER BY CAST(sequencia AS INTEGER)";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1,lote);
                stmt.setString(2, marca);
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        painel obj = new painel();
                        obj.setId(rs.getString("id"));
                        obj.setLote(views.main.AESUtil.decrypt(rs.getString("lote"), secretKey));
                        obj.setMarca(views.main.AESUtil.decrypt(rs.getString("marca"), secretKey));
                        obj.setAmostra(views.main.AESUtil.decrypt(rs.getString("amostra"), secretKey));
                        obj.setABO(views.main.AESUtil.decrypt(rs.getString("ABO"), secretKey));
                        obj.setRH(views.main.AESUtil.decrypt(rs.getString("RH"), secretKey));
                        obj.setSequencia(views.main.AESUtil.decrypt(rs.getString("sequencia"), secretKey));
                        obj.setD(views.main.AESUtil.decrypt(rs.getString("D"), secretKey));
                        obj.setC(views.main.AESUtil.decrypt(rs.getString("C"), secretKey));
                        obj.setC_pequeno(views.main.AESUtil.decrypt(rs.getString("c_pequeno"), secretKey));
                        obj.setE(views.main.AESUtil.decrypt(rs.getString("E"), secretKey));
                        obj.setE_pequeno(views.main.AESUtil.decrypt(rs.getString("e_pequeno"), secretKey));
                        obj.setF(views.main.AESUtil.decrypt(rs.getString("f"), secretKey));
                        obj.setCW(views.main.AESUtil.decrypt(rs.getString("CW"), secretKey));
                        obj.setKpa(views.main.AESUtil.decrypt(rs.getString("kpa"), secretKey));
                        obj.setKpb(views.main.AESUtil.decrypt(rs.getString("kpb"), secretKey));
                        obj.setK(views.main.AESUtil.decrypt(rs.getString("K"), secretKey));
                        obj.setCellano(views.main.AESUtil.decrypt(rs.getString("cellano"), secretKey));
                        obj.setJSA(views.main.AESUtil.decrypt(rs.getString("JSA"), secretKey));
                        obj.setJSB(views.main.AESUtil.decrypt(rs.getString("JSB"), secretKey));
                        obj.setDia(views.main.AESUtil.decrypt(rs.getString("dia"), secretKey));
                        obj.setLua(views.main.AESUtil.decrypt(rs.getString("lua"), secretKey));
                        obj.setLub(views.main.AESUtil.decrypt(rs.getString("lub"), secretKey));
                        obj.setCob(views.main.AESUtil.decrypt(rs.getString("Cob"), secretKey));
                        obj.setXga(views.main.AESUtil.decrypt(rs.getString("Xga"), secretKey));
                        obj.setFya(views.main.AESUtil.decrypt(rs.getString("fya"), secretKey));
                        obj.setFyb(views.main.AESUtil.decrypt(rs.getString("fyb"), secretKey));
                        obj.setJka(views.main.AESUtil.decrypt(rs.getString("jka"), secretKey));
                        obj.setJkb(views.main.AESUtil.decrypt(rs.getString("jkb"), secretKey));
                        obj.setM(views.main.AESUtil.decrypt(rs.getString("m"), secretKey));
                        obj.setN(views.main.AESUtil.decrypt(rs.getString("n"), secretKey));
                        obj.setS(views.main.AESUtil.decrypt(rs.getString("S"), secretKey));
                        obj.sets(views.main.AESUtil.decrypt(rs.getString("s_pequeno"), secretKey));
                        obj.setP1(views.main.AESUtil.decrypt(rs.getString("p1"), secretKey));
                        obj.setIR_P1(views.main.AESUtil.decrypt(rs.getString("IR_P1"), secretKey));
                        obj.setLea(views.main.AESUtil.decrypt(rs.getString("lea"), secretKey));
                        obj.setLeb(views.main.AESUtil.decrypt(rs.getString("leb"), secretKey));
                        obj.setGenotipagem(views.main.AESUtil.decrypt(rs.getString("genotipagem"), secretKey));
                        obj.setObservacoes(views.main.AESUtil.decrypt(rs.getString("observacoes"), secretKey));

                        lista.add(obj);
                    }}}
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar amostra: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
    //PESQUISAR
    public List<painel> buscarRegistros(String pesquisa) {
        String sql = "SELECT * FROM painel";
        List<painel> resultados = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Panels.db")) {
            try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();

                // Processar os resultados
                while (rs.next()) {
                    painel obj = new painel();
                    obj.setId(rs.getString("id"));
                    obj.setLote(views.main.AESUtil.decrypt(rs.getString("lote"), secretKey));
                    obj.setMarca(views.main.AESUtil.decrypt(rs.getString("marca"), secretKey));
                    obj.setAmostra(views.main.AESUtil.decrypt(rs.getString("amostra"), secretKey));
                    obj.setABO(views.main.AESUtil.decrypt(rs.getString("ABO"), secretKey));
                    obj.setRH(views.main.AESUtil.decrypt(rs.getString("RH"), secretKey));
                    obj.setSequencia(views.main.AESUtil.decrypt(rs.getString("sequencia"), secretKey));
                    obj.setD(views.main.AESUtil.decrypt(rs.getString("D"), secretKey));
                    obj.setC(views.main.AESUtil.decrypt(rs.getString("C"), secretKey));
                    obj.setC_pequeno(views.main.AESUtil.decrypt(rs.getString("c_pequeno"), secretKey));
                    obj.setE(views.main.AESUtil.decrypt(rs.getString("E"), secretKey));
                    obj.setE_pequeno(views.main.AESUtil.decrypt(rs.getString("e_pequeno"), secretKey));
                    obj.setF(views.main.AESUtil.decrypt(rs.getString("f"), secretKey));
                    obj.setCW(views.main.AESUtil.decrypt(rs.getString("CW"), secretKey));
                    obj.setKpa(views.main.AESUtil.decrypt(rs.getString("kpa"), secretKey));
                    obj.setKpb(views.main.AESUtil.decrypt(rs.getString("kpb"), secretKey));
                    obj.setK(views.main.AESUtil.decrypt(rs.getString("K"), secretKey));
                    obj.setCellano(views.main.AESUtil.decrypt(rs.getString("cellano"), secretKey));
                    obj.setJSA(views.main.AESUtil.decrypt(rs.getString("JSA"), secretKey));
                    obj.setJSB(views.main.AESUtil.decrypt(rs.getString("JSB"), secretKey));
                    obj.setDia(views.main.AESUtil.decrypt(rs.getString("dia"), secretKey));
                    obj.setLua(views.main.AESUtil.decrypt(rs.getString("lua"), secretKey));
                    obj.setLub(views.main.AESUtil.decrypt(rs.getString("lub"), secretKey));
                    obj.setCob(views.main.AESUtil.decrypt(rs.getString("Cob"), secretKey));
                    obj.setXga(views.main.AESUtil.decrypt(rs.getString("Xga"), secretKey));
                    obj.setFya(views.main.AESUtil.decrypt(rs.getString("fya"), secretKey));
                    obj.setFyb(views.main.AESUtil.decrypt(rs.getString("fyb"), secretKey));
                    obj.setJka(views.main.AESUtil.decrypt(rs.getString("jka"), secretKey));
                    obj.setJkb(views.main.AESUtil.decrypt(rs.getString("jkb"), secretKey));
                    obj.setM(views.main.AESUtil.decrypt(rs.getString("m"), secretKey));
                    obj.setN(views.main.AESUtil.decrypt(rs.getString("n"), secretKey));
                    obj.setS(views.main.AESUtil.decrypt(rs.getString("S"), secretKey));
                    obj.sets(views.main.AESUtil.decrypt(rs.getString("s_pequeno"), secretKey));
                    obj.setP1(views.main.AESUtil.decrypt(rs.getString("p1"), secretKey));
                    obj.setIR_P1(views.main.AESUtil.decrypt(rs.getString("IR_P1"), secretKey));
                    obj.setLea(views.main.AESUtil.decrypt(rs.getString("lea"), secretKey));
                    obj.setLeb(views.main.AESUtil.decrypt(rs.getString("leb"), secretKey));
                    obj.setObservacoes(views.main.AESUtil.decrypt(rs.getString("observacoes"), secretKey));

                    // Verificar se o registro corresponde à pesquisa
                    if (matchesSearch(obj, pesquisa)) {
                        resultados.add(obj);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return resultados;
    }
    
    private boolean matchesSearch(painel obj, String pesquisa) {
        if (pesquisa.contains(": ")) {
            String[] parts = pesquisa.split(": ");
            if (parts.length == 2) {
                String coluna = parts[0].trim();
                String valor = parts[1].trim();

                switch (coluna) {
                    case "LOTE":
                        return obj.getLote().equalsIgnoreCase(valor);
                    case "MARCA":
                        return obj.getMarca().equalsIgnoreCase(valor);
                    case "AMOSTRA":
                        return obj.getAmostra().equalsIgnoreCase(valor);
                    case "ABO":
                        return obj.getABO().equalsIgnoreCase(valor);
                    case "RH":
                        return obj.getRH().equalsIgnoreCase(valor);
                    case "NUMERO":
                        return obj.getSequencia().equalsIgnoreCase(valor);
                    case "D":
                        return obj.getD().equalsIgnoreCase(valor);
                    case "C":
                        return obj.getC().equalsIgnoreCase(valor);
                    case "c":
                        return obj.getC_pequeno().equalsIgnoreCase(valor);
                    case "E":
                        return obj.getE().equalsIgnoreCase(valor);
                    case "e":
                        return obj.getE_pequeno().equalsIgnoreCase(valor);
                    case "f":
                        return obj.getF().equalsIgnoreCase(valor);
                    case "CW":
                        return obj.getCW().equalsIgnoreCase(valor);
                    case "Kpa":
                        return obj.getKpa().equalsIgnoreCase(valor);
                    case "Kpb":
                        return obj.getKpb().equalsIgnoreCase(valor);
                    case "K":
                        return obj.getK().equalsIgnoreCase(valor);
                    case "k":
                        return obj.getCellano().equalsIgnoreCase(valor);
                    case "Jsa":
                        return obj.getJSA().equalsIgnoreCase(valor);
                    case "Jsb":
                        return obj.getJSB().equalsIgnoreCase(valor);
                    case "Dia":
                        return obj.getDia().equalsIgnoreCase(valor);
                    case "Lua":
                        return obj.getLua().equalsIgnoreCase(valor);
                    case "Lub":
                        return obj.getLub().equalsIgnoreCase(valor);
                    case "Cob":
                        return obj.getCob().equalsIgnoreCase(valor);
                    case "Xga":
                        return obj.getXga().equalsIgnoreCase(valor);
                    case "Fya":
                        return obj.getFya().equalsIgnoreCase(valor);
                    case "Fyb":
                        return obj.getFyb().equalsIgnoreCase(valor);
                    case "Jka":
                        return obj.getJka().equalsIgnoreCase(valor);
                    case "Jkb":
                        return obj.getJkb().equalsIgnoreCase(valor);
                    case "M":
                        return obj.getM().equalsIgnoreCase(valor);
                    case "N":
                        return obj.getN().equalsIgnoreCase(valor);
                    case "S":
                        return obj.getS().equalsIgnoreCase(valor);
                    case "s":
                        return obj.gets().equalsIgnoreCase(valor);
                    case "P1":
                        return obj.getP1().equalsIgnoreCase(valor);
                    case "IR P1":
                        return obj.getIR_P1().equalsIgnoreCase(valor);
                    case "Lea":
                        return obj.getLea().equalsIgnoreCase(valor);
                    case "Leb":
                        return obj.getLeb().equalsIgnoreCase(valor);
                    case "OBSERVAÇÕES":
                        return obj.getObservacoes().equalsIgnoreCase(valor);
                    default:
                        return false;
                }}
        } else {
            return obj.getLote().contains(pesquisa) ||
                   obj.getMarca().contains(pesquisa) ||
                   obj.getAmostra().contains(pesquisa) ||
                   obj.getABO().contains(pesquisa) ||
                   obj.getRH().contains(pesquisa) ||
                   obj.getD().contains(pesquisa) ||
                   obj.getC().contains(pesquisa) ||
                   obj.getC_pequeno().contains(pesquisa) ||
                   obj.getE().contains(pesquisa) ||
                   obj.getE_pequeno().contains(pesquisa) ||
                   obj.getF().contains(pesquisa) ||
                   obj.getCW().contains(pesquisa) ||
                   obj.getKpa().contains(pesquisa) ||
                   obj.getKpb().contains(pesquisa) ||
                   obj.getK().contains(pesquisa) ||
                   obj.getCellano().contains(pesquisa) ||
                   obj.getJSA().contains(pesquisa) ||
                   obj.getJSB().contains(pesquisa) ||
                   obj.getDia().contains(pesquisa) ||
                   obj.getLua().contains(pesquisa) ||
                   obj.getLub().contains(pesquisa) ||
                   obj.getCob().contains(pesquisa) ||
                   obj.getXga().contains(pesquisa) ||
                   obj.getFya().contains(pesquisa) ||
                   obj.getFyb().contains(pesquisa) ||
                   obj.getJka().contains(pesquisa) ||
                   obj.getJkb().contains(pesquisa) ||
                   obj.getM().contains(pesquisa) ||
                   obj.getN().contains(pesquisa) ||
                   obj.getS().contains(pesquisa) ||
                   obj.gets().contains(pesquisa) ||
                   obj.getP1().contains(pesquisa) ||
                   obj.getIR_P1().contains(pesquisa) ||
                   obj.getLea().contains(pesquisa) ||
                   obj.getLeb().contains(pesquisa) ||
                   obj.getObservacoes().contains(pesquisa);
        }
        return false;
    }

}