/*
 * My Data My Consent - Developer API
 * Unleashing the power of consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@mydatamyconsent.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mydatamyconsent.api;

import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.model.DataProcessingAgreement;
import com.mydatamyconsent.model.Error;
import com.mydatamyconsent.model.PaginatedListOfDataProcessingAgreements;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataProcessingAgreementsApi
 */
@Disabled
public class DataProcessingAgreementsApiTest {

    private final DataProcessingAgreementsApi api = new DataProcessingAgreementsApi();

    /**
     * Get paginated data processing agreements.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1DataAgreementsGetTest() throws ApiException {
        Integer pageNo = null;
        Integer pageSize = null;
        PaginatedListOfDataProcessingAgreements response = api.v1DataAgreementsGet(pageNo, pageSize);
        // TODO: test validations
    }

    /**
     * Delete a data processing agreement this will not delete a published or a agreement in use with consents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1DataAgreementsIdDeleteTest() throws ApiException {
        String id = null;
        Boolean response = api.v1DataAgreementsIdDelete(id);
        // TODO: test validations
    }

    /**
     * Get data processing agreement by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1DataAgreementsIdGetTest() throws ApiException {
        String id = null;
        DataProcessingAgreement response = api.v1DataAgreementsIdGet(id);
        // TODO: test validations
    }

    /**
     * Terminate a data processing agreement by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1DataAgreementsIdTerminatePutTest() throws ApiException {
        String id = null;
        Boolean response = api.v1DataAgreementsIdTerminatePut(id);
        // TODO: test validations
    }

}
