$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/stepdef6/casestudy6.feature");
formatter.feature({
  "name": "testme function in jenkins",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "testme functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user do launching chrome browser and registration page",
  "keyword": "When "
});
formatter.match({
  "location": "case6.user_do_launching_chrome_browser_and_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user do  sigin function",
  "keyword": "When "
});
formatter.match({
  "location": "case6.user_do_sigin_function()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User do enter input username as \"lalitha\" in un field",
  "keyword": "When "
});
formatter.match({
  "location": "case6.user_do_enter_input_username_as_in_un_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user do enter input password as \"password123\" in pw field",
  "keyword": "When "
});
formatter.match({
  "location": "case6.user_do_enter_input_password_as_in_pw_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user do click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "case6.user_do_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user do search productname in search menu",
  "keyword": "When "
});
formatter.match({
  "location": "case6.user_do_search_productname_in_search_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user do click find details",
  "keyword": "When "
});
formatter.match({
  "location": "case6.user_do_click_find_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user do validate the product",
  "keyword": "Then "
});
formatter.match({
  "location": "case6.user_do_validate_the_product()"
});
formatter.result({
  "status": "passed"
});
});