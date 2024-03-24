package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterTest {

    @Test
    public void shouldMovieAdd() {

        MoviePoster movieService = new MoviePoster(1);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";
        String movie8 = "Пчеловод";

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
        movieService.add(movie5);
        movieService.add(movie6);
        movieService.add(movie7);
        movieService.add(movie8);

        String[] actual = movieService.findLast();
        String[] expected = {movie8};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {

        MoviePoster movieService = new MoviePoster();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
        movieService.add(movie5);
        movieService.add(movie6);
        movieService.add(movie7);

        String[] actual = movieService.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {

        MoviePoster movieService = new MoviePoster();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
        movieService.add(movie5);
        movieService.add(movie6);
        movieService.add(movie7);

        String[] actual = movieService.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastNewLimits() {

        MoviePoster movieService = new MoviePoster(3);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
        movieService.add(movie5);
        movieService.add(movie6);
        movieService.add(movie7);

        String[] actual = movieService.findLast();
        String[] expected = {movie7, movie6, movie5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastNewLimits2() {

        MoviePoster movieService = new MoviePoster(7);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
        movieService.add(movie5);
        movieService.add(movie6);
        movieService.add(movie7);

        String[] actual = movieService.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }
}
