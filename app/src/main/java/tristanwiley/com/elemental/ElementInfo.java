package tristanwiley.com.elemental;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 10/10/2015.
 */
public class ElementInfo {
    List<String[]> list;

    public void getElement(InputStream is) {

        String next[] = {};
        list = new ArrayList<String[]>();

        try {
            CSVReader reader = new CSVReader(new InputStreamReader(is));
            while (true) {
                next = reader.readNext();
                if (next != null) {
                    list.add(next);
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getSymbol(int num) {
        return list.get(num)[0];
    }

    public String getName(int num) {
        return list.get(num)[1];
    }

    public String getAtomic(int num) {
        return list.get(num)[2];
    }

    public String getMass(int num) {
        return list.get(num)[3];
    }

    public String getDensity(int num) {
        return list.get(num)[4];
    }

    public String getMeltingPoint(int num) {
        return list.get(num)[5];
    }

    public String getBoilingPoint(int num) {
        return list.get(num)[6];
    }

    public String getYearDiscover(int num) {
        return list.get(num)[7];
    }

    public String getDiscoverer(int num) {
        return list.get(num)[8];
    }

    public String getDescription(int num){ return list.get(num)[9];}

    public String getUses(int num){ return list.get(num)[10];}

    public String getStateatSTP(int num){ return list.get(num)[11];}

    public String getOccuranceValue(int num){ return list.get(num)[12];}

    public String getGroup(int num){return list.get(num)[13];}

    public String getPeriod(int num){return list.get(num)[14];}

}