import java.util.Queue;

public class Consumer {
    private Queue<String> queue;

    public Consumer(Queue<String> queue) {
        this.queue = queue;
    }

    public String consume() {
        String name = queue.poll();
        return name != null ? "Hello " + name : "";
    }
}
