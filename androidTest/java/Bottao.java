import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.optionm.R;

public class Bottao extends AppCompatActivity {
    EditText editTextnome, editphone;
    Button buttonReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editphone = findViewById(R.id.phone);
        editTextnome = findViewById(R.id.nome);
        buttonReg = findViewById(R.id.buttonRegistrar);

        buttonReg = (Button) findViewById(R.id.buttonRegistrar);
        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome;
                String phone;
                nome = String.valueOf(editTextnome.getText());
                phone = String.valueOf(editphone.getText());

                if (nome.equals("nome") && (phone.equals("5961122"))) {
                    Toast.makeText(Bottao.this, "Registo com sucesso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Bottao.class);
                    startActivity(intent);
                } else
                    Toast.makeText(Bottao.this, "credenciais invalidas", Toast.LENGTH_SHORT).show();

            }
        });
    }
        public void botao(View view) {
            Intent intent =new Intent(this,Bottao.class);
            startActivity(intent);
        }
    }


