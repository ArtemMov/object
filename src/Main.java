public class Main {
    public static void main(String[] args) {
        Author login = new Author("Булгаков ","Михаил");
        Book book = new Book("Мастер и маргарита",login, 1929);
        book.setAge(1940);
        System.out.println("Название: "+book.getTitle()+ login +" Год издания: "+book.getAge());
        System.out.println("Автор:"+login.getSurname() +login.getName());
        System.out.println(book.toString());





        Author login1 = new Author("Достоевский ", "Федор");
        Book book1 = new Book("Записки из Мертвого дома",login1,1860);
        book1.setAge(1961);
        System.out.println("Название: "+book1.getTitle()+" Год издания: "+book1.getAge());
        System.out.println("Автор:"+login1.getSurname() +login1.getName());
        System.out.println(book1.toString());
    }
}