package org.example.springboottest;

import org.springframework.data.repository.CrudRepository;

// CRUD: CREATE, READ, UPDATE, DELETE
/*
* This repository works with Customer entities and Long IDs.
* It also declares the findCustomerById() method. Spring Data JPA
* will derive a query based on this method's signature, which will
* select the Customer object for the specified ID. You can try
* adding other methods to see how IntelliJ IDEA provides completion suggestions
* based on available JPA entities (in this case, the Customer class).
* */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findCustomerById(Long id);
    Customer findCustomerByFirstName(String firstName);
    Customer findCustomerByLastName(String lastName);
}
