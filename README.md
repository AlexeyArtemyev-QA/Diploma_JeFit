# **Overview**

**https://www.jefit.com/ - приложение предназначенное для поиска, создания плана тренировок, 
отслеживаниея результата физической активности, а так же физических параметров пользователя.**

# **Installation**

#### IDE: IntelliJ

#### Тип проект: Maven

#### Язык программирования: JAVA

#### Pattern: POM (Page Object Module)

# **Frameworks**

#### Selenium

#### TestNG

#### Maven

#### CircleCI

#### Allure Reporting

# **Структура проекта**

## **pages**

BasePage

ExercisesPage

LoginPage

ProfilePage

### **constants**

ExercisesPageConstants

ProfilePageConstants

## **tests**

BaseTest

DriverFactory

ExercisesTest

LoginTest

ProfileTest

Retry

TestListener

# **Check list**

#### Проверить регистрацию на сайте

#### Проверить вход в личный кабинет

#### Проверить негативные сценарии при входе в личный кабинет

#### Проверить возможность изменения параметров пользователя

#### Проверить поиск упражнений по параметрам

##### Проверить поиск упражнений по картинке

##### Проверить поиск по базе данных

##### Проверить раздел Blog по темам

##### Проверить поиск новостей по тексту

To run Login tests use the command:

mvn -Dtest=LoginTest test

command result: Tests run: 14, Failures: 0, Errors: 0, Skipped: 0

To run Exercises tests use the command:

mvn -Dtest=ExercisesTest test

command result: Tests run: 13, Failures: 0, Errors: 0, Skipped: 0

To run Profile tests use the command:

mvn -Dtest=ProfileTest test

command result: Tests run: 11, Failures: 2, Errors: 0, Skipped: 0

In order to run tests, use the command:

mvn clean test -DsuiteXmlFile=src/test/resources/negative.xml

command result: Tests run: 13, Failures: 0, Errors: 0, Skipped: 0

mvn clean test -DsuiteXmlFile=src/test/resources/regression.xml

command result: Tests run: 12, Failures: 4, Errors: 0, Skipped: 1

