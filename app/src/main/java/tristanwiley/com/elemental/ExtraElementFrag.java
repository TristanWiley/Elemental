package tristanwiley.com.elemental;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tristan on 10/10/2015.
 */
public class ExtraElementFrag extends DialogFragment {

    LinearLayout element1;
    LinearLayout element2;
    LinearLayout element3;
    LinearLayout element4;
    LinearLayout element5;
    LinearLayout element6;
    LinearLayout element7;
    LinearLayout element8;
    LinearLayout element9;
    LinearLayout element10;
    LinearLayout element11;
    LinearLayout element12;
    LinearLayout element13;
    LinearLayout element14;
    LinearLayout element15;


    public ExtraElementFrag() {
        // Empty constructor is required for DialogFragment
        // Make sure not to add arguments to the constructor
        // Use `newInstance` instead as shown below
    }

    public static ExtraElementFrag newInstance(String title) {
        ExtraElementFrag frag = new ExtraElementFrag();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.extraelements, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Get field from view
        element1 = (LinearLayout) view.findViewById(R.id.element1);
        element2 = (LinearLayout) view.findViewById(R.id.element2);
        element3 = (LinearLayout) view.findViewById(R.id.element3);
        element4 = (LinearLayout) view.findViewById(R.id.element4);
        element5 = (LinearLayout) view.findViewById(R.id.element5);
        element6 = (LinearLayout) view.findViewById(R.id.element6);
        element7 = (LinearLayout) view.findViewById(R.id.element7);
        element8 = (LinearLayout) view.findViewById(R.id.element8);
        element9 = (LinearLayout) view.findViewById(R.id.element9);
        element10 = (LinearLayout) view.findViewById(R.id.element10);
        element11 = (LinearLayout) view.findViewById(R.id.element11);
        element12 = (LinearLayout) view.findViewById(R.id.element12);
        element13 = (LinearLayout) view.findViewById(R.id.element13);
        element14 = (LinearLayout) view.findViewById(R.id.element14);
        element15 = (LinearLayout) view.findViewById(R.id.element15);

        ArrayList<View> elements = new ArrayList<View>();
        elements.add(0, element1);
        elements.add(1, element2);
        elements.add(2, element3);
        elements.add(3, element4);
        elements.add(4, element5);
        elements.add(5, element6);
        elements.add(6, element7);
        elements.add(7, element8);
        elements.add(8, element9);
        elements.add(9, element10);
        elements.add(10, element11);
        elements.add(11, element12);
        elements.add(12, element13);
        elements.add(13, element14);
        elements.add(14, element15);


        // Fetch arguments from bundle and set title
        String title = getArguments().getString("range", "Range");
        boolean first_extra = getArguments().getBoolean("first_extra");
        getDialog().setTitle(title);
        ElementInfo e = new ElementInfo();
        try {
            e = new ElementInfo();
            e.getElement(getActivity().getAssets().open("elements.csv"));
        } catch (Exception ex) {
            //Damn
        }

        int n;
        if(first_extra) {
            n = 57;
        }else {
            n = 89;
        }
            for (int i = 0; i < elements.size(); i++) {
                final int number = i + n;

                TextView atomic = (TextView) elements.get(i).findViewById(R.id.element_atomic_number);
                TextView symbol = (TextView) elements.get(i).findViewById(R.id.element_symbol);
                TextView name = (TextView) elements.get(i).findViewById(R.id.element_name);

                atomic.setText(e.getAtomic(number));
                symbol.setText(e.getSymbol(number));
                name.setText(e.getName(number));

                View.OnClickListener clickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadElement(number);
                    }
                };
                elements.get(i).setOnClickListener(clickListener);

            }

        }
    public void loadElement(int num) {
        Intent i = new Intent(getActivity(), ElementDetail.class);
        i.putExtra("ATOMIC_NUMBER", num);
        startActivity(i);
    }
    }

