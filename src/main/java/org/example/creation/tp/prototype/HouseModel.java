package org.example.creation.tp.prototype;

public class HouseModel extends Model3D {
    public HouseModel(int taille, String couleur, String texture) {
        super(taille, couleur, texture);
    }

    @Override
    public HouseModel clone() {
        return new HouseModel(this.getTaille(), this.getCouleur(), this.getTexture());
    }
}
