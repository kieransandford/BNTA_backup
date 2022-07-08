package _2_test_with_junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Service2Test {

    @Test
    @DisplayName("When calling hello(\"lucas\") on a Service2 object we should get \"Hello, lucas!\"")
    void helloTest() {
        // given an object of type Service2
        Service2 service = new Service2();
        String expectedValue = "Hello, lucas!";
        // when hello is called with "lucas"
        String actualValue = service.hello("lucas");
        //then it should return "Hello, lucas!"
        assertEquals(expectedValue, actualValue);

        // fail();
    }
}