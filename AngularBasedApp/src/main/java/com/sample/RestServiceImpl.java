package com.sample;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class RestServiceImpl {

    @Path("getData")
    @GET
    @Produces("text/html")
    public String getData() {
        return "<html lang=\"en\"><body><h1>This is message from java-file on the MainServer</body></h1></html>";
    }
    
    @Path("getAppInfo")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AppInfo getAppInfo() {
    	AppInfo appInfo = new AppInfo("TestApp", "1", "This is a test app");
    	
    	return appInfo;
    }
    
    @Path("putAppInfo")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putAppInfo(AppInfo appInfo) {
    	System.out.println(appInfo);
    	return Response.status(200).entity(appInfo).build();
    }
    
    
}
