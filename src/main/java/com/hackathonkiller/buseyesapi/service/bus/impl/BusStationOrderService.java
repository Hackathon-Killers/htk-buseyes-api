package com.hackathonkiller.buseyesapi.service.bus.impl;

import com.hackathonkiller.buseyesapi.dto.SearchResultOfAPI;
import com.hackathonkiller.buseyesapi.service.bus.BusService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(value = 2)
public class BusStationOrderService implements BusService {

    @Override
    public void callApi(SearchResultOfAPI searchResultOfAPI) {

    }
}
