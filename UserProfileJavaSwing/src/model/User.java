/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;

/**
 *
 * @author demi
 */
public class User {

// Attribute
private String firstname;
private String lastname;
private String gender;
private int age;
private String phone;
private String email;
private String continent;
private String hobbies;
private File photo;

// Constructor
    public User(String firstname, String lastname, String gender, int age, 
            String phone, String email, String continent, String hobbies, File photo) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.continent = continent;
        this.hobbies = hobbies;
        this.photo = photo;
    }

// Getters & Setters
    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getContinent() {return continent;}
    public void setContinent(String continent) {this.continent = continent;}

    public String getHobbies() {return hobbies;}
    public void setHobbies(String hobbies) {this.hobbies = hobbies;}

    public File getPhoto() {return photo;}
    public void setPhoto(File photo) {this.photo = photo;}
    
    // to String method
@Override
public String toString() {
    return """
            User Profile
            ---------------------
            Name: %s %s
            Gender: %s
            Age: %d
            Phone: %s
            Email: %s
            Continent: %s
            Hobbies: %s
            """.formatted(
                    firstname, lastname, gender, age, phone, email, continent, hobbies
            );
           
}
    
}

