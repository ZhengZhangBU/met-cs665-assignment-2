/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/16/2023
 * File Name: Driver.java
 * Description: This file is an object of Subscriber
 */

package assigment2;

public class Driver implements Subscriber {
    private String driverName;

    public Driver(String driverName) {
      this.driverName = driverName;
    }

    /**
     * get the update Delivery Request message
     * @param deliveryRequest
     */
    public void update(DeliveryRequest deliveryRequest) {
        System.out.println("Hi, " + this.driverName);
        System.out.println("New Delivery Request!");
        System.out.println("The Delivery Request ID: " + deliveryRequest.getRequestID());
        System.out.println("The destination is " + deliveryRequest.getDeliveryAddress());
    }

    /**
     * override toString method so that we can print out driver info
     * @return String
     */
    @Override
    public String toString() {
        return "Driver Name: " + this.driverName + "\n";
    }

}
