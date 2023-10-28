public class Main {
    public static void main(String[] args) {
        Author author = new Author("Булгаков ","Михаил");
        Book book = new Book("Мастер и маргарита",author, 1929);
        book.setAge(1940);
        System.out.println("Название: "+book.getTitle()+" Год издания: "+book.getAge());
        System.out.println("Автор:"+author.getSurname() +author.getName());




        Author author1 = new Author("Достоевский ", "Федор");
        Book book1 = new Book("Записки из Мертвого дома",author,1860);
        book1.setAge(1961);
        System.out.println("Название: "+book1.getTitle()+" Год издания: "+book1.getAge());
        System.out.println("Автор:"+author1.getSurname() +author1.getName());
    }
}