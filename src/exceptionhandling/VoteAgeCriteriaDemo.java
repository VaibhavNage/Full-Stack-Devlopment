package exceptionhandling;

import java.util.Scanner;

public class VoteAgeCriteriaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer age = sc.nextInt();
        try {
            if (age < 18) {
                throw new VoteAgeCriteriaException("Not Eligible to Vote");
            }else {
                System.out.println("You are eligible to Vote");
            }
        }
        catch (VoteAgeCriteriaException e){
            System.out.println("in catch block");
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining code");
    }
}
