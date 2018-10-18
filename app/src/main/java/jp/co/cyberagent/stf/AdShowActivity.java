package jp.co.cyberagent.stf;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

public class AdShowActivity extends Activity {
    public static final String url="http://dsp.zsapp.info/news/chenxiyun.html";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView=new WebView(this);
        if(webView.getSettings()!=null){
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setUserAgentString("my custom user agent");
            webView.loadUrl(url);
            setContentView(webView);
        }

    }
}
