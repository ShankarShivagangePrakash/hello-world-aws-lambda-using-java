package helloworld;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DataTypes {

    public int getNumber(float number) {
        return (int)number;
    }
    public boolean getBoolean(float number) {
        return number > 100 ? true : false;
    }

    public List<Integer> getStudentsScore(List<String> names) {

        Map<String, Integer> studentsScore = new HashMap<>();
        studentsScore.put("gill", 100);
        studentsScore.put("Harris", 95);
        studentsScore.put("Bob", 85);

        List<Integer> matchingScores = new LinkedList<>();
        names.forEach(name -> {
            matchingScores.add(studentsScore.get(name));
        });

        return matchingScores;
    }

    public void printMapData(Map<String, Integer> studentScores) {
        System.out.println(studentScores);
    }
}
