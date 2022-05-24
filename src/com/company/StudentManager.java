package com.company;
import java.io.*;
import java.util.*;

public class StudentManager {
    static void showStudent() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] Student = line.split(",");

                System.out.println("" + Student[0] + ",Name=" + " " + Student[1] + ",Address=" + " " + Student[2] + " " + ",Date=" + " " + Student[3] + " " + ",Gender= " + Student[4] + " " + ",DSMH=" + " " + Student[5] + " " + ",lisSubkect=" + " " + Student[6] + " " + ",NameSubject=" + " " + Student[7] + " " + ",Gpa=" + Student[8]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }  // Function ShowStudent

    public void add() throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        FileOutputStream fos = new FileOutputStream("D:\\Data\\111.csv", true);
        String line;
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(",");
            if (Check()) {
                System.out.println("Enter your full iD: ");
                String iD = sc.nextLine();
                System.out.println("Enter your full name: ");
                String name = sc.nextLine();
                System.out.println("Enter your address :");
                String address = sc.nextLine();
                System.out.println("Enter your date of birth (dd/MM/yyyy): ");
                String date = sc.nextLine();
                System.out.println("Enter your gender ");
                String gender = sc.nextLine();
                System.out.println("Enter your List ");
                String DSMH = sc.nextLine();
                System.out.println("Enter your listSubject ");
                String listSubject = sc.nextLine();
                System.out.println("Enter your nameSubject ");
                String nameSubject = sc.nextLine();
                System.out.println("Enter your GPA ");
                String gpa = sc.nextLine();
                System.out.println(fos);
                PrintWriter pw = new PrintWriter(fos);
                pw.println(iD + "," + name + "," + address + "," + date + "," + gender + "," + DSMH + "," + listSubject + "," + nameSubject + "," + gpa);
                pw.close();
                System.out.println("Add Success ");
                System.exit(0);
            } else {
                System.out.print("");
            }

        }

    } // Function Add Student

    public boolean Check() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        String iD = sc.nextLine();
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(",");
            if (Student[0].contains(iD.toString())) {
                System.out.println(" ID error, please re-enter");
                return false;
            }
        }
        return true;
    }  // Function Check Student


    public void updateStudent() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your ID: ");
        String iD = sc.nextLine();
        System.out.println("Enter Your Full Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter Your Address :");
        String address = sc.nextLine();
        System.out.println("Enter Your Date Of Birth (dd/MM/yyyy): ");
        String date = sc.nextLine();
        System.out.println("Enter Your Gender ");
        String gender = sc.nextLine();
        System.out.println("Enter Your List ");
        String DSMH = sc.nextLine();
        System.out.println("Enter Your ListSubject ");
        String listSubject = sc.nextLine();
        System.out.println("Enter Your NameSubject ");
        String nameSubject = sc.nextLine();
        System.out.println("Enter Your GPA ");
        String Gpa = sc.nextLine();
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;
        String splitBy = ",";
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(splitBy);
            for (int i = 1; i <= Student.length; i++) {
                if (Student[0].equals(iD)) {
                    Student[1] = Name;
                    Student[2] = address;
                    Student[3] = date;
                    Student[4] = gender;
                    Student[5] = DSMH;
                    Student[6] = listSubject;
                    Student[7] = nameSubject;
                    Student[8] = String.valueOf(Gpa);
                }
            }
            System.out.println(Student[0] + "," + Student[1] + "," + Student[2] + ", " + Student[3] + ", "
                    + Student[4] + ", " + Student[5] + ", " + Student[6] + "," + Student[7] + Student[8]);
        }

    } // Function updateStudent

    public void Search() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        String iD = sc.nextLine();
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;

        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(",");
            if (Student[0].contains(iD.toString())) {
                System.out.println(Arrays.toString(Student));
                System.out.println("GPA: " + Student[8]);
                Statistical(Integer.parseInt(Student[8]));
            }
        }
    } // Function Search Student


    public void Statistical(int mark) {
        if (mark >= 8) {
            System.out.println("Excellent");
        } else if (mark <= 8 && mark >= 6.5) {
            System.out.println("Very good");
        } else if (mark <= 6.5 && mark >= 3) {

            System.out.println("Good");
        } else {
            System.out.println("Fairly good");
        }
    } // Function Statistical Student

    public void countStudent() throws IOException {
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;
        int Excellent = 0;
        int veryGood = 0;
        int Good = 0;
        int fairlyGoole = 0;
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(",");
            int mark = Integer.parseInt(Student[8]);
            if (mark >= 8) {
                Excellent++;
            } else if (mark <= 8 && mark >= 6.5) {
                veryGood++;
            } else if (mark <= 6.5 && mark >= 3) {
                Good++;
            } else {
                fairlyGoole++;
            }
        }
        System.out.println("Excellent: " + Excellent);
        System.out.println("VeryGood: " + veryGood);
        System.out.println("Good: " + Good);
        System.out.println("FairlyGood: " + fairlyGoole);


    } // Function Students are good, Good, Average, Weak, Poor


    public void sortBigToSmall() throws IOException {


        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;
        String splitBy = ",";
        List<Student> listStu = new ArrayList<Student>();
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(splitBy);
            int iD = Integer.parseInt(Student[0]);
            String firstName = Student[1].toString();
            String address = Student[2].toString();
            String day = Student[3].toString();
            String gender = Student[4].toString();
            ;
            String listSubject = Student[5].toString();
            ;
            int idSubject = Integer.parseInt(Student[6]);
            String nameSubject = Student[7].toString();
            ;
            float gpa = Integer.parseInt(Student[8].toString());
            Student stu = new Student(iD, firstName, address, day, gender, listSubject, idSubject, nameSubject, gpa);
            listStu.add(stu);
        }
        System.out.println(listStu.size());
        Collections.sort(listStu, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Math.round(s1.getGpa() - s2.getGpa());

            }
        });
        for (int i = 0; i < listStu.size(); i++) {
            System.out.println(listStu.get(i).getID() + "," + listStu.get(i).getFirstName() + ","
                    + listStu.get(i).getDay() + ", " + listStu.get(i).getAddress() + ", "
                    + listStu.get(i).getGender() + ", " + listStu.get(i).getListSubject() + ", " + listStu.get(i).getIdSubject()
                    + "," + listStu.get(i).getNameSubject() + ", " + listStu.get(i).getGpa());

        }

    } // Function Sort Student

    public void Ratio() throws IOException {
//        BufferedReader reader = null;
//        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
//        String line = null;
//        String[] Student = new String[0];
//        while ((line = reader.readLine()) != null) {
//            Student = line.split(",");
//        }
//        int mark1 = Integer.parseInt(Student[0]);
//        for (int i = 0; i < Student[8].length(); i++) {
//            System.out.println(mark1);
//        }
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;
        int Excellent = 0;
        int veryGood = 0;
        int Good = 0;
        int fairlyGoole = 0;
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(",");
            int mark = Integer.parseInt(Student[8]);
            if (mark >= 8) {
                Excellent++;
            } else if (mark <= 8 && mark >= 6.5) {
                veryGood++;
            } else if (mark <= 6.5 && mark >= 3) {
                Good++;
            } else {
                fairlyGoole++;
            }
        }

        int Sum = (Excellent + veryGood + Good + fairlyGoole);
        float sum1 = 100;

        System.out.println(("Excellent=" + (Excellent * sum1) / Sum + "%"));
        System.out.println(("veryGood=" + (veryGood * sum1) / Sum + "%"));
        System.out.println(("Good=" + (Good * sum1) / Sum + "%"));
        System.out.println(("FairlyGood=" + (fairlyGoole * sum1) / Sum + "%"));


    } // Function Ratio Student

    public void sortAZ() throws IOException {

        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;
        String splitBy = ",";
        List<Student> listStu = new ArrayList<Student>();
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(splitBy);
            int iD = Integer.parseInt(Student[0]);
            String firstName = Student[1].toString();
            String address = Student[2].toString();
            String day = Student[3].toString();
            String gender = Student[4].toString();
            ;
            String listSubject = Student[5].toString();
            ;
            int idSubject = Integer.parseInt(Student[6]);
            String nameSubject = Student[7].toString();
            ;
            float gpa = Integer.parseInt(Student[8].toString());
            Student stu = new Student(iD, firstName, address, day, gender, listSubject, idSubject, nameSubject, gpa);
            listStu.add(stu);
        }

        Collections.sort(listStu, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
            }
        });
        for (int i = 0; i < listStu.size(); i++) {
            System.out.println(listStu.get(i).getID() + "," + listStu.get(i).getFirstName() + ","
                    + listStu.get(i).getDay() + ", " + listStu.get(i).getAddress() + ", "
                    + listStu.get(i).getGender() + ", " + listStu.get(i).getListSubject() + ", " + listStu.get(i).getIdSubject()
                    + "," + listStu.get(i).getNameSubject() + ", " + listStu.get(i).getGpa());
        }
    } // Function Sort AZ


    public void SearchName() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String iD = sc.nextLine();
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;

        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(",");
            if (Student[1].equals(iD.toUpperCase(Locale.ROOT))) {
                System.out.println(Arrays.toString(Student));
                System.out.println("Success Name =:" + Student[1]);
                Statistical(Integer.parseInt(Student[1]));
            }
        }
    }  // Function Search Name


    public void delete() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        String iD = sc.nextLine();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] Student = line.split(",");
                if (Student[0].equals(iD))
                    continue;
                System.out.println("" + Student[0] + ",Name=" + " " + Student[1] + ",Address=" + " " + Student[2] + " " + ",Date=" + " " + Student[3] + " " + ",Gender= " + Student[4] + " " + ",DSMH=" + " " + Student[5] + " " + ",lisSubkect=" + " " + Student[6] + " " + ",NameSubject=" + " " + Student[7] + " " + ",Gpa=" + Student[8]);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        }
    } // Function delete Student


    public void countName() throws IOException {
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;
        String splitBy = ",";
        List<Student> listStu = new ArrayList<Student>();
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(splitBy);
            int iD = Integer.parseInt(Student[0]);
            String firstName = Student[1].toString();
            String address = Student[2].toString();
            String day = Student[3].toString();
            String gender = Student[4].toString();
            ;
            String listSubject = Student[5].toString();
            ;
            int idSubject = Integer.parseInt(Student[6]);
            String nameSubject = Student[7].toString();
            ;
            float gpa = Integer.parseInt(Student[8].toString());
            Student stu = new Student(iD, firstName, address, day, gender, listSubject, idSubject, nameSubject, gpa);
            listStu.add(stu);
        }
        addStuden1(listStu);
    } // Function Count Name


    public void addStuden1(List<Student> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getFirstName().toString().equals(list.get(j).getFirstName().toString())) {

                    System.out.println(list.get(i).getID() + " " + list.get(i).getFirstName());
                    System.out.println(list.get(j).getID() + " " + list.get(j).getFirstName());

                }
            }
        }
    }

    public void MinMax() throws IOException {
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;
        String splitBy = ",";
        List<Student> listStu = new ArrayList<Student>();
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(splitBy);
            int iD = Integer.parseInt(Student[0]);
            String firstName = Student[1].toString();
            String address = Student[2].toString();
            String day = Student[3].toString();
            String gender = Student[4].toString();
            ;
            String listSubject = Student[5].toString();
            ;
            int idSubject = Integer.parseInt(Student[6]);
            String nameSubject = Student[7].toString();
            ;
            float gpa = Integer.parseInt(Student[8].toString());
            Student stu = new Student(iD, firstName, address, day, gender, listSubject, idSubject, nameSubject, gpa);
            listStu.add(stu);
        }
        System.out.println("Studen Min + Max:= ");
        Collections.sort(listStu, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Math.round(s1.getGpa() - s2.getGpa());

            }
        });
        System.out.println(listStu.get(0).getID() + "," + listStu.get(0).getFirstName() + ","
                + listStu.get(0).getDay() + ", " + listStu.get(0).getAddress() + ", "
                + listStu.get(0).getGender() + ", " + listStu.get(0).getListSubject() + ", " + listStu.get(0).getIdSubject()
                + "," + listStu.get(0).getNameSubject() + ", " + listStu.get(0).getGpa());


        System.out.println(listStu.get(listStu.size() - 1).getID() + "," + listStu.get(listStu.size() - 1).getFirstName() + ","
                + listStu.get(listStu.size() - 1).getDay() + ", " + listStu.get(listStu.size() - 1).getAddress() + ", "
                + listStu.get(listStu.size() - 1).getGender() + ", " + listStu.get(listStu.size() - 1).getListSubject() + ", " + listStu.get(listStu.size() - 1).getIdSubject()
                + "," + listStu.get(listStu.size() - 1).getNameSubject() + ", " + listStu.get(listStu.size() - 1).getGpa());
    }  // Function Min/Max Student


    public void test() throws IOException {
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("D:\\Data\\111.csv"));
        String line = null;
        String splitBy = ",";
        while ((line = reader.readLine()) != null) {
            String[] Student = line.split(splitBy);
            System.out.println(Student[2]);


        }
    }

    public void printList(String[] listStu1, String line) {
        listStu1 = line.split(",");
        System.out.println(listStu1[0] + "," + listStu1[1] + "," + listStu1[2] + "," + listStu1[3] + "," + listStu1[4] + "," + listStu1[5] + "," + listStu1[6] + "," + listStu1[7] + "," + listStu1[8]);
    }

}








































