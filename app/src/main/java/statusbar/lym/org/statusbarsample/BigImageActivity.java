package statusbar.lym.org.statusbarsample;

/**
 * 透明状态栏
 *
 * @author yaoming.li
 * @since 2017-07-28 15:53
 */
public class BigImageActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return R.layout.activity_big_image;
    }

    @Override
    protected boolean topIsImage() {
        return true;
    }
}
