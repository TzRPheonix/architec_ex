package org.example.creation.tp.prototype;

public abstract class Model3D {
    private int taille;
    private String couleur;
    private String texture;

    public Model3D(int taille, String couleur, String texture) {
        this.taille = taille;
        this.couleur = couleur;
        this.texture = texture;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public abstract Model3D clone();

    @Override
    public String toString() {
        return "Model3D{" +
                "taille=" + taille +
                ", couleur='" + couleur + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }


}
