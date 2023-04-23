/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

import static bookingapp.Room.validateJavaDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bm0022
 */
public class AssistantonShift {

    private String time;
    private String status;
    private String day = day();

    static String day() {
        /*
        Sets up the format that dates will have
        */
        Date date2 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date2);
    }

    public void deleteAssShift(AssistantonShift aos) {
        /*
        Deletes an assistant's shift
        */
        time = "xx:xx";
        status = "x";
        day = "xx/xx/xxxx";
    }

    static void listAssistants(Assistant[] a1) {
        /*
        lists all assistants
        */
        for (int v = 0; v < a1.length; v++) {
            String email = a1[v].getEmail();
            ArrayList<AssistantonShift> want = a1[v].getWorkers();
            for (int i = 0; i < want.size(); i++) {
                if (!(want.get(i).getTime().equals(null) || want.get(i).getStatus().equals(null))) {
                    String day = want.get(i).getDay();
                    String tim = want.get(i).getTime();
                    String stat = want.get(i).getStatus();
                    System.out.println("|Shifts: " + day + " " + tim + "|Status: " + stat + "|Email: " + email + "|");
                }
            }
            System.out.print("\n");
        }
    }

    static void addAssistantShift(Assistant[] aslist) {
        /*
        adds an assistant on shift by giving a shift to an assistant
        */
        System.out.println("Please, enter one of the following:");
        System.out.print("\n");
        System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.\n"
                + "0. Back to main menu.\n"
                + "-1. Quit application.");
        Scanner s1 = new Scanner(System.in);
        String ans = s1.nextLine();
        while (ans.split(" ").length != 2) {
            System.out.println("Error! Invalid input. ");
            System.out.println("Please enter one of the following. ");
            System.out.print("\n");
            System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.\n"
                    + "0. Back to main menu.\n"
                    + "-1. Quit application.");
            s1 = new Scanner(System.in);
            ans = s1.nextLine();
            if (ans.equals("0")) {
                return;
            }
            if (ans.equals("-1")) {
                System.exit(0);

            }
        }
        String[] res = ans.split(" ");
        String ans1 = res[0];
        String ans2 = res[1];
        while (!((ans1.equals("11") || ans1.equals("12") || ans1.equals("13") || ans1.equals("14") || ans1.equals("15") || ans1.equals("16") || ans1.equals("17") || ans1.equals("18") || ans1.equals("19") || ans1.equals("20") || ans1.equals("21") && (validateJavaDate(ans2) == true)))) {
            System.out.println("Error! Invalid input. ");
            System.out.println("Please enter one of the following. ");
            System.out.print("\n");
            System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.\n"
                    + "0. Back to main menu.\n"
                    + "-1. Quit application.");
            s1 = new Scanner(System.in);
            res = ans.split(" ");
            ans1 = res[0];
            ans2 = res[1];
            ans = s1.nextLine();
            if (ans.equals("0")) {
                return;
            }
            if (ans.equals("-1")) {
                System.exit(0);

            }

        }
        String email = "";
        if (ans1.equals("11")) {
            email = "mark@uok.ac.uk";
        } else if (ans1.equals("12")) {
            email = "john@uok.ac.uk";
        } else if (ans1.equals("13")) {
            email = "amy@uok.ac.uk";
        } else if (ans1.equals("14")) {
            email = "ella@uok.ac.uk";
        } else if (ans1.equals("15")) {
            email = "diogo@uok.ac.uk";
        } else if (ans1.equals("16")) {
            email = "ronaldo@uok.ac.uk";
        } else if (ans1.equals("17")) {
            email = "matt@uok.ac.uk";
        } else if (ans1.equals("18")) {
            email = "johan@uok.ac.uk";
        } else if (ans1.equals("19")) {
            email = "marcos@uok.ac.uk";
        } else if (ans1.equals("20")) {
            email = "layal@uok.ac.uk";
        } else if (ans1.equals("21")) {
            email = "marilyn@uok.ac.uk";
        }
        AssistantonShift add = new AssistantonShift();
        add.setStatus("FREE");
        add.setTime("07:00");
        add.setDay(ans2);
        int pos = Integer.valueOf(ans1) - 11;
        aslist[pos].add(add);
        System.out.println("Assistant on Shift added successfully:");
        System.out.println("|Date: " + add.getDay() + " " + add.getTime() + " 07:00" + "|Status: " + add.getStatus() + "|Email: " + email + "|");

        AssistantonShift add2 = new AssistantonShift();
        add2.setStatus("FREE");
        add2.setTime("08:00");
        add2.setDay(ans2);
        aslist[pos].add(add2);
        System.out.println("Assistant on Shift added successfully:");
        System.out.println("|Date: " + add2.getDay() + " " + add2.getTime() + "|Status: " + add2.getStatus() + "|Email: " + email + "|");

        AssistantonShift add3 = new AssistantonShift();
        add3.setStatus("FREE");
        add3.setTime("09:00");
        add3.setDay(ans2);
        aslist[pos].add(add3);
        System.out.println("Assistant on Shift added successfully:");
        System.out.println("|Date: " + add3.getDay() + " " + add3.getTime() + "|Status: " + add3.getStatus() + "|Email: " + email + "|");

        System.out.println("Please, enter one of the following:");
        System.out.print("\n");
        System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.\n"
                + "0. Back to main menu.\n"
                + "-1. Quit application.");
    }

    static void removeAoS(Assistant a1) {
        /*
        removes a shift from an assitant
        */
        System.out.println("Please, enter one of the following:");
        System.out.print("\n");
        System.out.println("The sequential ID to select the assistant on shift to be removed.\n"
                + "0. Back to main menu.\n"
                + "-1. Quit application.");
        Scanner s1 = new Scanner(System.in);
        String answer = s1.nextLine();
        while (!(answer.equals("11") || answer.equals("12") || answer.equals("13") || answer.equals("14") || answer.equals("15") || answer.equals("16") || answer.equals("17") || answer.equals("18") || answer.equals("19") || answer.equals("20") || answer.equals("21"))) {
            System.out.println("Error! Invalid output.");
            System.out.println("Please enter one of the follwing:");
            System.out.print("\n");
            System.out.println("The sequential ID to select the assistant on shift to be removed.\n"
                    + "0. Back to main menu.\n"
                    + "-1. Quit application.");
            s1 = new Scanner(System.in);
            answer = s1.nextLine();
            if (answer.equals("0")) {
                return;
            }
            if (answer.equals("-1")) {
                System.exit(0);
            }
        }
        int borr = Integer.valueOf(answer) - 11;
        a1.getWorkers().get(borr).deleteAssShift(a1.getWorkers().get(borr));
        System.out.println("The sequential ID to select the assistant on shift to be removed.\n"
                + "0. Back to main menu.\n"
                + "-1. Quit application.");
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

}
