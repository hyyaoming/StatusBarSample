package statusbar.lym.org.statusbarsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

/**
 * 状态栏着色
 *
 * @author yaoming.li
 * @since 2017-07-28 15:58
 */
public class ColourActivity extends BaseActivity {

    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mToolBar = (Toolbar) findViewById(R.id.toolbar);
        mToolBar.setTitle(ColourActivity.class.getSimpleName());
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_colour;
    }
}
