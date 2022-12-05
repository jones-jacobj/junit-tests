import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class StudentTest {
    Student s1;

    @Before
    public void init() {
        this.s1 = new Student("Dave",1);
    }

    @Test
    public void hasConstructor(){
        assertNotNull(s1);
    }

    @Test
    public void hasName(){
        assertNotNull(s1.getName());
    }

    @Test
    public void hasID(){
        assertNotNull(s1.getId());
    }

}
