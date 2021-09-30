# Learning Java Collections
This is the repository for the LinkedIn Learning course Learning Java Collections. The full course is available from [LinkedIn Learning][lil-course-url].

![Learning Java Collections][lil-thumbnail-url] 

As developers advance past the basics of Java, they must understand how to effectively use Java collections in their daily work. This course offers you a deep dive into the framework and hands-on experience working with it. The Java Collections framework consists of interfaces, implementations, and utilities that together provide standard support for common data structures in the language. Instructor Kevin Bowersox explains these things, then goes into real examples of techniques for working with them, like creating different collections types and iterating them. He covers operations and interfaces such as List (including both ArrayList and LinkedList), Queue, Deque, and Map. Kevin concludes with a discussion of how you can use Java Collections utilities to sort elements, search collections, use comparators, and more.

## Instructions
This repository has branches for each of the videos in the course. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"

## Installing
1. To use these exercise files, you must have the following installed:
	- [Java Development Kit 11 (JDK 11)][jdk11]
	- [Eclipse IDE][eclipse]
2. Clone this repository into your local machine using the terminal (Mac), CMD (Windows), or a GUI tool like SourceTree.

### Instructor

Kevin Bowersox 
                            
Web application developer

                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/kevin-bowersox).

[lil-course-url]: https://www.linkedin.com/learning/learning-java-collections
[lil-thumbnail-url]: https://cdn.lynda.com/course/2421704/2421704-1632758713620-16x9.jpg
[jdk11]: https://adoptopenjdk.net/
[eclipse]: https://www.eclipse.org/downloads/packages/

