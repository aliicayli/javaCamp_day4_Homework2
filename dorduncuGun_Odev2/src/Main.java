public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Engin", "Demiroğ", "1985.1.6", "12345678901");
        Customer customer2 = new Customer(2, "Ali", "Çaylı", "2001.3.20", "12345678902");

        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        baseCustomerManager.save(customer1);
        baseCustomerManager.save(customer2);

        System.out.println("***************************");


        CustomerManager starbucksCustomer1 = new StarbucksCustomerManager(new CustomerCheckManager());
        CustomerManager starbucksCustomer2 = new StarbucksCustomerManager(new CustomerCheckManager());


        starbucksCustomer1.save(customer1);
        starbucksCustomer2.save(customer2);


    }
}
