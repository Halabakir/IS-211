package supermarket;

import eventsim.Event;

    public class PickProductEvent extends Event {
    Customer customer;


    public PickProductEvent(Customer customer) {
    super(customer.numProducts);
    this.customer = customer;
    }
    @Override
    public Event happen() { return new QueForTillEvent(customer);}




}


