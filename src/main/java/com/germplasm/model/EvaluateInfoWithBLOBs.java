package com.germplasm.model;

public class EvaluateInfoWithBLOBs extends EvaluateInfo {
    private String advantage;

    private String disadvantage;

    private String utility;

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage == null ? null : advantage.trim();
    }

    public String getDisadvantage() {
        return disadvantage;
    }

    public void setDisadvantage(String disadvantage) {
        this.disadvantage = disadvantage == null ? null : disadvantage.trim();
    }

    public String getUtility() {
        return utility;
    }

    public void setUtility(String utility) {
        this.utility = utility == null ? null : utility.trim();
    }
}