package com.mycompany.sassologarage1;

public class Veicolo {
    
    String nome;
    String cognome;
    String targa;
    int posto;
    
    public Veicolo () {
        
    }

    public Veicolo (String nome, String cognome, String targa, int posto) {
        this.nome = nome;
        this.cognome = cognome;
        this.targa = targa;
        this.posto = posto;
        
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTarga() {
        return targa;
    }

    public int getPosto() {
        return posto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setPosto(int posto) {
        this.posto = posto;
    }
    

    @Override
    public String toString() {
        return "-------------------\n\n" + "Proprietario " + getCognome() + " " + getNome() + "\nTarga " + getTarga() + "\nPosto occupato " + getPosto();
    }      
}
