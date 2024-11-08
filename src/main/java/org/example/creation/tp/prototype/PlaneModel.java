package org.example.creation.tp.prototype;

public class PlaneModel extends Model3D {
    public PlaneModel(int taille, String couleur, String texture) {
        super(taille, couleur, texture);
    }

    @Override
    public PlaneModel clone() {
        return new PlaneModel(this.getTaille(), this.getCouleur(), this.getTexture());
    }
}