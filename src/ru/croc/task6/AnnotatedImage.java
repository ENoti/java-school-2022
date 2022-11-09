package ru.croc.task6;

record AnnotatedImage(String imagePath, Annotation... annotations) {

    public String getImagePath() {
        return this.imagePath;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }

    Annotation findByPoint(int x, int y) {
        for (Annotation annotation : annotations) {
            if (annotation.getFigure(x, y))
                return annotation;
        }
        return null;
    }

    Annotation findByLabel() {
        for (Annotation annotation : annotations) {
            if (annotation.getLabel())
                return annotation;
        }
        return null;
    }
}
