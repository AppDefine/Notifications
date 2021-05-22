package com.androidlover.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void notifications(View view) {
        NotificationManagerCompat MyMan = NotificationManagerCompat.from(this);
        NotificationCompat.Builder MyNoti = new NotificationCompat.Builder(this);
        MyNoti.setContentTitle("Test Notification");
        MyNoti.setContentText("This Is A Test Notification!!!");
        MyNoti.setSmallIcon(android.R.drawable.ic_dialog_info);

        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this,1,intent,0);
        MyNoti.setContentIntent(pi);
        MyNoti.setAutoCancel(true);

        MyMan.notify(1,MyNoti.build());
        finish();
    }
}