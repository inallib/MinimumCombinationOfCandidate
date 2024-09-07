package org.ibmTest;

import org.ibmTest.records.Candidate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumCombinationOfCandidate {
    private Set<Integer> groupOfCandidatesNumber = new HashSet<>();
    private Set<String> combinedSkillsOfGroupOfCandidates = new HashSet<>();

    public int findMinimumCombinationOfCandidate(Set<String> skillsRequired, List<Candidate> candidates) {
        int minLength = candidates.size();
        boolean foundMatch = false;

        for(int i = 0; i <= candidates.size() - 1 ; i++) {
            for(int k = i; k <= candidates.size() - 1; k++) { // ToDo: this for loop further be optimized implementing a 2 way pointer
                groupOfCandidatesNumber = addCandidateNumbersToGroup(groupOfCandidatesNumber, candidates.get(k), combinedSkillsOfGroupOfCandidates);
                combinedSkillsOfGroupOfCandidates.addAll(candidates.get(k).skills());

                if (isSkillMatch(skillsRequired, combinedSkillsOfGroupOfCandidates)) {
                    minLength = updateMinLengthWhenFoundSmaller(minLength);

                    reinitializeGroupOfCandidatesNumberAndCombinedSkillsOfGroupOfCandidates();

                    groupOfCandidatesNumber.add(candidates.get(i).candidateNo());
                    combinedSkillsOfGroupOfCandidates.addAll(candidates.get(i).skills());
                    foundMatch = true;
                }
            }
            reinitializeGroupOfCandidatesNumberAndCombinedSkillsOfGroupOfCandidates();
        }

        if (!foundMatch)
            return 0;
        return minLength;
    }

    private int updateMinLengthWhenFoundSmaller(int minLength) {
        if (minLength > groupOfCandidatesNumber.size())
            return groupOfCandidatesNumber.size();
        return minLength;
    }

    private Set<Integer> addCandidateNumbersToGroup(Set<Integer> groupOfCandidatesNumber, Candidate candidate, Set<String> combinedSkillsOfGroupOfCandidates) {
        if (groupOfCandidatesNumber.size() > 0) {
            if (!combinedSkillsOfGroupOfCandidates.containsAll(candidate.skills()))
                groupOfCandidatesNumber.add(candidate.candidateNo());
        } else
            groupOfCandidatesNumber.add(candidate.candidateNo());
        return groupOfCandidatesNumber;
    }

    private boolean isSkillMatch(Set<String> skillsRequired, Set<String> combinedSkillsOfGroupOfCandidates) {
        return combinedSkillsOfGroupOfCandidates.containsAll(skillsRequired);
    }

    public void reinitializeGroupOfCandidatesNumberAndCombinedSkillsOfGroupOfCandidates() {
        groupOfCandidatesNumber.clear();
        combinedSkillsOfGroupOfCandidates.clear();
    }
}