/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/16/2023
 * File Name: DeliveryRequest.java
 * Description: This file is for creating a DeliveryRequest Data Type
 */

package assigment2;

public class DeliveryRequest {
    private String requestID;
    private String deliveryAddress;

    /**
     * constructor for initialing some values in DeliveryRequest
     * @param deliveryAddress
     */
    public DeliveryRequest(String requestID, String deliveryAddress) {
        this.requestID = requestID;
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * to get the delivery address
     * @return String
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * get the DeliveryRequest ID
     * @return int
     */
    public String getRequestID() {
        return requestID;
    }


    /**
     * override toString Method so that we can display delivery request info
     * @return String
     */
    @Override
    public String toString() {
        return "Delivery Request ID:     " + requestID + "\nDelivery Request Address: " + deliveryAddress + "\n-------------------------\n";
    }

}
