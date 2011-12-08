import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BarTest extends UnitTest {

    @Test
    public void integrationTest() {
        Bar bar = new Bar();
        bar.name = "a new bar";
        bar.save();
        assertNotNull(bar.id);
        assertTrue(Bar.findAll().size() >= 1);
        bar.delete();
        assertTrue(Bar.findAll().size() == 0);
    }

}
