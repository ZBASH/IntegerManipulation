import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestManipulator {

    @org.junit.jupiter.api.Test
    void getInt() {
        String s = "sodfjh234";
        int actual = Integer.valueOf(s.replaceAll("\\D*", ""));
        int expected = 234;
        assertEquals(expected,actual);
    }

    @Test
    void flipInt() {
        Manipulator test = new Manipulator();
        int actual = test.reverseInt(54321);
        assertEquals(12345, actual);
    }

}