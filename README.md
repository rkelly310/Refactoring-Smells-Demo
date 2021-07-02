<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/rkelly310/CucumberAPIDemo/">
    <img src="images/codesmell.png" alt="Logo" width="400">
  </a>

  <h2 align="center">Spotting and Refactoring Common Code Smells in Legacy Code</h2>

  <p align="center">
    A demo lab instructing users on getting to know some of the most common code smells and spotting poorly written code fragments. Students will refactor these smells using Junit testing and their knowledge of proper coding principles.
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

This project is designed for a lab environment within a Working With Legacy Code course. Students will download, build and execute the simple example project, and follow the instructions below to locate numerous poorly written code fragments. Students will then use the preexisting test methods as well as create new methods to clean and organize the smelly codebase.

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
### Task 1: Run Code  
First, import and build the code as an existing Gradle project. Run the code as a series of Junit tests to validate that the code functions as it is written. Examine the tests and gain an understanding of what the code does.  
<br>
### Task 2: Identify the Smells  

Now, lets look at the Pub class a little more closely.  

```csharp
public class Pub {


    public static final String ONE_BEER = "budweiser";
    public static final String ONE_CIDER = "downeast";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    public double computeCost(String drink, boolean student, double amount) {

        if (amount > 2 && (drink == GT || drink == BACARDI_SPECIAL)) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
        double price;
        if (drink.equals(ONE_BEER)) {
            price = 4.00;
        }
        else if (drink.equals(ONE_CIDER)) {
            price = 5.00;
        }
        else if (drink.equals(A_PROPER_CIDER)) price = 5.50;
        else if (drink.equals(GT)) {
            price = ingredient6() + ingredient5() + ingredient4();
        }
        else if (drink.equals(BACARDI_SPECIAL)) {
            price = ingredient6()/2 + ingredient1() + ingredient2() + ingredient3();
        }
        else {
            throw new RuntimeException("No such drink exists");
        }
        if (student && (drink == ONE_CIDER || drink == ONE_BEER || drink == A_PROPER_CIDER)) {
            price = price - price/10;
        }
        return price*amount;
    }

    //one unit of rum
    private double ingredient1() {
        return 3.00;
    }

    //one unit of grenadine
    private double ingredient2() {
        return 0.50;
    }

    //one unit of lime juice
    private double ingredient3() {
        return 0.50;
    }
    
    //one unit of green stuff
    private double ingredient4() {
        return 0.50;
    }

    //one unit of tonic water
    private double ingredient5() {
        return 1.00;
    }

    //one unit of gin
    private double ingredient6() {
        return 3.00;
    }
}
```  

What is wrong with this code? Some of the smaller issues are:  
* Naming Convention Issues
* Magical Numbers
* Poorly Structured Class(es)
* Overly complex logic
* Unhelpful Comments
* etc,.  
Try to find the more complex smells on your own.  
<br>
### Task 3: Refactor the Code  

There are many ways to refactor this code and not necessarily one correct one. It's useful to discuss whether you see any code that should be separated into and what each class should do. Can any of the code structures you've learned about make this code easier to read and easier to maintain? If you add more drinks to the menu, how can you make the code support this in the best way possible? 

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




