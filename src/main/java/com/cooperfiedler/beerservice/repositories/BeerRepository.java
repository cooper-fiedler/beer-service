package com.cooperfiedler.beerservice.repositories;

import com.cooperfiedler.beerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {


}
