public class Main {
    public static void main(String[] args) {
        Author author = new Author("Булгаков ","Михаил");
        Book book = new Book("Мастер и маргарита",1929);
        book.setAge(1940);
        System.out.println("Название: "+book.getTitle());
        System.out.println("Автор:"+author.getSurname());
        System.out.println("Автор:"+author.getName());
        System.out.println("Год издания:"+book.getAge());


        Author author1 = new Author("Достоевский", "Федор");
        Book book1 = new Book("Записки из Мертвого дома",1860);
        System.out.println("Название: "+book1.getTitle());
        System.out.println("Автор: "+author1.getSurname());
        System.out.println("Автор: "+author1.getName());
        System.out.println("Год издания: "+book1.getAge());
        book1.setAge(1961);
        System.out.println("Год переиздания " + book1.getAge());
    }
}