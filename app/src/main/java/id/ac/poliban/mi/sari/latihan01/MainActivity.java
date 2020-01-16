package id.ac.poliban.mi.sari.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etNim = findViewById(R.id.etNim);
        final EditText etName = findViewById(R.id.etName);
        EditText etAdress = findViewById(R.id.etAddres);
        final EditText etPhone = findViewById(R.id.etPhone);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);

        btClear.setOnClickListener(v -> {
            //mengkosongkan EditText
            etNim.setText("");
            etName.setText("");
            etAdress.setText("");
            etPhone.setText("");
        });

        btSubmit.setOnClickListener(v -> {
            etNim.setText("");
            etName.setText("");
            etAdress.setText("");
            etPhone.setText("");
            etNim.requestFocus();
            Toast.makeText(this, "Sukses!!!", Toast.LENGTH_SHORT).show();
        });
    }
}
