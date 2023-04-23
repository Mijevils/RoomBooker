/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bm0022
 */
public class BookingSystem {

    public BookableRoom[] rooms;
    public AssistantonShift[] aos;
    public Booking[] bookings;

    public void printBooking(Booking[] booking) {
        /*
        Prints out all bookings in the specified template
        */
        for (int i = 0; i < booking.length; i++) {
            String day = booking[i].getDay();
            String time = booking[i].getTime();
            String stat = booking[i].getStatus();
            String aem = booking[i].getAssistant().getEmail();
            String cod = booking[i].getRoom().getCode();
            String stem = booking[i].getEmail();
            System.out.println("|Time: " + day + " " + time + "|Status: " + stat + "|Assistant email: " + aem + "|Room code: " + cod + "|Student email: " + stem + "|");
        }
    }

    public void printBooking1(Booking booking) {
        /*
        prints out 1 booking in the specified template
        */
        String day = booking.getDay();
        String time = booking.getTime();
        String stat = booking.getStatus();
        String aem = booking.getAssistant().getEmail();
        String cod = booking.getRoom().getCode();
        String stem = booking.getEmail();
        System.out.println("|Time: " + day + " " + time + "|Status: " + stat + "|Assistant email: " + aem + "|Room code: " + cod + "|Student email: " + stem + "|");

    }

    public void schedBooking(Booking[] booking) {
        /*
        Prints out bookings with a 'SCHEDULED' status
        */
        for (int i = 0; i < booking.length; i++) {
            if (booking[i].getStatus().equals("SCHEDULED")) {
                String day = booking[i].getDay();
                String time = booking[i].getTime();
                String stat = booking[i].getStatus();
                String aem = booking[i].getAssistant().getEmail();
                String cod = booking[i].getRoom().getCode();
                String stem = booking[i].getEmail();
                System.out.println("|Time: " + day + " " + time + "|Status: " + stat + "|Assistant email: " + aem + "|Room code: " + cod + "|Student email: " + stem + "|");
            }
        }
    }

    public void finBooking(Booking[] booking) {
                /*
        Prints out bookings with a 'COMPLETED' status
        */
        for (int i = 0; i < booking.length; i++) {
            if (booking[i].getStatus().equals("COMPLETED")) {
                String day = booking[i].getDay();
                String time = booking[i].getTime();
                String stat = booking[i].getStatus();
                String aem = booking[i].getAssistant().getEmail();
                String cod = booking[i].getRoom().getCode();
                String stem = booking[i].getEmail();
                System.out.println("|Time: " + day + " " + time + "|Status: " + stat + "|Assistant email: " + aem + "|Room code: " + cod + "|Student email: " + stem + "|");
            }
        }
    }

