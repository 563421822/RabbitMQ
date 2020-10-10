package util;

import com.rabbitmq.client.Connection;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;

public class ConnectionUtilsTest {

    @Test
    public void getConnection() throws IOException, TimeoutException {
        Connection connection = ConnectionUtils.getConnection();
        System.out.println("connection = " + connection);
    }
}