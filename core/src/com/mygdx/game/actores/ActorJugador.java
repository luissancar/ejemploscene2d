package com.mygdx.game.actores;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by luissancar on 26/12/16.
 */

public class ActorJugador extends Actor{
    private Texture jugador;
    public ActorJugador(Texture actor){
        this.jugador=actor;
    }
    @Override
    public void act(float delta) {

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(jugador,getX(),getY());


    }
}
