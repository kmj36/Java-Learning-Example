package n_dependencyInjection.e_DIChaining;

// DataSource는 인터페이스 (표준 javax.sql.DataSource도 이런 구조)
interface DataSource {
    // 실제로는 getConnection() 등의 메서드가 있음
}

// 구체 구현체
class DataSourceImpl implements DataSource {
    private final String driver, url, user, password;

    public DataSourceImpl(String driver, String url, String user, String password) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.password = password;
    }
}

class UserDAO {
    private final DataSource dataSource;

    public UserDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String findUser(int id) {
        return "user_" + id;
    }
}

class UserService {
    private final UserDAO userDao;

    public UserService(UserDAO userDao) {
        this.userDao = userDao;
    }

    public String getUserInfo(int id) {
        return userDao.findUser(id);
    }
}

public class DIChaining {
    static void main(String[] args) {
        DataSource dataSource = new DataSourceImpl("driver", "url", "user", "pw");
        UserDAO userDao = new UserDAO(dataSource);
        UserService userService = new UserService(userDao);

        System.out.println(userService.getUserInfo(1));
    }
}
