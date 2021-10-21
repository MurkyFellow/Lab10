
package com.mycompany.lab10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 000728303
 */
public class EvaluationTest {
    
    
    @Test
    public void test1() {
        Evaluation ev = new Evaluation("1 2 3 + *");
        double result = ev.Solve();
        assertEquals(9.0, result, 0.01);
    }
    
    @Test
    public void test2() {
        Evaluation ev = new Evaluation("5 8 4 7 / + *");
        double result = ev.Solve();
        assertEquals(32.37, result, 0.01);
    }
    
    @Test
    public void test3() {
        Evaluation ev = new Evaluation("3 10 11 75 + - -");
        double result = ev.Solve();
        assertEquals(-73.0, result, 0.01);
    }
    
    @Test
    public void test4() {
        Evaluation ev = new Evaluation("5 7 6 41 2 + * - /");
        double result = ev.Solve();
        assertEquals(15.5, result, 0.01);
    }
    
    @Test
    public void test5() {
        Evaluation ev = new Evaluation("1 2 3 + @");
        StackException e = assertThrows(StackException.class, () -> ev.Solve());
        assertEquals("This is not a valid input!", e.getMessage());
    }
}
