package abstrac;

import entity.Customer;

public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
