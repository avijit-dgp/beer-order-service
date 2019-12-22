package avi.learn.beerorderservice.service;

import avi.learn.beerorderservice.web.model.BeerOrderPagedList;
import avi.learn.beerorderservice.web.model.BeerOrderDto;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface BeerOrderService {
    BeerOrderPagedList listOrders(UUID customerId, Pageable pageable);

    BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto);

    BeerOrderDto getOrderById(UUID customerId, UUID orderId);

    void pickupOrder(UUID customerId, UUID orderId);

}
