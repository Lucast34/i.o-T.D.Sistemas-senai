/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ead
 */
public class AlunoDAO {
    private Connection connection;

    public AlunoDAO(){
        this.connection = new ConnectionFactory().connectaBD();
    }
    
    public void criarAlunoro(Aluno aluno) throws SQLException{
        String sql= "INSERT INTO tb_aluno(nome, endereco, "
                + "sexo, cpf, matricula, curso)"
                + "values(?,?,?,?)";
        
        PreparedStatement pstm;
            pstm = null;
        
        try {
            
            pstm = connection.prepareStatement(sql);
            
            pstm.setString(1,aluno.getNome());
            pstm.setString(2,aluno.getEndereco());
            pstm.setString(3,aluno.getSexo());
            pstm.setString(4,aluno.getCpf());
            pstm.setString(5,aluno.getMatricula());
            pstm.setString(6,aluno.getCurso());
            
            
            pstm.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
    }
        
        
    public List<Aluno> listarAlunoros() throws SQLException{
        
        List<Aluno> list = new ArrayList<>();
        
        String sql = "SELECT * FROM tb_aluno";
        
        PreparedStatement pstm;
            pstm = null;
        
        ResultSet rs = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Aluno aluno = new Aluno();
                
                aluno.getId(rs.getInt("id"));   
                aluno.setMarca(rs.getString("Marca"));
                aluno.setAno(rs.getInt("Ano"));
                aluno.setTipo(rs.getString("Tipo"));
                aluno.setPorta(rs.getInt("Porta"));
                
                list.add(Aluno);
            }
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        } finally {
            if(rs!= null && pstm != null){
                rs.close();
                pstm.close();
            }
            
        }
        return list;
    }
    
    public Aluno buscaAlunoPorId(int id) throws SQLException{
        String sql = "SELECT * FROM tb_Alunoro WHERE id=?";
        
        PreparedStatement pstm;
                pstm = null;
        
        ResultSet rs = null;
        
        Aluno Aluno = null;
        
        try {
            
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                
                Aluno = new Aluno();
                
                Aluno.setId(rs.getInt("id"));
                Aluno.setMarca(rs.getString("marca"));
                Aluno.setAno(rs.getInt("ano"));
                Aluno.setTipo(rs.getString("tipo"));
                Aluno.setAno(rs.getInt("ano"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }
        }
        
        return Aluno;
    }
    
    public void atualizarAluno(Aluno aluno)throws SQLException{
        String sql = "UPDATE tb_aluno SET nome = ?,  endereco = ?, "
                + "sexo= ?, cpf= ?, matricula= ?, curso= ? WHERE id = ?";
        
        PreparedStatement pstm;
            pstm = null;
            
        try {
            
            pstm = connection.prepareCall(sql);
            
            pstm.setString(1,aluno.getNome());
            pstm.setString(2,aluno.getEndereco());
            pstm.setString(3,aluno.getSexo());
            pstm.setString(4,aluno.getCpf());
            pstm.setString(4,aluno.getMatricula());
            pstm.setString(4,aluno.getCurso());
            
            int linhaAfetadas = pstm.executeUpdate();
            
            if(linhaAfetadas > 0){
                System.out.println("Leitura concluida");
            }else{
                System.out.println("Aluno não foi encontrado");
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } finally{
            if(pstm != null)pstm.close();
        }
    }
    
    public void deletarAluno(int id) throws SQLException{
        String sql = "DELETE FROM tb_Aluno WHERE id = ?";
        
        PreparedStatement pstm;
            pstm = null;
            
        try {
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1,id);
            
            pstm.executeUpdate();
            
            System.out.println("Aluno deletado com sucesso");
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
    
    }
    
    
    
    
}
