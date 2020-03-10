# JAX-RS
Java API for RESTful Web Services  
: RESTful 방식을 지원하는 API


**어노테이션**  
- @Path
- @GET
- @POST
- @PUT
- @DELETE
- @HEAD
- @OPTION 
- @Produces
- @Consumes
- @PathParam
- @QueryParam
- @MatrixParam
- @FormParam
- @DefaultValue
- @HeaderParam
- @CookieParam
- @Context



```java
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("index")
public class HelloWorld {

	private String msg = "Hello World";
	
	@GET
	@Produces("text/plain")
	public String getMsg(){
		return this.msg;
	}
	
	@DELETE
	public Response deleteMsg(){
		this.msg = "";
		return Response.noContent().build();
	}
}
```



**구현**  
- Apache CXF (http://cxf.apache.org/)
- RESTEasy (https://resteasy.github.io/)
- Jersey (https://jersey.github.io/)
