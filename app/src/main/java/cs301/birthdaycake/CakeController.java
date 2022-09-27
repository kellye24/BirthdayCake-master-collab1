package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    // Added by Emma, Lab 3
    private CakeView cakeView;
    private CakeModel model;

    public CakeController(CakeView cView) {
        this.cakeView = cView;
        this.model = cView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("CakeController", "This is a click!");
        this.model.isLit = false;
        this.cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            this.model.hasCandles = true;
        } else {
            this.model.hasCandles = false;
        }

        this.cakeView.invalidate();

        //Log.i("cakeController", "Made it to checked change!");
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        this.model.numCandle = i;
        this.cakeView.invalidate();
        //Log.i("cakeController", "Number of candles is " + i);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
