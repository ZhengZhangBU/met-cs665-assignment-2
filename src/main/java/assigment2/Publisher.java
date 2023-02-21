/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/16/2023
 * File Name: Publisher.java
 * Description: This file is an interface of Publisher
 */

package assigment2;

public interface Publisher {

    /**
     * Driver subscribe Shop to get the DeliveryRequest
     * @param o
     */
    void subscribe(Driver o);

    /**
     * Driver unsubscribe Shop
     * @param o
     */
    void unsubscribe(Driver o);

    /**
     * notify the DeliveryRequest to Subscribers
     * @param deliveryRequest
     */
    void notifySubscribers(DeliveryRequest deliveryRequest);
}
