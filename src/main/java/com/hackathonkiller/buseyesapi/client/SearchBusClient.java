package com.hackathonkiller.buseyesapi.client;

import com.hackathonkiller.buseyesapi.dto.SearchResultOfAPI;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "bus-search-api", url = "")
@Headers("Content-Type: application/json;charset=utf-8;")
public interface SearchBusClient {

    Object busStationPosition(
        String searchKey,
        String tmX,
        String tmY,
        String radius
    );

    Object busStationName(
        String searchKey,
        String stSrch
    );

    Object busStationOrder(
        String searchKey,
        String arsId
    );

    Object busRoute(
        String searchKey,
        String startX,
        String startY,
        String endX,
        String endY
    );

    Object findBus(
        String searchKey,
        String busRouteId,
        String startOrd,
        String endOrd
    );

    default Object callBusStationPosition(SearchResultOfAPI searchResultOfAPI) {
        return busStationPosition(searchResultOfAPI.searchKey(), searchResultOfAPI.tmX(), searchResultOfAPI.tmY(),
            searchResultOfAPI.radius());
    }

    default Object callBusStationName(SearchResultOfAPI searchResultOfAPI) {
        return busStationName(searchResultOfAPI.searchKey(), searchResultOfAPI.stSrch());
    }

    default Object busStationOrder(SearchResultOfAPI searchResultOfAPI) {
        return busStationOrder(searchResultOfAPI.searchKey(), searchResultOfAPI.arsId());
    }

    default Object callBusRoute(SearchResultOfAPI searchResultOfAPI) {
        return busRoute(searchResultOfAPI.searchKey(), searchResultOfAPI.startX(), searchResultOfAPI.startY(),
            searchResultOfAPI.endX(), searchResultOfAPI.endY());
    }

    default Object callFindBus(SearchResultOfAPI searchResultOfAPI) {
        return findBus(searchResultOfAPI.searchKey(), searchResultOfAPI.busRouteId(), searchResultOfAPI.startOrd(),
            searchResultOfAPI.endOrd());
    }
}
