package concrete;

import abstrac.BaseCustomerManager;
import abstrac.ICustomerCheckService;
import abstrac.ICustomerService;
import entity.Customer;
import exception.PersonNotFound;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService {
    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager() {

    }

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            throw new PersonNotFound("Not a valid person");
        }
    }


    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
