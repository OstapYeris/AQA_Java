package HWPerson;

public class HWPerson {
    private String name;
    private String surname;
    private int age;
    private String profession;

    public String introduce() {
        return String.format("Hello, my name is " + this.name + " " + this.surname + " and I’m " + String.format("%d", this.age) + " years old. My profession is " + this.profession + ".");
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getProfession() {
        return this.profession;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
