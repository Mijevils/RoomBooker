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
public class UniversityResources {

    private Assistant[] Assistant;
    private Room[] Room;

    
    
    ///Function to  add assistants or rooms
    ///Function to remove assistants or rooms

    public Assistant[] getAssistant() {
        return Assistant;
    }

    public void setAssistant(Assistant[] Assistant) {
        this.Assistant = Assistant;
    }

    public Room[] getRoom() {
        return Room;
    }

    public void setRoom(Room[] Room) {
        this.Room = Room;
    }

    
}
