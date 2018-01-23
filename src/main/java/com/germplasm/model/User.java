package com.germplasm.model;

public class User {
    private Integer id;

    private String loginname;

    private String passwd;

    private String unite;

    private Integer roleId;

    private String uniteId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite == null ? null : unite.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUniteId() {
        return uniteId;
    }

    public void setUniteId(String uniteId) {
        this.uniteId = uniteId == null ? null : uniteId.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", unite='" + unite + '\'' +
                ", roleId=" + roleId +
                ", uniteId='" + uniteId + '\'' +
                '}';
    }
}