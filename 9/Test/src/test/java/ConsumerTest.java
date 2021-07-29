import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ConsumerTest {

    @Test
    public void singleValueInQueue() {

        FakeQueue fk = mock(FakeQueue.class);
        Consumer consumer = new Consumer(fk);
        when(fk.poll()).thenReturn("world");
        assertThat(consumer.consume()).isEqualTo("Hello world");
    }

}