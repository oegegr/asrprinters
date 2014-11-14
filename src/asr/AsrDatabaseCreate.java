package asr;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class AsrDatabaseCreate {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:h2:./data/asr_database", "sa", "");
			Statement stmt = conn.createStatement();
			stmt.execute("CREATE SCHEMA asr;");
			conn.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
