package com.hackathonkiller.buseyesapi.controller;

import com.hackathonkiller.buseyesapi.dto.SearchResult;
import com.hackathonkiller.buseyesapi.service.search.SearchService;
import com.hackathonkiller.buseyesapi.vo.SearchParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @GetMapping("/voice")
    public ResponseEntity<SearchResult> search(SearchParam searchParam) {

        return ResponseEntity.ok(searchService.search(searchParam));
    }
}
