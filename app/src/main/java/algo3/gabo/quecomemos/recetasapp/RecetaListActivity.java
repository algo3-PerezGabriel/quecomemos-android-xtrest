package algo3.gabo.quecomemos.recetasapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import algo3.gabo.quecomemos.R;


/**
 * An activity representing a list of Recetas. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link RecetaDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p/>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link RecetaListFragment} and the item details
 * (if present) is a {@link RecetaDetailFragment}.
 * <p/>
 * This activity also implements the required
 * {@link RecetaListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class RecetaListActivity extends AppCompatActivity
        implements RecetaListFragment.Callbacks {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta_app_bar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        if (findViewById(R.id.receta_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((RecetaListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.receta_list))
                    .setActivateOnItemClick(true);
        }

    }

    /**
     * Callback method from {@link RecetaListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(RecetaDetailFragment.ARG_ITEM_ID, id);
            RecetaDetailFragment fragment = new RecetaDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.receta_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity

        }
    }
}


