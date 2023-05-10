package com.company_abc;

public class RecruitingTeam extends Team{
    public static boolean isEligible(Candidate candidate) {
        Boolean isEligible = false;
        if(candidate!=null){
            if(candidate.getDob().getYear() < 1999){
                return isEligible;
            } else if (candidate.getHscPCMPercent()<60) {
                return isEligible;
            } else if (candidate.getPgCgpa()<8 && candidate.getUgCgpa()<8 && candidate.getNumProjects() < 2) {
                return isEligible;
            } else if (!candidate.getCitizenship().equalsIgnoreCase("Indian") && candidate.isFullTime()!=true) {
                return isEligible;
            }else {
                return true;
            }
        }
        return isEligible;
    }

    public static HRTeam conductInterview(Candidate candidate) {
        candidate.setInterviewMarks(58);
        if(candidate.getInterviewMarks()>35) {
            HRTeam.getResult(candidate);
        } else {
            System.out.println(candidate.getName()+" is rejected.");
        }
        return null;
    }
}
