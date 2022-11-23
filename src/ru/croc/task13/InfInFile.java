package ru.croc.task13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.parseInt;

class InfInFile {

    Map<Integer, String> filmsMap = new HashMap<>();
    ArrayList<Set<Integer>> historyList = new ArrayList<>();

    public Map<Integer, String> getFilmsMap() {
        return filmsMap;
    }

    public ArrayList<Set<Integer>> getSetHistoryList(){
        return historyList;
    }

    static File films;
    static File history;

    InfInFile(File films, File history){
        InfInFile.films = films;
        InfInFile.history = history;
    }

    protected void initialFilms() {
        List<String> allFilms = new ArrayList<>();
        try (Scanner s = new Scanner((films))) {
            while (s.hasNext()) {
                allFilms.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(String film_i: allFilms) {
            Integer number = parseInt(film_i.substring(0, film_i.indexOf(',')));
            String nameFilm = film_i.substring(film_i.indexOf(',') + 1);
            filmsMap.put(number, nameFilm);
        }
    }

    protected void initialViews() {
        List<String> allViews = new ArrayList<>();
        try (Scanner s = new Scanner((history))) {
            while (s.hasNext()) {
                allViews.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(String view: allViews) {
            Set<Integer> views = new HashSet<>();
            String[] numbers = view.split(",");
            for(String number:numbers) {
                views.add(parseInt(number));
            }
            historyList.add(views);
        }
    }
}