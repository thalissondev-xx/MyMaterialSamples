package br.com.ruitercomp.mymaterialsamples;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class CardViewFiltro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_filtro);

        CardView card_view1 = (CardView) findViewById(R.id.card_view1);

        final LinearLayout viewMain = (LinearLayout) findViewById(R.id.activity_card_view_filtro);
        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar
                        .make(viewMain, "Filtro 1!", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(viewMain, "Filtro 1!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();
            }
        });

        CardView card_view = (CardView) findViewById(R.id.card_view);

        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar
                        .make(viewMain, "Filtro 1!", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(viewMain, "filtro 2!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();
            }
        });

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            StateListAnimator stateListAnimator = AnimatorInflater
//                    .loadStateListAnimator(CardViewFiltro.this, R.animator.lift_on_touch);
//            card_view1.setStateListAnimator(stateListAnimator);
//            card_view.setStateListAnimator(stateListAnimator);
//        }
    }
}
