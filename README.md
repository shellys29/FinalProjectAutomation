# **Fullstack Automation Project**
------------

###  *This project was created to show my knowledge and skills on a several platforms using different kinds of tools and frameworks.*

-----------
###  *Project Overview* 
The project is an example of infrastructure for automation testing using different kinds of applications:
- Web API
- Web based application
- Mobile application
- Desktop application
- Electron application

### *Infrastructure project*

- Page Object Design Pattern
- Project Layers(Extensions/Work Flows/Test Cases...)
- Support of Different Clients/Browsers
- Failure Mechanism
- Common Functionality
- External Files Support
- Reporting System (including screenshots)
- Visual Testing
- DB support
- CI support

### *Applications used in this project*
- Web based application- Grafana webpage 
- Mobile application - Mortgage calculator 
- Web API- Grafana API  
- Electron application- Todolist
- Desktop application- Windows calculator 

### *Tools & Frameworks used in this project*
**Selenium** - For Web Application Testing

**Appium** - For Mobile Application Testing

**TestNG** - Testing Framework


    @Test(description = "Test02 - verify default Users")
    @Description("This test verifies the default users")
    public void Test02_VerifyDefaultUsers() {
        UIActions.mouseHover(GrafanaLeftMenu.btn_server, GrafanaServerAdmin.link_users);
        Verifications.numberOfElements(GrafanaServerAdminMain.rows, 1);
    }

**Listeners** - interface used to generate logs and customize the TestNG reports

**MySQL** - Free Online DB - used for Grafana web page

**Jenkins**- for tests execution

**Allure Reports** - as the main reporting system 
![allure exp](https://user-images.githubusercontent.com/109291463/179021063-b8d01ad2-93f2-4bcd-a6d1-25d40891c277.png)

**RestAssured**- for API testing

**WinAppDriver** - For Desktop Application Testing

**Electron Driver** - For Electron Application Testing



------------

### *Tests Cases*
For each of the following application there is a few simple test cases who meant to demonstrate the usage of the tools and frameworks that have been used.
[to-test-cases](https://github.com/shellys29/FinalProjectAutomation/tree/main/src/test/java "test-cases")


#### *Known Issues:*
*Sometimes there can be conflicts with some dependencies the applications are using. Hence, the project is for DEMO purpose only.*
*In production it should be divided into several projects.*
