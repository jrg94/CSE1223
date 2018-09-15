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

[1]: http://www.drjava.org/
