package downloader.video.usmans.videodownloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.applovin.adview.AppLovinInterstitialAd;

/**
 * Created by Usman Jamil on 4/17/2017.
 */
public class SettingActivity  extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getSupportActionBar().show();
        getSupportActionBar().setTitle("Settings");
        getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();

//        // For interstitials
//        if(AppLovinInterstitialAd.isAdReadyToDisplay(this)){
//            // An ad is available to display.  It's safe to call show.
//            AppLovinInterstitialAd.show(this);
//            Log.d("APPLOVINReady=====>","YES");
//        }
//        else{
//            // No ad is available to display.  Perform failover logic...
//            Log.d("Not Ready=====>","YES");
//        }

    }
}