/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author alampi.adrian
 */
public class Studente implements Serializable{

    private String nome, cognome;
    private int nRegistro;

    public Studente(int nRegistro, String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.nRegistro = nRegistro;
    }

    @Override
    public String toString() {
        return "Studente:  " + "nome: " + nome + ", cognome: " + cognome + ", " + nRegistro ;
    }

    

}
