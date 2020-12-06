package com.hackathonkiller.buseyesapi.client;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "bus-search-api", url = "")
public interface SearchBusClient {

    @Headers("Content-Type: application/json;charset=utf-8;")
    Object busStationName(

    );

    default Object callBusStationName(){
        return null;
    }
}
