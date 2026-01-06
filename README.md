ModelTFLite Android App
Project Overview

This Android application allows users to draw digits on the screen and predicts the digit using a TensorFlow Lite (TFLite) model.
The app uses SignaturePad for drawing input and a pre-trained MNIST-like model for digit recognition.

Features

Draw digits (0–9) using touch input.

Real-time digit prediction.

Lightweight and fast inference using TFLite.

Works on Android devices with API 24+.

Project Structure
com.nayab.modeltflite
├── MainActivity.java         # Main app logic (drawing + prediction)
├── model.tflite              # Pre-trained TFLite model
├── layout/
│   └── activity_main.xml     # UI layout with SignaturePad
├── build.gradle              # Project dependencies and build config

Dependencies

AndroidX AppCompat, Material, ConstraintLayout

TensorFlow Lite: org.tensorflow:tensorflow-lite:2.14.0

TensorFlow Lite Support: org.tensorflow:tensorflow-lite-support:0.4.4

Signature Pad: com.github.gcacace:signature-pad:1.3.1

Installation

Clone the repository.

Open in Android Studio (Arctic Fox or newer recommended).

Sync Gradle to download dependencies.

Connect an Android device or start an emulator.

Run the app.

Usage

Launch the app.

Draw a digit (0–9) on the canvas.

Press the Predict button.

The predicted digit will appear on the screen.

Notes / Troubleshooting

Ensure the input image is preprocessed to match model input (28x28 grayscale, normalized to 0–1).

If predictions are always “5”, check:

Model is loaded correctly.

Input preprocessing is correct.

Model is properly trained and not biased.

License

This project is licensed under MIT License.
