# Android-components
# Branch
1-> main or Activity
2-> Services
3-> Broadcast receiver
4-> Content Providers

# Activity
/*
  Companion Object
  -> if we want to access any function or any member variable of class then we have to create an object of that class
   and then we can access through that object
  -> How can we access without crating an object
  1-> JAVA
  --------
  By the use of static keyword its possible
  Ex - public static String name ="Nalini";
  2-> KOTLIN
  ----------
  As written below we have to crate an companion object in this companion we can declare the variable or function
  But if you want to access this variable in a java class then you have to use an annotation @JvmStatic
  3-> const val
  -------------
  const val    ->    This the keyword use to declare a immutable variable at compile time
  compile time -> compile time meaning at the time of building
  */
