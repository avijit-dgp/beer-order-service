package avi.learn.beerorderservice.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Customer extends BaseEntity {
    private String customerName;

    @OneToMany(mappedBy = "customer")
    private Set<BeerOrder> beerOrders;
}
