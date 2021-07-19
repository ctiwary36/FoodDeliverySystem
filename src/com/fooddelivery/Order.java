package com.fooddelivery;

import java.util.*;

public class Order {

    enum PaymentMethod {DEBIT_CARD, NET_BANKING, COD, UPI, CREDIT_CARD, WALLET}

    String deliveryAddress;
    String customerName;
    int totalAmount;
    Date orderTime;
    Map<FoodItem, Integer> map = new HashMap<FoodItem, Integer>();

    @Override
    public String toString() {
        return "Order{" +
                "deliveryAddress='" + deliveryAddress + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalAmount=" + totalAmount +
                ", orderTime=" + orderTime +
                ", map=" + map +
                '}';
    }
}
