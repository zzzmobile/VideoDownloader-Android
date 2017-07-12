package downloader.video.usmans.videodownloader.constants;

import downloader.video.usmans.videodownloader.R;

/**
 * Created by Usman Jamil on 4/10/2017.
 */

public interface iConstants {
    public static final String[] DISABLE_DOWNLOADING = {"youtube.com"}; // separated with comma

    public static final String WEB_DISABLE = "We cannot allow to download videos form this website.";

    public static final String FACEBOOK_BANNER_ID = "1770584959918615_1791164521193992";

    public static final String FACEBOOK_INTERSTITIAL_ID = "1770584959918615_1791164521193992";
    public static final String ADMOB_APP_ID = "ca-app-pub-7798873219549265~7253056030";
//    public static final String ADMOB_INTERSTITIAL_ID = "ca-app-pub-7798873219549265/8590188432";

    public static final String ADMOB_INTERSTITIAL_ID = "ca-app-pub-1660432537928468/7714736838";

    public static final String PREF_APPNAME = "xmatevidedownloader";


    public static final String DOWNLOADING_MSG = "Generating download links";

    public  static  final String URL_NOT_SUPPORTED = "This url not supported or no media found!";

    public static final String DOWNLOAD_DIRECTORY="apex_video_dwonloader";

    public Integer[] HomePageThumbs = {R.drawable.dailymotion,R.drawable.img_logo_facebook,R.drawable.img_logo_soundcloud,R.drawable.img_logo_vimeo,R.drawable.img_logo_instagram,R.drawable.img_logo_tumblr,R.drawable.img_logo_tune,R.drawable.img_logo_metacafe,R.drawable.img_logo_twitch};
    public String[] HomePageURI = {"http://dailymotion.com","http://facebook.com","http://soundcloud.com","http://vimeo.com","http://instagaram.com","http://tumbler.com","http://tune.pk","http://metacafe.com","https://www.twitch.tv"};

    public  static  final String EMAIL_ID = "usmanjamil547@gmail.com";

    public  static final String SEARCH_ENGINE="https://www.google.com/search?q=%1$s"; //Search Engine

    ///Save It Offline Api

    public  static  final String API_URL = "https://www.saveitoffline.com/process/?url=%1$s&type=json";
    public  static boolean isAdloding = false;








}
