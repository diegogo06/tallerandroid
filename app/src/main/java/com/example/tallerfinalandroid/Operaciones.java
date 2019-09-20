package com.example.tallerfinalandroid;

import androidx.appcompat.app.AppCompatActivity;
import com.example.tallerfinalandroid.operaciones.OperacionesLogica;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.function.ToIntFunction;


public class Operaciones extends AppCompatActivity{
private TextView num1;
private TextView num2;
private Button btnresult;
private TextView txtoperador;
private EditText txtrespu;
private TextView txtrespuesta;
 OperacionesLogica operacionesLogica = new OperacionesLogica();

    public TextView getNum1() {
        return num1;
    }

    public void setNum1(TextView num1) {
        this.num1 = num1;
    }

    public TextView getNum2() {
        return num2;
    }

    public void setNum2(TextView num2) {
        this.num2 = num2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);



this.asignar();

        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                correctoincorrecto();
            }
        });

    }

private void asignar() {
  num1.setText(Integer.toString(operacionesLogica.getNumero1()));
num2.setText(Integer.toString(operacionesLogica.getNumero2()));
txtoperador.setText(operacionesLogica.getOperador());
    txtrespu=findViewById(R.id.editRespuesta);
    operacionesLogica.setNumero1(operacionesLogica.generarnumero(50));
    operacionesLogica.setNumero2(operacionesLogica.generarnumero1(50));
    num1=findViewById(R.id.txtnumero1);
    num2=findViewById(R.id.txtnumero2);
    operacionesLogica.setOpcion(operacionesLogica.generarnumero(5));
    txtoperador=findViewById(R.id.txtoperacion);
    btnresult=findViewById(R.id.btnresultado);
txtrespuesta=findViewById(R.id.txtrespuesta);


}


    private void correctoincorrecto()  {
        {
            txtrespu=findViewById(R.id.editRespuesta);


            int  resp = Integer.parseInt(txtrespu.toString());

            if (resp==operacionesLogica.getResultado()) {

                txtrespuesta.setText("Correcto");
                txtrespu.setCursorVisible(true);
            }

            else {
                txtrespuesta.setText("falso");
                txtrespu.setCursorVisible(true);
            }

        }
    }
}
