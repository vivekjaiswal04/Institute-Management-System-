package com.cjc.ims.app.client;

import com.ims.app.serviceimpl.Karvenagar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Karvenagar k = new Karvenagar();

        while (true) {
            System.out.println("\n1.Add Course\n2.View Course\n3.Add Faculty\n4.View Faculty\n5.Add Batch\n6.View Batch\n7.Add Student\n8.View Student\n9.Exit");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: k.addCourse(); break;
                case 2: k.viewCourse(); break;
                case 3: k.addFaculty(); break;
                case 4: k.viewFaculty(); break;
                case 5: k.addBatch(); break;
                case 6: k.viewBatch(); break;
                case 7: k.addStudent(); break;
                case 8: k.viewStudent(); break;
                case 9: System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }
}