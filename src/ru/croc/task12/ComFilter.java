package ru.croc.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ComFilter implements BlackListFilter {
    @Override
    public void filterComments(List<String> comments, Set<String> blackList) {
        List<String> unCorrectComments = new ArrayList<>();
        for (String commentNow : comments) {
            for (String badWordNow : blackList) {
                if(commentNow.contains(badWordNow)) {
                    unCorrectComments.add(commentNow);
                    break;
                }
            }
        }
        comments.removeAll(unCorrectComments);
    }
}

