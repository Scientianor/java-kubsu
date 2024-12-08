package task_4.I_classes_using_Inheritance;

public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        if (fileSize > 0) {
            this.fileSize = fileSize;
        } else {
            throw new IllegalArgumentException("Размер файла должен быть больше 0.");
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Размер файла: " + fileSize + " MB";
    }
}
