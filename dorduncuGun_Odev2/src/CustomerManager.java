public abstract class CustomerManager implements CustomerService {
    public void save(Customer customer) {
        System.out.println("Saved to database " + customer.getFirstName());
    }
}
