$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login/LoginTest.feature");
formatter.feature({
  "name": "Teste login usuario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Realiza login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@T0001"
    }
  ]
});
formatter.step({
  "name": "abre o browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clica em LogIn",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user preenche campo de username e password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clica em logar",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "valida campo de Usuario ativo",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});