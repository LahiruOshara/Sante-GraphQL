package com.example.searchinterface.controller;

import com.example.searchinterface.dto.Resource;
import com.example.searchinterface.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SearchController {
    private final SearchService searchService;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @QueryMapping
    Iterable<Resource> resource(@Argument String type, @Argument String query, @Argument String context) {
        LOGGER.info("Executing Query-> query: {}, type: {} and context: {}", query, type, context);
        return searchService.fetchResults(type, query, context);
    }

    @QueryMapping
    Iterable<Resource> fetchResource(@Argument String query, @Argument String context) {
        LOGGER.info("Executing Query-> query: {} and context: {}", query, context);
        return searchService.fetchResults(query, context);
    }
}
