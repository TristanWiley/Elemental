package tristanwiley.com.elemental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ElementInfo e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            e = new ElementInfo();
            e.getElement(getAssets().open("elements.csv"));
        } catch (Exception e) {
            //Damn
        }

        // Add one row for testing
        TableRow tableRow = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            if (i == 0) {
                final int fNum = i;
                final int number = i + 1;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                tableRow.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            }
            if (i == 16) {
                final int fNum = i;
                final int number = 2;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            } else {
                final int fNum = i;

                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
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
                final int number = i + 3;

                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow2.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            } else if (i == 1) {
                final int fNum = i;
                final int number = i + 3;

                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow2.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            } else if (i == 5){
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText("Element Name");
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText("Atomic #");
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText("Symbol");
                tableRow2.addView(v);

            } else if (i > 11) {
                int n = 7;
                final int number = i - n;
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow2.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            } else {
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

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
                final int number = i + 11;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow3.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            } else if (i == 1) {
                final int fNum = i;
                final int number = i + 11;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow3.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            } else if (i > 11) {
                final int fNum = i;
                final int number = i + 1;

                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow3.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            } else {
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText("");
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText("");
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText("");
                tableRow3.addView(v);


            }
        }

        // Add another row for testing
        TableRow tableRow4 = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            int n = 19;
            final int number = i + n;
            final int fNum = i;
            View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

            TextView name = (TextView) v.findViewById(R.id.element_name);
            name.setText(e.getName(number));
            TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
            num.setText(e.getAtomic(number));
            TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
            symbol.setText(e.getSymbol(number));
            tableRow4.addView(v);
            View.OnClickListener clickListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    loadElement(number);
                }
            };
            v.setOnClickListener(clickListener);

        }

        // Add one row for testing
        TableRow tableRow5 = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            int n = 37;
            final int number = i + n;
            final int fNum = i;
            View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

            TextView name = (TextView) v.findViewById(R.id.element_name);
            name.setText(e.getName(number));
            TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
            num.setText(e.getAtomic(number));
            TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
            symbol.setText(e.getSymbol(number));
            tableRow5.addView(v);
            View.OnClickListener clickListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    loadElement(number);
                }
            };
            v.setOnClickListener(clickListener);

        }

        // Add another row for testing
        TableRow tableRow6 = new TableRow(this);
        for (int i = 0; i < 18; i++) {
            if (i == 0) {
                final int fNum = i;
                final int number = i + 55;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow6.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);


            } else if (i == 1) {
                final int fNum = i;
                final int number = i + 55;

                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow6.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            } else if (i == 2) {
                final int fNum = i;
                final String range = "57-71";
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);

                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                num.setText("");
                symbol.setText(range);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText("");
                tableRow6.addView(v);

                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showExtraElements(range, true);
                    }
                };
                v.setOnClickListener(clickListener);



            } else {
                int n = 69;
                final int number = i + n;
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow6.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            }

        }

        TableRow tableRow7 = new TableRow(this);
        // Add one row for testing
        for (int i = 0; i < 18; i++) {
            int n = 87;
            final int number = i + n;
            if (i == 0) {
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow7.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);


            } else if (i == 1) {
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(number));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(number));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(number));
                tableRow7.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                v.setOnClickListener(clickListener);

            } else if (i == 2) {
                final String range = "89-103";
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                num.setText("");
                symbol.setText(range);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText("");
                tableRow7.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showExtraElements(range, false);
                    }
                };
                v.setOnClickListener(clickListener);

            } else {
                int nn = 101;
                final int nnumber = i + nn;
                final int fNum = i;
                View v = getLayoutInflater().inflate(R.layout.table_square, null, false);
                TextView name = (TextView) v.findViewById(R.id.element_name);
                name.setText(e.getName(nnumber));
                TextView num = (TextView) v.findViewById(R.id.element_atomic_number);
                num.setText(e.getAtomic(nnumber));
                TextView symbol = (TextView) v.findViewById(R.id.element_symbol);
                symbol.setText(e.getSymbol(nnumber));
                tableRow7.addView(v);
                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(nnumber);
                    }
                };
                v.setOnClickListener(clickListener);

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

    public void loadElement(int num) {
        Intent i = new Intent(MainActivity.this, ElementDetail.class);
        i.putExtra("ATOMIC_NUMBER", num);
        startActivity(i);
    }

    public void showExtraElements(String range, boolean firstExtra) {
        FragmentManager fm = getSupportFragmentManager();
        ExtraElementFrag editNameDialog = ExtraElementFrag.newInstance(range);
        Bundle args = new Bundle();
        args.putString("range", range);
        args.putBoolean("first_extra", firstExtra);
        editNameDialog.setArguments(args);
        editNameDialog.show(fm, "fragment_edit_name");
    }
}

