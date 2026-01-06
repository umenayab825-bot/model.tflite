Handwritten Digit Classifier (TFLite Integration)
This project is a native Android application that integrates a Machine Learning model to recognize handwritten digits. It demonstrates the complete workflow of training a model in Python and deploying it on an Android device for real-time inference.

🚀 Project Workflow
Model Training: A Convolutional Neural Network (CNN) was trained on the MNIST Dataset using Google Colab.

Format Conversion: The trained model was converted from Keras (.h5) format to TensorFlow Lite (.tflite) for mobile optimization.

Android Integration: The .tflite model was embedded into the Android assets folder.

On-Device Inference: Using the TensorFlow Lite Java library, the app processes input data and generates predictions locally on the device.

🛠️ Tech Stack
Language: Java (Android), Python (Training)

Frameworks: TensorFlow Lite, Keras/TensorFlow

Tools: Android Studio, Google Colab

Dataset: MNIST (Handwritten Digits 0-9)

📁 Key Files
app/src/main/assets/model.tflite: The optimized Machine Learning model.

MainActivity.java: Contains the logic for loading the model and handling the inference process.

activity_main.xml: The user interface featuring a button to trigger model testing.

📱 Features
Offline Processing: No internet is required to run the model once the app is installed.

Efficient Performance: Optimized for mobile hardware using the TFLite interpreter.

Instant Feedback: Displays "Model Successfully Worked!" upon successful inference.

⚙️ Setup and Installation
Clone this repository to your local machine.

Open the project in Android Studio.

Sync the Gradle files to download necessary TensorFlow Lite dependencies.

Build and run the app on an Android device (API 24 or higher).

Click the "Check Model" button to see the model in action!
