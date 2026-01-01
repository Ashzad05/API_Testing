package api.endpoints;
/*
Swagger URI--> https://petstore.swagger.io

Create User(Post)-->    https://petstore.swagger.io/v2/user
Get User(Get)-->        https://petstore.swagger.io/v2/user/{user1}
Update User(Put)-->     https://petstore.swagger.io/v2/user/{user1}
Delete User(Delete)-->  https://petstore.swagger.io/v2/user/{user1}
*/
public class Routes {

	public static String base_url="https://petstore.swagger.io/v2";
	
	//User Module
	
	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{user1}";
	public static String update_url=base_url+"/user/{user1}";
	public static String delete_url=base_url+"/user/{user1}";
	
	
	//Store Module
	 //here you will create store module URL's
	
	
	//Pet Module
		 //here you will create Pet module URL's
}
