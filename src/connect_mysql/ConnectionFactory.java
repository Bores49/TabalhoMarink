
package connect_mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Camila e Luan
 */
public class ConnectionFactory {

    public  static Connection conecta() {
        try {

            return DriverManager.getConnection("jdbc:mysql://localhost/bdjogos", "root", "");

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }

}
