package Pojo_Examples;

import java.util.List;

public class Pojo_Example
{
    private String name;
    private String email;
    private int age;
    private Address address;
    private List<String> interests;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int  getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getInterests() {
        return interests;
    }
    public void setInterests(List<String> interests)
    {
        this.interests = interests;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
}
