package com.company_abc;

import java.util.Date;

public class RecruitmentProcess {
    public static void main(String[] args) {
        Candidate candidate = new Candidate(
                "Salman Khan",
                new Date(1989, 5, 9),
                78,
                8,
                9,
                2,
                true,
                0,
                "indian");

        if(RecruitingTeam.isEligible(candidate)){
            RecruitingTeam.conductInterview(candidate);
        } else{
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

            System.out.println(candidate.getName()+" is not eligible for interview process.");
        }
    }
}
