package org.example.Profiles;

import javax.persistence.*;


@Entity
@Table(name = "`users`")
public class JpaUserRepository {

    public JpaUserRepository(){

    }
    public JpaUserRepository(int id,String name, String Email) {
        this.id = id;
        this.name = name;
        this.Email = Email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }


    @Id
    @Column(name = "`ID`")
    private int id;

    @Column(name = "`Name`")
    private String name;

    @Column(name = "`Email`")
    private String Email;

}
