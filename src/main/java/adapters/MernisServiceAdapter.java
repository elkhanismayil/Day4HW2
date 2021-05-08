package adapters;

import abstrac.ICustomerCheckService;
import entity.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
