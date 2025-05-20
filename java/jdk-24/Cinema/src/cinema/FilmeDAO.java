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
            
            pstm.setString(1, filme.getTitulo());
            pstm.setString(2, filme.getGenero());
            pstm.setInt(3, filme.getAno());
            
            pstm.execute();
            
        }catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        }finally {
            if(pstm != null)pstm.close();
        }
        
    }
    
    public List<Filme> listarFilmes() throws SQLException{
        
        List<Filme> list = new ArrayList<>();
        
        String sql = "SELECT * FROM tb_filme";
        
        PreparedStatement pstm;
            pstm = null;
        
        ResultSet rs = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Filme film = new Filme();
                
                film.setId(rs.getInt("id"));
                film.setTitulo(rs.getString("Marca"));
                film.setGenero(rs.getString("Tipo"));
                film.setAno(rs.getInt("Ano"));
                
                
                list.add(film);
            }
            
        }catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        }finally {
            if(rs!= null && pstm != null){
                rs.close();
                pstm.close();
            }
            
        }
        return list;
    }
    
    public Filme film(int id) throws SQLException{
        String sql = "SELECT * FROM film WHERE id=?";
        
        PreparedStatement pstm;
                pstm = null;
        
        ResultSet rs = null;
        
        Filme film = null;
        
        try {
            
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                
                film = new Filme();
                
                film.setId(rs.getInt("id"));
                film.setTitulo(rs.getString("titulo"));
                film.setGenero(rs.getString("genero"));
                film.setAno(rs.getInt("ano"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }
        }
        
        return film;
    }
    
}
