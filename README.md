# CSE 1223

Welcome to the homework test repo for OSU's programming Java course. In this repo, you'll find various
JUnit files for testing project solutions.

## Navigation

At the top-level, you'll notice a tools folder and a projects folder. Inside the projects folder, you'll 
see several project folders. Each project folder contains a single JUnit source file for testing solutions.
Inside the tools folder, you'll find the Python script for automated grading.

## Usage

To use one of the test files, I typically download all student student submissions and run them
using the Python tool. The tool uses the JUnit projects to test each student's solution before
dumping the results to a JSON file.

To make testing easier, I don't deal with solution structure. Instead, I focus on solution content.
In other words, when I test, I remove all whitespace including newlines before comparison. This allows
me to verify that each student solution is at least semantically correct. I don't personally care
to nitpick on structure.

Before grading, I typically open one solution at a time and look them over for style. 
If necessary, I'll launch [Dr. Java][1] and run the file by hand.

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
