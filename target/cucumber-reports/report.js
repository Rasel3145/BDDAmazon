$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/ebay.feature");
formatter.feature({
  "name": "Access Ebay homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ebay Homepage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter https:www.Ebay.com on the address bar",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayHomepage.i_enter_https_www_Ebay_com_on_the_address_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on Ebay Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.EbayHomepage.i_should_be_on_Ebay_Homepage()"
});
formatter.result({
  "status": "passed"
});
});