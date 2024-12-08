package task_3;
import java.util.ArrayList;
import java.util.Comparator;

public class GroupDeanery {
    private ArrayList<Deanery> deaneries;

    public GroupDeanery() {
        this.deaneries = new ArrayList<>();
    }

    public GroupDeanery(ArrayList<Deanery> deaneries) {
        this.deaneries = deaneries;
    }

    public ArrayList<Deanery> getDeaneries() {
        return deaneries;
    }

    public void setDeaneries(ArrayList<Deanery> deaneries) {
        this.deaneries = deaneries;
    }

    public Deanery getDeanery(int index) {
        return deaneries.get(index);
    }

    public void setDeanery(int index, Deanery deanery) {
        deaneries.set(index, deanery);
    }

    public void addDeanery(Deanery deanery) {
        deaneries.add(deanery);
    }

    public void removeDeaneryByFaculty(String facultyName) {
        boolean removed = deaneries.removeIf(deanery -> deanery.getNameFaculty().equalsIgnoreCase(facultyName));
        if (!removed) {
            System.out.println("Не найден деканат с названием факультета: " + facultyName);
        }
    }

    public void sortByFacultyName() {
        deaneries.sort(Comparator.comparing(Deanery::getNameFaculty));
    }

    public void updateDeanNameById(int id, String newDeanName) {
        for (Deanery deanery : deaneries) {
            if (deanery.getUniqueId() == id) {
                deanery.setNameDean(newDeanName);
                System.out.println("Имя декана обновлено для идентификации: " + id);
                return;
            }
        }
        System.out.println("Не найдено ни одного деканата с идентификатором: " + id);
    }

    public Deanery getDeaneryById(int id) {
        for (Deanery deanery : deaneries) {
            if (deanery.getUniqueId() == id) {
                return deanery;
            }
        }
        return null;
    }

    public void printAllDeaneries() {
        for (Deanery deanery : deaneries) {
            System.out.println(deanery);
        }
    }
}
