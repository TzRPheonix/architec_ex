package org.example.creation.singleton;

public class QuiCorrige {

    private static QuiCorrige instance;

    private QuiCorrige() {
    };

    public static QuiCorrige getInstance() {
        if (instance == null) {
            instance = new QuiCorrige();
        }
        return instance;
    };


}
