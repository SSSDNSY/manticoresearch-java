/*
 * Manticore Search Client
 * Please note that this client is experimental. For full documentation of the API methods consult https://manual.manticoresearch.com/. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package org.manticoresearch.api;

import org.manticoresearch.ApiCallback;
import org.manticoresearch.ApiClient;
import org.manticoresearch.ApiException;
import org.manticoresearch.ApiResponse;
import org.manticoresearch.Configuration;
import org.manticoresearch.Pair;
import org.manticoresearch.ProgressRequestBody;
import org.manticoresearch.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.manticoresearch.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilsApi {
    private ApiClient localVarApiClient;

    public UtilsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UtilsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for sql
     * @param body Expects is a query parameters string that can be in two modes:    * Select only query as &#x60;query&#x3D;SELECT * FROM myindex&#x60;. The query string MUST be URL encoded    * any type of query in format &#x60;mode&#x3D;raw&amp;query&#x3D;SHOW TABLES&#x60;. The string must be as is (no URL encoding) and &#x60;mode&#x60; must be first.  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> In case of SELECT-only in mode none the response schema is the same as of &#x60;search&#x60;. In case of &#x60;mode&#x3D;raw&#x60; the response depends on the query executed.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/httpapi_reference.html#sql-api">Perform SQL requests Documentation</a>
     */
    public okhttp3.Call sqlCall(String body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/sql";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "text/plain"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sqlValidateBeforeCall(String body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling sql(Async)");
        }
        

        okhttp3.Call localVarCall = sqlCall(body, _callback);
        return localVarCall;

    }

    /**
     * Perform SQL requests
     * Run a query in SQL format. Expects is a query parameters string that can be in two modes: * Select only query as &#x60;query&#x3D;SELECT * FROM myindex&#x60;. The query string MUST be URL encoded * any type of query in format &#x60;mode&#x3D;raw&amp;query&#x3D;SHOW TABLES&#x60;. The string must be as is (no URL encoding) and &#x60;mode&#x60; must be first. The response object depends on the query executed. In select mode the response has same format as &#x60;/search&#x60; operation. 
     * @param body Expects is a query parameters string that can be in two modes:    * Select only query as &#x60;query&#x3D;SELECT * FROM myindex&#x60;. The query string MUST be URL encoded    * any type of query in format &#x60;mode&#x3D;raw&amp;query&#x3D;SHOW TABLES&#x60;. The string must be as is (no URL encoding) and &#x60;mode&#x60; must be first.  (required)
     * @return Map&lt;String, Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> In case of SELECT-only in mode none the response schema is the same as of &#x60;search&#x60;. In case of &#x60;mode&#x3D;raw&#x60; the response depends on the query executed.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/httpapi_reference.html#sql-api">Perform SQL requests Documentation</a>
     */
    public Map<String, Object> sql(String body) throws ApiException {
        ApiResponse<Map<String, Object>> localVarResp = sqlWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Perform SQL requests
     * Run a query in SQL format. Expects is a query parameters string that can be in two modes: * Select only query as &#x60;query&#x3D;SELECT * FROM myindex&#x60;. The query string MUST be URL encoded * any type of query in format &#x60;mode&#x3D;raw&amp;query&#x3D;SHOW TABLES&#x60;. The string must be as is (no URL encoding) and &#x60;mode&#x60; must be first. The response object depends on the query executed. In select mode the response has same format as &#x60;/search&#x60; operation. 
     * @param body Expects is a query parameters string that can be in two modes:    * Select only query as &#x60;query&#x3D;SELECT * FROM myindex&#x60;. The query string MUST be URL encoded    * any type of query in format &#x60;mode&#x3D;raw&amp;query&#x3D;SHOW TABLES&#x60;. The string must be as is (no URL encoding) and &#x60;mode&#x60; must be first.  (required)
     * @return ApiResponse&lt;Map&lt;String, Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> In case of SELECT-only in mode none the response schema is the same as of &#x60;search&#x60;. In case of &#x60;mode&#x3D;raw&#x60; the response depends on the query executed.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/httpapi_reference.html#sql-api">Perform SQL requests Documentation</a>
     */
    public ApiResponse<Map<String, Object>> sqlWithHttpInfo(String body) throws ApiException {
        okhttp3.Call localVarCall = sqlValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Perform SQL requests (asynchronously)
     * Run a query in SQL format. Expects is a query parameters string that can be in two modes: * Select only query as &#x60;query&#x3D;SELECT * FROM myindex&#x60;. The query string MUST be URL encoded * any type of query in format &#x60;mode&#x3D;raw&amp;query&#x3D;SHOW TABLES&#x60;. The string must be as is (no URL encoding) and &#x60;mode&#x60; must be first. The response object depends on the query executed. In select mode the response has same format as &#x60;/search&#x60; operation. 
     * @param body Expects is a query parameters string that can be in two modes:    * Select only query as &#x60;query&#x3D;SELECT * FROM myindex&#x60;. The query string MUST be URL encoded    * any type of query in format &#x60;mode&#x3D;raw&amp;query&#x3D;SHOW TABLES&#x60;. The string must be as is (no URL encoding) and &#x60;mode&#x60; must be first.  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> In case of SELECT-only in mode none the response schema is the same as of &#x60;search&#x60;. In case of &#x60;mode&#x3D;raw&#x60; the response depends on the query executed.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/httpapi_reference.html#sql-api">Perform SQL requests Documentation</a>
     */
    public okhttp3.Call sqlAsync(String body, final ApiCallback<Map<String, Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = sqlValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
