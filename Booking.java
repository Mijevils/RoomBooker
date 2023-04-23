/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

/**
 *
 * @author bm0022
 */
public class Booking {
    public Room room;
    public BookableRoom broom;
    public AssistantonShift aos;
    public String time;
    public String day;
    public String email;
    public String status;
    public Assistant assistant;

    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public BookableRoom getBroom() {
        return broom;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }
    public void setBroom(BookableRoom broom) {
        this.broom = broom;
    }

    public AssistantonShift getAos() {
        return aos;
    }

    public void setAos(AssistantonShift aos) {
        this.aos = aos;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
