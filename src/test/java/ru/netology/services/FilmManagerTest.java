package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilmManagerTest {

    @Test
    public void filmManagerWithNotInitialConstructorTest() {
        FilmManager manager = new FilmManager(1);

        manager.add("Movie_1");
        manager.add("Movie_2");
        manager.add("Movie_3");

        String[] expected = {"Movie_3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyMoviesManagerTest() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void notEmptyMoviesManagerTest() {
        FilmManager manager = new FilmManager();

        manager.add("Movie_1");
        String[] expected = {"Movie_1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingMoviesTest() {
        FilmManager manager = new FilmManager();

        manager.add("Movie_1");
        manager.add("Movie_2");
        manager.add("Movie_3");

        String[] expected = {"Movie_1", "Movie_2", "Movie_3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieTest() {
        FilmManager manager = new FilmManager();

        manager.add("Movie_1");
        manager.add("Movie_2");
        manager.add("Movie_3");

        String[] expected = {"Movie_3", "Movie_2", "Movie_1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outputLastFiveFilmsTest() {
        FilmManager manager = new FilmManager();

        manager.add("Movie_1");
        manager.add("Movie_2");
        manager.add("Movie_3");
        manager.add("Movie_4");
        manager.add("Movie_5");
        manager.add("Movie_6");
        manager.add("Movie_7");

        String[] expected = {"Movie_7", "Movie_6", "Movie_5", "Movie_4", "Movie_3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}