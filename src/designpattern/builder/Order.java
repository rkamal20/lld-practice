package src.designpattern.builder;

import java.util.List;

public class Order {

    private final String customer;
    private final List<String> items;
    private final String restaurant;

    private final String deliveryAddress;
    private final String deliveryInstructions;
    private final String deliveryBoy;

    private Order(Builder builder) {
        this.customer = builder.customer;
        this.items = List.copyOf(builder.items); // made order immutable by making List immutable
        this.restaurant = builder.restaurant;
        this.deliveryAddress = builder.deliveryAddress;
        this.deliveryInstructions = builder.deliveryInstructions;
        this.deliveryBoy = builder.deliveryBoy;
    }

    public static class Builder {
        private String customer;
        private List<String> items;
        private String restaurant;

        private String deliveryAddress;
        private String deliveryInstructions;
        private String deliveryBoy;

        public Builder customer(String customer) {
            this.customer = customer;
            return this;
        }

        public Builder items(List<String> items) {
            this.items = items;
            return this;
        }

        public Builder restaurant(String restaurant) {
            this.restaurant = restaurant;
            return this;
        }

        public Builder deliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public Builder deliveryInstructions(String deliveryInstructions) {
            this.deliveryInstructions = deliveryInstructions;
            return this;
        }

        public Builder deliveryBoy(String deliveryBoy) {
            this.deliveryBoy = deliveryBoy;
            return this;
        }

        public Order build() {
            if (this.customer == null || this.restaurant == null || this.items == null) {
                throw new IllegalArgumentException();
            }
            return new Order(this);
        }

    }

    @Override
    public String toString() {
        return "Order{" +
                "customer='" + customer + '\'' +
                ", items=" + items +
                ", restraurant='" + restaurant + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryInstructions='" + deliveryInstructions + '\'' +
                ", deliveryBoy='" + deliveryBoy + '\'' +
                '}';
    }

}
