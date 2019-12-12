import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class UserApplication {

	private static Dao userDao;
	private DBConnection db;


	public static void main(String[] args) {
		userDao = new UserDao();
		userDao.save(new User("Julie", "julie@domain.com"));
		userDao.load("Julie");

	}

}
