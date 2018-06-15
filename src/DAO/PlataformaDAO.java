/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connect_mysql.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javabens.Plataforma;

/**
 *
 * @author nilce
 */
public class PlataformaDAO {
    private Connection conecta;
    
    public PlataformaDAO(){
    
        this.conecta = new ConnectionFactory().conecta();
    
    }
    
    public void cadastrarPlataforma(Plataforma obj){
        
        try {
            String cmdsql = "insert into plataforma(plataforma)values (?)";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getPlataforma());
            //executa
            stmt.execute();
            
            //fecha conexao
            stmt.close();
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        
}
}
