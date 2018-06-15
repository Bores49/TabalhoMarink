/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connect_mysql.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javabens.Genero;

/**
 *
 * @author nilce
 */
public class GenerosDAO {
    private Connection conecta;
    
    public GenerosDAO(){
    
        this.conecta = new ConnectionFactory().conecta();
    
    }
    
    public void cadastrarGenero(Genero obj){
        
        try {
            String cmdsql = "insert into genero(genero)values (?)";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getGenero());
            //executa
            stmt.execute();
            
            //fecha conexao
            stmt.close();
            
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
}
