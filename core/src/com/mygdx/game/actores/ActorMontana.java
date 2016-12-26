package com.mygdx.game.actores;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by luissancar on 26/12/16.
 */

public class ActorMontana extends Actor {

    private TextureRegion montana;

    public ActorMontana(TextureRegion montana) {
        this.montana=montana;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(montana,getX(),getY());
    }
}
