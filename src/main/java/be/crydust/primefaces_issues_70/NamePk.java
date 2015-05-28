package be.crydust.primefaces_issues_70;

import java.io.Serializable;

public class NamePk implements Serializable{

    private String pk;
    private String name;

    public NamePk() {
    }

    public NamePk(String name, String pk) {
        this.name = name;
        this.pk = pk;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
