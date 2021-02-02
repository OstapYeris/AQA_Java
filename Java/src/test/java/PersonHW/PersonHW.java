package PersonHW;

import HWPerson.HWPerson;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PersonHW {
    HWPerson person;

    @BeforeClass
    public void setup() {
        person = new HWPerson();
    }

    @Test
    public void testIntroduce() {
        person.setName("Ostap");
        person.setSurname("Yerys");
        person.setAge(28);
        person.setProfession("QA Engineer");

        String expected = "Hello, my name is Ostap Yerys and I’m 28 years old. My profession is QA Engineer.";
        String actual = person.introduce();
        Assert.assertEquals(expected, actual);
    }
}
