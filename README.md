## Overview
Velley Demo is a sample app showing usage of Volley library for networking.
Volley is a library that makes networking for Android apps easier and most importantly, faster. Volley Library was announced by [Ficus Kirkpatrick](https://plus.google.com/+FicusKirkpatrick) at Google I/O '13.

## Why Volley?

* Volley can pretty much do everything with that has to do with Networking in Android.
* Volley automatically schedules all network requests such as fetching responses for image from web.
* Volley provides transparent disk and memory caching.
* Volley provides powerful cancellation request API for canceling a single request or you can set blocks of requests to cancel.
* Volley provides powerful customization abilities.
* Volley provides debugging and tracing tools.

## Setup Volley

Adding Volley to our `app/build.gradle` file:

```gradle
dependencies {
    implementation 'com.android.volley:volley:1.0.0'
}
```

And add the internet permission in `AndroidManifest.xml`:

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.simplenetworking"
    android:versionCode="1"
    android:versionName="1.0" >
 
   <!-- Add permissions here -->
   <uses-permission android:name="android.permission.INTERNET" /> 
   <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

</manifest>
```

## How to use Volley?

Volley has two classes that you will have to deal with:

1. `RequestQueue` - Requests are queued up here to be executed
2. `Request` (and any extension of it) - Constructing an network request

A Request object comes in three major types:

* [JsonObjectRequest](http://afzaln.com/volley/com/android/volley/toolbox/JsonObjectRequest.html) — To send and receive JSON Object from the server
* [JsonArrayRequest](http://afzaln.com/volley/com/android/volley/toolbox/JsonArrayRequest.html) — To receive JSON Array from the server
* [ImageRequest](http://afzaln.com/volley/com/android/volley/toolbox/ImageRequest.html) - To receive an image from the server
* [StringRequest](http://afzaln.com/volley/com/android/volley/toolbox/StringRequest.html) — To retrieve response body as String (ideally if you intend to parse the response by yourself)

### Constructing a RequestQueue

All requests in Volley are placed in a queue first and then processed, here is how you will be creating a request queue:

### Requesting images

Volley provides the ability to make image requests and receive back as bitmap.  You can use this bitmap to set directly onto an ImageView.



## References
Usefull references for deepdiving into Volley

* <https://developer.android.com/training/volley/index.html>
* <https://smaspe.github.io/2013/06/03/volley-part1.html>
* <http://java.dzone.com/articles/android-%E2%80%93-volley-library>
* <http://arnab.ch/blog/2013/08/asynchronous-http-requests-in-android-using-volley/>
* <http://files.evancharlton.com/volley-docs/>
* <https://www.youtube.com/watch?v=yhv8l9F44qo/>

##Contributing
If you see any issue in the app or documentation feel free to open issue or pull request.
The best way to contribute is to add more examples and best practices for using Volley
