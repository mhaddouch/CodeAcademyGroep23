package Domain;

public class Student {
private String emailAddress;
private String name;
private String birthPlace;
private String gender;
private Address address;

public String getEmailAddress() {
    return emailAddress;
}
public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getBirthPlace() {
    return birthPlace;
}
public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public Address getAddress() {
    return address;
}
public void setAddress(Address address) {
    this.address = address;
}
}
