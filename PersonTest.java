import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person testPerson = new Person("000001","Mike","Nelson","Intern",1983);
    @Test
    void getAge()
    {
       int testAge = 40;
       int actualAge=testPerson.getAge(2023);
       assertEquals(testAge,actualAge);
    }
}