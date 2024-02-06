import java.util.Objects;

public class Person {
    private String id;
    private String firstName;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    private String lastName;
    private String title;
    private int YOB;
    public Person(String id, String firstName, String lastName, String title, int YOB) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }
    public String toCSVDataRecord() {return id+", "+firstName+", "+lastName+", "+title+", "+YOB;}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }
    public String getFormalName(){return this.getTitle() + " " + this.getFullName(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(title, person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, title, YOB);
    }

    public int getAge (int year){
        int timeElapsedAge=year-YOB;
        return timeElapsedAge;
    }
}

