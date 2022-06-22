package example;

public class UserReg {


    private String FirstName;
    private String LastName;
    private Integer Age;
    private String Date;
    public UserReg(String firstName, String lastName, Integer age, String date) {

        this.FirstName = firstName;
        this.LastName = lastName;
        this.Age = age;
        this.Date = date;
    }


    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lostName) {
        LastName = lostName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "UserReg{" +
                "Date='" + Date + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LostName='" + LastName + '\'' +
                ", Age=" + Age +
                '}';
    }
}
