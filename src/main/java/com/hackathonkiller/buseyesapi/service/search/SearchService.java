package com.hackathonkiller.buseyesapi.service.search;

import com.hackathonkiller.buseyesapi.dto.SearchResult;
import com.hackathonkiller.buseyesapi.dto.SearchResultOfAPI;
import com.hackathonkiller.buseyesapi.parser.SearchResultParser;
import com.hackathonkiller.buseyesapi.service.bus.BusService;
import com.hackathonkiller.buseyesapi.vo.SearchParam;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchService {

    private final List<BusService> busServiceList;
    private final SearchResultParser searchResultParser;

    public SearchResult search(SearchParam searchParam) {

        SearchResultOfAPI searchResultOfAPI = SearchResultOfAPI.Instance();
        searchResultOfAPI.searchParam(searchParam);
        busServiceList
            .forEach(service -> service.callApi(searchResultOfAPI));

        return searchResultParser.parser(searchResultOfAPI);
    }
}
