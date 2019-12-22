package avi.learn.beerorderservice.domain;

import avi.learn.beerorderservice.web.model.OrderStatus;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class BeerOrder extends BaseEntity{

    @OneToMany(mappedBy = "beerOrder")
    private Set<BeerOrderLine> beerOrderLines;

    @ManyToOne
    private Customer customer;

    private OrderStatus orderStatus;
}
