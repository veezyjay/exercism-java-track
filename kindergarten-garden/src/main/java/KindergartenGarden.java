import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class KindergartenGarden {
    private String garden;

    KindergartenGarden(String garden) {
        this.garden = garden;
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> studentPlants = new ArrayList<>();
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};
        String[] gardenRows = garden.split("\n");
        String firstRow = gardenRows[0];
        String secondRow = gardenRows[1];
        int studentIndex = Arrays.asList(students).indexOf(student);
        int cupStartPosition = studentIndex * 2;
        
        studentPlants.add(Plant.getPlant(firstRow.charAt(cupStartPosition)));
        studentPlants.add(Plant.getPlant(firstRow.charAt(cupStartPosition + 1)));
        studentPlants.add(Plant.getPlant(secondRow.charAt(cupStartPosition)));
        studentPlants.add(Plant.getPlant(secondRow.charAt(cupStartPosition + 1)));
        return studentPlants;
    }

}
