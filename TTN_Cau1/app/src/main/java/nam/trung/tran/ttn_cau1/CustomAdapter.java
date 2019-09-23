package nam.trung.tran.ttn_cau1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private FilmModel[] films;
    private LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, FilmModel[] films) {
        this.context = context;
        this.films = films;
        this.inflater = LayoutInflater.from(applicationContext);
    }

    @Override
    public int getCount() {
        return films.length;
    }

    @Override
    public Object getItem(int i) {
        return films[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    static class ViewHolder {
        TextView textName;
        TextView textCountry;
        TextView textPrice;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_list_view, null);
        TextView textName = (TextView)view.findViewById(R.id.textName);
        TextView textCountry = (TextView)view.findViewById(R.id.textCountry);
        TextView textPrice = (TextView)view.findViewById(R.id.textPrice);

        textName.setText(films[i].name);
        textCountry.setText(films[i].country);
        textPrice.setText(films[i].price + "00");
        return view;
    }
}
