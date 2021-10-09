package be.intecbrussel;

import be.intecbrussel.model.Car;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EntityTest {
    @Test
    void testDBConnection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
    }

    @Test
    void testDBSaveEntity(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        Car car = new Car();
        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();
    }

    @Test
    void jdbcTest() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:");

    }
}
