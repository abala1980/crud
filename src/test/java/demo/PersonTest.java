package demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
public class PersonTest {

    private Person person = new Person();

    @Before
    public void setUp() throws Exception {
        person.setFirstName("John");
        person.setLastName("Doe");
    }

    @Test
    public void getFirstName() throws Exception {
        assertThat(this.person.getFirstName()).contains("John");
    }

    @Test
    public void getLastName() throws Exception {
        assertThat(this.person.getLastName()).contains("Doe");
    }
}