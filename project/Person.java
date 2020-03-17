package project;

public class Person {
    String firstName;
    String lastName;
    Long mobile;
    String eMail;
    Person next;

    public Person(String firstName, String lastName, Long mobile, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.eMail = eMail;
        next = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
