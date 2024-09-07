package org.ibmTest;

import org.ibmTest.records.Candidate;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Testable
public class MinimumCombinationOfCandidateTest {
    Set<String> skillsRequired = Set.of("A", "B", "C", "D", "E", "F");
    MinimumCombinationOfCandidate minimumCombinationOfCandidate = new MinimumCombinationOfCandidate();

    @Test
    public void TestData_1() {
        Candidate candidateNo_1 = new Candidate(1,  Set.of("A", "B", "C", "D"));
        Candidate candidateNo_2 = new Candidate(2,  Set.of("A", "B", "E"));
        Candidate candidateNo_3 = new Candidate(3,  Set.of("C", "D"));
        Candidate candidateNo_4 = new Candidate(4,  Set.of("E"));
        Candidate candidateNo_5 = new Candidate(5,  Set.of("A", "B", "C", "D", "E", "F"));
        Candidate candidateNo_6 = new Candidate(6,  Set.of("X", "Y", "Z"));

        List<Candidate> candidates = List.of(candidateNo_1, candidateNo_2,candidateNo_3, candidateNo_4,candidateNo_5, candidateNo_6);

        assertEquals (1, minimumCombinationOfCandidate.findMinimumCombinationOfCandidate(skillsRequired, candidates));
    }

    @Test
    public void TestData_2() {
        Candidate candidateNo_1 = new Candidate(1,  Set.of("A", "B", "C", "D"));
        Candidate candidateNo_2 = new Candidate(2,  Set.of("A", "B", "E"));
        Candidate candidateNo_3 = new Candidate(3,  Set.of("C", "D"));
        Candidate candidateNo_4 = new Candidate(4,  Set.of("E"));
        Candidate candidateNo_5 = new Candidate(5,  Set.of("F"));
        Candidate candidateNo_6 = new Candidate(6,  Set.of("X", "Y", "Z"));

        List<Candidate> candidates = List.of(candidateNo_1, candidateNo_2,candidateNo_3, candidateNo_4,candidateNo_5, candidateNo_6);

        assertEquals (3, minimumCombinationOfCandidate.findMinimumCombinationOfCandidate(skillsRequired, candidates));
    }

    @Test
    public void TestData_3() {
        Candidate candidateNo_1 = new Candidate(1,  Set.of("A", "B", "C", "D"));
        Candidate candidateNo_2 = new Candidate(2,  Set.of("A", "B", "E"));
        Candidate candidateNo_3 = new Candidate(3,  Set.of("C", "D", "F"));
        Candidate candidateNo_4 = new Candidate(4,  Set.of("E"));
        Candidate candidateNo_5 = new Candidate(5,  Set.of("F"));
        Candidate candidateNo_6 = new Candidate(6,  Set.of("X", "Y", "Z"));

        List<Candidate> candidates = List.of(candidateNo_1, candidateNo_2,candidateNo_3, candidateNo_4,candidateNo_5, candidateNo_6);

        assertEquals (2, minimumCombinationOfCandidate.findMinimumCombinationOfCandidate(skillsRequired, candidates));
    }

    @Test
    public void TestData_4() {
        Candidate candidateNo_1 = new Candidate(1,  Set.of("A", "B", "C", "D"));
        Candidate candidateNo_2 = new Candidate(2,  Set.of("X", "Y", "U"));
        Candidate candidateNo_3 = new Candidate(3,  Set.of("T", "L", "K"));
        Candidate candidateNo_4 = new Candidate(4,  Set.of("LL"));
        Candidate candidateNo_5 = new Candidate(5,  Set.of("KK"));
        Candidate candidateNo_6 = new Candidate(6,  Set.of("X", "Y", "Z"));

        List<Candidate> candidates = List.of(candidateNo_1, candidateNo_2,candidateNo_3, candidateNo_4,candidateNo_5, candidateNo_6);

        assertEquals (0, minimumCombinationOfCandidate.findMinimumCombinationOfCandidate(skillsRequired, candidates));
    }

    @Test
    public void TestData_5() {
        Candidate candidateNo_1 = new Candidate(1,  Set.of("A", "B"));
        Candidate candidateNo_2 = new Candidate(2,  Set.of("C"));
        Candidate candidateNo_3 = new Candidate(3,  Set.of("D"));
        Candidate candidateNo_4 = new Candidate(4,  Set.of("E"));
        Candidate candidateNo_5 = new Candidate(5,  Set.of("F"));
        Candidate candidateNo_6 = new Candidate(6,  Set.of("X", "Y", "Z"));

        List<Candidate> candidates = List.of(candidateNo_1, candidateNo_2,candidateNo_3, candidateNo_4,candidateNo_5, candidateNo_6);

        assertEquals (5, minimumCombinationOfCandidate.findMinimumCombinationOfCandidate(skillsRequired, candidates));
    }

    @Test
    public void TestData_6() {
        Candidate candidateNo_1 = new Candidate(1,  Set.of("X", "Y", "V", "B"));
        Candidate candidateNo_2 = new Candidate(2,  Set.of("A","C"));
        Candidate candidateNo_3 = new Candidate(3,  Set.of("D"));
        Candidate candidateNo_4 = new Candidate(4,  Set.of("E"));
        Candidate candidateNo_5 = new Candidate(5,  Set.of("F"));
        Candidate candidateNo_6 = new Candidate(6,  Set.of("X", "Y", "Z"));

        List<Candidate> candidates = List.of(candidateNo_1, candidateNo_2,candidateNo_3, candidateNo_4,candidateNo_5, candidateNo_6);

        assertEquals (5, minimumCombinationOfCandidate.findMinimumCombinationOfCandidate(skillsRequired, candidates));
    }
}
