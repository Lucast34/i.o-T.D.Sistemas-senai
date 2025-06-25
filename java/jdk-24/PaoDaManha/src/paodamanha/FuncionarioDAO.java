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
    
    public void adicionarFuncionario(Funcionario funcionario) throws SQLException{
        String sql = "INSERT INTO tb_funcionario(nome,cpf,telefone,idade,sexo)"
                + "VALUES(?,?,?,?,?)";
        
        
        PreparedStatement pstm;
        pstm = null;
        
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
    
    public List<Funcionario> listarFuncionarios() throws SQLException{
        String sql = "SELECT * FROM tb_funcionario";
        
        List<Funcionario> lista = new ArrayList<>();
        
        
        PreparedStatement pstm;
        pstm = null;
        
        ResultSet rs;
        rs = null;
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Funcionario fun = new Funcionario();
                
                fun.setId(rs.getInt("id"));
                fun.setNome(rs.getString("nome"));
                
            }
            
        } catch (Exception e) {
        } finally {
        }
        
        return lista;
    }
}
