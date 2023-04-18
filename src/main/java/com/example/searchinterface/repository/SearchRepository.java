package com.example.searchinterface.repository;

import com.example.searchinterface.dto.Resource;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SearchRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchRepository.class);

    SearchRepository() {}

    public List<Resource> fetchResults(String type, String query, String context) {
        // prepare context object
        JsonObject contextObject = prepareContextObject(context);

        if (contextObject.has(type)) {
            LOGGER.info("Type: {}", contextObject.get(type));
        }

        // extract labels from the context
        LOGGER.info("query: {}", query);

        // create map between given context and result

        return getAll();
    }

    private JsonObject  prepareContextObject(String context) {
        Gson gson = new Gson();
        return gson.fromJson(context, JsonObject.class);
    }

    private List<Resource> getAll() {
        List<Resource> resourceList = new ArrayList<>();
        resourceList.add(new Resource("name1", "type1", "url1"));
        resourceList.add(new Resource("name2", "type2", "url2"));
        resourceList.add(new Resource("name3", "type3", "url3"));
        resourceList.add(new Resource("name4", "type4", "url4"));

        return resourceList;
    }
}
