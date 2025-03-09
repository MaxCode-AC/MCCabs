package com.megacity.cab.repository;



import com.megacity.cab.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    // NIC is the primary key (String type)
}
