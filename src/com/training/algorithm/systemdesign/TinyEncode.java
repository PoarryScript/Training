package com.training.algorithm.systemdesign;

import java.util.HashMap;

/**
 * Created by yangbo on 2017/7/17.
 */
public class TinyEncode {

    /***
     *
     *
     *https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
     *
     *
     */
    public static void main(String[] args) {
        TinyEncode tinyEncode = new TinyEncode();
        String originalCode = "http://101.200.228.39/zentaopms/www/user-login-L3plbnRhb3Btcy93d3cvYnVnLWJyb3dzZS0zLmh0bWw=.html";
        String shortUrl = tinyEncode.encode(originalCode);

        String url = tinyEncode.decode(shortUrl);
        System.out.println("" + url);
    }

    HashMap<Integer, String> hashMap = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {

        hashMap.put(longUrl.hashCode(), longUrl);
        return "http://tinyurl.com/" + longUrl.hashCode();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hashMap.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }

}
