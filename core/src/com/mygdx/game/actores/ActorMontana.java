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
        setSize(montana.getRegionWidth(),montana.getRegionHeight()); //damos dimensiones para las colisiones
    }


    @Override
    public void act(float delta) {
       // float x=getX(); // mal efecto no uniforme
       // setX(x-10);  //

        /// multiplicar delta por pixeles por segundo
        setX(getX()-250*delta);

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(montana,getX(),getY());
    }
}
