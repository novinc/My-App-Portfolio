package nov.chang.portfolio;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Placeholder for starting app activity
    public void startApp(View button){
        int buttonId = button.getId();
        String appName = "";
        PackageManager packageManager = getPackageManager();
        Intent intent;
        if (buttonId == R.id.app1) {
            try {
                intent = packageManager.getLaunchIntentForPackage("nov.chang.spotifystreamer");
                startActivity(intent);
                return;
            } catch (NullPointerException e) {
                appName = getResources().getString(R.string.app_1);
            }
        } else if (buttonId == R.id.app2) {
            try {
                intent = packageManager.getLaunchIntentForPackage("barqsoft.footballscores");
                startActivity(intent);
                return;
            } catch (NullPointerException e) {
                appName = getResources().getString(R.string.app_2);
            }
        } else if (buttonId == R.id.app3) {
            try {
                intent = packageManager.getLaunchIntentForPackage("it.jaschke.alexandria");
                startActivity(intent);
                return;
            } catch (NullPointerException e) {
                appName = getResources().getString(R.string.app_3);
            }
        } else if (buttonId == R.id.app4) {
            try {
                intent = packageManager.getLaunchIntentForPackage("");
                startActivity(intent);
                return;
            } catch (NullPointerException e) {
                appName = getResources().getString(R.string.app_4);
            }
        } else if (buttonId == R.id.app5) {
            try {
                intent = packageManager.getLaunchIntentForPackage("");
                startActivity(intent);
                return;
            } catch (NullPointerException e) {
                appName = getResources().getString(R.string.app_5);
            }
        } else if (buttonId == R.id.app6) {
            try {
                intent = packageManager.getLaunchIntentForPackage("");
                startActivity(intent);
                return;
            } catch (NullPointerException e) {
                appName = getResources().getString(R.string.app_6);
            }
        }
        String toastMessage = "This button will launch " + appName + "!";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }
}
