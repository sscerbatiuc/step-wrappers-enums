package com.step.demo.enums;

import com.step.demo.model.Employee;
import java.util.Scanner;

/**
 *
 * @author sscerbatiuc
 */
public class WithoutEnums {

    static Employee[] emps = new Employee[2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter name:");
            String name = sc.nextLine();
            System.out.println("Please enter surname:");
            String surname = sc.nextLine();
            System.out.println("Please enter idnp:");
            String idnp = sc.nextLine();
            System.out.println("Please enter gender");
            char gender = sc.next().charAt(0);

            emps[i] = new Employee(name, surname, idnp, gender);
        }
    }
    
    private static void alterData(){
        // Este posibil de a seta valori de tip char care nu reprezintă nici un gen:
        emps[0].setGender('a');
        emps[0].setGender('b');
        emps[0].setGender('c');
    }
}
