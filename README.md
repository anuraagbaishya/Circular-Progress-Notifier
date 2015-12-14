# Circular Progress Notifier
Circular Progress Notifier is, as the name suggests, a progress notifier that displays progress percentage as well.

This library was inspired by [Colin Madere's blog post](http://tech.taskrabbit.com/blog/2014/11/07/android-custom-progress-view/)

![Image](http://i.imgur.com/8AP1KPq.jpg)

##Usage
* Step 1. Add the JitPack repository to your build file

  Add it in your root build.gradle at the end of repositories:
    ```java
    allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
	```
	
* Step 2: Add the dependency
    ```java
    dependencies {
      
      	   compile 'com.github.anuraagbaishya:Circular-Progress-Notifier:v1.0'
	  }
	```
* Step 3: Create a CircularProgressNotifier in your activity's xml
  
    ```xml
    <com.appex.circularprogressnotify.CircularProgress
      android:id="@+id/circular_progress"
      android:layout_width="200dp"
      android:layout_height="200dp"
      android:layout_centerInParent="true"/>`
    ```
* Step 4: Declare an Object in your Activity

    ```java
    CircularProgress circularProgress = (CircularProgress) findViewById(R.id.circular_progress);
    circularProgress.setProgress(25);`
    ```
* To change the colour of progress bar:

    ```java
    circularProgress.init(getApplicationContext(), backgroudColor,
              primaryColor,
              targetColor);
    ```
    
##Contributions
Contributions are welcome. Please fork this project to make contributions.

##License
This project is licensed under the terms of the MIT License.
