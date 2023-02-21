/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/16/2023
 * File Name: Shop.java
 * Description: This file is an object of Publisher
 */

package assigment2;

import java.util.ArrayList;

public class Shop implements Publisher {
    private ArrayList<DeliveryRequest> deliveryRequests;
    private ArrayList<Driver> subscribers;

    public Shop() {
        this.deliveryRequests = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    /**
     * allow subscriber to subscribe
     * @param driver
     */
    public void subscribe(Driver driver) {
        subscribers.add(driver);
    }

    /**
     * all subscriber to unsubscribe
     * @param driver
     */
    public void unsubscribe(Driver driver) {
        subscribers.remove(driver);
    }

    /**
     * Shop notify the DeliveryRequest to subscribers
     * @param deliveryRequest
     */
    public void notifySubscribers(DeliveryRequest deliveryRequest) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(deliveryRequest);
        }
    }

    /**
     * Shop creates a new DeliveryRequest and add it to DeliveryRequests List
     * @param deliveryRequest
     */
    public void addDeliveryRequest(DeliveryRequest deliveryRequest) {
        deliveryRequests.add(deliveryRequest);
        notifySubscribers(deliveryRequest);
    }

    /**
     * Shop can get the all the DeliveryRequest
     * @return
     */
    public ArrayList<DeliveryRequest> getDeliveryRequests() {
        return deliveryRequests;
    }

    /**
     * get all the subscribers
     * @return ArrayList<Driver>
     */
    public ArrayList<Driver> getSubscribers() {
        return subscribers;
    }


}
