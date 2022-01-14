# Android-components
# Branch
1-> main or Activity
2-> Services
3-> Broadcast receiver
4-> Content Providers

# Activity
It 's an component of android , the one point where almost every activity interacts with the user , It's take the responsbility 
to create an window where we can put our ui with setContentView() , It have an method onCreate from where you initialize your activity
It have an it's own lifecycle and also you can specify lunch mode for the activity . Every activity extends an class app compactivity 
which is the base class for every activity.
/*
## Companion Object
  -> if we want to access any function or any member variable of class then we have to create an object of that class
   and then we can access through that object
  -> How can we access without crating an object
  
  ### 1-> JAVA :
  By the use of static keyword its possible
  Ex - public static String name ="Nalini";
  
  ###  2-> KOTLIN :
  As written below we have to crate an companion object in this companion we can declare the variable or function
  But if you want to access this variable in a java class then you have to use an annotation @JvmStatic
   companion object {
   @JvmStatic
    val TAG: String = "TAG"
    }
  ## 3-> const val
  const val    ->    This the keyword use to declare a immutable variable at compile time
  compile time -> compile time meaning at the time of building
  
*/
