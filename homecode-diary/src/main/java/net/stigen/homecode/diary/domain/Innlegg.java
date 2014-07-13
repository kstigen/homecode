package net.stigen.homecode.diary.domain;

import java.util.Date;

public class Innlegg {
    private Date opprettetDato;
    private String innhold;

    public Innlegg(Date opprettetDato, String innhold) {
        this.opprettetDato = opprettetDato;
        this.innhold = innhold;
    }

    public Date getOpprettetDato() {
        return opprettetDato;
    }

    public void setOpprettetDato(Date opprettetDato) {
        this.opprettetDato = opprettetDato;
    }

    public String getInnhold() {
        return innhold;
    }

    public void setInnhold(String innhold) {
        this.innhold = innhold;
    }
}
