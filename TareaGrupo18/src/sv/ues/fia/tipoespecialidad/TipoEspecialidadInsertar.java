package sv.ues.fia.tipoespecialidad;

import sv.ues.fia.R;
import sv.ues.fia.R.layout;
import sv.ues.fia.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TipoEspecialidadInsertar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo_especialidad_insertar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tipo_especialidad_insertar, menu);
		return true;
	}

}
