package main;

import java.util.Observable;

public class Aviao extends Observable {
    private boolean voando;
    private String nome;
    public Aviao(String nome){
        this.nome = nome;
    }
    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
        setChanged();
        notifyObservers();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
