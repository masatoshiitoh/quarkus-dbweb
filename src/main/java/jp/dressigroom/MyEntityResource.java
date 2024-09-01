package jp.dressigroom;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/myentity")
@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
public class MyEntityResource {
    @Inject
    MyEntityRepository repository;

    @GET
    public Iterable<MyEntity> list() {
        return repository.listAll();
    }
    @GET
    @Path("count")
    public Integer count() {
        return repository.listAll().size();
    }

}
