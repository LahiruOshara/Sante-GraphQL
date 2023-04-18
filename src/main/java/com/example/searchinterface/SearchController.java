package com.example.searchinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SearchController {
    private final SearchRepository searchRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);

    public SearchController(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @QueryMapping
    Iterable<Resource> resource(@Argument String type, @Argument String query, @Argument String context) {
        LOGGER.info("Executing Query-> query: {}, type: {} and context: {}", query, type, context);
        return searchRepository.fetchResults(type, query, context);
    }
}
