package sv.ues.fia.evaluacionetapa;

import sv.ues.fia.R;
import sv.ues.fia.R.layout;
import sv.ues.fia.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EvaluacionEtapaInsertar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_evaluacion_etapa_insertar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.evaluacion_etapa_insertar, menu);
		return true;
	}

}
