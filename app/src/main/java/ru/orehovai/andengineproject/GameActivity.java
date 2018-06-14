package ru.orehovai.andengineproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.ui.IGameInterface;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import java.io.IOException;

public class GameActivity extends SimpleBaseGameActivity {

    //public static Camera mCamera;

    /**
     * Размеры экрана и камеры
     */
    public static final int Camera_width = 800;
    public static final int Camera_height = 480;

    /**
     * Основная сцена игры
     */
    // public static Scene MainScene;

    /**
     * Область на Атласе, в которую загружается графика для спрайта
     */
    TextureRegion _Sprite_TR;

    /**
     * Called when the activity is first created.
     */

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_game);
    }*/

 /*   @Override
    public Engine onLoadEngine() {

    }*/


    /*@Override
    public void onLoadResources() {

    }*/

    /*@Override
    public Scene onLoadScene() {
    }*/
    /*@Override
    public void onLoadComplete() {

    }*/
    @Override
    public EngineOptions onCreateEngineOptions() {


        Camera mCamera = new Camera(0, 0, Camera_width, Camera_height);
        return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,
                new RatioResolutionPolicy(Camera_width, Camera_height), mCamera);
    }

    /**
     * Создаём камеру размером 800*480
     * Я ориентируюсь на экран своего Galaxy S
     */
       /*mCamera = new Camera(0, 0, Camera_width, Camera_height);
        /**
         * Создаем движок с некоторыми опциями
         */
        /*return new Engine(
                /**
                 * Опции движка
                 */
               /* new EngineOptions(
                        true,   //режим Fullscreen = true
                        ScreenOrientation.LANDSCAPE_FIXED,    //ориентация экрана ГОРИЗОНТАЛЬНАЯ
                        /**
                         * Здесь нужно указать правила для вывода графики
                         * На разных устройствах экран имеет разные свойства:
                         * разрешение экрана, плотность в точках/дюйм и прочие
                         *
                         *  В данном случае RatioResolutionPolicy позволит
                         *  движку отображать графику в игре без искажений на любых экранах,
                         *  т.е. вся графика будет ПРОПОРЦИОНАЛЬНО уменьшатся или
                         *  увеличиваться относительно заданного нами размера (800x480)
                         */
                       /* new RatioResolutionPolicy(Camera_width, Camera_height),
                        /**
                         * Указываем основную камеру для движка
                         */
                      /*  mCamera))
                        //.getAudioOptions().getSoundOptions().setNeedsSound(true)
                        //.getMusicOptions().setNeedsMusic(true));
                        //.setNeedsSound(true)    //игра будет использовать звуки
                        //.setNeedsMusic(true));  //игра будет использовать музыку
        //return null;
    }*/
    @Override
    public void onCreateResources() {

    }

    /**
     * Указываем путь до графики. В данном случае графика будет загружаться из папки assets/gfx/
     */
    //BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");

    /**
     * Создаем Атлас, в который будем загружать графику.
     * TextureOptions - задаёт режим вывода графики на экран.
     * Если вы планируете масштабировать спрайты, изменять прозрачность и спрайты
     * имеют изначально размыте края, то лучше ставить BILINEAR_PREMULTIPLYALPHA
     * Тут нужно эскпериментировать
     * Бывает:
     * NEAREST
     * NEAREST_PREMULTIPLYALPHA
     * BILINEAR
     * BILINEAR_PREMULTIPLYALPHA
     * и др.
     */
        /*BitmapTextureAtlas Texture1 = new BitmapTextureAtlas(mEngine.getTextureManager(), 512, 512,TextureOptions.NEAREST_PREMULTIPLYALPHA);
        //BitmapTextureAtlas Texture1 = new BitmapTextureAtlas(512,512,TextureOptions.NEAREST_PREMULTIPLYALPHA);

        /**
         * Создаем регион (область) для спрайта в этом атласе.
         * Нужно указать координаты региона в Атласе (0,0 в данном случае)
         */
        /*_Sprite_TR = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Texture1, this, "face.png", 0, 0);

        /**
         * Теперь всё готово. Загружаем Атлас
         */
        /*mEngine.getTextureManager().loadTexture(Texture1);

    }*/
    @Override
    protected Scene onCreateScene() {

        /**
         * Создаём основную сцену и запоминаем её
         * в MainScene. Это упростит доступ к сцене из
         * любого другого класса и сэкономит время.
         * Иначе придётся каждый раз вызывать метод
         * this.mEngine.getScene();
         * чтобы получить доступ к Сцене
         */
      /*  MainScene = new Scene();
        return MainScene;*/
        Scene scene = new Scene();
        scene.setBackground(new Background(0.09804f, 0.6274f, 0));
        return scene;


    }

   /*@Override
    public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws IOException {

        /**
         * Всё прошло успешно. Текстуры загружены,
         * движок создан, сцена создана.
         * Самое время создать спрайт и добавить
         * его на сцену
         */
        /*Sprite _Sprite = new Sprite(100, 100, _Sprite_TR);
        MainScene.attachChild(_Sprite);

    }*/
}