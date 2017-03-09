package polybellum.widget;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements GraphicsRenderer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraphicsView(this).setRenderer(this));
    }

    @Override
    public void onDraw(Canvas c) {
        Log.v("test", ""+c.isHardwareAccelerated());
    }
}
