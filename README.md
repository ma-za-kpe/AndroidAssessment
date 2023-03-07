# AndroidAssessment

## Pick any 2 cards (That would have been implemented by a senior engineer) and implement them.
- This question is from the android technical assessment, they show case what i have done in the 
  repository.
1. Domain Modelling.
  > I assume;
  - that we have already had a meeting with the stakeholders prior to this task.
  We have a backend API and are using a tool like Postman to communicate with the backend. As attached here in the project README.
  > Metric,
   - Creation of a formula or algorithm that a single user(farmer) will look like until they generate a credit score. This can be seen below.
   - Conversation of JSON object to kotlin data classes.
2. Planning.
  > I assume;
  - The whole team has had several meetings and decided how and what tools to use(As seen above).
  > Metric,
  - Create the first version of the project.
  - Implement a naive dependency management system.
  - Create documentation using the README.
  - Set up continuous integration.
  - Set up linting on both sides of the development. (Android side/GitHub actions).
  - Create a git flow that other devs can branch off from.

## Installation
Please follow these steps to set up AndroidAssessment on your local machine.
1. Create a new, empty folder called androidassessment/ within your home folder. 
2. Navigate to it (cd androidassessment), then clone the AndroidAssessment repo. 
3. This will create a new folder named androidassessment/AndroidAssessment.

- Note: Please keep the folder name as androidassessment.
- Changing the project folder name might lead to future issues with running the pre-push checks on your machine.

2. Run the setup script, which adds some development tools for AndroidAssessment (ktlint, checkstyle, etc.):
-  For Windows
    - Install Git Bash Command Line
    - Open Git Bash Command Line.
    - Navigate to androidassessment/AndroidAssessment.
    - Run the script ``` bash scripts/setup.sh ```.
    - Download the google_checks.xml(https://github.com/checkstyle/checkstyle/blob/14005e371803bd52dff429904b354dc3e72638c0/src/main/resources/google_checks.xml) file. To do this, you can simply right-click on the Raw button and click on Save Link as.
    - Copy this file to the directory where Git is installed (usually C:/Program Files/Git/).

3. Follow instruction on this https://stackoverflow.com/a/66133030/8277525 to change IntelliJ's import order for Kotlin to satisfy ktlint

4. In Android Studio, select File > Open, navigate to androidassessment/AndroidAssessment, and click OK to load the project.

5. Click the elephant icon in the toolbar ("Sync Gradle") to ensure that all the correct dependencies are downloaded. (In general, you'll want to do this step any time you update your dependencies.)

## Important Design Links
1. Postman
   - Farmers => [https://documenter.getpostman.com/view/3729762/2s93JowRBY](Sample Api For Farmer)
   - Capacity =>[https://documenter.getpostman.com/view/3729762/2s93JowR7C](Sample Api For Capacity)
   
## Important Design images
1. Entity relationship diagram

![farmer-credit-system drawio](https://user-images.githubusercontent.com/28810111/223129269-7239d139-64f0-4862-bd1e-7d5a6516848f.svg)

2. Flowchart diagram

![farmer-credit-system-flow-chart drawio](https://user-images.githubusercontent.com/28810111/223134848-7d6d078f-ae67-4a03-9fb9-254d8240b0c9.svg)





