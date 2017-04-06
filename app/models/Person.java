package models;


public class Person {
    private String name;
    private String DOB;
    private String address;
    private int age;
    private String gender;
    private String password;

    public Person(String name, String DOB, String address, int age, String gender, String password){
        this.setName(name);
        this.setDOB(DOB);
        this.setAddress(address);
        this.setAge(age);
        this.setGender(gender);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
