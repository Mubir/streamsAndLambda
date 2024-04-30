package oops.mubir.defaultfuninterface;



public class JustTest {
    private StringConsumer consumer;

    public JustTest(StringConsumer consumer) {
        this.consumer = consumer;
    }

    public void process(String input) {
        // Process the input and then pass it to the consumer
        String processed = input.toUpperCase();
        consumer.consume(processed);
    }
}
