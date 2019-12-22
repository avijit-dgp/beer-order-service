package avi.learn.beerorderservice.repository;

import avi.learn.beerorderservice.domain.BeerOrder;
import avi.learn.beerorderservice.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
    Page<BeerOrder> findAllByCustomer(Customer customer, Pageable pageable);
}
