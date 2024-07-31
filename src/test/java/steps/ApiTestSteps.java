package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import apiClient.ApiClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import user.User;

public class ApiTestSteps {
    private ApiClient apiClient;
    private User newUser;
    private Response response;
    private User createdUser;

    @Given("a user with name {string} and job {string}")
    public void a_user_with_name_and_job(String name, String job) {
        newUser = new User(name, job);
        apiClient = new ApiClient();
    }

    @When("I send a request to create the user")
    public void i_send_a_request_to_create_the_user() throws Exception {
        response = apiClient.createUser(newUser);
        createdUser = apiClient.parseUserResponse(response); // Movido aqui para garantir a inicialização
    }

    @Then("the user is created successfully")
    public void the_user_is_created_successfully() throws Exception {
        assertNotNull("The created user should not be null", createdUser);
        assertEquals(newUser.getName(), createdUser.getName());
        assertEquals(newUser.getJob(), createdUser.getJob());
    }

    @Then("the status code is {int}")
    public void the_status_code_is(Integer expectedStatusCode) {
        assertEquals(expectedStatusCode.intValue(), response.getStatusCode());
    }

    @Then("the response contains the mandatory fields")
    public void the_response_contains_the_mandatory_fields() {
        assertNotNull("User ID should not be null", createdUser.getId());
        assertNotNull("Creation date should not be null", createdUser.getCreatedAt());
    }

    @Then("the response contains name {string} and job {string}")
    public void the_response_contains_name_and_job(String name, String job) {
        assertEquals(name, createdUser.getName());
        assertEquals(job, createdUser.getJob());
    }
}