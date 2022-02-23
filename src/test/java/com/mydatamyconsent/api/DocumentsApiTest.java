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
import com.mydatamyconsent.model.DocumentIssueRequest;
import com.mydatamyconsent.model.DocumentIssueRequestDetails;
import com.mydatamyconsent.model.DocumentTypePaginatedList;
import java.io.File;
import com.mydatamyconsent.model.IssuedDocument;
import com.mydatamyconsent.model.IssuedDocumentPaginatedList;
import org.threeten.bp.OffsetDateTime;
import com.mydatamyconsent.model.ProblemDetails;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentsApi
 */
@Ignore
public class DocumentsApiTest {

    private final DocumentsApi api = new DocumentsApi();

    
    /**
     * Get issued document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssuedDocumentByIdTest() throws ApiException {
        UUID documentId = null;
                IssuedDocument response = api.getIssuedDocumentById(documentId);
        // TODO: test validations
    }
    
    /**
     * Get paginated list of issued documents of given document type.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssuedDocumentsTest() throws ApiException {
        UUID documentTypeId = null;
        OffsetDateTime fromDateTime = null;
        OffsetDateTime toDateTime = null;
        Integer pageNo = null;
        Integer pageSize = null;
                IssuedDocumentPaginatedList response = api.getIssuedDocuments(documentTypeId, fromDateTime, toDateTime, pageNo, pageSize);
        // TODO: test validations
    }
    
    /**
     * Get registered document types.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRegisteredDocumentTypesTest() throws ApiException {
        Integer pageNo = null;
        Integer pageSize = null;
                DocumentTypePaginatedList response = api.getRegisteredDocumentTypes(pageNo, pageSize);
        // TODO: test validations
    }
    
    /**
     * Issue a new document to an individual user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDocumentToIndividualTest() throws ApiException {
        DocumentIssueRequest documentIssueRequest = null;
                DocumentIssueRequestDetails response = api.issueDocumentToIndividual(documentIssueRequest);
        // TODO: test validations
    }
    
    /**
     * Issue a new document to an organization.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDocumentToOrganizationTest() throws ApiException {
        DocumentIssueRequest documentIssueRequest = null;
                DocumentIssueRequestDetails response = api.issueDocumentToOrganization(documentIssueRequest);
        // TODO: test validations
    }
    
    /**
     * Upload a document for issuance request of individual.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadDocumentForIndividualTest() throws ApiException {
        UUID issueRequestId = null;
        File formFile = null;
                String response = api.uploadDocumentForIndividual(issueRequestId, formFile);
        // TODO: test validations
    }
    
    /**
     * Upload a document for issuance request of organization.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadDocumentForOrganizationTest() throws ApiException {
        UUID issueRequestId = null;
        File formFile = null;
                String response = api.uploadDocumentForOrganization(issueRequestId, formFile);
        // TODO: test validations
    }
    
}
