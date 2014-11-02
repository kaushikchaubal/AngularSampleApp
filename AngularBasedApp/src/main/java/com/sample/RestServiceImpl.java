package com.sample;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/api")
public class RestServiceImpl {

    @Path("getData")
    @GET
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Getting data from MainServer</body></h1></html>";
    }
}
