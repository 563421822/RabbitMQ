package util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;

public class ConnectionUtils {
    public static Connection getConnection()  {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.206.128");
        factory.setPort(5672);
        factory.setUsername("wyl");
        factory.setPassword("123");
        factory.setVirtualHost("/test");
//       创建Connection
        Connection conn = null;

        try {
            conn = factory.newConnection();
        } catch (IOException | TimeoutException e) {
            System.out.println("e.getCause() = " + e.getCause());
            System.out.println("e.getStackTrace() = " + Arrays.toString(e.getStackTrace()));
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }

        return conn;
    }

}
