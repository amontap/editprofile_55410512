package app.lap.resume_amontap;


	import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.view.View.OnClickListener;
	import android.widget.Button;
	import android.widget.EditText;
	import android.widget.TextView;
	public class edit_boat extends Activity implements OnClickListener {
	private Button btnsubmit;
	private EditText etxt1, etxt2, etxt3, etxt4, etxt5;
	private String txt1, txt2, txt3, txt4, txt5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	setContentView(R.layout.edit_512);
	super.onCreate(savedInstanceState);
	ViewMatching();
	}
	private void ViewMatching() {
	btnsubmit = (Button) findViewById(R.id.btn_edit);
	btnsubmit.setOnClickListener(this); 
	etxt1 = (EditText) findViewById(R.id.etxt1);
	etxt2 = (EditText) findViewById(R.id.etxt2);
	etxt3 = (EditText) findViewById(R.id.etxt3);
	etxt4 = (EditText) findViewById(R.id.etxt4);
	etxt5 = (EditText) findViewById(R.id.etxt5);
	
	}
	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btn_edit:
	txt1 = (etxt1.getText().toString());
	txt2 = (etxt2.getText().toString());
	txt3 = (etxt3.getText().toString());
	txt4 = (etxt4.getText().toString());
	txt5 = (etxt5.getText().toString());
	
	Intent R = new Intent(getApplicationContext(), MainActivity.class);
	R.putExtra("txt01", txt1);
	R.putExtra("txt02", txt2);
	R.putExtra("txt03", txt3);
	R.putExtra("txt04", txt4);
	R.putExtra("txt05", txt5);
	
	startActivity(R);
	break;
	default:
	break;
	}
	}
	}

