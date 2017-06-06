package it.millsoft.ms.users.dto;

import java.io.Serializable;

/**
 * Created by a.benvenuto on 23/03/2017.
 */
public class User implements Serializable
{

    private static final long serialVersionUID = -39105790715510729L;

    private Integer id;
    private String name;
    private String surname;
    private String taxCode;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", taxCode='" + taxCode + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
