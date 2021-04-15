/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

/**
 *
 * @author alampi.adrian
 */
public class Studente {

    private String nome, cognome;
    private int nRegistro;

    public Studente( int nRegistro,String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.nRegistro = nRegistro;
    }

}
