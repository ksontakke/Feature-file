Feature: Unacademy Website

Scenario Outline: User wants to search for particular Educator/course/lesson
Given User is on Unacademy Home Page
When User enters course <data>
Then User navigates to respective pages
Examples:
|data|
|Sahil Khandelwal|
|Chemistry|
|SSC|
|abcdef|


Scenario: User wants to search all the courses from a particular educator
Given User is on Unacademy Home Page
When User enters Educators name
And User clicks on Educators Hyperlink
Then User navigates to Educators profile page


Scenario: User wants to follow the educator
Given User is on Course page
When User click on fallow
Then User should see following option


Scenario: User wants to search for particular Course
Given User is on Search Page
When User enters course name
And User clicks on Course Hyperlink
Then User navigates to the Course page


Scenario: User wants see free classes and test
Given User is on the Course page
When User click on free classes and test
Then User should see the free courses


Scenario: User wants see Quick cources
Given User is on a Course page
When User click on Quick cources
Then User should see the Quick cources


Scenario: User wants see Enroll and save course content
Given User is on a Course page
When User click on My library
Then User should see the saved cources content 


Scenario: User wants see course Syllabus
Given User is on a Course page
When User click on Syllabus
Then User should see the course syllabus 


Scenario: User wants see test series and practices
Given User is on a Course page
When User click on Test series and Practices
And User click on Test series
Then User should see the test pracices and series


Scenario: User clicks on Related searches 
Given User is on the Search Page
When User clicks on any Related Search
And user clicks on Particular course
Then User navigates to course page


Scenario: User wants to come back to Unacademy Home page
Given User is on a Search Page
When User clicks on Home
Then User navigates to Unacademy Home page


Scenario: User wants to Report An Issue
Given User is on Search Page
When User clicks on Report an issue
Then User navigates to Report an issue page
And User Reports an Issue
And Submits it


Scenario: User wants to Report An Issue
Given User is on Search Page
When User clicks on Report an issue
Then User navigates to Report an issue page
And User Reports an Issue using data table
|This is an issue|
And Submits it


Scenario: User wants to Check other Links
Given User is on Search Page
When User clicks on Other Links
Then User clicks on Facebook logo
And User navigates to facebook page of the Unacademy website


Scenario: User wants to See All the Educators on Search Page and plays a preview video
Given User is on Search Page
When User clicks on See All
Then User Gets all the Educators name
And User Clicks on particular Educator
And User Clicks on a video


Scenario: User wants to click on Get the Learning App
Given User is on Search Page
When User clicks on Get the learning App
Then User navigates to Learning App page