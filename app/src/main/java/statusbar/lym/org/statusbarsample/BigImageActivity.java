package statusbar.lym.org.statusbarsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import statusbar.lym.org.statusbarsample.util.StatusBarManager;

/**
 * 透明状态栏
 *
 * @author yaoming.li
 * @since 2017-07-28 15:53
 */
public class BigImageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_image);
        StatusBarManager.setStatusBar(this, Color.TRANSPARENT,true);
    }
}
