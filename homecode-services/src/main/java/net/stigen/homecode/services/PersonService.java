package net.stigen.homecode.services;

import net.stigen.homecode.domain.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("personservice")
public class PersonService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person getValue() {
        return new Person("Donald Duck", "Andeby");
    }

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAll() {
        List<Person> liste = new ArrayList<Person>();
        liste.add(new Person("Donald Duck", "Andeby"));
        liste.add(new Person("Dolly Duck", "Andeby"));
        return liste;
    }

}
