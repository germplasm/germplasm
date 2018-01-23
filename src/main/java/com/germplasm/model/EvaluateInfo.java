package com.germplasm.model;

public class EvaluateInfo {
    private Integer id;

    private String germId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGermId() {
        return germId;
    }

    public void setGermId(String germId) {
        this.germId = germId == null ? null : germId.trim();
    }
}