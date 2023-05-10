package com.company_abc;

public class HRTeam extends Team{

    public static void getResult(Candidate candidate) {
        informCandidates(candidate);
    }
    public static void informCandidates(Candidate candidate) {
        for (int i = 0; i < 25 + 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("Company ABC");
        for (int i = 0; i < 25 + 4; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();

        System.out.println("Name of selected candidate :");
        System.out.println(candidate.getName()+".");


    }

}
