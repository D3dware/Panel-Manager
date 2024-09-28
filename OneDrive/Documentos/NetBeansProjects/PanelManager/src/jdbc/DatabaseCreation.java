package jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author D3dware
 */
public class DatabaseCreation {
    
    public DatabaseCreation() {
        Connection connection = null;
        Statement statement = null;

        try {
            // Carregar o driver JDBC SQLite
            Class.forName("org.sqlite.JDBC");

            // Conectar ao banco de dados (criará o arquivo Panels.db se não existir)
            connection = DriverManager.getConnection("jdbc:sqlite:Panels.db");

            // Criar uma declaração SQL
            statement = connection.createStatement();

            // Executar a consulta para criar a tabela
            String sql = "CREATE TABLE IF NOT EXISTS painel (" +
                    "id INTEGER PRIMARY KEY, " +
                    "lote TEXT, " +
                    "marca TEXT, " +
                    "amostra TEXT, " +
                    "ABO TEXT, " +
                    "RH TEXT, " +
                    "sequencia TEXT," +
                    "D TEXT, " +
                    "C TEXT, " +
                    "c_pequeno TEXT, " +
                    "E TEXT, " +
                    "e_pequeno TEXT, " +
                    "f TEXT, " +
                    "CW TEXT, " +
                    "kpa TEXT, " +
                    "kpb TEXT, " +
                    "K TEXT, " +
                    "cellano TEXT, " +
                    "JSA TEXT, " +
                    "JSB TEXT, " +
                    "dia TEXT, " +
                    "lua TEXT, " +
                    "lub TEXT, " +
                    "Cob TEXT, " +
                    "Xga TEXT, " +
                    "fya TEXT, " +
                    "fyb TEXT, " +
                    "jka TEXT, " +
                    "jkb TEXT, " +
                    "m TEXT, " +
                    "n TEXT, " +
                    "S TEXT, " +
                    "s_pequeno TEXT, " +
                    "p1 TEXT, " +
                    "IR_P1 TEXT, " +
                    "lea TEXT, " +
                    "leb TEXT, " +
                    "genotipagem TEXT, " +
                    "observacoes TEXT)";
            statement.execute(sql);

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver SQLite: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta SQL: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }    

    public String crypt(){
    // Verifique o arquivo para carregar a credencial AES
    try {
        File file2 = new File("C:/Panel_Manager/AutoUpdate/Conf.ini");

        if (file2.exists() && file2.length() != 0){
            try (Scanner scanner1 = new Scanner(file2)) {

                String secret2 = scanner1.nextLine(); // --------------> 16bits/

                if (secret2 != null){

                    return secret2;

                }else{

                    return null;

                }
        }}else if(file2.exists() && file2.length() == 0) {

            JOptionPane.showMessageDialog(null, "Chave AES não encontrada!", "AES-Key ERROR", JOptionPane.ERROR_MESSAGE);

    }} catch (FileNotFoundException r) {

        JOptionPane.showMessageDialog(null, "Arquivo não encontrado: " + r, "Erro", JOptionPane.ERROR_MESSAGE);

    }
    return null;
}

}
