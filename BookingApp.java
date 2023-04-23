/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

import static bookingapp.AssistantonShift.listAssistants;
//import static bookingapp.Room.printout;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bm0022
 */
public class BookingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date2 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        ///Creation of room objects
        Room r1 = new Room();
        r1.setCode("TF001");
        r1.setCapacity(10);
        r1.setBookable(new boolean[]{true, true, true});
        Room r2 = new Room();
        r2.setCode("TF005");
        r2.setCapacity(10);
        r2.setBookable(new boolean[]{true, true, true});
        Room r3 = new Room();
        r3.setCode("TF006");
        r3.setCapacity(10);
        r3.setBookable(new boolean[]{true, true, true});
        Room r4 = new Room();
        r4.setCode("TF007");
        r4.setCapacity(10);
        r4.setBookable(new boolean[]{true, true, true});
        Room r5 = new Room();
        r5.setCode("TF122");
        r5.setCapacity(15);
        Room r6 = new Room();
        r6.setCode("HB243");
        r6.setCapacity(7);
        Room r7 = new Room();
        r7.setCode("HB244");
        r7.setCapacity(7);
        Room r8 = new Room();
        r8.setCode("HB245");
        r8.setCapacity(7);
        r8.setBookable(new boolean[]{true, true, true});
        Room r9 = new Room();
        r9.setCode("HB246");
        r9.setCapacity(7);
        r9.setBookable(new boolean[]{true, true, true});
        Room r10 = new Room();
        r10.setCode("HB247");
        r10.setCapacity(7);
        r10.setBookable(new boolean[]{true, true, true});
        Room r11 = new Room();
        r11.setCode("IN001");
        r11.setCapacity(3);
        r11.setBookable(new boolean[]{true, true, true});
        Room r12 = new Room();
        r12.setCode("IN002");
        r12.setCapacity(3);
        r12.setBookable(new boolean[]{true, true, true});
        Room r13 = new Room();
        r13.setCode("PB325");
        r13.setCapacity(14);
        Room r14 = new Room();
        r14.setCode("PB326");
        r14.setCapacity(14);
        r14.setBookable(new boolean[]{true, true, true});
        Room r15 = new Room();
        r15.setCode("PB327");
        r15.setCapacity(14);
        r15.setBookable(new boolean[]{true, true, true});

        ///Creation of assistant objects
        Assistant v1 = new Assistant();
        v1.setName("Mark");
        v1.setRole("Student");
        v1.setEmail("mark@uok.ac.uk");
        v1.setWorking(new boolean[]{false, false, false});
        Assistant v2 = new Assistant();
        v2.setName("John");
        v2.setRole("Student");
        v2.setEmail("john@uok.ac.uk");
        v2.setWorking(new boolean[]{false, false, false});
        Assistant v3 = new Assistant();
        v3.setName("Amy");
        v3.setRole("Student");
        v3.setEmail("amy@uok.ac.uk");
        v3.setWorking(new boolean[]{false, false, false});
        Assistant v4 = new Assistant();
        v4.setName("Ella");
        v4.setRole("Student");
        v4.setEmail("ella@uok.ac.uk");
        v4.setWorking(new boolean[]{false, false, false});
        Assistant v5 = new Assistant();
        v5.setName("Diogo");
        v5.setRole("Staff");
        v5.setEmail("diogo@uok.ac.uk");
        v5.setWorking(new boolean[]{false, false, false});
        Assistant v6 = new Assistant();
        v6.setName("Ronaldo");
        v6.setRole("Staff");
        v6.setEmail("ronaldo@uok.ac.uk");
        v6.setWorking(new boolean[]{false, false, false});
        Assistant v7 = new Assistant();
        v7.setName("Matt");
        v7.setRole("Staff");
        v7.setEmail("matt@uok.ac.uk");
        v7.setWorking(new boolean[]{false, false, false});
        Assistant v8 = new Assistant();
        v8.setName("Johan");
        v8.setRole("Staff");
        v8.setEmail("johan@uok.ac.uk");
        v8.setWorking(new boolean[]{false, false, false});
        Assistant v9 = new Assistant();
        v9.setName("Marcos");
        v9.setRole("Staff");
        v9.setEmail("marcos@uok.ac.uk");
        v9.setWorking(new boolean[]{false, false, false});
        Assistant v10 = new Assistant();
        v10.setName("Layal");
        v10.setRole("Staff");
        v10.setEmail("layal@uok.ac.uk");
        v10.setWorking(new boolean[]{false, false, false});
        Assistant v11 = new Assistant();
        v11.setName("Marilyn");
        v11.setRole("Staff");
        v11.setEmail("marilyn@uok.ac.uk");
        v11.setWorking(new boolean[]{false, false, false});

        ///Setting university resources
        UniversityResources total = new UniversityResources();
        total.setAssistant(new Assistant[]{v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11});
        total.setRoom(new Room[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15});

        ///Bookable rooms
        BookableRoom br1h1 = new BookableRoom();
        br1h1.setDay(formatter.format(date2));
        br1h1.setTime("07:00");
        br1h1.setStatus("EMPTY");
        BookableRoom br1h2 = new BookableRoom();
        br1h2.setDay(formatter.format(date2));
        br1h2.setTime("08:00");
        br1h2.setStatus("EMPTY");
        BookableRoom br1h3 = new BookableRoom();
        br1h3.setDay(formatter.format(date2));
        br1h3.setTime("09:00");
        br1h3.setStatus("EMPTY");
        BookableRoom br2h1 = new BookableRoom();
        br2h1.setDay(formatter.format(date2));
        br2h1.setTime("07:00");
        br2h1.setStatus("EMPTY");
        BookableRoom br2h2 = new BookableRoom();
        br2h2.setDay(formatter.format(date2));
        br2h2.setTime("08:00");
        br2h2.setStatus("EMPTY");
        BookableRoom br2h3 = new BookableRoom();
        br2h3.setDay(formatter.format(date2));
        br2h3.setTime("09:00");
        br2h3.setStatus("EMPTY");
        BookableRoom br3h1 = new BookableRoom();
        br3h1.setDay(formatter.format(date2));
        br3h1.setTime("07:00");
        br3h1.setStatus("EMPTY");
        BookableRoom br3h2 = new BookableRoom();
        br3h2.setDay(formatter.format(date2));
        br3h2.setTime("08:00");
        br3h2.setStatus("EMPTY");
        BookableRoom br3h3 = new BookableRoom();
        br3h3.setDay(formatter.format(date2));
        br3h3.setTime("09:00");
        br3h3.setStatus("EMPTY");
        BookableRoom br4h1 = new BookableRoom();
        br4h1.setDay(formatter.format(date2));
        br4h1.setTime("07:00");
        br4h1.setStatus("EMPTY");
        BookableRoom br4h2 = new BookableRoom();
        br4h2.setDay(formatter.format(date2));
        br4h2.setTime("08:00");
        br4h2.setStatus("EMPTY");
        BookableRoom br4h3 = new BookableRoom();
        br4h3.setDay(formatter.format(date2));
        br4h3.setTime("09:00");
        br4h3.setStatus("EMPTY");
        BookableRoom br5h1 = new BookableRoom();
        br5h1.setDay(formatter.format(date2));
        br5h1.setTime("07:00");
        br5h1.setStatus("EMPTY");
        BookableRoom br5h2 = new BookableRoom();
        br5h2.setDay(formatter.format(date2));
        br5h2.setTime("08:00");
        br5h2.setStatus("EMPTY");
        BookableRoom br5h3 = new BookableRoom();
        br5h3.setDay(formatter.format(date2));
        br5h3.setTime("09:00");
        br5h3.setStatus("EMPTY");
        BookableRoom br6h1 = new BookableRoom();
        br6h1.setDay(formatter.format(date2));
        br6h1.setTime("07:00");
        br6h1.setStatus("EMPTY");
        BookableRoom br6h2 = new BookableRoom();
        br6h2.setDay(formatter.format(date2));
        br6h2.setTime("08:00");
        br6h2.setStatus("EMPTY");
        BookableRoom br6h3 = new BookableRoom();
        br6h3.setDay(formatter.format(date2));
        br6h3.setTime("09:00");
        br6h3.setStatus("EMPTY");
        BookableRoom br7h1 = new BookableRoom();
        br7h1.setDay(formatter.format(date2));
        br7h1.setTime("07:00");
        br7h1.setStatus("EMPTY");
        BookableRoom br7h2 = new BookableRoom();
        br7h2.setDay(formatter.format(date2));
        br7h2.setTime("08:00");
        br7h2.setStatus("EMPTY");
        BookableRoom br7h3 = new BookableRoom();
        br7h3.setDay(formatter.format(date2));
        br7h3.setTime("09:00");
        br7h3.setStatus("EMPTY");
        BookableRoom br8h1 = new BookableRoom();
        br8h1.setDay(formatter.format(date2));
        br8h1.setTime("07:00");
        br8h1.setStatus("EMPTY");
        BookableRoom br8h2 = new BookableRoom();
        br8h2.setDay(formatter.format(date2));
        br8h2.setTime("08:00");
        br8h2.setStatus("EMPTY");
        BookableRoom br8h3 = new BookableRoom();
        br8h3.setDay(formatter.format(date2));
        br8h3.setTime("09:00");
        br8h3.setStatus("EMPTY");
        BookableRoom br9h1 = new BookableRoom();
        br9h1.setDay(formatter.format(date2));
        br9h1.setTime("07:00");
        br9h1.setStatus("EMPTY");
        BookableRoom br9h2 = new BookableRoom();
        br9h2.setDay(formatter.format(date2));
        br9h2.setTime("08:00");
        br9h2.setStatus("EMPTY");
        BookableRoom br9h3 = new BookableRoom();
        br9h3.setDay(formatter.format(date2));
        br9h3.setTime("09:00");
        br9h3.setStatus("EMPTY");
        BookableRoom br10h1 = new BookableRoom();
        br10h1.setDay(formatter.format(date2));
        br10h1.setTime("07:00");
        br10h1.setStatus("EMPTY");
        BookableRoom br10h2 = new BookableRoom();
        br10h2.setDay(formatter.format(date2));
        br10h2.setTime("08:00");
        br10h2.setStatus("EMPTY");
        BookableRoom br10h3 = new BookableRoom();
        br10h3.setDay(formatter.format(date2));
        br10h3.setTime("09:00");
        br10h3.setStatus("EMPTY");
        BookableRoom br11h1 = new BookableRoom();
        br11h1.setDay(formatter.format(date2));
        br11h1.setTime("07:00");
        br11h1.setStatus("EMPTY");
        BookableRoom br11h2 = new BookableRoom();
        br11h2.setDay(formatter.format(date2));
        br11h2.setTime("08:00");
        br11h2.setStatus("EMPTY");
        BookableRoom br11h3 = new BookableRoom();
        br11h3.setDay(formatter.format(date2));
        br11h3.setTime("09:00");
        br11h3.setStatus("EMPTY");

        ///Room again
        r1.setBookablerooms(new BookableRoom[]{br1h1, br1h2, br1h3});
        r2.setBookablerooms(new BookableRoom[]{br2h1, br2h2, br2h3});
        r3.setBookablerooms(new BookableRoom[]{br3h1, br3h2, br3h3});
        r4.setBookablerooms(new BookableRoom[]{br4h1, br4h2, br4h3});
        r8.setBookablerooms(new BookableRoom[]{br5h1, br5h2, br5h3});
        r9.setBookablerooms(new BookableRoom[]{br6h1, br6h2, br6h3});
        r10.setBookablerooms(new BookableRoom[]{br7h1, br7h2, br7h3});
        r11.setBookablerooms(new BookableRoom[]{br8h1, br8h2, br8h3});
        r12.setBookablerooms(new BookableRoom[]{br9h1, br8h2, br8h3});
        r14.setBookablerooms(new BookableRoom[]{br10h1, br10h2, br10h3});
        r15.setBookablerooms(new BookableRoom[]{br11h1, br11h2, br11h3});

        ///Assistant on shift
        AssistantonShift w1s1 = new AssistantonShift();
        w1s1.setTime("07:00");
        w1s1.setStatus("FREE");
        AssistantonShift w1s2 = new AssistantonShift();
        w1s2.setTime("08:00");
        w1s2.setStatus("FREE");
        AssistantonShift w1s3 = new AssistantonShift();
        w1s3.setTime("09:00");
        w1s3.setStatus("FREE");
        AssistantonShift w2s1 = new AssistantonShift();
        w2s1.setTime("07:00");
        w2s1.setStatus("FREE");
        AssistantonShift w2s2 = new AssistantonShift();
        w2s2.setTime("08:00");
        w2s2.setStatus("FREE");
        AssistantonShift w2s3 = new AssistantonShift();
        w2s3.setTime("09:00");
        w2s3.setStatus("FREE");
        AssistantonShift w3s1 = new AssistantonShift();
        w3s1.setTime("07:00");
        w3s1.setStatus("FREE");
        AssistantonShift w3s2 = new AssistantonShift();
        w3s2.setTime("08:00");
        w3s2.setStatus("FREE");
        AssistantonShift w3s3 = new AssistantonShift();
        w3s3.setTime("09:00");
        w3s3.setStatus("FREE");
        AssistantonShift w4s1 = new AssistantonShift();
        w4s1.setTime("07:00");
        w4s1.setStatus("FREE");
        AssistantonShift w4s2 = new AssistantonShift();
        w4s2.setTime("08:00");
        w4s2.setStatus("FREE");
        AssistantonShift w4s3 = new AssistantonShift();
        w4s3.setTime("09:00");
        w4s3.setStatus("FREE");
        AssistantonShift w5s1 = new AssistantonShift();
        w5s1.setTime("07:00");
        w5s1.setStatus("FREE");
        AssistantonShift w5s2 = new AssistantonShift();
        w5s2.setTime("08:00");
        w5s2.setStatus("FREE");
        AssistantonShift w5s3 = new AssistantonShift();
        w5s3.setTime("09:00");
        w5s3.setStatus("FREE");
        AssistantonShift w6s1 = new AssistantonShift();
        w6s1.setTime("07:00");
        w6s1.setStatus("FREE");
        AssistantonShift w6s2 = new AssistantonShift();
        w6s2.setTime("08:00M");
        w6s2.setStatus("FREE");
        AssistantonShift w6s3 = new AssistantonShift();
        w6s3.setTime("09:00");
        w6s3.setStatus("FREE");
        AssistantonShift w7s1 = new AssistantonShift();
        w7s1.setTime("07:00");
        w7s1.setStatus("FREE");
        AssistantonShift w7s2 = new AssistantonShift();
        w7s2.setTime("08:00");
        w7s2.setStatus("FREE");
        AssistantonShift w7s3 = new AssistantonShift();
        w7s3.setTime("09:00");
        w7s3.setStatus("FREE");

        ///Assistant again
        ArrayList<AssistantonShift> x1 = new ArrayList<AssistantonShift>(Arrays.asList(w1s1, w1s2, w1s3));
        ArrayList<AssistantonShift> x2 = new ArrayList<AssistantonShift>(Arrays.asList(w2s1, w2s2, w2s3));
        ArrayList<AssistantonShift> x3 = new ArrayList<AssistantonShift>(Arrays.asList(w3s1, w3s2, w3s3));
        ArrayList<AssistantonShift> x6 = new ArrayList<AssistantonShift>(Arrays.asList(w6s1, w6s2, w6s3));
        ArrayList<AssistantonShift> x4 = new ArrayList<AssistantonShift>(Arrays.asList(w4s1, w4s2, w4s3));
        ArrayList<AssistantonShift> x5 = new ArrayList<AssistantonShift>(Arrays.asList(w5s1, w5s2, w5s3));
        ArrayList<AssistantonShift> x7 = new ArrayList<AssistantonShift>(Arrays.asList(w7s1, w7s2, w7s3));

        v1.setWorkers(x1);
        v2.setWorkers(x2);
        v3.setWorkers(x3);
        v4.setWorkers(x4);
        v5.setWorkers(x5);
        v6.setWorkers(x6);
        v7.setWorkers(x7);

        ///Creating bookings
        Booking b1 = new Booking();
        b1.setAos(w7s1);
        b1.setDay("31/07/2021");
        b1.setEmail("mcanals@uok.ac.uk");
        b1.setBroom(br1h1);
        b1.setTime("09:00");
        b1.setStatus("SCHEDULED");
        b1.setAssistant(v1);
        b1.setRoom(r1);
        Booking b2 = new Booking();
        b2.setAos(w3s2);
        b2.setDay("21/01/2021");
        b2.setEmail("dancuad@uok.ac.uk");
        b2.setBroom(br2h1);
        b2.setTime("09:00");
        b2.setStatus("COMPLETED");
        b2.setAssistant(v2);
        b2.setRoom(r2);

        BookingSystem system = new BookingSystem();
        system.setAos(new AssistantonShift[]{w1s1, w1s2, w1s3, w2s1, w2s2, w2s3, w3s1, w3s2, w3s3, w4s1, w4s2, w4s3, w5s1, w5s2, w5s3, w6s1, w6s2, w6s3, w7s1, w7s2, w7s3});
        system.setBookings(new Booking[]{b1, b2});
        system.setRooms(new BookableRoom[]{br1h1, br1h2, br1h3, br2h1, br2h2, br2h3, br3h1, br3h2, br3h3, br4h1, br4h2, br4h3, br5h1, br5h2, br5h3, br6h1, br6h2, br6h3, br7h1, br7h2, br7h3, br8h1, br8h2, br8h3, br9h1, br9h2, br9h3, br10h1, br10h2, br10h3, br11h1, br11h2, br11h3});
        ///Menu
        boolean f = true;
        while (f == true) {
            System.out.print("University of Knowledge - COVID test\n"
                    + "\n"
                    + "Manage Bookings\n"
                    + "\n"
                    + "Please, enter the number to select your option:\n"
                    + "\n"
                    + "To manage Bookable Rooms:\n"
                    + "1. List\n"
                    + "2. Add\n"
                    + "3. Remove\n"
                    + "To manage Assistants on Shift:\n"
                    + "4. List\n"
                    + "5. Add\n"
                    + "6. Remove\n"
                    + "To manage Bookings:\n"
                    + "7. List\n"
                    + "8. Add\n"
                    + "9. Remove\n"
                    + "10. Conclude");
            System.out.print("\n");
            System.out.println("After selecting one the options above, you will be presented other screens.");
            System.out.println("If you press 0, you will be able to return to this main menu.");
            System.out.println("Press -1 (or ctrl+c) to quit this application.");
            Scanner input = new Scanner(System.in);
            System.out.print("\n");
            String studanswer = input.nextLine();
            String a = "123456789";
            while ((!a.contains(studanswer) && !studanswer.equals("10")) && !studanswer.equals("-1") || studanswer == "") {
                System.out.println("Please choose one of the options stated above. ");
                studanswer = input.nextLine();
            }

            switch (studanswer) {
                case "1":
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println(dtf.format(now));
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    //System.out.println("\n");
                    //System.out.println("\n");
                    //System.out.println("\n");
                    //System.out.println("\n");
                    //System.out.println("\n");
                    //System.out.println("\n");
                    //System.out.println("\n");
                    //System.out.println("\n");
                    //System.out.println("\n");
                    //System.out.println("\n");
                    System.out.println("University of Knowledge - COVID test");
                    System.out.println("\n");
                    Room.listrooms(total.getRoom());
                    System.out.println("0. Back to main menu.");
                    System.out.println("-1. Quit application.");
                    Scanner s1 = new Scanner(System.in);
                    String line = s1.nextLine();
                    while (!(line.equals("0") || line.equals("-1"))) {
                        System.out.println("Invalid input, please input either 0 or -1.");
                        line = s1.nextLine();
                    }
                    if (line.equals("-1")) {
                        System.out.println("Thanks for using this program. It will now close. ");
                        f = false;
                    }
                    break;
                case "2":
                    System.out.println("University of Knowledge - COVID test");
                    System.out.println("\n");
                    System.out.println("Adding bookable room");
                    System.out.println("\n");
                    r1.add(total.getRoom());
                    System.out.println("0. Back to main menu.");
                    System.out.println("-1. Quit application.");
                    Scanner s2 = new Scanner(System.in);
                    line = s2.nextLine();
                    while (!(line.equals("0") || line.equals("-1"))) {
                        System.out.println("Invalid input, please input either 0 or -1.");
                        line = s2.nextLine();
                    }
                    if (line.equals("-1")) {
                        System.out.println("Thanks for using this program. It will now close. ");
                        f = false;
                    }

                    break;
                case "3":
                    System.out.println("University of Knowledge - COVID test");
                    System.out.println("\n");
                    Room.listrooms(total.getRoom());
                    r1.remove(total.getRoom());
                    break;
                case "4":
                    System.out.println("University of Knowledge - COVID test");
                    System.out.println("\n");
                    AssistantonShift.listAssistants(total.getAssistant());
                    System.out.println("0. Back to main menu. ");
                    System.out.println("-1. Quit application");
                    Scanner s4 = new Scanner(System.in);
                    String listas = s4.nextLine();
                    while (!(listas.equals("-1") || listas.equals("0"))) {
                        System.out.println("Invalid input. Please enter either 0 to go back to main menu or -1 to exit. ");
                        listas = s4.nextLine();
                    }
                    if (listas.equals("-1")) {
                        System.out.println("Thank you for using this program. It will now close. ");
                        f = false;
                    }
                    break;
                case "5":
                    System.out.println("University of Knowledge - COVID test");
                    System.out.print("\n");
                    System.out.println("Adding assistant on shift");
                    System.out.print("\n");
                    Assistant.list(total.getAssistant());
                    AssistantonShift.addAssistantShift(total.getAssistant());
                    Scanner s5 = new Scanner(System.in);
                    listas = s5.nextLine();
                    while (!(listas.equals("-1") || listas.equals("0"))) {
                        System.out.println("Invalid input. Please enter either 0 to go back to main menu or -1 to exit. ");
                        listas = s5.nextLine();
                    }
                    if (listas.equals("-1")) {
                        System.out.println("Thank you for using this program. It will now close. ");
                        f = false;
                    }
                    break;
                case "6":
                    int counter = 0;
                    System.out.println("University of Knowledge - COVID test");
                    System.out.print("\n");
                    for (int h = 0; h < total.getAssistant().length; h++) {
                        for (int k = 0; k < total.getAssistant()[h].getWorkers().size(); k++) {
                            if (total.getAssistant()[h].getWorkers().get(k).getStatus().equals("FREE") && counter < 1) {
                                AssistantonShift.listAssistants(total.getAssistant());
                                counter++;
                            }
                        }
                    }
                    System.out.println("Removing assistant on shift");
                    System.out.print("\n");
                    w1s1.removeAoS(v1);
                    Scanner s6 = new Scanner(System.in);
                    listas = s6.nextLine();
                    while (!(listas.equals("-1") || listas.equals("0"))) {
                        System.out.println("Invalid input. Please enter either 0 to go back to main menu or -1 to exit. ");
                        listas = s6.nextLine();
                    }
                    if (listas.equals("-1")) {
                        System.out.println("Thank you for using this program. It will now close. ");
                        f = false;
                    }
                    break;
                case "7":
                    System.out.print("University of Knowledge - COVID test");
                    System.out.print("\n");
                    System.out.println("Select which booking to list:\n"
                            + "1. All\n"
                            + "2. Only bookings status:SCHEDULED\n"
                            + "3. Only bookings status:COMPLETED\n"
                            + "0. Back to main menu.\n"
                            + "-1. Quit application.");
                    Scanner s7 = new Scanner(System.in);
                    String answer = s7.nextLine();

                    if (answer.equals("0")) {
                        return;
                    } else if (answer.equals("-1")) {
                        System.exit(0);
                    } else if (answer.equals("2")) {
                        system.schedBooking(system.getBookings());
                        System.out.print("0. Back to main menu.\n"
                                + "-1. Quit application.\n");
                        System.out.print("\n");
                        Scanner s71 = new Scanner(System.in);
                        String sentence = s71.nextLine();
                        while (!(sentence.equals("0") || sentence.equals("-1"))) {
                            System.out.println("Invalid input.");
                            System.out.print("0. Back to main menu.\n"
                                    + "-1. Quit application.\n");
                            System.out.print("\n");
                            sentence = s71.nextLine();
                        }
                        if (sentence.equals("0")) {
                            break;
                        }
                        if (sentence.equals("-1")) {
                            System.exit(0);
                        }
                    } else if (answer.equals("3")) {
                        system.finBooking(system.getBookings());
                        System.out.print("0. Back to main menu.\n"
                                + "-1. Quit application.\n");
                        System.out.print("\n");
                        Scanner s71 = new Scanner(System.in);
                        String sentence = s71.nextLine();
                        while (!(sentence.equals("0") || sentence.equals("-1"))) {
                            System.out.println("Invalid input.");
                            System.out.print("0. Back to main menu.\n"
                                    + "-1. Quit application.\n");
                            System.out.print("\n");
                            sentence = s71.nextLine();
                        }
                        if (sentence.equals("0")) {
                            break;
                        }
                        if (sentence.equals("-1")) {
                            System.exit(0);
                        }
                    } else if (answer.equals("1")) {
                        system.printBooking(system.getBookings());
                        System.out.print("0. Back to main menu.\n"
                                + "-1. Quit application.\n");
                        System.out.print("\n");
                        Scanner s71 = new Scanner(System.in);
                        String sentence = s71.nextLine();
                        while (!(sentence.equals("0") || sentence.equals("-1"))) {
                            System.out.println("Invalid input.");
                            System.out.print("0. Back to main menu.\n"
                                    + "-1. Quit application.\n");
                            System.out.print("\n");
                            sentence = s71.nextLine();
                        }
                        if (sentence.equals("0")) {
                            break;
                        }
                        if (sentence.equals("-1")) {
                            System.exit(0);
                        }
                    }
                    break;
                case "8":                   
                    System.out.print("University of Knowledge - COVID test");
                    System.out.print("\n");
                    System.out.println("Adding booking (appointment for a COVID test) to the system");
                    System.out.print("\n");
                    system.addBooking(system.getBookings(),system.getRooms(),system.getAos());
                    break;
                case "9":
                    System.out.print("University of Knowledge - COVID test");
                    System.out.print("\n");
                    system.schedBooking(system.getBookings());
                    System.out.print("\n");
                    system.concludeBooking(system.getBookings());
                    break;
                case "10":
                    System.out.println("University of Knowledge - COVID test ");
                    System.out.print("\n");
                    system.schedBooking(system.getBookings());
                    System.out.println("Conclude booking");
                    System.out.print("\n");
                    System.out.println("Please, enter one of the following:");
                    System.out.print("\n");
                    System.out.println("The sequential ID to select the booking to be completed.");
                    System.out.println("0. Back to main menu.");
                    System.out.println("-1. Quit application.");
                    Scanner s10 = new Scanner(System.in);
                    String q = s10.nextLine();
                    int position = Integer.valueOf(q);
                    while (system.getBookings()[position] == null) {
                        System.out.println("Error! Invalid input");
                        System.out.println("Please, enter one of the following:");
                        System.out.print("\n");
                        System.out.println("The sequential ID to select the booking to be completed.");
                        System.out.println("0. Back to main menu.");
                        System.out.println("-1. Quit application.");
                        q = s10.nextLine();
                        position = Integer.valueOf(q);

                        if (q.equals("0")) {
                            break;
                        } else if (q.equals("-1")) {
                            f=false;    
                        }
                    }
                    System.out.println("Booking completed successfully:");
                    system.getBookings()[position].setStatus("COMPLETED");
                    system.printBooking1(system.getBookings()[position]);
                    System.out.println("Please, enter one of the following:");
                    System.out.print("\n");
                    System.out.println("The sequential ID to select the booking to be completed.\n"
                            + "0. Back to main menu.\n"
                            + "-1. Quit application.");
                    String answer2 = s10.nextLine();
                    while (!(answer2.equals("0") || answer2.equals("-1"))) {
                        System.out.println("Invalid output. ");
                        System.out.println("Please, enter one of the following:");
                        System.out.print("\n");
                        System.out.println("The sequential ID to select the booking to be completed.\n"
                                + "0. Back to main menu.\n"
                                + "-1. Quit application.");
                        answer2 = s10.nextLine();

                        if (q.equals("0")) {
                            break;
                        } else if (q.equals("-1")) {
                            System.exit(0);
                        }
                    }
                    break;
                case "-1":
                    System.out.println("Thank you for using this program. It will now close. ");
                    f = false;
                    break;
                default:
                    break;

                ///System.out.print(studanswer);
            }
        }
    }
}
