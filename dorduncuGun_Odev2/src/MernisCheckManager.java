public class MernisCheckManager implements CustomerCheckService{
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return customer.getNationalityId().length()==11;
    }
}
