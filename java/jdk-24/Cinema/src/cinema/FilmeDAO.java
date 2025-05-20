package cinema;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class FilmeDAO {
    private Connection connection;
    
    public FilmeDAO(){
        this.connection = new ConnectionFactory().connectaBD();
    }
    
    public void criarFilme(Filme filme)throws SQLException{
        String sql= "INSERT INTO tb_filme(marca,ano,tipo,portas)"
                + "values(?,?,?,?)";
        
        PreparedStatement pstm;
            pstm = null;
        
        try {
            
            pstm = connection.prepareStatement(sql);
            
            pstm.setString(1, filme.getMarca());
            pstm.setString(2, filme.getGenero() );
            pstm.setString(3, filme.getAno());
            
            pstm.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
         
    }
}
