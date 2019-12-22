package avi.learn.beerorderservice.web.mappers;

import avi.learn.beerorderservice.domain.BeerOrderLine;
import avi.learn.beerorderservice.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerOrderLineMapper {
    BeerOrderLine beerOderLineFromBeerOderLineDto(BeerOrderLineDto beerOrderLineDto);
    BeerOrderLineDto beerOrderLineDtoFromBeerOrderLine(BeerOrderLine beerOrderLine);
}
