/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connect_mysql.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javabens.Fabricante;

/**
 *
 * @author nilce
 */
public class FabricantesDAO {
    private Connection conecta;
    
    public FabricantesDAO(){
    
        this.conecta = new ConnectionFactory().conecta();
    
    }
    
    public void cadastrarFabricante(Fabricante obj){
        
        try {
            String cmdsql = "insert into fabricante(nome)values (?)";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            //executa
            stmt.execute();
            
            //fecha conexao
            stmt.close();
            
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        
}
}