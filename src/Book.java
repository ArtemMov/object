public class Book {
    private String title;
    private Author authorName;
    private int age;
    public Book(String title,Author authorName, int age) {
        this.title = title;
        this.authorName = authorName;
        this.age = age;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthorName() {
        return this.authorName;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}