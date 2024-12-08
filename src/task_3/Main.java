package task_3;

public class Main {
    public static void main(String[] args) {
        Deanery d1 = new Deanery("Инженерный", "101", "A", "8-800-123-32-12", "Александр");
        Deanery d2 = new Deanery("Математический", "202", "B", "8-800-123-32-11", "Валентина");
        Deanery d3 = new Deanery("Физический", "303", "C", "8-800-123-32-10", "Сергей");
        Deanery d4 = new Deanery("Химический", "404", "D", "8-800-123-32-09", "Ольга");
        Deanery d5 = new Deanery("Биологический", "505", "E", "8-800-123-32-08", "Ирина");
        Deanery d6 = new Deanery("Экономический", "606", "F", "8-800-123-32-07", "Николай");
        Deanery d7 = new Deanery("Географический", "707", "G", "8-800-123-32-06", "Екатерина");
        Deanery d8 = new Deanery("Юридический", "808", "H", "8-800-123-32-05", "Анатолий");
        Deanery d9 = new Deanery("Филологический", "909", "I", "8-800-123-32-04", "Мария");
        Deanery d10 = new Deanery("Психологический", "1010", "J", "8-800-123-32-03", "Дмитрий");

        GroupDeanery group = new GroupDeanery();
        group.addDeanery(d1);
        group.addDeanery(d2);
        group.addDeanery(d3);
        group.addDeanery(d4);
        group.addDeanery(d5);
        group.addDeanery(d6);
        group.addDeanery(d7);
        group.addDeanery(d8);
        group.addDeanery(d9);
        group.addDeanery(d10);

        System.out.println("Перед сортировкой:");
        group.printAllDeaneries();

        group.sortByFacultyName();
        System.out.println("\nПосле сортировки:");
        group.printAllDeaneries();

        System.out.println("\nОбновление имени декана для ID 3...");
        group.updateDeanNameById(3, "Евгений");

        System.out.println("\nПолучение факультета по ID 3...");
        Deanery retrievedDeanery = group.getDeaneryById(3);
        if (retrievedDeanery != null) {
            System.out.println(retrievedDeanery);
        } else {
            System.out.println("Факультет с ID 3 не найден.");
        }

        System.out.println("\nУдаление факультета 'Юридический'...");
        group.removeDeaneryByFaculty("Юридический");

        System.out.println("\nПосле удаления:");
        group.printAllDeaneries();
    }
}