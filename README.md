# Проект по автоматизации тестирования для SmartDeal
## <a target="_blank" href="https://www.rshb.ru/">Веб сайт https://smartdeal.pro</a>
## :o2: Содержание:

- <a href="#shinto_shrine-общая-информация-о-тестовом-фреймворке">Общая информация о тестовом фреймворке</a>
- <a href="#shinto_shrine-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#shinto_shrine-реализованные-проверки">Реализованные проверки</a>
- <a href="#shinto_shrine-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#shinto_shrine-запуск-из-терминала">Запуск из терминала</a>
- <a href="#shinto_shrine-allure-отчет">Allure отчет</a>
- <a href="#shinto_shrine-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#shinto_shrine-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :o2: Общая информация о тестовом фреймворке
&nbsp;&nbsp;&nbsp;Для реализации данного тестового фреймворка на хостинге был развернут VPS
с Ubuntu 22.04, установлен Docker, в Docker Compose подняты Jenkins, Selenoid
and Selenoid UI, настроены роли в Jenkins для доступа, загружены необходимые
образы браузеров. Создан чат бот в Telegram для получения уведомлений о
прохождении тестов из Jenkins. Создан проект в IntellijIDEA, запушен на GitHub.
В коде добавлены все аттачменты для сохранения статистики проходжения тестов,
такие как: Screenshot, PageSource, BrowserConsole and addVideo. 

## :o2: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/IntelliJ_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.png">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="GitHub" src="images/logo/Github.png">
<img width="6%" title="GitHub" src="images/logo/Docker.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :o2: Реализованные проверки
- Открытие сайта smartdeal.pro
- Переход по кнопке: 'Банкам'
- Переход по кнопке: 'Застройщикам'
- Переход по кнопке: 'Получить консультацию'
- Переход по ссылке: 'Блог'
- Переход по ссылке: 'Контакты'
- Переход по ссылке: 'Команда'
- Переход по ссылке: 'Справочный центр'
- Переход по ссылке: 'Тарифы'
- Переход по ссылке: 'Правовая информация'
- Открытие окна чата, проверка наличия сообщения

### <a target="_blank" href="http://62.113.108.218:8888/job/SmartDeal/">Сборка в Jenkins</a>
<p align="center">
  <img title="Jenkins Dashboard" src="images/screenshots/jenkins_dashboard.png">
</p>

### Параметры сборки в Jenkins:
Сборка в Jenkins
- browser (браузер, по умолчанию chrome)
- browserVersion (default 112.0)
- browserSize (default 1920x1080)
- threads (количество потоков)

## :o2: Запуск из терминала
Локальный запуск:
```bash
gradle clean test
gradle clean ui-test
```

Удаленный запуск:
```bash
clean
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-Dthreads=${THREADS}
test
```


<table width="100%" cellspacing="0" cellpadding="0">
  <tr> 
    <td class="leftcol"><img src="images/logo/Java.svg"
      width="90" height="78" alt="Вы не поверите, но это ёжик"></td>
    <td valign="top">Ёжики защищены от внешней агрессии колючим 
      панцирем, который спасает их от тех, кто хочет поживиться вкусным и нежным мясом 
      ежа. Но не стоит считать это животное и совершенно безобидным, все-таки это 
      хищник. Да, он не питается волками и лисами, но только потому, что уступает 
      им в размерах. А вот закусить червячком или даже змеей ему вполне под силу.</td>
  </tr>
</table>



## :shinto_shrine: Allure отчет    
  <img src="images/logo/Jenkins.svg" width="30" height="30">Посетите наш сайт, кликнув по картинке:


- ### <a target="_blank" href="http://62.113.108.218:8888/job/SmartDeal/18/allure/">Главный экран отчета</a>
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_main_page.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure_test_page.png">
</p>

## :shinto_shrine: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/screenshots/telegram_notification.png">
</p>

## :shinto_shrine: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/smartdeal.gif">
</p>