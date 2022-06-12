package com.ua.learning.project.model.entity;


public class RegistrationForm {
    private String firstname;
    private String lastname;
    private String birthday;
    private int age;

    public RegistrationForm(String firstname,String lastname,String birthday,int age)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthday=birthday;
        this.age=age;
    }

    public RegistrationForm(String firstname){
        this.firstname = firstname;
        lastname = "";
        birthday = "";
        age = 0;
    }

    public RegistrationForm(){
        firstname = "Ivan";
        lastname = "Petrov";
        birthday = "25/05/1988";
        age = 25;
    }

    @Override
    public String toString(){
        return String.format("RegistrationForm(firstname = '%s', lastName='%s', birthday='%s', age=%d)", getFirstname(), getLastname(), getBirthday(), getAge());
    }

    @Override
    public int hashCode() {
        if(firstname.length()>3){
            System.out.println("firstName is more than 3 symbols");
            return 0;
        }else{
            return firstname.hashCode();
        }
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String fname){
        this.firstname = fname;
    }

    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lname){
        this.lastname = lname;
    }

    public String getBirthday(){
        return birthday;
    }
    public void setBirthday(String bday){
        this.birthday = bday;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
