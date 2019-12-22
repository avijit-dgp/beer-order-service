package avi.learn.beerorderservice.domain;

import lombok.Data;
import org.springframework.core.BridgeMethodResolver;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Data
public class BeerOrderLine extends BaseEntity {

    @ManyToOne
    private BeerOrder beerOrder;

    private UUID beerId;
    private Integer orderQuantity = 0;
    private Integer quantityAllocated = 0;
}
