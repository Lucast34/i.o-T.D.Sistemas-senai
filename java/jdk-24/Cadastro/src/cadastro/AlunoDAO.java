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
                + "values(?,?,?,?,?,?)";
        
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
                
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setCurso(rs.getString("curso"));
                
                list.add(aluno);
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
        
        Aluno aluno = null;
        
        try {
            
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                
                aluno = new Aluno();
                
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setCurso(rs.getString("curso"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }
        }
        
        return aluno;
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
