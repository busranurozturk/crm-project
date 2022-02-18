@login
  Feature:Users should be able to login
    Scenario:Login with valid credentials
      Given the user should be able to login
      Then the user is on the "Activity Stream" page
