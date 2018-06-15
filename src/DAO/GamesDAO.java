/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connect_mysql.ConnectionFactory;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javabens.Games;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nilce
 */
public class GamesDAO {
    
    private Connection conecta;
    
    public GamesDAO(){
    
        this.conecta = new ConnectionFactory().conecta();
    }
    
    //Cadastrar
    public void cadastrarGames(Games obj){
    
        try {
            String cmdsql = "insert into games(nome,tamanho)values (?,?)";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setDouble(2,obj.getTamanho());
            
            
            
            //executa
            stmt.execute();
            
            //fecha conexao
            stmt.close();
        
        } catch (SQLException erro) {
            
           throw new RuntimeException(erro);
        }
        
    }
    
    //listar
    public List<Games> listarGames(){
        
        try {
            
            List<Games> lista = new ArrayList<Games>();
            
            String cmdsql = "select * from valores";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
            
                Games v = new Games();
                v.setCodigo(rs.getInt("codigo"));
                v.setNome(rs.getString("nome"));
                v.setGenero(rs.getString("genero"));
                v.setPlataforma(rs.getString("plataforma"));
                v.setTamanho((float) rs.getDouble("tamanho"));
                v.setFabricante(rs.getString("fabricante"));
                
                lista.add(v);
            }
            return lista;
        } catch (Exception erro) {
            throw new RuntimeException(erro);
            
        }
    
    
    }
    
}
