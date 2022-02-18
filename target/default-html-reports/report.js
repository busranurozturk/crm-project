$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/message.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Given "
});
formatter.match({
  "location": "com.crm.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on Message",
  "keyword": "And "
});
formatter.match({
  "location": "com.crm.step_definitions.MessageStepDefs.the_user_click_on_Message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "adding users by selecting multiple contacts from Employees and Departments contact lists",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@872"
    },
    {
      "name": "@pass"
    }
  ]
});
formatter.step({
  "name": "the user click on Add more button",
  "keyword": "When "
});
formatter.match({
  "location": "com.crm.step_definitions.MessageStepDefs.the_user_click_on_Add_more_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on Employees and departments button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.crm.step_definitions.MessageStepDefs.the_user_click_on_Employees_and_departments_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on \"Accounting\" department",
  "keyword": "Then "
});
formatter.match({
  "location": "com.crm.step_definitions.MessageStepDefs.the_user_click_on_department(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on All department and department employees to add all department add",
  "keyword": "And "
});
formatter.match({
  "location": "com.crm.step_definitions.MessageStepDefs.the_user_click_on_All_department_and_department_employees_to_add_all_department_add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on \"helpdesk9@cybertekschool.com\" to add employee",
  "keyword": "Then "
});
formatter.match({
  "location": "com.crm.step_definitions.MessageStepDefs.the_user_click_on_to_add_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see selected department and employee, in To input box",
  "keyword": "And "
});
formatter.match({
  "location": "com.crm.step_definitions.MessageStepDefs.the_user_should_be_able_to_see_selected_department_and_employee_in_To_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});