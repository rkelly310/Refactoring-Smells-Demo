<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/rkelly310/CucumberAPIDemo/">
    <img src="images/codesmell.png" alt="Logo">
  </a>

  <h2 align="center">Creating and Testing BDD Scenarios using Specflow in .NET and Selenium Webdriver</h2>

  <p align="center">
    A demo lab instructing users on construct BDD test projects, feature files, step definitions and test runners to complete a BDD test iteration.
    <br />
    <a href="https://github.com/U815073/SpecFlowSeleniumDemo/"><strong>Explore the docs �</strong></a>
    <br />
    <br />
    <a href="https://github.com/U815073/SpecFlowSeleniumDemo/">View Demo</a>
    �
    <a href="https://github.com/U815073/SpecFlowSeleniumDemo/issues">Report Bug</a>
    �
    <a href="https://github.com/U815073/SpecFlowSeleniumDemo/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        </ul>
        <li><a href="#instructions">Instructions</a></li>
      </ul>
    </li>
<!--
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
-->
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
<!--
    <li><a href="#acknowledgements">Acknowledgements</a></li>
-->
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
### About The Project

This project is designed for a lab environment within a Test Automation and Behavior-Driven Development course. Students will build out a feature file, a series of step definitions, a Specflow test runner class to test a basic webdriver application that utilizes the preexisting Lambda lab to test its To-Do List functionalities.
To view individual requirement solutions, review the steps below.

### Built With

* Eclipse IDE: [IntelliJ Community Edition](https://www.eclipse.org/downloads/)
* Java dev kit: [Java SE Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Gradle: [https://gradle.org/install/]
<br>
**The following dependencies are used in this project:**

* [Junit-Jupiter-Engine] 
* [Junit-Jupiter-Api]
* [Maven-Compiler-Plugin]

<br>


<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

None, other than Eclipse or Intellij IDE, the packages/dependencies above.

### Installation

Simply clone the repo to see the full solution:
   ```sh
   git clone https://github.com/U815073/SpecFlowSeleniumDemo.git
   ```
<!-- Instructions -->
## Instructions
### Task 1: 

<br>
<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.

<!-- CONTACT -->
## Contact

Project Link: [https://github.com/U815073/SpecFlowSeleniumDemo](https://github.com/U815073/SpecFlowSeleniumDemo)



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png

You will learn to:

- Identify bad code
- Fix code smells
- Refactor with tests

## Required software and tools for this exercise

- Eclipse IDE: [IntelliJ Community Edition](https://www.eclipse.org/downloads/)
- Java dev kit: [Java SE Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)



## Details

:pencil2: Open `pom.xml` in IntelliJ by selecting *Import project* from the Welcome Screen. You can also use File --> New --> Project from existing sources. 

:pencil2: Run all the tests and examine the code. 

:question: What does this code do? Before you start changing the code, understand what the code does. 

:question: What is wrong with the code? There are naming issues, magical numbers, bad structure and more. 

The main part of this exercise is to refactor the code. You'll get to do much of this on your own, but here are some fairly small tasks to start with: 

:pencil2: Fix all the magical numbers. 

:pencil2: Rename existing functions so their names reflect what they do.

:pencil2: Remove bad comments.

:pencil2: Make functions where appropriate if there are clear bits of the code that are independent of the rest. 

From now on you're on your own. There are many ways to refactor this code and not necessarily one correct one. It's useful to discuss whether you see any code that should be separated into and what each class should do. Can any of the code structures you've learned about make this code easier to read and easier to maintain? If you add more drinks to the menu, how can you make the code support this in the best way possible? 

