package helloworld;

import helloworld.pojo.ClinicalRecord;
import helloworld.pojo.Patient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

    public Map<String, List<Map<String, Integer>>> AddStudentScores(Map<String, List<Map<String, Integer>>> studentScores) {
        System.out.println(studentScores);
        return studentScores;
    }

    public ClinicalRecord getPatientClinicalRecord(Patient patient) {
        System.out.println(patient.getPatientId());
        System.out.println(patient.getName());

        ClinicalRecord clinicalRecord = new ClinicalRecord();
        clinicalRecord.setBp("80/120");
        clinicalRecord.setHeartRate("82");
        return clinicalRecord;
    }

    public void getOutPut(InputStream inputStream, OutputStream outputStream) throws IOException {
        int data;
        while ((data = inputStream.read()) != -1) {
            outputStream.write(Character.toLowerCase(data));
        }
    }
}
