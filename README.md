# Validation 
[ ![Download](https://api.bintray.com/packages/daniftodi/maven/validation/images/download.svg?version=0.9.3) ](https://bintray.com/daniftodi/maven/validation/0.9.3/link)

A set of useful annotations to use for TextViews validation in Android projects

![Logo](app/src/main/res/drawable/logo.png)

Field validators for Android TextViews which uses annotation to generate boilerplate code for you.

Installation
------
Gradle
```java
compile 'com.dan.iftodi.validation:validation:0.9.3'
```
Maven
```xml
<dependency>
  <groupId>com.dan.iftodi.validation</groupId>
  <artifactId>validation</artifactId>
  <version>0.9.3</version>
  <type>pom</type>
</dependency>
```

Example
------
```java
class ExampleActivity extends Activity {
  @EmailValidator
  EditText emailAddress;

  @StringValidator(minLength = 3,maxLength = 8)
  EditText password;

  @PatternValidator(pattern = "\\+//d{2,3}//d{5,8}",message = "Please use format +YYY XXXXXXX")
  EditText phoneNumber;

  void submit(View v) {
    if(Validator.validate(this))
        {
                //all fields are valid
        }
        else
        {
                //some fields are not valid
        }
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simple_activity);
    // TODO Use fields...
  }
}
```
