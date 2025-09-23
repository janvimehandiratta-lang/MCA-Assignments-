public class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends Order {
    int trackingNumber;

    ShippedOrder(int trackingNumber, String orderId, String orderDate) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String deliveryDate, int trackingNumber, String orderId, String orderDate) {
        super(trackingNumber, orderId, orderDate);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Delivery date : " + deliveryDate);
        System.out.println("Tracking Number : " + trackingNumber);
        System.out.println("Order ID : " + orderId);
        System.out.println("Order Date : " + orderDate);
    }
}

class main2 {
    public static void main(String[] args) {
        DeliveredOrder d1 = new DeliveredOrder("10 August", 123450, "ABC", "15 August");
        d1.getOrderStatus();

    }
}