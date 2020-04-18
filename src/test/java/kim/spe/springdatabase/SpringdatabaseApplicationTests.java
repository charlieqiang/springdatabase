package kim.spe.springdatabase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

@SpringBootTest
class SpringdatabaseApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        //com.zaxxer.hikari.HikariDataSource
        Connection connection = dataSource.getConnection();
        connection.close();

    }

}
