# Student Profile App

Open this folder in Android Studio, allow Gradle to sync, select an emulator or connected Android device, and click **Run**.

Enter a full name, registration number, and programme. Tap **Submit** to display the profile. Registration numbers are stored as text so letters and leading zeros are preserved.

## Project exploration

| Component | Role in this project |
| --- | --- |
| [MainActivity.kt](app/src/main/java/rw/mku/studentprofile/MainActivity.kt) | Android launches this activity when the student opens the app. Its onCreate method loads the layout and connects the Submit button to the code that validates the fields and displays the profile. |
| [activity_main.xml](app/src/main/res/layout/activity_main.xml) | Defines the title, three labelled fields, Submit button, and result area. |
| [AndroidManifest.xml](app/src/main/AndroidManifest.xml) | Declares the application and identifies MainActivity as its launcher activity. |
| [Resources](app/src/main/res) | Holds the screen layout and reusable text, including the formatted welcome message in values/strings.xml. |

## Example

Entering Jean, 12345, and Information Technology produces:

```text
Welcome, Benit!
Registration Number: 12345
Programme: Information Technology
```
