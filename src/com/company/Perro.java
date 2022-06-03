package com.company;

public class Perro extends Animal{
    private String modeloCorrea = "Perro pituco";
    private String casa;

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getModeloCorrea() {
        return modeloCorrea;
    }

    public void setModeloCorrea(String modeloCorrea) {
        this.modeloCorrea = modeloCorrea;
    }
}
