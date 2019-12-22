package avi.learn.beerorderservice.web.mappers;

import avi.learn.beerorderservice.domain.BeerOrder;
import avi.learn.beerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {
    BeerOrder beerOrderFromBeerOrderDto(BeerOrderDto beerOrderDto);
    BeerOrderDto beerOrderDtoFromBeerOrder(BeerOrder beerOrder);
}
