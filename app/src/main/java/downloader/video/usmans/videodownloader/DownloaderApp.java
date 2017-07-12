package downloader.video.usmans.videodownloader;

import android.app.Application;
import android.util.Log;

import com.applovin.adview.AppLovinInterstitialAd;

/**
 * Created by Usman Jamil on 4/19/2017.
 */

public class DownloaderApp extends Application {
    public static final String TAG = DownloaderApp.class
            .getSimpleName();

    private static DownloaderApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        AnalyticsTrackers.initialize(this);
        AnalyticsTrackers.getInstance().get(AnalyticsTrackers.Target.APP);

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