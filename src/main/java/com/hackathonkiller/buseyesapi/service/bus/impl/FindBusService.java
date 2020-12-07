package com.hackathonkiller.buseyesapi.service.bus.impl;

import com.hackathonkiller.buseyesapi.dto.SearchResultOfAPI;
import com.hackathonkiller.buseyesapi.service.bus.BusService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(value = 4)
public class FindBusService implements BusService {

    @Override
    public void callApi(SearchResultOfAPI searchResultOfAPI) {

    }
}
