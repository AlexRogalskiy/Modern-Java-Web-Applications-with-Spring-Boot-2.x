/*
 * Farm Management REST WS
 * The web service layer.
 *
 * OpenAPI spec version: 1.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.packt.springboot22.vid02.client;

import org.packt.springboot22.vid02.config.ApiException;
import org.packt.springboot22.vid02.model.ProfileInformation;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for SignupControllerApi
 */
@Ignore
public class SignupControllerApiTest {

    private final SignupControllerApi api = new SignupControllerApi();

    
    /**
     * Add new user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addNewFormSignupUsingPOSTTest() throws ApiException {
        Object reqParams = null;
        String response = api.addNewFormSignupUsingPOST(reqParams);

        // TODO: test validations
    }
    
    /**
     * Add new user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addNewSignupUsingPOSTTest() throws ApiException {
        ProfileInformation profile = null;
        String response = api.addNewSignupUsingPOST(profile);

        // TODO: test validations
    }
    
    /**
     * Delete user account.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSignupUsingDELETETest() throws ApiException {
        String username = null;
        String response = api.deleteSignupUsingDELETE(username);

        // TODO: test validations
    }
    
    /**
     * Returns all approved users only.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApprovedUsersUsingGETTest() throws ApiException {
        java.util.List<Object> response = api.getApprovedUsersUsingGET();

        // TODO: test validations
    }
    
    /**
     * Returns users with matched username.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSignedupUserUsingGETTest() throws ApiException {
        String username = null;
        java.util.List<Object> response = api.getSignedupUserUsingGET(username);

        // TODO: test validations
    }
    
    /**
     * Returns all users.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSignedupUsersUsingGETTest() throws ApiException {
        java.util.List<Object> response = api.getSignedupUsersUsingGET();

        // TODO: test validations
    }
    
    /**
     * Returns total number of users.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTotalUsersUsingGETTest() throws ApiException {
        String response = api.getTotalUsersUsingGET();

        // TODO: test validations
    }
    
    /**
     * Update some profile detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void partialupdateSignupUsingPATCHTest() throws ApiException {
        Object updates = null;
        String username = null;
        String response = api.partialupdateSignupUsingPATCH(updates, username);

        // TODO: test validations
    }
    
    /**
     * Update a user account.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSignupUsingPUTTest() throws ApiException {
        ProfileInformation profile = null;
        String username = null;
        String response = api.updateSignupUsingPUT(profile, username);

        // TODO: test validations
    }
    
}
