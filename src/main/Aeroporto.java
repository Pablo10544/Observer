package main;

import java.util.Observable;
import java.util.Observer;

public class Aeroporto implements Observer {
    private String nome;

    public String getStatusAvioes() {
        return StatusAvioes;
    }

    public void setStatusAvioes(String statusAvioes) {
        StatusAvioes = statusAvioes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String StatusAvioes="";
    public Aeroporto(String nome, Aviao a){
        this.nome = nome;
        a.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Aviao a = (Aviao)o;
        String status = "";
        if(a.isVoando()){
            status = "voando";
        }else{
            status = "no hangar";
        }
        this.StatusAvioes+= a.getNome() +" mudou para o estado "+ status;
    }
}
