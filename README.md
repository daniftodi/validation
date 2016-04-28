# validation
A set of annotations to use for validation TextViews in Android

Example
------
```java
class ExampleActivity extends Activity {
  @EmailValidator EditText emailAddress;
  @StringValidator(minLength = 3,maxLength = 8) EditText password;

  @PatternValidator(pattern = "\\+//d{2,3}//d{5,8}",message = "Please use format +YYY XXXXXXX")
  EditText phoneNumber;

  @OnClick(R.id.submit) void submit() {
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
