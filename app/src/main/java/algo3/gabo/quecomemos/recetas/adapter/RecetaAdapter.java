package algo3.gabo.quecomemos.recetas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import algo3.gabo.quecomemos.R;
import algo3.gabo.quecomemos.recetas.dominio.Receta;

/**
 * Created by Gabo on 24/11/2015.
 */
public class RecetaAdapter extends ArrayAdapter<Receta>{

    public RecetaAdapter(Context context, List<Receta> recetas) {
        super(context, R.layout.receta_row, recetas);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.receta_row, parent, false);
        final Receta receta = getItem(position);

        TextView tvRecetaNombre = (TextView) rowView.findViewById(R.id.lblNombre);
        tvRecetaNombre.setText(receta.getNombre());

        TextView tvCalorias = (TextView) rowView.findViewById(R.id.lblCalorias);
        tvCalorias.setText("Calorias: "+ String.valueOf(receta.getCalorias()));

        TextView tvDificultad = (TextView) rowView.findViewById(R.id.lblDificultad);
        tvDificultad.setText("Dificultad: "+receta.getDificultad());

        TextView tvTemporada = (TextView) rowView.findViewById(R.id.lblTemporada);
        tvTemporada.setText("Temporada: "+receta.getTemporada());

        TextView tvPreparacion = (TextView) rowView.findViewById(R.id.lblPreparacion);
        tvPreparacion.setText("Preparacion: "+receta.getPreparacion());

        return rowView;
    }
}
