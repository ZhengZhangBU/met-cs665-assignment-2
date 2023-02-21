/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/16/2023
 * File Name: Subscriber.java
 * Description: This file is an interface of Subscriber
 */

package assigment2;

public interface Subscriber {

    /**
     * to update the delivery message
     * @param deliveryRequest
     */
    void update(DeliveryRequest deliveryRequest);
}
