/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

import java.util.ArrayList;

/**
 *
 * @author bm0022
 */
public class Assistant {

    private String role;
    private String email;
    private String name;
    private boolean[] working;
    private ArrayList<AssistantonShift> workers = new ArrayList<AssistantonShift>();

    public static void list(Assistant[] a1) {
        for (int i = 0; i < a1.length; i++) {
            String email = a1[i].getEmail();
            String name = a1[i].getName();
            System.out.println(i+11+"|Name: " + name + "|Email: " + email + "|");
        }
    }
    
    public void add(AssistantonShift aos){
      /*
        Adds assistant on shift to a given object
        */
      workers.add(aos);      
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getWorking() {
        return working;
    }

    public void setWorking(boolean[] working) {
        this.working = working;
    }

    public ArrayList<AssistantonShift> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<AssistantonShift> workers) {
        this.workers = workers;
    }

}
