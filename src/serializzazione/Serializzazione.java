/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.*;

/**
 *
 * @author alampi.adrian
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generatore g=new Generatore();
        g.run();
//        Studente[] arr = new Studente[3];
//        Studente s0 = new Studente(123, "Nome0", "Cognome0");
//        Studente s1 = new Studente(1234, "Nome1", "Cognome1");
//        Studente s2 = new Studente(1235, "Nome2", "Cognome2");
//        arr[0] = s0;
//        arr[1] = s1;
//        arr[2] = s2;

//        try {
//            FileOutputStream FO = new FileOutputStream("test.ser");
//            ObjectOutputStream OS = new ObjectOutputStream(FO);
//            OS.writeObject(arr);
////            OS.writeObject("ciao");
////            OS.writeObject(0.123);
////            OS.writeObject(false);
////            OS.writeObject("q");
//            OS.flush();
//            OS.close();
//            FO.close();

//            FileInputStream FI = new FileInputStream("test.ser");
//            ObjectInputStream IS = new ObjectInputStream(FI);
//            Studente[] arrayStudente = (Studente[]) IS.readObject();
//            for (Studente s : arrayStudente) {
//                System.out.println(s.toString());
//            }

//            String v2 = (String) IS.readObject();
//            float v3 = (float) (double) IS.readObject();
//            System.out.println("v1--> " + arrayStudente[0].toString());
//            System.out.println("v2--> " + v2.toString());
//            System.out.println("v3--> " + v3.toString());

//        } catch (FileNotFoundException ex) {
//            System.out.println("Impossibile trovare il file");
//        } catch (IOException ex) {
//            System.out.println("Hai rotto Java");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
