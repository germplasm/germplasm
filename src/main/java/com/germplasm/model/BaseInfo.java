package com.germplasm.model;

import java.math.BigDecimal;
import java.util.Date;

public class BaseInfo {
    private String id;

    private String germName;

    private String familyName;

    private String genusName;

    private String sciName;

    private String cityId;

    private String countyId;

    private String townId;

    private String address;

    private Date surveyDate;

    private String surveyer;

    private String surveyerPhone;

    private String guider;

    private String guiderPhone;

    private BigDecimal altitude;

    private String terrain;

    private BigDecimal lng;

    private BigDecimal lat;

    private BigDecimal slope;

    private String aspect;

    private BigDecimal waterTable;

    private String soilType;

    private String plantSpace;

    private String spieceConfig;

    private String spieceWeight;

    private String source;

    private String germType;

    private Integer treeAge;

    private Integer treeMaxAge;

    private String distributeRange;

    private String userId;

    private Integer countyChecked;

    private Integer cityChecked;

    private Integer provChecked;

    private Integer submited;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGermName() {
        return germName;
    }

    public void setGermName(String germName) {
        this.germName = germName == null ? null : germName.trim();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName == null ? null : genusName.trim();
    }

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName == null ? null : sciName.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId == null ? null : townId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public String getSurveyer() {
        return surveyer;
    }

    public void setSurveyer(String surveyer) {
        this.surveyer = surveyer == null ? null : surveyer.trim();
    }

    public String getSurveyerPhone() {
        return surveyerPhone;
    }

    public void setSurveyerPhone(String surveyerPhone) {
        this.surveyerPhone = surveyerPhone == null ? null : surveyerPhone.trim();
    }

    public String getGuider() {
        return guider;
    }

    public void setGuider(String guider) {
        this.guider = guider == null ? null : guider.trim();
    }

    public String getGuiderPhone() {
        return guiderPhone;
    }

    public void setGuiderPhone(String guiderPhone) {
        this.guiderPhone = guiderPhone == null ? null : guiderPhone.trim();
    }

    public BigDecimal getAltitude() {
        return altitude;
    }

    public void setAltitude(BigDecimal altitude) {
        this.altitude = altitude;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain == null ? null : terrain.trim();
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getSlope() {
        return slope;
    }

    public void setSlope(BigDecimal slope) {
        this.slope = slope;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect == null ? null : aspect.trim();
    }

    public BigDecimal getWaterTable() {
        return waterTable;
    }

    public void setWaterTable(BigDecimal waterTable) {
        this.waterTable = waterTable;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType == null ? null : soilType.trim();
    }

    public String getPlantSpace() {
        return plantSpace;
    }

    public void setPlantSpace(String plantSpace) {
        this.plantSpace = plantSpace == null ? null : plantSpace.trim();
    }

    public String getSpieceConfig() {
        return spieceConfig;
    }

    public void setSpieceConfig(String spieceConfig) {
        this.spieceConfig = spieceConfig == null ? null : spieceConfig.trim();
    }

    public String getSpieceWeight() {
        return spieceWeight;
    }

    public void setSpieceWeight(String spieceWeight) {
        this.spieceWeight = spieceWeight == null ? null : spieceWeight.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getGermType() {
        return germType;
    }

    public void setGermType(String germType) {
        this.germType = germType == null ? null : germType.trim();
    }

    public Integer getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(Integer treeAge) {
        this.treeAge = treeAge;
    }

    public Integer getTreeMaxAge() {
        return treeMaxAge;
    }

    public void setTreeMaxAge(Integer treeMaxAge) {
        this.treeMaxAge = treeMaxAge;
    }

    public String getDistributeRange() {
        return distributeRange;
    }

    public void setDistributeRange(String distributeRange) {
        this.distributeRange = distributeRange == null ? null : distributeRange.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getCountyChecked() {
        return countyChecked;
    }

    public void setCountyChecked(Integer countyChecked) {
        this.countyChecked = countyChecked;
    }

    public Integer getCityChecked() {
        return cityChecked;
    }

    public void setCityChecked(Integer cityChecked) {
        this.cityChecked = cityChecked;
    }

    public Integer getProvChecked() {
        return provChecked;
    }

    public void setProvChecked(Integer provChecked) {
        this.provChecked = provChecked;
    }

    public Integer getSubmited() {
        return submited;
    }

    public void setSubmited(Integer submited) {
        this.submited = submited;
    }
}