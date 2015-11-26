package algo3.gabo.quecomemos.recetasapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import algo3.gabo.quecomemos.R;
import algo3.gabo.quecomemos.recetas.dominio.Receta;

/**
 * A fragment representing a single Receta detail screen.
 * This fragment is either contained in a {@link RecetaListActivity}
 * in two-pane mode (on tablets) or a {@link RecetaDetailActivity}
 * on handsets.
 */
public class RecetaDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private Receta receta;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public RecetaDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            receta = (Receta) getArguments().get(ARG_ITEM_ID);

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(receta.getNombre());
            }else {
                appBarLayout.setTitle(receta.getNombre());
            }
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_receta_detail, container, false);
        CheckBox check;
        // Show the dummy content as text in a TextView.
        if (receta != null) {

            ((TextView) rootView.findViewById(R.id.receta_autor)).setText("Creador: " + receta.getAutor());
            ((TextView) rootView.findViewById(R.id.receta_calorias)).setText(String.valueOf(receta.getCalorias()) + " calorias");

            ((TextView) rootView.findViewById(R.id.receta_dificultad)).setText("Dificultad: " + receta.getDificultad());
            ((TextView) rootView.findViewById(R.id.receta_preparacion)).setText("Preparacion: " + receta.getPreparacion());
            ((TextView) rootView.findViewById(R.id.receta_temporada)).setText("Temporada Recomendada: " + receta.getTemporada());


            //el checkbox no tiene comportamiento

            check = (CheckBox) rootView.findViewById(R.id.receta_esFavorita);
            check.setEnabled(true);
            check.setChecked(receta.isFavorita());
        }

        return rootView;
    }
}
