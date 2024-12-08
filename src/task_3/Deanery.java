package task_3;

public class Deanery {
    private static int idCounter = 0; // Статический счетчик для уникальных ID
    private final int uniqueId;
    private String nameFaculty;
    private String room;
    private String corps;
    private String telephone;
    private String nameDean;

    public Deanery(String nameFaculty, String room, String corps, String telephone, String nameDean) {
        this.uniqueId = ++idCounter;
        this.nameFaculty = nameFaculty;
        this.room = room;
        this.corps = corps;
        this.telephone = telephone;
        this.nameDean = nameDean;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNameDean() {
        return nameDean;
    }

    public void setNameDean(String nameDean) {
        this.nameDean = nameDean;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Faculty: %s, Room: %s, Corps: %s, Telephone: %s, Dean: %s",
                uniqueId, nameFaculty, room, corps, telephone, nameDean);
    }
}
