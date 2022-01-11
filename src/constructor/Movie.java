package constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country,title, Genre, releaseDate, director;
    public ArrayList<String> cast = new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String str){
        cast.add(str);

    }

    public void addCasts(String[] str1){
        cast.addAll(Arrays.asList(str1));
    }

    @Override
    public String toString() {
        return "constructor.Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", cast number=" + cast.size() +
                '}';
    }
}
