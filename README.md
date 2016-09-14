# MavenCucumberSeleniumExample

This is a small and leightweight example for automating acceptance tests over Maven with Cucumber and Selenium WebDriver.

pre-conditions:

- install Maven (see [https://maven.apache.org/install.html]())
- install Cucumber (see [https://github.com/cucumber/cucumber/wiki/Install]())

Now you can run the tests with the following Maven call:

`mvn clean install integration-test -Dcucumber.options='--tags @cucumber'`

Cucumber report will be generated and placed in *target*-folder.