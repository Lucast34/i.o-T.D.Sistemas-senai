package paodamanha;

import java.sql.Connection;

public class GerenteDAO {
    private Connection conn;
    
    public GerenteDAO(){
        this.conn = new ConnectionFactory().connectaBD();
    }
}
