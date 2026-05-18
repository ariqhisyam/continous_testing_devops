import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ShouterTest {

    private Shouter shouter;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        shouter = new Shouter();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testShoutConvertsToUpperCase() {
        shouter.shout("hello world");
        String output = outputStream.toString().trim();
        assertEquals("HELLO WORLD!!!", output);
    }

    @Test
    public void testShoutAppendsExclamation() {
        shouter.shout("java");
        String output = outputStream.toString().trim();
        assertTrue("Output harus diakhiri dengan !!!", output.endsWith("!!!"));
    }

    @Test
    public void testShoutWithAlreadyUpperCase() {
        shouter.shout("MAVEN");
        String output = outputStream.toString().trim();
        assertEquals("MAVEN!!!", output);
    }

    @Test
    public void testShoutWithMixedCase() {
        shouter.shout("GitHub Actions");
        String output = outputStream.toString().trim();
        assertEquals("GITHUB ACTIONS!!!", output);
    }

}
