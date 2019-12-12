import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class UserDao implements Dao<User> {

	private List<User> users = new ArrayList<>();

	public UserDao() {
		users.add(new User("John", "john@domain.com"));
		users.add(new User("Susan", "susan@domain.com"));
	}


	@Override
	public void save(User user) {
		String url = "jdbc:mysql://localhost/hello";
		String login = "root";
		String passwd ="";
		Connection cn =null;
		Statement st =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "INSERT INTO `hello`.`hello_person` (`name`) VALUES ('"+user.getName()+"');";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
