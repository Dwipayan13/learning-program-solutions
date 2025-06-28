package mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.util.List;

public class MockingTest {
    @Test
    void testMockList() {
        @SuppressWarnings("unchecked")
		List<String> mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("Mocked Value");

        System.out.println(mockList.get(0)); // Output: Mocked Value
    }
}
