package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Puente con la vista
        Casteo();
    }

    public void Casteo(){
        num1 = (EditText) findViewById(R.id.etNum1);
        num2 = (EditText) findViewById(R.id.etNum2);
        resultado = (TextView) findViewById(R.id.tvResultado);
    }

    public void suma(View view){
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double resultadoSuma = n1+n2;
        resultado.setText(""+resultadoSuma);
    }
    public void resta(View view){
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double resultadoResta = n1-n2;
        resultado.setText(""+resultadoResta);
    }
    public void multiplicacion(View view){
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double resultadoMultiplicacion = n1*n2;
        resultado.setText(""+resultadoMultiplicacion);
    }
    public void division(View view){
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double resultadoDivision = n1/n2;
        resultado.setText(""+resultadoDivision);
    }
    public void limpiar(View view){
        num1.setText("");
        num2.setText("");
        resultado.setText("");
    }
}