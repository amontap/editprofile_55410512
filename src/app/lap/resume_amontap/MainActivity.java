package app.lap.resume_amontap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	private Button btn1, btn2;
	private TextView txt01, txt02, txt03, txt04, txt05;
	private String show1, show2, show3, show4, show5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewMatching();
	}

	private void ViewMatching() {
		btn1 = (Button) findViewById(R.id.btn_edit);
		btn2 = (Button) findViewById(R.id.btnimg);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		txt01 = (TextView) findViewById(R.id.txt01);
		txt02 = (TextView) findViewById(R.id.txt02);
		txt03 = (TextView) findViewById(R.id.txt03);
		txt04 = (TextView) findViewById(R.id.txt04);
		txt05 = (TextView) findViewById(R.id.txt05);

		txt01.setText("Amontap Naksano");
		txt02.setText("Boat");
		txt03.setText("0849244232");
		txt04.setText("boat_111333@hotmail.com");
		txt05.setText("Singbure");

		show1 = getIntent().getStringExtra("txt01");
		show2 = getIntent().getStringExtra("txt02");
		show3 = getIntent().getStringExtra("txt03");
		show4 = getIntent().getStringExtra("txt04");
		show5 = getIntent().getStringExtra("txt05");

		txt01.setText(show1);
		txt02.setText(show2);
		txt03.setText(show3);
		txt04.setText(show4);
		txt05.setText(show5);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_edit:
			Intent i = new Intent(getApplicationContext(), edit_boat.class);
			startActivity(i);
			break;
		case R.id.btnimg:
			Intent j = new Intent(getApplicationContext(), ImageActivity.class);
			startActivity(j);
			break;
		default:
			break;
		}
	}
}