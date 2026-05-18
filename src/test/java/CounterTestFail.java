import static org.junit.Assert.*;
import org.junit.Test;

/**
 * CounterTestFail.java
 *
 * File ini digunakan untuk SIMULASI kode GAGAL melalui testing (Video Week 11.5).
 * Test di bawah ini sengaja mengandung assertion yang salah agar
 * pipeline CI/CD menunjukkan status BUILD FAILURE.
 */
public class CounterTestFail {

    /**
     * Test ini SENGAJA GAGAL:
     * Setelah increment(), nilai counter seharusnya 1,
     * tetapi kita assertEquals dengan 99 (nilai yang salah).
     */
    @Test
    public void testIncrementFail() {
        Counter testCounter = new Counter();
        testCounter.increment();

        // Assertion yang SALAH — counter bernilai 1, bukan 99
        assertEquals("Counter seharusnya 1 setelah satu increment", 99, testCounter.getCount());
    }

    /**
     * Test ini SENGAJA GAGAL:
     * Setelah reset(), nilai counter seharusnya 0,
     * tetapi kita assertEquals dengan -1 (nilai yang salah).
     */
    @Test
    public void testResetFail() {
        Counter testCounter = new Counter();
        testCounter.increment();
        testCounter.increment();
        testCounter.reset();

        // Assertion yang SALAH — counter bernilai 0, bukan -1
        assertEquals("Counter seharusnya 0 setelah reset", -1, testCounter.getCount());
    }
}
