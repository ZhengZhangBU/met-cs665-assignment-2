/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/16/2023
 * File Name: TestDeliveryRequest.java
 * Description: This file is for testing DeliveryRequest class
 */

package assignment2;

import assigment2.DeliveryRequest;
import assigment2.Driver;
import assigment2.Shop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeliveryRequest {

    @Test
    public void testCreateDeliveryRequest() {
        // create a DeliveryRequest object
        DeliveryRequest myDeliveryRequest = new DeliveryRequest("123456", "Brighton");

        // check if we can get the ID and address
        assertEquals(myDeliveryRequest.getRequestID(), "123456");
        assertEquals(myDeliveryRequest.getDeliveryAddress(), "Brighton");
    }

    @Test
    public void testShopPublishRequest() {
        //create a new shop
        Shop myShop = new Shop();

        // add two DeliveryRequest
        myShop.addDeliveryRequest(new DeliveryRequest("123456789", "BU"));
        myShop.addDeliveryRequest(new DeliveryRequest("987654321", "CAS"));

        // print out all the delivery Request in myShop
        System.out.println(myShop.getDeliveryRequests());
    }

    @Test
    public void testShopSubscribe() {
        Shop myShop = new Shop();

        // create 5 Driver object
        Driver driver1 = new Driver("Bob");
        Driver driver2 = new Driver("John");
        Driver driver3 = new Driver("Lisa");
        Driver driver4 = new Driver("Lily");
        Driver driver5 = new Driver("Andrew");

        // 5 drivers subscribe to myShop
        myShop.subscribe(driver1);
        myShop.subscribe(driver2);
        myShop.subscribe(driver3);
        myShop.subscribe(driver4);
        myShop.subscribe(driver5);

        // print out all the subscribers of myShop
        System.out.println(myShop.getSubscribers());
    }

    @Test
    public void testUnsubscribe() {
        Shop myShop = new Shop();

        // create 5 Driver object
        Driver driver1 = new Driver("Bob");
        Driver driver2 = new Driver("John");
        Driver driver3 = new Driver("Lisa");
        Driver driver4 = new Driver("Lily");
        Driver driver5 = new Driver("Andrew");

        // 5 drivers subscribe to myShop
        myShop.subscribe(driver1);
        myShop.subscribe(driver2);
        myShop.subscribe(driver3);
        myShop.subscribe(driver4);
        myShop.subscribe(driver5);

        // print out all the subscribers of myShop before someone unsubscribes
        System.out.println("Subscribers before some unsubscribes: " + myShop.getSubscribers());

        // someone unsubscribes
        myShop.unsubscribe(driver2);

        // print out all the subscribers of myShop before someone unsubscribes
        // "John" should not be here
        System.out.println("Subscribers after some unsubscribes: " + myShop.getSubscribers());
    }

    @Test
    public void testNotifyNewRequest() {
        Shop myShop = new Shop();

        // create 5 Driver object
        Driver driver1 = new Driver("Bob");
        Driver driver2 = new Driver("John");
        Driver driver3 = new Driver("Lisa");
        Driver driver4 = new Driver("Lily");
        Driver driver5 = new Driver("Andrew");

        // 5 drivers subscribe to myShop
        myShop.subscribe(driver1);
        myShop.subscribe(driver2);
        myShop.subscribe(driver3);
        myShop.subscribe(driver4);
        myShop.subscribe(driver5);

        //create a new delivery request
        DeliveryRequest newReq = new DeliveryRequest("123456", "Brighton");

        // create a new Delivery Request
        // there are 5 people getting the new delivery request
        myShop.notifySubscribers(newReq);
    }

}
