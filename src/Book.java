public class Book {
    private String title;
    private Author name;
    private int age;

    public Book(String title, Author name, int age) {
        this.title = title;
        this.name = name;
        this.age = age;
    }
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
