/*
 * My Data My Consent - Developer API
 * Unleashing the power of data consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.
 *
 * The version of the OpenAPI document: v1
 * Contact: support@mydatamyconsent.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mydatamyconsent.api;

import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.model.CreateDataConsentRequest;
import com.mydatamyconsent.model.DataConsentRequest;
import com.mydatamyconsent.model.DataConsentStatus;
import com.mydatamyconsent.model.IndividualDataConsentRequestDetails;
import com.mydatamyconsent.model.IndividualDataConsentRequestDetailsPaginatedList;
import org.threeten.bp.OffsetDateTime;
import com.mydatamyconsent.model.OrganizationDataConsentRequestDetails;
import com.mydatamyconsent.model.OrganizationDataConsentRequestDetailsPaginatedList;
import com.mydatamyconsent.model.ProblemDetails;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataConsentRequestsApi
 */
@Ignore
public class DataConsentRequestsApiTest {

    private final DataConsentRequestsApi api = new DataConsentRequestsApi();

    
    /**
     * Cancel the individual data consent request by Id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelIndividualDataConsentRequestTest() throws ApiException {
        UUID requestId = null;
                api.cancelIndividualDataConsentRequest(requestId);
        // TODO: test validations
    }
    
    /**
     * Cancel the organization data consent request by Id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelOrganizationDataConsentRequestTest() throws ApiException {
        UUID requestId = null;
                api.cancelOrganizationDataConsentRequest(requestId);
        // TODO: test validations
    }
    
    /**
     * Create data consent request for an individual.
     *
     * Create data consent request for an individual.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIndividualDataConsentRequestTest() throws ApiException {
        CreateDataConsentRequest createDataConsentRequest = null;
                IndividualDataConsentRequestDetails response = api.createIndividualDataConsentRequest(createDataConsentRequest);
        // TODO: test validations
    }
    
    /**
     * Create data consent request for an organization.
     *
     * Create data consent request for an organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrganizationDataConsentRequestTest() throws ApiException {
        CreateDataConsentRequest createDataConsentRequest = null;
                OrganizationDataConsentRequestDetails response = api.createOrganizationDataConsentRequest(createDataConsentRequest);
        // TODO: test validations
    }
    
    /**
     * Get all Consent Requests sent to individuals.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConsentRequestsToIndividualsTest() throws ApiException {
        DataConsentStatus status = null;
        OffsetDateTime startDateTime = null;
        OffsetDateTime endDateTime = null;
        Integer pageNo = null;
        Integer pageSize = null;
                IndividualDataConsentRequestDetailsPaginatedList response = api.getAllConsentRequestsToIndividuals(status, startDateTime, endDateTime, pageNo, pageSize);
        // TODO: test validations
    }
    
    /**
     * Get all Consent Requests sent to organizations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConsentRequestsToOrganizationsTest() throws ApiException {
        DataConsentStatus status = null;
        OffsetDateTime startDateTime = null;
        OffsetDateTime endDateTime = null;
        Integer pageNo = null;
        Integer pageSize = null;
                OrganizationDataConsentRequestDetailsPaginatedList response = api.getAllConsentRequestsToOrganizations(status, startDateTime, endDateTime, pageNo, pageSize);
        // TODO: test validations
    }
    
    /**
     * Get individual data consent request by id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndividualConsentRequestByIdTest() throws ApiException {
        UUID requestId = null;
                DataConsentRequest response = api.getIndividualConsentRequestById(requestId);
        // TODO: test validations
    }
    
    /**
     * Get a OrganizationConsent Request by Id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationConsentRequestByIdTest() throws ApiException {
        UUID requestId = null;
                DataConsentRequest response = api.getOrganizationConsentRequestById(requestId);
        // TODO: test validations
    }
    
}
