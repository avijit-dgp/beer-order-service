package avi.learn.beerorderservice.web.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class BeerOrderLineDto extends BaseDto {
    private UUID beerId;
    private Integer orderQuantity;
}
