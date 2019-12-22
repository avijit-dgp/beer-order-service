package avi.learn.beerorderservice.repository;

import avi.learn.beerorderservice.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
