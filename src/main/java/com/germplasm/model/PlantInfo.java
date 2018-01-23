package com.germplasm.model;

import java.math.BigDecimal;

public class PlantInfo {
    private Integer id;

    private String germId;

    private String breedWay;

    private String treeVigor;

    private String rootStock;

    private String treePose;

    private BigDecimal treeHeight;

    private String treeShape;

    private BigDecimal crownDiameter;

    private BigDecimal poleHeight;

    private Integer branchNum;

    private BigDecimal polePerimeter;

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

    public String getBreedWay() {
        return breedWay;
    }

    public void setBreedWay(String breedWay) {
        this.breedWay = breedWay == null ? null : breedWay.trim();
    }

    public String getTreeVigor() {
        return treeVigor;
    }

    public void setTreeVigor(String treeVigor) {
        this.treeVigor = treeVigor == null ? null : treeVigor.trim();
    }

    public String getRootStock() {
        return rootStock;
    }

    public void setRootStock(String rootStock) {
        this.rootStock = rootStock == null ? null : rootStock.trim();
    }

    public String getTreePose() {
        return treePose;
    }

    public void setTreePose(String treePose) {
        this.treePose = treePose == null ? null : treePose.trim();
    }

    public BigDecimal getTreeHeight() {
        return treeHeight;
    }

    public void setTreeHeight(BigDecimal treeHeight) {
        this.treeHeight = treeHeight;
    }

    public String getTreeShape() {
        return treeShape;
    }

    public void setTreeShape(String treeShape) {
        this.treeShape = treeShape == null ? null : treeShape.trim();
    }

    public BigDecimal getCrownDiameter() {
        return crownDiameter;
    }

    public void setCrownDiameter(BigDecimal crownDiameter) {
        this.crownDiameter = crownDiameter;
    }

    public BigDecimal getPoleHeight() {
        return poleHeight;
    }

    public void setPoleHeight(BigDecimal poleHeight) {
        this.poleHeight = poleHeight;
    }

    public Integer getBranchNum() {
        return branchNum;
    }

    public void setBranchNum(Integer branchNum) {
        this.branchNum = branchNum;
    }

    public BigDecimal getPolePerimeter() {
        return polePerimeter;
    }

    public void setPolePerimeter(BigDecimal polePerimeter) {
        this.polePerimeter = polePerimeter;
    }
}