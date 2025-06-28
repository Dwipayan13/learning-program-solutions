package mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.util.List;

public class VerifyTest {

    @Test
    void testVerifyInteraction() {
        // Mocking a List
        @SuppressWarnings("unchecked")
		List<String> mockList = mock(List.class);

        // Using the mock
        mockList.add("Java");
        mockList.clear();

        // Verifying that 'add' and 'clear' were called
        verify(mockList).add("Java");
        verify(mockList).clear();
    }
}
