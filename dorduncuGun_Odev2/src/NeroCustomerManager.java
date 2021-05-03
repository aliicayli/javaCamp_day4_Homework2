public class NeroCustomerManager  extends BaseCustomerManager{
    @Override
    public void save(Customer customer) {
    System.out.println(customer.getFirstName()+" was saved in the database for Nero");
    }
}
