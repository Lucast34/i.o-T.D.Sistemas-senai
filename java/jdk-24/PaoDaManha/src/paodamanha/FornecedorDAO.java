package paodamanha;

import java.sql.Connection;

public class FornecedorDAO {
    private Connection conn;

    public FornecedorDAO() {
        this.conn = new ConnectionFactory().connectaBD();
    }
    
    
}
