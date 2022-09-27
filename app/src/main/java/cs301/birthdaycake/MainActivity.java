package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cView = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(cView);

        Button blowOutBtn = findViewById(R.id.blowOut);
        blowOutBtn.setOnClickListener(controller);

        CompoundButton withCandle = findViewById(R.id.candleSwitch);
        withCandle.setOnCheckedChangeListener(controller);

        SeekBar numCandle = findViewById(R.id.numCandles);
        numCandle.setOnSeekBarChangeListener(controller);

    }

    public void goodbye(View button) {
        //System.out.println("Goodbye");
        //Log.i("introLog", "Goodbye, from Logcat!");


    }
}
