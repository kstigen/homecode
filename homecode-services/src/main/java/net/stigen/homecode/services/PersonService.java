package net.stigen.homecode.services;

import net.stigen.homecode.domain.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("personservice")
public class PersonService {

    private static Map<Long, Person> personer;

    static {
        personer = new HashMap<Long, Person>();
        personer.put(1L, new Person(1, "Donald Duck", "Andeby"));
        personer.put(2L, new Person(2, "Dolly Duck", "Andeby"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Person> listPersons() {
        return personer.values();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("id") long id) {
        return personer.get(id);
    }

}