    public void addBooking(Booking[] bookings, BookableRoom[] brs, AssistantonShift[] asos) {
        /*
        Allows the user to add a booking
        */
        System.out.println("List of available time-slots:");
        int counter = 0;
        int counter2 = 0;
        ArrayList<String> daylist = new ArrayList<String>();
        ArrayList<String> hourlist = new ArrayList<String>();
        for (int i = 0; i < brs.length; i++) {
            for (int h = 0; h < asos.length; h++) {
                String dayr = brs[i].getDay();
                String daya = asos[h].getDay();
                String hour = brs[i].getTime();
                counter2 = 0;
                for (int tpm = 0; tpm < daylist.size(); tpm++) {
                    if (dayr.equals(daylist.get(tpm)) && hour.equals(hourlist.get(tpm))) {
                        counter2++;
                    }
                }
                if (dayr.equals(daya) && counter2 == 0) {
                    System.out.println((counter + 11) + " " + dayr + " " + hour);
                    daylist.add(dayr);
                    hourlist.add(hour);
                    counter++;
                }

            }
        }
        System.out.print("\n");
        System.out.println("Please, enter one of the following:");
        System.out.print("\n");
        System.out.println("The sequential ID of an available time-slot and the student email, separated by a white space.\n"
                + "0. Back to main menu.\n"
                + "-1. Quit application.");
        Scanner s10 = new Scanner(System.in);
        String answer = s10.nextLine();
        while (answer.equals("0") || answer.equals("-1") || answer.equals("11") || answer.equals("12") || answer.equals("13")) {
            System.out.println("Please, enter one of the following:");
            System.out.print("\n");
            System.out.println("The sequential ID of an available time-slot and the student email, separated by a white space.\n"
                    + "0. Back to main menu.\n"
                    + "-1. Quit application.");
            s10 = new Scanner(System.in);
            answer = s10.nextLine();
        }
        System.out.println("What is your email? ");
        String email = s10.nextLine();
        while (!(email.split("@")[1].equals("uok.ac.uk"))) {
            System.out.println("Error! Make sure your input ends in @uok.ac.uk ");
            System.out.println("What is your email? ");
            email = s10.nextLine();
        }
        if (answer.equals("0")) {
            return;
        } else if (answer.equals("-1")) {
            System.exit(0);
        } else if (answer.equals("11")) {
            Booking add = new Booking();
            add.setDay(daylist.get(0));
            add.setTime("07:00");
            add.setStatus("SCHEDULED");
            add.setEmail(email);
            System.out.println("Booking added successfully. ");
            printBooking1(add);
        } else if (answer.equals("12")) {
            Booking add = new Booking();
            add.setDay(daylist.get(0));
            add.setTime("08:00");
            add.setStatus("SCHEDULED");
            add.setEmail(email);
            System.out.println("Booking added successfully. ");
            printBooking1(add);
        } else if (answer.equals("13")) {
            Booking add = new Booking();
            add.setDay(daylist.get(0));
            add.setTime("09:00");
            add.setStatus("SCHEDULED");
            add.setEmail(email);
            System.out.println("Booking added successfully. ");
            printBooking1(add);
        }
        boolean f = true;
        System.out.println("List of available time-slots:");
        counter = 0;
        counter2 = 0;
        for (int i = 0; i < brs.length; i++) {
            for (int h = 0; h < asos.length; h++) {
                String dayr = brs[i].getDay();
                String daya = asos[h].getDay();
                String hour = brs[i].getTime();
                counter2 = 0;
                for (int tpm = 0; tpm < daylist.size(); tpm++) {
                    if (dayr.equals(daylist.get(tpm)) && hour.equals(hourlist.get(tpm))) {
                        counter2++;
                    }
                }
                if (dayr.equals(daya) && counter2 == 0) {
                    System.out.println((counter + 11) + " " + dayr + " " + hour);
                    daylist.add(dayr);
                    hourlist.add(hour);
                    counter++;

                }
            }
        }
        System.out.print("\n");
        System.out.println("Please, enter one of the following:");
        System.out.print("\n");
        System.out.println("The sequential ID of an available time-slot and the student email, separated by a white space.\n"
                + "0. Back to main menu.\n"
                + "-1. Quit application.");
        answer = s10.nextLine();
        while (!(answer.equals("0") || answer.equals("-1") || answer.equals("11") || answer.equals("12") || answer.equals("13"))) {
            System.out.println("Error! Invalid input. ");
            System.out.print("\n");
            System.out.println("Please, enter one of the following:");
            System.out.print("\n");
            System.out.println("The sequential ID of an available time-slot and the student email, separated by a white space.\n"
                    + "0. Back to main menu.\n"
                    + "-1. Quit application.");
            answer = s10.nextLine();
        }
        if (answer.equals("0")) {
            return;
        }
        if (answer.equals("-1")) {
            System.exit(0);
        }
    }

    public void delete(Booking booking) {
        /*
        deletes a booking by essentially removing its attribtue values
        */
        booking.setAos(null);
        booking.setAssistant(null);
        booking.setBroom(null);
        booking.setDay("xx/xx/xxxx");
        booking.setEmail("x");
        booking.setRoom(null);
        booking.setStatus("x");
        booking.setTime("xx:xx");
    }

