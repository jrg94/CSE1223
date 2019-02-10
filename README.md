# CSE 1223

Welcome to the homework test repo for OSU's programming Java course. In this repo, you'll find various
JUnit files for testing project solutions.

## Navigation

At the top-level, you'll notice a tools folder. Inside that folder, you'll see several project folders. 
Each project folder contains a single JUnit source file for testing solutions. 

## Usage

To use one of the test files, I typically download all student student submissions, unzip the folder, and place the 
JUnit file at the top-level. From there, I launch [Dr. Java][1] and drop the JUnit file into the editor.

To grade, I typically open one solution at a time and look them over for style. 
Then, I compile each solution and hit test. At that point, I'll see either green glowing 
bars indicating successful testing or red glowing bars indicating failed testing.

To make testing easier, I don't deal with solution structure. Instead, I focus on solution content.
In other words, when I test, I remove all whitespace including newlines before comparison. This allows
me to verify that each student solution is at least semantically correct. I don't personally care
to nitpick on structure.

## Report Format

Old report format:

```
+++++++++++++++ student name ++++++++++++++++

C:/Users/Jerem/Downloads\Dump\student name\Project04\src\osu\cse1223\Project04.java


JUnit version 4.13-beta-2
..........E....E.E.
Time: 0.088
There were 3 failures:
1) testAllCapsFire(Project04Test)
org.junit.ComparisonFailure: expected:<...ire/plant/water]:you[chose:firedragonichose:waterdragonwaterdefeatsfire-youlose]!> but was:<...ire/plant/water]:you[don'thaveafiredragon,soyouchoosenodragons.ichose:waterdragonyoulosebydefault]!>
	at org.junit.Assert.assertEquals(Assert.java:117)
	at org.junit.Assert.assertEquals(Assert.java:146)
	at Project04Test.runCase(Project04Test.java:268)
	at Project04Test.testAllCapsFire(Project04Test.java:308)
2) testAllCapsPlant(Project04Test)
org.junit.ComparisonFailure: expected:<...ire/plant/water]:you[chose:plantdragonichose:plantdragonatie]!> but was:<...ire/plant/water]:you[don'thaveaplantdragon,soyouchoosenodragons.ichose:plantdragonyoulosebydefault]!>
	at org.junit.Assert.assertEquals(Assert.java:117)
	at org.junit.Assert.assertEquals(Assert.java:146)
	at Project04Test.runCase(Project04Test.java:268)
	at Project04Test.testAllCapsPlant(Project04Test.java:388)
3) testAllCapsWater(Project04Test)
org.junit.ComparisonFailure: expected:<...ire/plant/water]:you[chose:waterdragonichose:waterdragonatie]!> but was:<...ire/plant/water]:you[don'thaveawaterdragon,soyouchoosenodragons.ichose:waterdragonyoulosebydefault]!>
	at org.junit.Assert.assertEquals(Assert.java:117)
	at org.junit.Assert.assertEquals(Assert.java:146)
	at Project04Test.runCase(Project04Test.java:268)
	at Project04Test.testAllCapsWater(Project04Test.java:348)

FAILURES!!!
Tests run: 16,  Failures: 3
```

[1]: http://www.drjava.org/
