package com.example.parktaejun.koreaunivhackathon;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.parktaejun.koreaunivhackathon.Adapter.GroupAdapter;
import com.example.parktaejun.koreaunivhackathon.Data.Board;
import com.example.parktaejun.koreaunivhackathon.Tutorial.Tutorial_1_Activity;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

public class LoginActivity extends AppCompatActivity {

    private CallbackManager callbackManager;
    public String userID;
    public String userToken;
    public Boolean loginCheck;
    public String userName;
    public SharedPreferences pref;
    public SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent startIntent = new Intent(LoginActivity.this, GroupActivity.class);
        startActivity(startIntent);

//        pref = getSharedPreferences("pref", 0);
//        editor = pref.edit();
//        pref.getBoolean("loginCheck", false);
//        pref.getString("userID", "");
//        pref.getString("userPW", "");
//        pref.getString("userName", "");
//
//        if (pref.getBoolean("loginCheck", loginCheck)) {
//            userID = pref.getString("userID", "");
//            userToken = pref.getString("userPW", "");
//            userName = pref.getString("userName", "");
//
//            Toast toast = Toast.makeText(LoginActivity.this, "자동 로그인 ...", Toast.LENGTH_SHORT);
//            toast.show();
//
//            Intent mainIntent = new Intent(LoginActivity.this, Tutorial_1_Activity.class);
//            mainIntent.putExtra("userID", userID);
//            mainIntent.putExtra("userToken", userToken);
//            mainIntent.putExtra("userName", userName);
//
//            startActivity(mainIntent);
//        } else {
//
//
//            callbackManager = CallbackManager.Factory.create();
//            LoginButton loginButton = (LoginButton) findViewById(R.id.facebook_login_button);
//
//            loginButton.setReadPermissions(Arrays.asList("public_profile", "email"));
//            loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//
//                @Override
//                public void onSuccess(LoginResult loginResult) {
//                    // App code
//                    Log.i("fuck", "User ID: " + loginResult.getAccessToken().getUserId());
//                    Log.i("fuck", "Auth Token: " + loginResult.getAccessToken().getToken());
//
//                    userID = loginResult.getAccessToken().getUserId();
//                    userToken = loginResult.getAccessToken().getToken();
//                    loginCheck = true;
//
//                    GraphRequest request = GraphRequest.newMeRequest(loginResult.getAccessToken(),
//                            new GraphRequest.GraphJSONObjectCallback() {
//                                @Override
//                                public void onCompleted(JSONObject object, GraphResponse response) {
//                                    Log.v("LoginActivity", response.toString());
//
//                                    // Application code
//                                    try {
//                                        userName = object.getString("name");
//                                        editor.putString("userName", userName);
//                                        editor.commit();      //값을 저장할때 호출
//
//                                        Log.d("TAG", userName);
//                                    } catch (JSONException e) {
//                                        e.printStackTrace();
//                                    }
//                                }
//                            });
//                    Bundle parameters = new Bundle();
//                    parameters.putString("fields", "id,name,email,gender,birthday");
//                    request.setParameters(parameters);
//                    request.executeAsync();
//
//                    Intent tutorialIntent = new Intent(LoginActivity.this, Tutorial_1_Activity.class);
//                    tutorialIntent.putExtra("userID", userID);
//                    tutorialIntent.putExtra("userToken", userToken);
//                    tutorialIntent.putExtra("userName", userName);
//
//                    editor.putBoolean("loginCheck", loginCheck);
//                    editor.putString("userID", userID);
//                    editor.putString("userPW", userToken);
//                    editor.putString("userName", userName);
//                    editor.commit();      //값을 저장할때 호출
//
//                    startActivity(tutorialIntent);
//                    finish();
//                }
//
//                @Override
//                public void onCancel() {
//                    // App code
//                    Log.w("fuck", "Cancel");
//                }
//
//                @Override
//                public void onError(FacebookException exception) {
//                    // App code
//                    Log.e("fuck", "Error", exception);
//                }
//            });
//        }
    }
}
