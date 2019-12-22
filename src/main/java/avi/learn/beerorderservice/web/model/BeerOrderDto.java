package avi.learn.beerorderservice.web.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class BeerOrderDto extends BaseDto {
    private UUID customerId;
    private List<BeerOrderLineDto> beerOrderLines;
    private OrderStatus orderStatus;
}
