package com.example.searchinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
public class SearchController {
    private final SearchRepository searchRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);

    public SearchController(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @QueryMapping
    Iterable<Resource> resource(@Argument String type, @Argument String query) {
        return searchRepository.getAll();
    }

//    @QueryMapping
//    Iterable<Resource> resource(@RequestBody Map<String, Object> body) {
//        Map<String, Object> context = (Map<String, Object>) body.get("context");
//        Map<String, Object> query = (Map<String, Object>) body.get("query");
//
//        LOGGER.info("context: {}", context);
//        LOGGER.info("query: {}", query);
//
//        return searchRepository.getAll();
//    }


}
