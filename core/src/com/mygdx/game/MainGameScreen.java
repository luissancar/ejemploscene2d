package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.actores.ActorJugador;
import com.mygdx.game.actores.ActorMontana;

/**
 * Created by luissancar on 26/12/16.
 */

public class MainGameScreen extends BaseScreen {


    private Stage stage;
    private ActorJugador jugador;
    private Texture texturaJugador;
    private Texture texturaMontana;
    private TextureRegion regionMontana;
    private ActorMontana montana;


    public MainGameScreen(MyGdxGame game) {
        super(game);
        texturaJugador=new Texture("badlogic.png");
        texturaMontana=new Texture("sierra.png");
        regionMontana=new TextureRegion(texturaMontana,0,72,256,85);

    }


    @Override
    public void show() {
        stage=new Stage();
        stage.setDebugAll(true);//dibuja márgenes objetos para debug
        jugador=new ActorJugador(texturaJugador);
        montana=new ActorMontana(regionMontana);



        stage.addActor(montana);
        stage.addActor(jugador);
        jugador.setPosition(200,0);
        montana.setPosition(408,0);
    }

    @Override
    public void hide() {
        stage.dispose();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0.8f,0.8f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();

        comprobarColisiones();

        stage.draw();
    }

    private void comprobarColisiones(){
        if (jugador.isVivo() && jugador.getX()+jugador.getWidth()>montana.getX())  {
            System.out.println("Colisión");
            jugador.setVivo(false);
        }

    }

}
