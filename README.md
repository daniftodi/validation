# Validation
A set of annotations to use for TextViews validation on Android

![Logo](app/src/main/res/drawable/logo.png)

Field validators for Android TextViews which uses annotation to generate boilerplate code for you.

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
