package kr.ac.ssu.kjminn.mirimoptionmenutest2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editDegree;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editDegree = findViewById(R.id.edit_degree);
        img1 = findViewById(R.id.img1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_rotate:
                img1.setRotation(Float.parseFloat(editDegree.getText().toString()));
                return true;
            case R.id.item_park:
                img1.setImageResource(R.drawable.seripark);
                return true;
            case R.id.item_son:
                img1.setImageResource(R.drawable.son);
                return true;
            case R.id.item_ahn:
                img1.setImageResource(R.drawable.ahn);
                return true;
        }

        return false;
    }
}