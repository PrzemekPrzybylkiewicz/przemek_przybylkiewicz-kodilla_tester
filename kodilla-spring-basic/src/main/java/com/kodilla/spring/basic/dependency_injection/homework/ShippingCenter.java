package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private DeliveryService deliveryService = new DeliveryService();
    private NotificationService notificationService = new NotificationService() {
        @Override
        public void success(String address) {
        }

        @Override
        public void fail(String address) {
        }
    };

    public ShippingCenter(DeliveryService deliveryService) {
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        }
        notificationService.fail(address);
    }
}
