package com.hackathonkiller.buseyesapi.controller;

import com.hackathonkiller.buseyesapi.dto.SearchResultOfResponse;
import com.hackathonkiller.buseyesapi.vo.SearchParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    @GetMapping("/void")
    public ResponseEntity<SearchResultOfResponse> search(SearchParam searchParam){

        return null;
    }
}
