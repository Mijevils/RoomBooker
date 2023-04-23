/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bm0022
 */
public class Room {

    private String code;
    private int capacity;
    private boolean[] bookable = {false, false, false};
    private BookableRoom[] bookablerooms = BookableRoom.init();

    static void printRoom(Room[] r1) {
        /*prints out all rooms
        
        */
        for (int x = 0; x < r1.length; x++) {
            System.out.println("|Code: " + r1[x].getCode() + "|Occupancy: " + r1[x].getCapacity() + "|");
        }
    }

    public static boolean validateJavaDate(String strDate) {
        /* 
        validates the dates in a given format
        */
        /* Check if date is 'null' */
        if (strDate.trim().equals("")) {
            return true;
        } /* Date is not 'null' */ else {
            /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
            SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
            sdfrmt.setLenient(false);
            /* Create Date object
	     * parse the string into date 
             */
            try {
                Date javaDate = sdfrmt.parse(strDate);
                //System.out.println(strDate + " is valid date format");
            } /* Date format is invalid */ catch (ParseException e) {
                //System.out.println(strDate + " is Invalid Date format");
                return false;
            }
            /* Return true if date format is valid */
            return true;
        }
    }

    static void add(Room[] r1) {
        /*
        adds a new bookable room
        */
        printRoom(r1);
        System.out.println("Please, enter one of the following: " + "\n");
        System.out.println("The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM),\n"
                + "separated by a white space.");
        Scanner s1 = new Scanner(System.in);
        String answer = s1.nextLine();
        if (answer.equals("-1")) {
            System.exit(0);
        }
        if (answer.equals("0")) {
            return;
        }
        while (answer.split(" ").length != 3) {
            System.out.println("Sorry, the input was invalid. Try again. ");
            System.out.println("Please, enter one of the following: " + "\n");
            System.out.println("The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM),\n"
                    + "separated by a white space.");
            answer = s1.nextLine();
        }
        String answerc = answer.split(" ")[0];
        String answerd = answer.split(" ")[1];
        String answert = answer.split(" ")[2];
        boolean answerok = false;
        boolean cfound = false;
        boolean dfound = false;
        boolean tfound = false;
        Room chosenroom = new Room();
        while (answerok == false) {
            for (int p = 0; p < r1.length; p++) {
                if (answerc.equals(r1[p].getCode())) {
                    chosenroom = r1[p];
                    cfound = true;
                }
            }
            if (answerc.equals("-1")) {
                System.exit(0);
            }
            if (answerc.equals("0")) {
                return;
            }
            if (validateJavaDate(answerd) == true) {
                dfound = true;
            }
            if (answert.equals("07:00") || answert.equals("08:00") || answert.equals("09:00")) {
                tfound = true;
            }

            if (cfound && dfound && tfound) {
                answerok = true;
            } else {
                System.out.println("Error! The submitted input was invalid. \n");
                System.out.println("Please, enter one of the following: ");
                System.out.println("\n");
                System.out.println("The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM),\n"
                        + "separated by a white space.");
                System.out.print("0. Back to main menu.");
                System.out.print("-1. Quit application.");
                answer = s1.nextLine();
                while (answerok == false) {
                    for (int p = 0; p < r1.length; p++) {
                        if (answerc.equals(r1[p].getCode())) {
                            chosenroom = r1[p];
                            cfound = true;
                        }
                    }
                    while (answer.split(" ").length != 3) {
                        System.out.println("Sorry, the input was invalid. Try again. ");
                        System.out.println("Please, enter one of the following: " + "\n");
                        System.out.println("The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM),\n"
                                + "separated by a white space.");
                        answer = s1.nextLine();
                    }
                    answerc = answer.split(" ")[0];
                    answerd = answer.split(" ")[1];
                    answert = answer.split(" ")[2];
                }
            }

            BookableRoom add = new BookableRoom();
            add.setDay(answerd);
            add.setTime(answert);
            add.setBkrooms(chosenroom);
            int hour = -1;
            if (answert.equals("07:00")) {
                hour = 0;
            } else if (answert.equals("08:00")) {
                hour = 1;
            } else if (answert.equals("09:00")) {
                hour = 2;
            }
            chosenroom.setBookableRoom(add, hour);
            chosenroom.setBookable2(true, hour);
            add.setStatus("EMPTY");
            System.out.println("Bookable Room added successfully: ");
            System.out.println("|Date: " + add.getDay() + " " + add.getTime() + "|Status: " + add.getStatus() + "|Code: " + add.getBkrooms().getCode() + "|Occupancy: " + add.getBkrooms().getCapacity() + "|"
            );
        }
    }

    static void remove(Room[] r1) {
        /*
        removes a bookable room
        */
        System.out.println("Removing bookable room");
        System.out.println("Please, enter one of the following:");
        System.out.println("The sequential ID to select the bookable room to be removed.");
        Scanner s1 = new Scanner(System.in);
        String answer = s1.nextLine();
        boolean answeroka = false;
        Room chosenroom = new Room();
        while (answeroka == false) {
            for (int i = 0; i < r1.length; i++) {
                if (r1[i].getCode().equals(answer)) {
                    answeroka = true;
                    chosenroom = r1[i];
                }
            }
            if (answer.equals("0")) {
                return;
            } else if (answer.equals("-1")) {
                System.out.println("The program will now close. ");
                System.exit(0);
            }
            if (answeroka == false) {
                System.out.print("Error! The input is invalid. Please make sure to type the code propertly. ");
                System.out.println("\n");
                System.out.println("Please, enter one of the following:");
                System.out.println("The sequential ID to select the bookable room to be removed.");
                System.out.println("0. Back to main menu.\n"
                        + "-1. Quit application.");
                answer = s1.nextLine();
            }
        }
        chosenroom.getBookablerooms()[0].delete();
        chosenroom.getBookablerooms()[1].delete();
        chosenroom.getBookablerooms()[2].delete();
        System.out.println("Bookable Room removed successfully: ");
        listrooms(r1);
    }

    public static void listrooms(Room[] r1) {
        /*
        lists all bookable rooms
        */
        int counter;
        for (int u = 0; u < r1.length; u++) {
            counter = 0;
            for (int y = 0; y < r1[u].getBookablerooms().length; y++) {
                if (!(r1[u].getBookablerooms()[y].getStatus().equals("x"))) {
                    BookableRoom.unabr(r1[u], y);
                    counter++;
                }

            }
            if (counter >0){
            System.out.print("\n");
            }
        }
    }
///Getters & Setters

    public void setBookable2(boolean change, int pos) {
        bookable[pos] = change;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean[] getBookable() {
        return bookable;
    }

    public void setBookable(boolean[] bookable) {
        this.bookable = bookable;
    }

    public BookableRoom[] getBookablerooms() {
        return bookablerooms;
    }

    public void setBookablerooms(BookableRoom[] bookablerooms) {
        this.bookablerooms = bookablerooms;
    }

    public void setBookableRoom(BookableRoom aula, int position) {
        bookablerooms[position] = aula;
    }
}
