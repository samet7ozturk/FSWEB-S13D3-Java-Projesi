public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String address;
    boolean isWorking;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String gender, String address, boolean isWorking){
        this.gender = gender;
        this.address = address;
        this.isWorking = isWorking;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
