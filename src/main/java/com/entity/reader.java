package com.entity;

public class reader {
    private Integer rid;

    private String raccount;

    private String rname;

    private String rpassword;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRaccount() {
        return raccount;
    }

    public void setRaccount(String raccount) {
        this.raccount = raccount == null ? null : raccount.trim();
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword == null ? null : rpassword.trim();
    }
}