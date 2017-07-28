package statusbar.lym.org.statusbarsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import statusbar.lym.org.statusbarsample.util.StatusBarManager;

/**
 * 状态栏着色
 *
 * @author yaoming.li
 * @since 2017-07-28 15:58
 */
public class ColourActivity extends AppCompatActivity {

    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour);
        mToolBar = (Toolbar) findViewById(R.id.toolbar);
        mToolBar.setTitle(ColourActivity.class.getSimpleName());
        StatusBarManager.setStatusBar(this, ContextCompat.getColor(this,R.color.colorPrimary),false);
    }
}
