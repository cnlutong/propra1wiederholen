package displayname;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Ein Stack mit den Elementen 1,2 und 3 ")
public class StackTest {

    private Stack<String> stack;


    @BeforeEach
    void setup() {
        stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
    }

    @DisplayName("sollte ein viertes Element speichern können")
    @Test
    void test_add_single_element() {
        stack.push("4");
        assertThat(stack).hasSize(4);
    }

    @DisplayName("sollte 3 zurückgeben, wenn pop aufgerufen wird und danach nur noch zwei Elemente haben")
    @Test
    void test_pop() {
        String top = stack.pop();
        assertThat(top).isEqualTo("3");
        assertThat(stack).hasSize(2);
    }


}
