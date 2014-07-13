package net.stigen.homecode.diary.services;

import net.stigen.homecode.diary.domain.Dagbok;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Path("diaryservice")
public class DiaryService {

        private static Map<Long, Dagbok> dagboker;

        static {
            dagboker = new HashMap<Long, Dagbok>();
            dagboker.put(1L, new Dagbok(1, "Ovingsdagbok", new Date()));
            dagboker.put(2L, new Dagbok(2, "Treningsdagbok", new Date()));
        }

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public Collection<Dagbok> listAlleDagboker() {
            return dagboker.values();
        }

        @GET
        @Path("/{id}")
        @Produces(MediaType.APPLICATION_JSON)
        public Dagbok getDagbok(@PathParam("id") long id) {
            return dagboker.get(id);
        }

}
