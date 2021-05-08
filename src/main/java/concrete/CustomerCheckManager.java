package concrete;

import abstrac.ICustomerCheckService;
import entity.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
