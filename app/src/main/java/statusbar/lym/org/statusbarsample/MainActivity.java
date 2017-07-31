package statusbar.lym.org.statusbarsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends BaseActivity {

    private Toolbar mTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTool = (Toolbar) findViewById(R.id.toolbar);
        mTool.setTitle(MainActivity.class.getSimpleName());
        findViewById(R.id.btn_steep_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BigImageActivity.class));
            }
        });
        findViewById(R.id.btn_change_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ColourActivity.class));
            }
        });
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }
}
