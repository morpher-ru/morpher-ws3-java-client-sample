[![](https://travis-ci.org/morpher-ru/morpher-ws3-java-client-sample.svg?branch=master)](https://travis-ci.org/morpher-ru/morpher-ws3-java-client-sample)
# morpher-ws3-java-client-sample
Пример использования [Java-клиента](https://github.com/morpher-ru/morpher-ws3-java-client) для веб-сервиса ["Морфер" 3.0](http://morpher.ru/ws3)
***

## Сборка и зависимости
Для использования клиента в своем проекте стоит подключить библоитеку через Maven.

Для начала добавить в файл pom.xml репозиторий который содержит библиотеку:

```xml
    <repositories>
        <repository>
            <id>morpher-ws3-java-client-mvn-repo</id>
            <url>https://raw.github.com/morpher-ru/morpher-ws3-java-client/mvn-repo</url>
            <snapshots>
                <enabled>true</enabled>
                <updatePolicy>always</updatePolicy>
            </snapshots>
        </repository>
    </repositories>
```

Добавить зависимость на клиент:

```xml
     <dependencies>
         <dependency>
             <groupId>ru.morpher</groupId>
             <artifactId>ws3.client</artifactId>
             <version>1.0-SNAPSHOT</version>
             <scope>compile</scope>
         </dependency>
     </dependencies>
```