    public void concludeBooking(Booking[] booking) {
        /*
        deletes a booking from the system
        */
        System.out.println("Please, enter one of the following:");
        System.out.print("\n");
        System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.\n"
                + "0. Back to main menu.\n"
                + "-1. Quit application.");
        System.out.print("\n");
        Scanner remove = new Scanner(System.in);
        String answer = remove.nextLine();
        while (!(answer.equals("0") || answer.equals("-1") || answer.equals("11") || answer.equals("12") || answer.equals("13"))) {
            System.out.println("Error! The submitted input was invalid. ");
            System.out.println("Please, enter one of the following:");
            System.out.print("\n");
            System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.\n"
                    + "0. Back to main menu.\n"
                    + "-1. Quit application.");
            System.out.print("\n");
            remove = new Scanner(System.in);
            answer = remove.nextLine();
        }
        if (answer.equals("0")) {
            return;
        } else if (answer.equals("-1")) {
            System.exit(0);
        } else if (answer.equals("11")) {
            delete(booking[0]);
            System.out.print("Booking removed successfully:");
            printBooking(booking);
            System.out.println("Please, enter one of the following:");
            System.out.print("\n");
            System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.\n"
                    + "0. Back to main menu.\n"
                    + "-1. Quit application.");
            System.out.print("\n");
            remove = new Scanner(System.in);
            answer = remove.nextLine();
            while (!(answer.equals("0") || answer.equals("-1") || answer.equals("11") || answer.equals("12") || answer.equals("13"))) {
                System.out.println("Error! The submitted input was invalid. ");
                System.out.println("Please, enter one of the following:");
                System.out.print("\n");
                System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.\n"
                        + "0. Back to main menu.\n"
                        + "-1. Quit application.");
                System.out.print("\n");
                remove = new Scanner(System.in);
                answer = remove.nextLine();
            }
            if (answer.equals("0")){
                return;
            }
            if (answer.equals("-1")){
                System.exit(0);
            }
        } else if (answer.equals("12")) {
            delete(booking[1]);
                        System.out.print("Booking removed successfully:");
            printBooking(booking);
            System.out.println("Please, enter one of the following:");
            System.out.print("\n");
            System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.\n"
                    + "0. Back to main menu.\n"
                    + "-1. Quit application.");
            System.out.print("\n");
            remove = new Scanner(System.in);
            answer = remove.nextLine();
            while (!(answer.equals("0") || answer.equals("-1") || answer.equals("11") || answer.equals("12") || answer.equals("13"))) {
                System.out.println("Error! The submitted input was invalid. ");
                System.out.println("Please, enter one of the following:");
                System.out.print("\n");
                System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.\n"
                        + "0. Back to main menu.\n"
                        + "-1. Quit application.");
                System.out.print("\n");
                remove = new Scanner(System.in);
                answer = remove.nextLine();
            }
            if (answer.equals("0")){
                return;
            }
            if (answer.equals("-1")){
                System.exit(0);
            }
        } else if (answer.equals("13")) {
            delete(booking[2]);
                        System.out.print("Booking removed successfully:");
            printBooking(booking);
            System.out.println("Please, enter one of the following:");
            System.out.print("\n");
            System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.\n"
                    + "0. Back to main menu.\n"
                    + "-1. Quit application.");
            System.out.print("\n");
            remove = new Scanner(System.in);
            answer = remove.nextLine();
            while (!(answer.equals("0") || answer.equals("-1") || answer.equals("11") || answer.equals("12") || answer.equals("13"))) {
                System.out.println("Error! The submitted input was invalid. ");
                System.out.println("Please, enter one of the following:");
                System.out.print("\n");
                System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.\n"
                        + "0. Back to main menu.\n"
                        + "-1. Quit application.");
                System.out.print("\n");
                remove = new Scanner(System.in);
                answer = remove.nextLine();
            }
            if (answer.equals("0")){
                return;
            }
            if (answer.equals("-1")){
                System.exit(0);
            }
        }
    }

    public BookableRoom[] getRooms() {
        return rooms;
    }

    public void setRooms(BookableRoom[] rooms) {
        this.rooms = rooms;
    }

    public AssistantonShift[] getAos() {
        return aos;
    }

    public void setAos(AssistantonShift[] aos) {
        this.aos = aos;
    }

    public Booking[] getBookings() {
        return bookings;
    }

    public void setBookings(Booking[] bookings) {
        this.bookings = bookings;
    }

}
