package paodamanha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private Connection conn;
    
    public FuncionarioDAO() {
        this.conn = new ConnectionFactory().connectaBD();
    }
    
    //Create
    public void adicionarFuncionario(Funcionario funcionario) throws SQLException{
        String sql = "INSERT INTO tb_funcionario(nome,cpf,telefone,idade,sexo)"
                + "VALUES(?,?,?,?,?)";
        
        PreparedStatement pstm = null ;
        
        try {
            pstm = conn.prepareCall(sql);
            
            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getCpf());
            pstm.setString(3, funcionario.getTelefone());
            pstm.setInt(4,funcionario.getIdade());
            pstm.setString(5, funcionario.getSexo());
            
            pstm.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("ErrorFuncioDAOAdd:"+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
        
    }
    
    //Read all
    public List<Funcionario> listarFuncionarios() throws SQLException{
        String sql = "SELECT * FROM tb_funcionario";
        
        List<Funcionario> lista = new ArrayList<>();
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Funcionario fun = new Funcionario();
                
                fun.setId(rs.getInt("id"));
                fun.setNome(rs.getString("nome"));
                fun.setCpf(rs.getString("cpf"));
                fun.setTelefone(rs.getString("telefone"));
                fun.setIdade(rs.getInt("idade"));
                fun.setSexo(rs.getString("sexo"));
                
                lista.add(fun);
            }
        } catch (SQLException e) {
            System.out.println("ErrorFunDAOReadList:"+e.getMessage());
        } finally {
            if(rs != null)rs.close();
            if(pstm != null)pstm.close();
        }
        
        return lista;
    }
    
    //Read for if
    public Funcionario buscarPorId(int id)throws SQLException{
        String sql = "SELECT * FROM tb_funcionario WHERE id= ?";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Funcionario fun = null;
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            if(rs.next()){
                fun = new Funcionario();
                
                fun.setId(rs.getInt("id"));
                fun.setNome(rs.getString("nome"));
                fun.setCpf(rs.getString("cpf"));
                fun.setTelefone(rs.getString("telefone"));
                fun.setIdade(rs.getInt("idade"));
                fun.setSexo(rs.getString("sexo"));
            }
            
        } catch (SQLException e) {
            System.out.println("ErrorFunDAOSearchForID:"+e.getMessage());
        } finally {
            if(rs != null)rs.close();
            if(pstm != null)pstm.close();
        }
        return fun;
    }
    
    //Update
    public void atualizarFuncionario(Funcionario fun) throws SQLException{
        String sql = "UPDATE tb_funcionaio SET nome = ?, cpf = ?, telefone = ?"
                +"idade = ?, sexo = ?";
        
        PreparedStatement pstm = null;
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, fun);
        } catch (Exception e) {
        } finally {
        }
        
        
    }
}
