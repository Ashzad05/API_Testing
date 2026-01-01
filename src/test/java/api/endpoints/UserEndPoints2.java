package api.endpoints;
import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//UserEndPoints
//create to perform create,read,update,delete request to the user


public class UserEndPoints2 {


	//method created for getting URL's from properties file
	static ResourceBundle getURL()
	{
		ResourceBundle routes=ResourceBundle.getBundle("routes");//load the properties file
		return routes;
	}


	public static Response createUser(User payload)
	{
		String post_url=getURL().getString("post_url");
		Response response=given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.post(post_url);

		return response;

	}

	public static Response readUser(String  userName)
	{
		String get_url=getURL().getString("get_url");
		Response response=given()
				.pathParam("user1", userName)
				.when()
				.get(get_url);

		return response;

	}


	public static Response updateUser(String userName,User payload)
	{
		String update_url=getURL().getString("update_url");
		Response response=given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.pathParam("user1", userName)
				.when()
				.put(update_url);

		return response;

	}


	public static Response deleteUser(String  userName)
	{
		String delete_url=getURL().getString("delete_url");
		Response response=given()
				.pathParam("user1", userName)
				.when()
				.delete(delete_url);

		return response;

	}
}
