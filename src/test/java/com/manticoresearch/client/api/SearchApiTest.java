/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 3.3.0
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.manticoresearch.client.api;

import com.manticoresearch.client.*;
import com.manticoresearch.client.auth.*;
import com.manticoresearch.client.model.ErrorResponse;
import com.manticoresearch.client.model.PercolateRequest;
import com.manticoresearch.client.model.SearchRequest;
import com.manticoresearch.client.model.SearchResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    /**
     * Perform reverse search on a percolate index
     *
     * Performs a percolate search.  This method must be used only on percolate indexes.  Expects two parameters: the index name and an object with array of documents to be tested. An example of the documents object:    &#x60;&#x60;&#x60;   {     \&quot;query\&quot;:     {       \&quot;percolate\&quot;:       {         \&quot;document\&quot;:         {           \&quot;content\&quot;:\&quot;sample content\&quot;         }       }     }   }   &#x60;&#x60;&#x60;  Responds with an object with matched stored queries:     &#x60;&#x60;&#x60;   {     &#39;timed_out&#39;:false,     &#39;hits&#39;:     {       &#39;total&#39;:2,       &#39;max_score&#39;:1,       &#39;hits&#39;:       [         {           &#39;_index&#39;:&#39;idx_pq_1&#39;,           &#39;_type&#39;:&#39;doc&#39;,           &#39;_id&#39;:&#39;2&#39;,           &#39;_score&#39;:&#39;1&#39;,           &#39;_source&#39;:           {             &#39;query&#39;:             {               &#39;match&#39;:{&#39;title&#39;:&#39;some&#39;}             }           }         },         {           &#39;_index&#39;:&#39;idx_pq_1&#39;,           &#39;_type&#39;:&#39;doc&#39;,           &#39;_id&#39;:&#39;5&#39;,           &#39;_score&#39;:&#39;1&#39;,           &#39;_source&#39;:           {             &#39;query&#39;:             {               &#39;ql&#39;:&#39;some | none&#39;             }           }         }       ]     }   }   &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void percolateTest() throws ApiException {
        //String index = null;
        //PercolateRequest percolateRequest = null;
        //SearchResponse response = api.percolate(index, percolateRequest);
        // TODO: test validations
    }

    /**
     * Performs a search on an index
     *
     *  The method expects an object with the following mandatory properties: * the name of the index to search * the match query object Here is an example search request:    &#x60;&#x60;&#x60;   {     &#39;index&#39;:&#39;movies&#39;,     &#39;query&#39;:     {       &#39;bool&#39;:       {         &#39;must&#39;:[{&#39;query_string&#39;:&#39; movie&#39;}]       }     },     &#39;script_fields&#39;:     {       &#39;myexpr&#39;:       {         &#39;script&#39;:{&#39;inline&#39;:&#39;IF(rating&gt;8,1,0)&#39;       }     },     &#39;sort&#39;:     [       {&#39;myexpr&#39;:&#39;desc&#39;},       {&#39;_score&#39;:&#39;desc&#39;}     ],     &#39;profile&#39;:true   }   &#x60;&#x60;&#x60;  Alternatively, you can use auxiliary objects to build your search query. For details, see the documentation on [**SearchRequest**](SearchRequest.md)  The method returns an object with the following properties: - took: the time taken to execute the search query. - timed_out: a boolean indicating whether the query timed out. - hits: an object with the following properties:    - total: the total number of hits found.    - hits: an array of hit objects, where each hit object represents a matched document. Each hit object has the following properties:      - _id: the ID of the matched document.      - _score: the score of the matched document.      - _source: the source data of the matched document.  In addition, if profiling is enabled, the response will include an additional array with profiling information attached. Here is an example search response:    &#x60;&#x60;&#x60;   {     &#39;took&#39;:10,     &#39;timed_out&#39;:false,     &#39;hits&#39;:     {       &#39;total&#39;:2,       &#39;hits&#39;:       [         {&#39;_id&#39;:&#39;1&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:11}},         {&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:12}}       ]     }   }   &#x60;&#x60;&#x60;  For more information about the match query syntax and additional parameters that can be added to request and response, please see the documentation [here](https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP-JSON). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        //SearchRequest searchRequest = null;
        //SearchResponse response = api.search(searchRequest);
        // TODO: test validations
    }

}
