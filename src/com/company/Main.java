package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String choose = null;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentManager.add();
                    break;
                case "2":
                    studentManager.showStudent();
                    break;
                case "3":
                 studentManager.updateStudent();
                    break;
                case "4":
                    studentManager.delete();
                    break;
                case "5":
                    studentManager.Search();
                    break;
                case "6":
                   studentManager.sortBigToSmall();
                    break;
                case "7":
                   studentManager.MinMax();
                    break;
                case "8":
                    studentManager.countStudent();
                    break;

                case "9":
                   studentManager.Ratio();
                    break;
                case "10":
                    studentManager.sortAZ();
                case "11":
                    studentManager.countName();
                case "12":
                    studentManager.test();
                case "13":
                        studentManager.SearchName();
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;

            }
            // show menu
            showMenu();
        }
    }

    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add Student");
        System.out.println("2. Show student.");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Search Student");
        System.out.println("6. Sort Student");
        System.out.println("7. Min- Max");
        System.out.println("8.  Statistical Student");
        System.out.println("9. Percent Good, Pretty Average, Weak");
        System.out.println("10. Sort Student A-Z");
        System.out.println("11. Same Student");
        System.out.println("12. Same Name Input");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
