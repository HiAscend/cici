package com.zzia;

import org.apache.http.impl.client.CloseableHttpClient;

import java.security.KeyStore;
import java.security.KeyStoreException;

/**
 * Created by adeng on 2016/8/13.
 */
public class HttpClientTest {

    /**
     * HttpClient链接ssl
     */
    public void ssl(){
        CloseableHttpClient httpClient = null;
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());

        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
    }




}
