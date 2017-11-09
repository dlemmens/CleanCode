package be.cegeka.cleancode.application;

import be.cegeka.cleancode.Domain.Customers.Customer;
import be.cegeka.cleancode.Domain.Customers.CustomerService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RestController
@RequestMapping(path = "/customer")
@Transactional
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @PostMapping
    public void addCustomer(@RequestParam (value = "name", required = true)String name) {
        customerService.addCustomer(name);
    }
    @GetMapping(path = "/byId")
    public Customer getCustomerById(@RequestParam(value = "ID") int id){
       return customerService.getCustomerById(id);
    }
    @PostMapping(path = "/addLoyaltyCard")
    public void addLoyaltyCardToCustomer(@RequestParam(value = "customerid", required = true) int customerId,
                                          @RequestParam(value = "loyaltycardid",required = true) int loyaltyCardId){
        customerService.addLoyaltyCardToCustomer(customerId, loyaltyCardId);
    }
}
