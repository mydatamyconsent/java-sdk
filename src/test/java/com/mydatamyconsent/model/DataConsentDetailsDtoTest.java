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


package com.mydatamyconsent.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mydatamyconsent.model.DataConsentDocumentDetailsDto;
import com.mydatamyconsent.model.DataConsentStatus;
import com.mydatamyconsent.model.Life;
import com.mydatamyconsent.model.Requester;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for DataConsentDetailsDto
 */
public class DataConsentDetailsDtoTest {
    private final DataConsentDetailsDto model = new DataConsentDetailsDto();

    /**
     * Model tests for DataConsentDetailsDto
     */
    @Test
    public void testDataConsentDetailsDto() {
        // TODO: test DataConsentDetailsDto
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'dataLife'
     */
    @Test
    public void dataLifeTest() {
        // TODO: test dataLife
    }

    /**
     * Test the property 'requestedByOrg'
     */
    @Test
    public void requestedByOrgTest() {
        // TODO: test requestedByOrg
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'approvedAtUtc'
     */
    @Test
    public void approvedAtUtcTest() {
        // TODO: test approvedAtUtc
    }

    /**
     * Test the property 'rejectedAtUtc'
     */
    @Test
    public void rejectedAtUtcTest() {
        // TODO: test rejectedAtUtc
    }

    /**
     * Test the property 'expiresAtUtc'
     */
    @Test
    public void expiresAtUtcTest() {
        // TODO: test expiresAtUtc
    }

    /**
     * Test the property 'requestedAtUtc'
     */
    @Test
    public void requestedAtUtcTest() {
        // TODO: test requestedAtUtc
    }

    /**
     * Test the property 'identifiers'
     */
    @Test
    public void identifiersTest() {
        // TODO: test identifiers
    }

    /**
     * Test the property 'documents'
     */
    @Test
    public void documentsTest() {
        // TODO: test documents
    }

    /**
     * Test the property 'financials'
     */
    @Test
    public void financialsTest() {
        // TODO: test financials
    }

    /**
     * Test the property 'healthRecords'
     */
    @Test
    public void healthRecordsTest() {
        // TODO: test healthRecords
    }

}
