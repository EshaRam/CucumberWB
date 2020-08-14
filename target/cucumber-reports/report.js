$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/easwarimuthu/IdeaProjects/CucumberWBQA/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "login action test",
  "description": "",
  "id": "login-action-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Whitebox login test",
  "description": "",
  "id": "login-action-test;whitebox-login-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpasswaord\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "message displayed wrong",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "login-action-test;whitebox-login-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "login-action-test;whitebox-login-test;;1"
    },
    {
      "cells": [
        "easwari.theetha@gmail.com",
        "blahblah"
      ],
      "line": 10,
      "id": "login-action-test;whitebox-login-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Whitebox login test",
  "description": "",
  "id": "login-action-test;whitebox-login-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter \"easwari.theetha@gmail.com\" and \"\u003cpasswaord\u003e\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "message displayed wrong",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.user_is_on_homepage()"
});
formatter.result({
  "duration": 4696485635,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 380375500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "easwari.theetha@gmail.com",
      "offset": 12
    },
    {
      "val": "\u003cpasswaord\u003e",
      "offset": 44
    }
  ],
  "location": "TestSteps.user_enter_and(String,String)"
});
formatter.result({
  "duration": 620382642,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.message_displayed_wrong()"
});
formatter.result({
  "duration": 95128327,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.quit_the_browser()"
});
formatter.result({
  "duration": 166082825,
  "status": "passed"
});
});