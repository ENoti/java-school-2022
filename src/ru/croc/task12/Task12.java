package ru.croc.task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Task12 {
    public static void main (String[] args) {
        List<String> comments = new ArrayList<>(Arrays.asList("Hello my boy", "Boy you're not ready!", "What the fox?!", "Fox off! ", "It's so good"));
        Set<String> badWords = Set.of("boy", "fox", "Fox", "Boy");
        ComFilter commentsFilter = new ComFilter();
        commentsFilter.filterComments(comments, badWords);
        System.out.println(comments);
    }
}
