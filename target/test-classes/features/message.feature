@wip
Feature:
  Background:
    Given the user should be able to login
    And the user click on Message
  @871 @pass
  Scenario:upload files icon
    When the user click on upload files icon
    Then the user choose files or images from local disk
    And User should be able to see selected files or images under Attached files and images
  @872 @pass
  Scenario:adding users by selecting multiple contacts from Employees and Departments contact lists
    When the user click on Add more button
    Then the user click on Employees and departments button
    Then the user click on "Accounting" department
    And the user click on All department and department employees to add all department add
    Then the user click on "helpdesk9@cybertekschool.com" to add employee
    And the user should be able to see selected department and employee, in To input box
  @873 @pass
  Scenario:attaching a link by clicking on the link icon
    When the user click on the Link icon
    Then the user write link text "Text" in Text input box
    Then the user write Link URL "https://de.wikipedia.org/wiki/Text" in Link input box
    Then the user click on save button
    And the user should be able to see written link text "Text" on message box
  @874 @fail @bug
  Scenario:inserting videos by clicking on the video icon and entering the video URL
     When the user click on the Insert video icon
     Then enter the video URL "https://www.youtube.com/watch?v=BVkZSt4lyTY" in Video source input box
     Then the user click on save button
     And the user should be able to see attached video URL "https://www.youtube.com/watch?v=BVkZSt4lyTY" on message box
  @875 @pass
  Scenario: creating a quote by clicking on the Comma icon
    When the user click on the Comma icon
    Then the user write quote "comment"
    And the user should be able to see written quote "comment" on message box
  @876 @pass
  Scenario: adding mention by clicking on the Add mention icon
    When the user click on the Add mention icon
    Then the user add mention from Recent or Employees and departments
    And the user should be able to see added mention in To input box
  @877 @pass
  Scenario:sending a message
    When the user write message "verify send message" in text box
    Then the user is click on the send button
    And the user should be able to see that written "verify send message" message on Activity Stream page
