package com.example.myapplication.models;

public class Disease  {
    private String diseaseName;
    private String diseaseType;

    public Disease(String DiseaseName,String DiseaseType){
        this.diseaseName=DiseaseName;
        this.diseaseType=DiseaseType;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }


    public boolean equals(String obj) {
        if(diseaseType.equalsIgnoreCase(obj)){
            return true;
        }
        return false;
    }
}
