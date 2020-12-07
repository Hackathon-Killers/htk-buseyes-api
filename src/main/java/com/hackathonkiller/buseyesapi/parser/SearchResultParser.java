package com.hackathonkiller.buseyesapi.parser;

import com.hackathonkiller.buseyesapi.dto.SearchResult;
import com.hackathonkiller.buseyesapi.dto.SearchResultOfAPI;
import org.springframework.stereotype.Service;

@Service
public class SearchResultParser {

    public SearchResult parser(SearchResultOfAPI searchResultOfAPI) {
        return SearchResult.builder()
            .startStationName(searchResultOfAPI.startStationName())
            .endStationName(searchResultOfAPI.endStationName())
            .busInfos(searchResultOfAPI.busInfos())
            .build();
    }
}
