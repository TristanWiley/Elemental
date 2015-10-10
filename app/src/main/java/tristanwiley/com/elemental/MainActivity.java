package tristanwiley.com.elemental;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ElementInfo e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            e = new ElementInfo();
            e.getElement(getAssets().open("elements.csv"));
        }catch (Exception e){
            //Damn
        }

        // Add one row for testing
        TableRow tableRow = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            if (i == 0) {
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + 1));
                tableRow.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
            }
            if (i == 16){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(2));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(2));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(2));
                tableRow.addView(v);
            }else{
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText("");
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText("");
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText("");
                tableRow.addView(v);
            }
        }

        // Add one row for testing
        TableRow tableRow2 = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            if (i == 0) {
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + 3));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + 3));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + 3));
                tableRow2.addView(v);
            }else if (i == 1){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);

                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + 3));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + 3));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + 3));
                tableRow2.addView(v);
            }else if (i > 11){
                int n = 7;
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i -n));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i -n));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i -n));
                tableRow2.addView(v);
            }else{
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText("");
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText("");
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText("");
                tableRow2.addView(v);
            }
        }

        // Add one row for testing
        TableRow tableRow3 = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            if (i == 0) {
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + 11));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + 11));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + 11));
                tableRow3.addView(v);
            }else if (i == 1){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + 11));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + 11));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + 11));
                tableRow3.addView(v);
            }else if (i > 11){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + 1));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + 1));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + 1));
                tableRow3.addView(v);
            }else{
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText("");
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText("");
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText("");
                tableRow3.addView(v);
            }        }

        // Add another row for testing
        TableRow tableRow4 = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            int n = 19;
            final int fNum = i;
            View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
            View.OnClickListener clickListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                }
            };
            v.setOnClickListener(clickListener);
            TextView name = (TextView) v.findViewById(R.id.element_name);
            name.setText(e.getName(i + n));
            TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
            num.setText(e.getAtomic(i + n));
            TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
            symbol.setText(e.getSymbol(i + n));
            tableRow4.addView(v);
        }

        // Add one row for testing
        TableRow tableRow5 = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            int n = 37;
            final int fNum = i;
            View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
            View.OnClickListener clickListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                }
            };
            v.setOnClickListener(clickListener);
            TextView name = (TextView) v.findViewById(R.id.element_name);
            name.setText(e.getName(i + n));
            TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
            num.setText(e.getAtomic(i + n));
            TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
            symbol.setText(e.getSymbol(i + n));
            tableRow5.addView(v);
        }

        // Add another row for testing
        TableRow tableRow6 = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            if(i == 0){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + 55));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + 55));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + 55));
                tableRow6.addView(v);

            }else if(i == 1){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + 55));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + 55));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + 55));
                tableRow6.addView(v);
            }else if(i == 2){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText("57-71");
                tableRow6.addView(v);
            }else{
                int n = 69;
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + n));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + n));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + n));
                tableRow6.addView(v);
            }

        }

        TableRow tableRow7 = new TableRow(this);
        // Add one row for testing
        for (int i = 0; i < 18; i++) {
            int n = 87;
            if(i == 0){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + n));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + n));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + n));
                tableRow7.addView(v);

            }else if(i == 1){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + n));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + n));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + n));
                tableRow7.addView(v);
            }else if(i == 2){
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(findViewById(R.id.mainActivity), e.getName(fNum), Snackbar.LENGTH_LONG).show();
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText("89-103");
                tableRow7.addView(v);
            }else{
                int nn = 101;
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(fNum);
                    }
                };
                v.setOnClickListener(clickListener);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(i + nn));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(i + nn));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(i + nn));
                tableRow7.addView(v);
            }

        }


        TableLayout tableLayout = (TableLayout) findViewById(R.id.periodic_table);
        tableLayout.addView(tableRow);
        tableLayout.addView(tableRow2);
        tableLayout.addView(tableRow3);
        tableLayout.addView(tableRow4);
        tableLayout.addView(tableRow5);
        tableLayout.addView(tableRow6);
        tableLayout.addView(tableRow7);

    }
    
    public void loadElement(int num){
        
    }
}
