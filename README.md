# Distributed Development Exercise

This exercise will give you practice doing distributed development as part of a large
team. The entire class will modify a single project in one Git repo. At the end of the
class, everyone should have a fully merged copy of every other student's changes in 
their own branch.

**The exercise will count for a quiz grade in the course.**

## The App

The app is a simple command line application that provides information about Vandy. The
current version of the app supports a single command that prints out the Vanderbilt website
URL. 

You can run the app with:

``` 
lein run
```

You can pass command line arguments with:

``` 
lein run some arguments to the main function
```


## Exercise Steps

0. Go and complete the "Class Exercise with Git" quiz so that you are added to the list
   of people that were in class.

1. Every student needs to contribute a new piece of information to the app by creating
   a function similar to the "vandy-homepage" function 
   
2. No students can implement the same or substantially similar functionality (zero credit
   will be awarded to all students that commit after the first student to commit the
   functionality)
   
3. Each piece of functionality needs to be accessible by running the application --
   you will need to determine what function to run and what output to print based on 
   the command line arguments to -main
   
4. The class as a whole must agree on how -main will work and what the format of the
   information functions, files, etc. will be
   
5. Every information function must have both a simple unit test similar to the 
   vandy-homepage-test and an integration test similar to the vandy-homepage-integration-test
   that ensures the functionality is runnable from the command line 
   
6. To hand-in the exercise, merge the every other student's information function, tests,
   etc., into your own copy of the exercise and then push the merged and *working* version
   of the code that passes all tests to a branch named "firstnamelastname" (replace
   firstnamelastname with your name)
   
7. The merged branch that you hand-in must run every other student's unit and integration
   tests AND they must pass:
   
   ```
   lein test 
   ```

8. The merged branch that you hand-in must be able to run every other student's information
   function based on a different command line parameter
   
9. If someone has a broken information function and/or tests, you are still responsible for
   making sure it is working in your hand-in branch -- you sink or swim together
   
10. Turn in your merged exercise branch by tonight at midnight



## WARNING!

Failure to coordinate as a class will result in this exercise being MUCH HARDER than it
needs to be. Simple rules on naming conventions, architecture, branch structure, etc. will make things much easier. If you help each other, you will all have a much easier time. 

This exercise is typically completed by the whole class with 15-20min to spare. Normally,
class gets out early. However, this ONLY happens if everyone works together and plans
ahead. 

Hits:

 1. Separate files are less likely to have merge conflicts
 
 2. The command args structure from Asgns 1-3 might be helpful for -main
 
 3. Tests can be created in the existing core_test.clj OR in new files with
    appropriate namespaces
    
 4. The class as a whole should try to ensure that everyone gets their functions and
    tests committed to a branch within the first 45min of class
    
 5. Workflows that have a tree structure will dramatically reduce the work for this 
    exercise
    
 6. You can look at a repo from a prior year for hints as to how they pulled it off:
    https://github.com/juleswhite/CSX278_Ex5


## License

Copyright © 2018 Jules White

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
