package com.entity;

public class gmer {
    private String gaccount;

    private Integer gid;

    private String gname;

    private String gpassword;

    public String getGaccount() {
        return gaccount;
    }

    public void setGaccount(String gaccount) {
        this.gaccount = gaccount == null ? null : gaccount.trim();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGpassword() {
        return gpassword;
    }

    public void setGpassword(String gpassword) {
        this.gpassword = gpassword == null ? null : gpassword.trim();
    }
}