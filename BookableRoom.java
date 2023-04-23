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
public class BookableRoom {

    private Room bkrooms;
    private String time;
    private String status;
    private String day;

    public static void unabr(Room r1, int pos) {
        /*
        prints out bookable rooms with the given template
        */
        String statusss = r1.getBookablerooms()[pos].getStatus();
        String dates = r1.getBookablerooms()[pos].getTime();
        String day = r1.getBookablerooms()[pos].getDay();
        String cod = r1.getCode();
        int occ = r1.getCapacity();
        System.out.println("|" + "Date: " + day + " " + dates + "|" + "Status: " + statusss + "|" + "Code: " + cod + "|" + "Occupancy: " + occ + "|");
    }

    public static BookableRoom[] init() {
        /*
        initialises a bookable room with inexisting attributes
        */
        BookableRoom brn = new BookableRoom();
        brn.setDay("xx/xx/xxxx");
        brn.setTime("xx:xx");
        brn.setStatus("x");
        BookableRoom brn2 = new BookableRoom();
        brn2.setDay("xx/xx/xxxx");
        brn2.setTime("xx:xx");
        brn2.setStatus("x");
        BookableRoom brn3 = new BookableRoom();
        brn3.setDay("xx/xx/xxxx");
        brn3.setTime("xx:xx");
        brn3.setStatus("x");
        BookableRoom[] made = {brn, brn2, brn3};
        return made;
    }

    public void delete() {
        /*
        deletes a bookable room
        */
        day = "xx/xx/xxxx";
        status = "x";
        time = "xx:xx";
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Room getBkrooms() {
        return bkrooms;
    }

    public void setBkrooms(Room bkrooms) {
        this.bkrooms = bkrooms;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
