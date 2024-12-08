package task_4.I_classes_using_Inheritance;

public class PrintedBook extends Book {
    private int pages;

    public PrintedBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            throw new IllegalArgumentException("Количество страниц должно быть больше 0.");
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Количество страниц: " + pages;
    }
}
