package net.stigen.homecode.domain;

import java.io.Serializable;

public class Person implements Serializable {
    private long id;
    private String navn;
    private String adresse;

    public Person(long id, String navn, String adresse) {
        this.id = id;
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
