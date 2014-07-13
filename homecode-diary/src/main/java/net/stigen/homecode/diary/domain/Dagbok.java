package net.stigen.homecode.diary.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dagbok {
    private long id;
    private String navn;
    private Date opprettet;

    List<Innlegg> innlegg;

    public Dagbok(long id, String navn, Date opprettet) {
        this.id = id;
        this.navn = navn;
        this.opprettet = opprettet;
        this.innlegg = new ArrayList<Innlegg>();
    }

    public List<Innlegg> getInnlegg() {
        if (innlegg == null) {
            innlegg = new ArrayList<Innlegg>();
        }

        return innlegg;
    }


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Date getOpprettet() {
        return opprettet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
