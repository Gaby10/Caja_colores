package basico.android.cftic.edu.cajacolor;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
//private  int color;
    private  int num_veces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // this.color = getResources().getColor(R.color.negro);
        this.num_veces = 0;
    }
    private  void salir() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            this.finishAffinity();
        } else {

            this.finish();
        }
    }
    public void cambiarColor (View view){

        LinearLayout cajatocada = (LinearLayout)view;
        int ncolor = getResources().getColor(R.color.negro);
        cajatocada.setBackgroundColor(ncolor);
      //  cajatocada.setBackgroundColor(this.color)
        num_veces = num_veces+1;
        if(num_veces == 6){

            salir();
        }

    }//cambiarColor

    //Creamos una función para controlar que caja se toca no está terminada
    public void controlar (View view){

        LinearLayout cajatocada = (LinearLayout)view;
        //view.setTag();

    }


}
