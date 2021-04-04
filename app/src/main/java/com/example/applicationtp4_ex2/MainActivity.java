package com.example.applicationtp4_ex2;import androidx.appcompat.app.AppCompatActivity;import androidx.fragment.app.FragmentManager;import android.app.DatePickerDialog;import android.os.Bundle;import android.view.View;import android.widget.Button;import android.widget.Toast;public class MainActivity extends AppCompatActivity implements SimpleDialogListener {    private Button PaiementCarte, PaiementPayPal, OK;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);        PaiementCarte = (Button) findViewById(R.id.PaiementCarte);        PaiementPayPal = (Button) findViewById(R.id.PaiementPayPal);        PaiementCarte.setOnClickListener(PaiementC);        PaiementPayPal.setOnClickListener(PaiementP);    }    private View.OnClickListener PaiementC = new View.OnClickListener() {        @Override        public void onClick(View v) {            showCarteDialog();        }    };    private View.OnClickListener PaiementP = new View.OnClickListener() {        @Override        public void onClick(View v) {            showSimpleDialog();        }    };    private void showSimpleDialog() {        FragmentManager fm = getSupportFragmentManager();        SimpleDialogFragment simpleDialogFragment = SimpleDialogFragment.newInstance("Titre");        simpleDialogFragment.show(fm, "fragment_simple_dialog_paypal");    }    private void showCarteDialog(){        FragmentManager fm = getSupportFragmentManager();        carteFragment carteF = carteFragment.newInstance("Titre");        carteF.show(fm, "fragment_simple_dialog_carte");    }    public void onOkClickDialog(String nom) {        Toast.makeText(this, "Hi, " + nom, Toast.LENGTH_SHORT).show();    }}