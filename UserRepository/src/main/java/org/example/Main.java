package org.example;

import org.example.Profiles.JpaUserRepository;
import org.example.services.JpaService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static String url = "jdbc:postgresql://localhost:5432/UserRepository";
    private static String user = "postgres";
    private static String password = "Shapovalenko0909!";
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) throws SQLException {
       /* try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        JdbcTemplateUserRepository jdbcTemplateUserRepository = new JdbcTemplateUserRepository(connection);

        //User user = new User(5, "Kirill","newKirill@mail.ru");
        jdbcTemplateUserRepository.delete(5);*/
        /*System.out.println(rs.get(0).getId() + " " + rs.get(0).getName());*/

        /*while (rs.next()){
            System.out.println(rs);
        }*/

        JpaService jpaService = new JpaService();
        JpaUserRepository jpaUserRepository = new JpaUserRepository(4,"Nastya", "Nastya@mail.ru");
        jpaService.add(jpaUserRepository);


        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("hashmap");

        context.register(ApplicationConfig.class);
        context.refresh();

        UserRepository userRepository = context.getBean(UserRepository.class);

        User user1 = new User(1L, "Alice", "qwe@mail.ru");
        userRepository.add(user1);

        User user2 = userRepository.getById(1L);
        System.out.println("User id - " + user2.getId().toString());

        user2.setEmail("newQwe@mail.ru");
        userRepository.update(user2);
        System.out.println("new Email - " + userRepository.getAll().getFirst().getEmail());

        userRepository.delete(1L);
        System.out.println(userRepository.getById(1L));

        context.close();*/
    }
}