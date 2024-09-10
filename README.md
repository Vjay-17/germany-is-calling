# germany-is-calling
Here There are Two TestScripts For Both successful Login and Unsuccessful Login
step 1: Both the test Scripts for successful & unsuccessful login are writtern using java with selenium in eclipse.
step 2 : First Create The Class For Successful login.
step 3 :create method to Open the Browser
        Here i used @BeforeMethod to execute this below statement before the actual statement.
        Take the WebDriver Reference and launch an ChormeBroswer.
        maximize the screen using maximize()
        after that implicitWait statement to match the speed the application to eclipse.
        fetched the Url with the help of driver.get(string url) method.
step 4 : Here used @Test annotation to execute after the @beforemethod 
         Here i took another method for login
         fetched the username by inspecting the email textfield and taken id attribute
         Then used driver.findElement method then By.Id given the id attribute value given the input with help of sendkeys for both username and password
         Then inspect the login button , here used xpath to click on the login button 
step 5 :   after that used softassert to check the condition after clicking on the button if home page dispalyed that our login is successful
step 6 : Later used @afterMethod which will execute after the actual method whick is used to close the browser
step 7 : Then taken another class to write the script for the unsuccessful login 
          do the same as above but give the wrong credentials.
step 8: Select the both the classes and create the suite then click on run button both the scripts will execute and test report will be genereted.
