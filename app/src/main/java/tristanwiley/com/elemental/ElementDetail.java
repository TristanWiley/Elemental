package tristanwiley.com.elemental;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;

public class ElementDetail extends AppCompatActivity {
    String symbol;
    String name;
    int num;
    String mass;
    String density;
    String boiling;
    String melting;
    String year;
    String discoverer;
    String description;
    String uses;
    String state;
    String ocurranceValue;
    String group;
    String period;

    ImageView iv;
    CollapsingToolbarLayout ctl;
    ElementInfo e;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv = (TextView) findViewById(R.id.element_info);
        ctl = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        iv = (ImageView) findViewById(R.id.imageView);

        try {
            e = new ElementInfo();
            e.getElement(getAssets().open("elements.csv"));
        } catch (Exception exception) {
            //Damn
        }

        Intent intent = getIntent();
        num = intent.getIntExtra("ATOMIC_NUMBER", 0);

        if (num != 0) {
            name = e.getName(num);
            symbol = e.getSymbol(num);
            mass = e.getMass(num);
            density = e.getDensity(num);
            boiling = e.getBoilingPoint(num);
            melting = e.getMeltingPoint(num);
            year = e.getYearDiscover(num);
            discoverer = e.getDiscoverer(num);
            description = e.getDescription(num);
            uses = e.getUses(num);
            state = e.getStateatSTP(num);
            ocurranceValue = e.getOccuranceValue(num);
            group = e.getGroup(num);
            period = e.getPeriod(num);

            ctl.setTitle(name);
        } else {
            Snackbar.make(findViewById(R.id.coordinatorLayout), "OH NO! AN ERROR! GO KHE!", Snackbar.LENGTH_SHORT).show();
        }



        String information = "Element Symbol: " + symbol + "\n\nAtomic Number: " + num + "\n\nAtomic Mass: " + mass + "\n\nElement Density: " + density + "\n\nBoiling Point: "
                + boiling + "\n\nMelting Point: " + melting + "\n\nDiscovered in " + year + " by " + discoverer + "\n\nDescription: " + description + "\n\nUses: " + uses
                + "\n\nState at STP: " + state + "\n\nOccurrence Value: " + ocurranceValue + "\n\nGroup: " + group + "\n\nPeriod: " + period;

        tv.setText(information);

        int drawable = getResources().getIdentifier(name.toLowerCase(), "drawable", getPackageName());

        iv.setImageResource(drawable);

    }
}
