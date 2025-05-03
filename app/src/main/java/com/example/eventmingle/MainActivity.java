package com.example.eventmingle;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.eventmingle.R;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ✅ Initialize Firebase
        FirebaseApp.initializeApp(this);

        // ✅ Get reference to Realtime Database
        dbRef = FirebaseDatabase.getInstance().getReference("test");

        // ✅ Write a test value
        dbRef.setValue("Hello from EventMingle!")
                .addOnSuccessListener(aVoid -> Log.d("Firebase", "Data written successfully!"))
                .addOnFailureListener(e -> Log.e("Firebase", "Failed to write data", e));
    }
}
