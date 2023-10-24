public class Main {
    public static void main(String[] args) {
        Book book = new Book("Мастер и маргарита", "М. Булгаков", 1929);
        book.setAge(1940);
        System.out.println("Название: "+book.getTitle());
        System.out.println("Автор:"+book.getAuthor());
        System.out.println("Год издания:"+book.getAge());


        Book book1 = new Book("Записки из Мертвого дома", "Ф.Достоевский",1860);
        System.out.println("Название: "+book1.getTitle());
        System.out.println("Автор: "+book1.getAuthor());
        System.out.println("Год издания: "+book1.getAge());
        book1.setAge(1961);
        System.out.println("Год переиздания " + book1.getAge());
    }
}