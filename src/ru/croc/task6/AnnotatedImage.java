package ru.croc.task6;

class AnnotatedImage {

    private final String imagePath;

    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation... annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }

    Annotation findByPoint(int x, int y){
        for (int i = 0; i < annotations.length; i++){
            if(annotations[i].getFigure(x, y))
                return annotations[i];
        }
        return null;
    }

    Annotation findByLabel(String label) {
        for (int i = 0; i < annotations.length; i++){
            if(annotations[i].getLabel(label) == true)
                return annotations[i];
        }
        return null;
    }
}
