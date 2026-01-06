package com.nayab.modeltflite;

import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import org.tensorflow.lite.Interpreter;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MainActivity extends AppCompatActivity {

    Interpreter tflite;
    TextView resultText;
    Button predictBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.resultText);
        predictBtn = findViewById(R.id.predictBtn);

        // 1. Model Load Karein
        try {
            tflite = new Interpreter(loadModelFile());
            Toast.makeText(this, "Model Load Ho Gaya!", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 2. Button Click Par Test Karein
        predictBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runInference();
            }
        });
    }

    private void runInference() {
        // MNIST model 28x28 images leta hai (784 pixels)
        // Hum test ke liye khali (zero) input bhej rahe hain
        float[][] input = new float[1][784];
        float[][] output = new float[1][10];

        if (tflite != null) {
            tflite.run(input, output); // Model ko chalana
            resultText.setText("Model Successfully Worked!");
            Toast.makeText(this, "Inference Complete!", Toast.LENGTH_SHORT).show();
        }
    }

    private MappedByteBuffer loadModelFile() throws Exception {
        AssetFileDescriptor fileDescriptor = this.getAssets().openFd("model.tflite");
        FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel = inputStream.getChannel();
        long startOffset = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
    }
}