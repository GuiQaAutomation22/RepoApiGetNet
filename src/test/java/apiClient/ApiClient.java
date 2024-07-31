package apiClient;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import user.User;

public class ApiClient {
    private static final String BASE_URL = "https://reqres.in/api";

    public Response createUser(User user) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        String userJson = objectMapper.writeValueAsString(user);

        return RestAssured.given()
            .contentType(ContentType.JSON)
            .body(userJson)
            .post(BASE_URL + "/users");
    }

    public User parseUserResponse(Response response) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response.getBody().asString(), User.class);
    }
}