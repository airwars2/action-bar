package nareshit.com.actionbar;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nareshit on 6/9/2017.
 */

public class ActionBarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionbar);

        initializeViews();
    }

    private void initializeViews() {
        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("This is ActionBar of 7 AM class");

        actionBar.setDisplayHomeAsUpEnabled(true);

        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.ic_book);

        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff0000")));
    }







}
