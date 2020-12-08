package br.com.alura.java.io.test;

import java.io.Serializable;

/**
 * Represents a bytebank customer
 *
 * @author Juliana Maijer
 * @version 0.1
 *
 */
public class Client implements Serializable {

    private static final long serialVersionUID = -3987952012371023746L;

    private String name;
    private String numberRegister;
    private String occupation;

    public String getNameNumberRegister(){
        return name + ", " + numberRegister;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumberRegister() {
        return numberRegister;
    }
    public void setNumberRegister(String numberRegister) {
        this.numberRegister = numberRegister;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
