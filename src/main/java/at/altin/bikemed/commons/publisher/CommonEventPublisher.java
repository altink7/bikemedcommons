package at.altin.bikemed.commons.publisher;

/**
 * CommonEventPublisher
 * This interface is used to define the common event publisher.
 */
public interface CommonEventPublisher {

    /**
     * This method is used to publish the event.
     * @param jsonEvent the event to be published
     */
    void publish(String jsonEvent);
}
