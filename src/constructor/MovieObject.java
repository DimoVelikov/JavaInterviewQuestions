package constructor;

public class MovieObject {
    public static void main(String[] args) {

        Movie movie1 = new Movie("bg","poker","12.december","dimo");

        movie1.addCast("Dimo");
        movie1.addCasts(new String[]{"Dimo", "Ivan", "Anna", "Rada", "Casey"});

        System.out.println(movie1);

    }
}
