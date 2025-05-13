package com.ims.app.serviceimpl;

import com.ims.app.model.*;
import com.ims.app.servicei.Cjc;

import java.util.*;

public class Karvenagar implements Cjc {

    Scanner sc = new Scanner(System.in);

    List<Course> clist = new ArrayList<>();
    List<Faculty> flist = new ArrayList<>();
    List<Batch> blist = new ArrayList<>();
    List<Student> slist = new ArrayList<>();

    public void addCourse() {
        Course c = new Course();
        System.out.println("Enter course id:");
        c.setCid(sc.nextInt());
        sc.nextLine(); // consume leftover newline
        System.out.println("Enter course name:");
        c.setCname(sc.nextLine());
        clist.add(c);
    }

    public void viewCourse() {
        for (Course c : clist) {
            System.out.println("ID: " + c.getCid() + " | Name: " + c.getCname());
        }
    }

    public void addFaculty() {
        Faculty f = new Faculty();
        System.out.println("Enter faculty id:");
        f.setFid(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter faculty name:");
        f.setFname(sc.nextLine());

        // Assign course
        System.out.println("Available Courses:");
        for (Course c : clist) {
            System.out.println(c.getCid() + " - " + c.getCname());
        }
        System.out.println("Enter course id to assign:");
        int cid = sc.nextInt();
        for (Course c : clist) {
            if (c.getCid() == cid) {
                f.setCourse(c);
                break;
            }
        }

        flist.add(f);
    }

    public void viewFaculty() {
        for (Faculty f : flist) {
            System.out.println("ID: " + f.getFid() + " | Name: " + f.getFname() + " | Course: " + f.getCourse().getCname());
        }
    }

    public void addBatch() {
        Batch b = new Batch();
        System.out.println("Enter batch id:");
        b.setBid(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter batch name:");
        b.setBname(sc.nextLine());

        // Assign faculty
        System.out.println("Available Faculty:");
        for (Faculty f : flist) {
            System.out.println(f.getFid() + " - " + f.getFname());
        }
        System.out.println("Enter faculty id to assign:");
        int fid = sc.nextInt();
        for (Faculty f : flist) {
            if (f.getFid() == fid) {
                b.setFaculty(f);
                break;
            }
        }

        blist.add(b);
    }

    public void viewBatch() {
        for (Batch b : blist) {
            System.out.println("ID: " + b.getBid() + " | Name: " + b.getBname() + " | Faculty: " + b.getFaculty().getFname());
        }
    }

    public void addStudent() {
        Student s = new Student();
        System.out.println("Enter student id:");
        s.setSid(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter student name:");
        s.setSname(sc.nextLine());

        // Assign batch
        System.out.println("Available Batches:");
        for (Batch b : blist) {
            System.out.println(b.getBid() + " - " + b.getBname());
        }
        System.out.println("Enter batch id to assign:");
        int bid = sc.nextInt();
        for (Batch b : blist) {
            if (b.getBid() == bid) {
                s.setBatch(b);
                break;
            }
        }

        slist.add(s);
    }

    public void viewStudent() {
        for (Student s : slist) {
            System.out.println("ID: " + s.getSid() + " | Name: " + s.getSname() + " | Batch: " + s.getBatch().getBname());
        }
    }
}