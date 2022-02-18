package com.example.misrutinas;


public class ListResumen {
    private  String etrutina;
    private String etGrupo;
    private  String etDescr;
    public ListResumen(String etrutina, String etGrupo, String etDescr) {
        this.etrutina = etrutina;
        this.etGrupo = etGrupo;
        this.etDescr = etDescr;
    }

    public String getEtrutina() {
        return etrutina;
    }

    public void setEtrutina(String etrutina) {
        this.etrutina = etrutina;
    }

    public String getEtGrupo() {
        return etGrupo;
    }

    public void setEtGrupo(String etGrupo) {
        this.etGrupo = etGrupo;
    }

    public String getEtDescr() {
        return etDescr;
    }

    public void setEtDescr(String etDescr) {
        this.etDescr = etDescr;
    }
}
