/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import java.sql.*;

public class AppMYSQL {
    public static void main(String[] args) {
        String LISTA_CARROS="SELECT * FROM tb_carro";
        
        try {
            Connection conn = ConexaoBD.ligarBD();
            
            PreparedStatement ps = conn.prepareStatement(LISTA_CARROS);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            conn.close();
        } catch (SQLException ex) {
            System.err.println("Erro na leitura de dados"+ex);
        }
        
    }
}
