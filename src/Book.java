public class Book {
    private String name;
    private String author;
    private int age;

    public Book(String name, String author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
