package com.example.container_gaston_cathalifaudxd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.opengl.EGLExt;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import objetos.Clientes;
import objetos.Productos;

public class MainActivity extends AppCompatActivity {

    private Spinner  spinner1, spinner2;
    private TextView text1, text2, text3, text4, text5, text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.spn1);
        spinner2 = (Spinner) findViewById(R.id.spn2);
        text1 = (TextView) findViewById(R.id.lbl1);
        text2 = (TextView) findViewById(R.id.lbl2);
        text3 = (TextView) findViewById(R.id.lbl3);
        text4 = (TextView) findViewById(R.id.lbl4);
        text5 = (TextView) findViewById(R.id.lbl5);
        text6 = (TextView) findViewById(R.id.lblRes);

        Clientes oClient = new Clientes();
        Productos oProduct = new Productos();

        oClient.getClientes();
        oProduct.getProductos();

        ArrayAdapter arrayAdapterCli = new ArrayAdapter(this, android.R.layout.simple_spinner_item, oClient.getClientes());
        ArrayAdapter arrayAdapterPro = new ArrayAdapter(this, android.R.layout.simple_spinner_item, oProduct.getProductos());

        spinner1.setAdapter(arrayAdapterCli);
        spinner2.setAdapter(arrayAdapterPro);

        text1.setText(""+ oProduct.getProductos()[0] + " "+ oProduct.getPrecios()[0]);
        text2.setText(""+ oProduct.getProductos()[1] + " "+ oProduct.getPrecios()[1]);
        text3.setText(""+ oProduct.getProductos()[2] + " "+ oProduct.getPrecios()[2]);
        text4.setText(""+ oProduct.getProductos()[3] + " "+ oProduct.getPrecios()[3]);
        text5.setText(""+ oProduct.getProductos()[4] + " "+ oProduct.getPrecios()[4]);



        //forma antigua
        /**spinner1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, oClient.getClientes()));
        spinner1.setOnItemSelectedListener(new  AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //vacio
            }
        });**/




    }

    public void Calcular(View view){

        int salario = 0;
        int precio = 0;
        int resultado = 0;
        Clientes oCLiente = new Clientes();
        Productos oProduct = new Productos();
        for (int i = 0; i<=oCLiente.getClientes().length; i++) {

            if (spinner1.getSelectedItem().toString().equals(oCLiente.getClientes()[i])) {
                salario = oCLiente.getSalarios()[i];
                break;

            }

        }
        for (int x = 0; x<=oProduct.getProductos().length; x++) {

            if (spinner2.getSelectedItem().toString().equals(oProduct.getProductos()[x])){
                precio = oProduct.getPrecios()[x];
                break;
            }

        }
        resultado = salario - precio;
        text6.setText("el resultaddo es: "+ resultado);

    }

}