package statusbar.lym.org.statusbarsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import statusbar.lym.org.statusbarsample.util.StatusBarManager;

/**
 * 基类
 *
 * @author yaoming.li
 * @since 2017-07-31 17:21
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        initStatusBar();
    }

    protected  abstract int getContentView();


    /**
     * 如下两种情况不满足需求，子类可重写
     */
    protected void initStatusBar() {
        if (enableStatusBar()) {
            if (topIsImage()) {
                StatusBarManager.setStatusBar(this, android.R.color.transparent, true);
            } else {
                StatusBarManager.setStatusBar(this, setStatusBarColor(), false);
            }
        }
    }

    /**
     * 方便于子类设置状态栏的颜色
     *
     * @return 返回状态栏的颜色
     */
    protected int setStatusBarColor() {
        return R.color.colorPrimary;
    }

    /**
     * 如果布局需侵入状态栏，子类可返回true,默认为false
     *
     * @return boolean
     */
    protected boolean topIsImage() {
        return false;
    }

    /**
     * 是否开启沉浸式模式，如果当前不需要开启沉浸式，子类返回false即可
     *
     * @return boolean
     */
    protected boolean enableStatusBar() {
        return true;
    }
}
