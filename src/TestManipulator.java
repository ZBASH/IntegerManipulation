import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestManipulator {
    @Test
    void flipInt() {
        Manipulator test = new Manipulator();
        int actual = test.reverseInt(54321);
        assertEquals(12345, actual);
    }
}