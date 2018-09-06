# CSE1223

OSU's Intro to Java Course for Instructors

## Navigation

At the top-level, you'll notice a tools folder. Inside that folder, you'll see several project folders. 
Each project folder contains a single JUnit source file for testing solutions. 

## Usage

To use one of the test files, I typically download all student student submissions, unzip the folder, and place the 
JUnit file at the top-level. From there, I launch [Dr. Java][1] and drop the JUnit file into the editor.

To grade, I typically open each solution and look it over for style. Then, I compile their solution and hit test.
At that point, you should see either green glowing bars indicating successful testing or red glowing bars
indicating failed tests.

Unfortunately, failed tests are harder to diagnose since my solutions do not handle the use of print vs.
println in conjuction with scanner very well. In other words, the following will typically cause problems
for my JUnit tests:

```
Scanner in = new Scanner(System.in)
System.out.print("Tell me your name: ");
String name = in.nextLine();
```

vs.

```
Scanner in = new Scanner(System.in)
System.out.println("Tell me your name: ");
String name = in.nextLine();
```

In either case, the student will probably see something like:

> Tell me your name: some name

To JUnit however, the string comparison will fail in the former case due to the missing new line character. 
Unfortunately, I haven't come up with a solid workaround. Perhaps, I should remove all new lines and compare 
the strings that way. Of course, that allows improper solutions to pass some tests, so I'm not sure how
I want to handle this.

I would prefer if the projects had more objective outcomes. Having a program output a string is a bit tedious 
and requires a lot of human judgment. In fact, I already have to use reflection to deal with package issues.

Oh well! These get the job done.

[1]: http://www.drjava.org/
