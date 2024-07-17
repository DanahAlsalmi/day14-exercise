public class Main {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", 500.0, "John Doe");
        System.out.println("Book Name: " + book.getName());
        System.out.println("Book Price: " + book.getPrice());
        System.out.println("Book Author: " + book.getAuther());
        System.out.println("Book Discount: " + book.getDiscount());
        System.out.println("----------------------------------------");

        Movie movie = new Movie("Cinderella", 100.0, "Disney");
        System.out.println("Movie Name: " + movie.getName());
        System.out.println("Movie Price: " + movie.getPrice());
        System.out.println("Movie Director: " + movie.getDirector());
        System.out.println("Movie Discount: " + movie.getDiscount());

        book.setName("Advanced Java Programming");
        book.setPrice(75.0);
        book.setAuther("Jane Smith");

        movie.setName("Molan");
        movie.setPrice(150.0);
        movie.setDirector("Disney");

        System.out.println("----------------------------------------");
        System.out.println("\nModified Book Name: " + book.getName());
        System.out.println("Modified Book Price: " + book.getPrice());
        System.out.println("Modified Book Author: " + book.getAuther());
        System.out.println("Modified Book Discount: " + book.getDiscount());
        System.out.println("----------------------------------------");

        System.out.println("\nModified Movie Name: " + movie.getName());
        System.out.println("Modified Movie Price: " + movie.getPrice());
        System.out.println("Modified Movie Director: " + movie.getDirector());
        System.out.println("Modified Movie Discount: " + movie.getDiscount());


        System.out.println("----------------------------------------");
        System.out.println("--------------------Q2--------------------");

        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial position:");
        System.out.println(point);

        point.moveUp();
        System.out.println("After moving up:");
        System.out.println(point);

        point.moveDown();
        System.out.println("After moving down:");
        System.out.println(point);

        point.moveLeft();
        System.out.println("After moving left:");
        System.out.println(point);

        point.moveRight();
        System.out.println("After moving right:");
        System.out.println(point);

    }
}