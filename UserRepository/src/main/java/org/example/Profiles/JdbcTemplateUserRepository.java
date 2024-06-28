package org.example.Profiles;

import org.example.User;
import org.example.UserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplateUserRepository implements UserRepository {

    private  Connection connection;
    private ResultSet rs;

    public JdbcTemplateUserRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User getById(int id) {
        User user = null;
        String query = "select * from users u where u.\"ID\" = ?";

        try{
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            rs = statement.executeQuery();

            if (rs.next()) {
                user = new User
                        (rs.getInt("ID"),
                         rs.getString("Name"),
                         rs.getString("Email")
                        );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        String query = "select * from users";

        try {
            PreparedStatement statement = connection.prepareStatement(query);

            rs = statement.executeQuery();

           while (rs.next()){
               User user = new User
                       (rs.getInt("ID"),
                        rs.getString("Name"),
                        rs.getString("Email")
                       );
               users.add(user);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public void add(User user) {
        String query = "insert into users (\"ID\", \"Name\", \"Email\") values (?, ?, ?)";
        try{
            PreparedStatement statement1 = connection.prepareStatement(query);

            statement1.setInt(1, user.getId());
            statement1.setString(2, user.getName());
            statement1.setString(3, user.getEmail());
            statement1.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(User user) {
        String query = "update users set \"Name\" = ?, \"Email\" = ? where \"ID\" = ?";
        try{
            PreparedStatement statement1 = connection.prepareStatement(query);

            statement1.setString(1, user.getEmail());
            statement1.setString(2, user.getEmail());
            statement1.setInt(3, user.getId());
            statement1.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "delete from users where \"ID\" = ?";
        try {
            PreparedStatement statement1 = connection.prepareStatement(query);

            statement1.setInt(1, id);
            statement1.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
