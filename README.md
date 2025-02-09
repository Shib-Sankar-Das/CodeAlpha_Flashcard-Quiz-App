# Quiz Quest: Online Quiz App 📚🎉

Welcome to the **QuizOnline App**! This application is designed to provide an engaging and interactive quiz experience to enhance your knowledge. Built with Kotlin and integrated with Firebase, it offers a seamless and dynamic user experience.

## Features ✨

- **Interactive Quizzes**: Participate in various quizzes with multiple-choice questions.
- **Real-time Data**: Fetch quiz data from Firebase in real-time.
- **Timer**: Each quiz comes with a timer to challenge your speed and accuracy.
- **Score Tracking**: Track your performance with a detailed score summary at the end of each quiz.

## Screenshots 📸

### UI
![Screenshot_2023-12-18_at_14 21 54-removebg-preview](https://github.com/bimalkaf/Android_QuizAppWithFirebase/assets/60041910/53b13a70-6087-409f-894d-c749f6f7d976)
### Home Page
![Screenshot 2023-12-18 at 14 24 56](https://github.com/bimalkaf/Android_QuizAppWithFirebase/assets/60041910/9986de9f-5cec-4ca0-8d13-962c11db2a5e)
### Quiz interface
![Screenshot 2023-12-18 at 14 25 14](https://github.com/bimalkaf/Android_QuizAppWithFirebase/assets/60041910/d22f0d62-83ba-42a9-a7c3-4c19bd1e183a)

## Installation 🛠️

1. **Clone the repository**:
    ```sh
    https://github.com/Shib-Sankar-Das/CodeAlpha_Flashcard-Quiz-App.git
    ```
2. **Open the project in Android Studio**:
    - File -> Open -> Select the cloned project directory.
3. **Build the project**:
    - Click on the "Build" menu and select "Make Project".
4. **Run the app**:
    - Connect your Android device or start an emulator.
    - Click on the "Run" button or press `Shift + F10`.

## Usage 🚀

1. **Launch the app** on your Android device.
2. **Browse quizzes** on the main screen.
3. **Select a quiz** to start.
4. **Answer questions** within the given time.
5. **Submit the quiz** to see your score and performance.

## Code Structure 🗂️

- `MainActivity.kt`: Handles the main screen and fetches quiz data from Firebase.
- `QuizActivity.kt`: Manages the quiz interface, question navigation, and score calculation.
- `QuizModel.kt`: Data models for quizzes and questions.
- `QuizListAdapter.kt`: Adapter for displaying quizzes in a RecyclerView.
- `activity_main.xml`: Layout for the main screen.
- `activity_quiz.xml`: Layout for the quiz screen.

## Dependencies 📦

- **Kotlin**: The primary programming language used.
- **Firebase**: For real-time database and data synchronization.
- **RecyclerView**: For displaying lists of quizzes.
- **CountDownTimer**: For managing quiz timers.

## Contributing 🤝

We welcome contributions! Please follow these steps:

1. **Fork the repository**.
2. **Create a new branch**:
    ```sh
    git checkout -b feature/your-feature-name
    ```
3. **Make your changes** and commit them:
    ```sh
    git commit -m "Add your message"
    ```
4. **Push to the branch**:
    ```sh
    git push origin feature/your-feature-name
    ```
5. **Create a Pull Request**
