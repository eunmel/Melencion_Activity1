package ph.edu.activity1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnActivity1 =findViewById(R.id.btnActivity1);
        Button btnActivity2 =findViewById(R.id.btnActivity2);
        Button btnActivity3 =findViewById(R.id.btnActivity3);
        Button btnActivity4 =findViewById(R.id.btnActivity4);
        Button btnActivity5 =findViewById(R.id.btnActivity5);

        btnActivity1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity1.class);
            startActivity(intent);
        });

        btnActivity2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        });

        btnActivity3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent);
        });

        btnActivity4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity4.class);
            startActivity(intent);
        });

        btnActivity5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity5.class);
            startActivity(intent);
        });
    }

}