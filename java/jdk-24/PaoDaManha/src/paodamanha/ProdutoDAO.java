package paodamanha;

import java.sql.Connection;

public class ProdutoDAO {
    private Connection conn;

    public ProdutoDAO() {
        this.conn = new ConnectionFactory().connectaBD();
    }
    
    
}
