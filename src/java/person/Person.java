/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Khanh
 */
public class Person {
    private String name;
    private boolean admin;
    private double receive;
    private double lent;
    private double diff;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, boolean admin, double receive, double lent, double diff) {
        this.name = name;
        this.admin = admin;
        this.receive = receive;
        this.lent = lent;
        this.diff = diff;
    }

    public String getName() {
        return name;
    }

    public boolean isAdmin() {
        return admin;
    }

    public double getReceive() {
        return receive;
    }

    public double getLent() {
        return lent;
    }

    public double getDiff(){
        return diff;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setReceive(double receive) {
        this.receive = receive;
    }

    public void setLent(double lent) {
        this.lent = lent;
    }

    public void setDiff(double diff){
        this.diff = diff;
    }
}
