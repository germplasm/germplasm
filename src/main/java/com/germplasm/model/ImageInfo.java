package com.germplasm.model;

import java.util.Date;

public class ImageInfo {
    private Integer id;

    private String germId;

    private Date imgDate;

    private String classify;

    private String ordernum;

    private String filename;

    private String desript;

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

    public Date getImgDate() {
        return imgDate;
    }

    public void setImgDate(Date imgDate) {
        this.imgDate = imgDate;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getDesript() {
        return desript;
    }

    public void setDesript(String desript) {
        this.desript = desript == null ? null : desript.trim();
    }
}