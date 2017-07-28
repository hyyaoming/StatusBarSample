package statusbar.lym.org.statusbarsample;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import statusbar.lym.org.statusbarsample.util.StatusBarManager;

public class MainActivity extends AppCompatActivity {

    private Toolbar mTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTool = (Toolbar) findViewById(R.id.toolbar);
        mTool.setTitle(MainActivity.class.getSimpleName());
        StatusBarManager.setStatusBar(this, ContextCompat.getColor(this,R.color.colorPrimary),false);
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
}
