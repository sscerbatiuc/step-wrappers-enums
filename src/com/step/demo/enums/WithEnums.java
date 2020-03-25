package com.step.demo.enums;

import static com.step.demo.enums.WithoutEnums.emps;
import com.step.demo.model.EmployeeWithEnum;
import java.util.Scanner;

/**
 *
 * @author sscerbatiuc
 */
public class WithEnums {

    static EmployeeWithEnum[] emps = new EmployeeWithEnum[2];

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
            String sGender = sc.nextLine();
            Gender gender = Gender.valueOf(sGender);

            emps[i] = new EmployeeWithEnum(name, surname, idnp, gender);
        }
    }

    private static void alterData() {
        // Nu este posibil de a seta valori altele decât prezente în Gender:
        emps[0].setGender(Gender.FEMALE);
        emps[0].setGender(Gender.MALE);
    }
}
