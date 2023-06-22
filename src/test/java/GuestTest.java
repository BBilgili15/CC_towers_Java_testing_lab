import com.codeclan.example.Guest;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Angel Gonzalez");
    }

    @Test
    public void hasName() {
        assertEquals("Angel Gonzalez", guest.getName());
    }
}
