import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

interface MathOperation {
    int add(int a, int b);
    int subtract(int a, int b);
}

class Calculator {
    private MathOperation mathOperation;

    public Calculator(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int add(int a, int b) {
        return mathOperation.add(a, b);
    }

    public int subtract(int a, int b) {
        return mathOperation.subtract(a, b);
    }
}

public class MockitoExample {
    @Test
    public void testAddition() {
        // Create a mock MathOperation
        MathOperation mathOperation = mock(MathOperation.class);

        // Set up behavior for the add method
        when(mathOperation.add(2, 3)).thenReturn(5);

        // Create a Calculator with the mock MathOperation
        Calculator calculator = new Calculator(mathOperation);

        // Perform the test and check the result
        assertEquals(5, calculator.add(2, 3));

        // Verify that the add method was called with the expected arguments
        verify(mathOperation).add(2, 3);
    }

    @Test
    public void testSubtraction() {
        // Create a mock MathOperation
        MathOperation mathOperation = mock(MathOperation.class);

        // Set up behavior for the subtract method
        when(mathOperation.subtract(5, 2)).thenReturn(3);

        // Create a Calculator with the mock MathOperation
        Calculator calculator = new Calculator(mathOperation);

        // Perform the test and check the result
        assertEquals(3, calculator.subtract(5, 2));

        // Verify that the subtract method was called with the expected arguments
        verify(mathOperation).subtract(5, 2);
    }
}