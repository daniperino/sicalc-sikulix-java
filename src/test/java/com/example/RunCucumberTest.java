package com.example;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:/Dani/Java-exercicios/SiCalc/receita-demo/src/test/resources/features",
    glue = "com.example.steps",
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    tags = "@darf"
)
public class RunCucumberTest {
    // Esta classe ficará vazia. Ela serve apenas para o JUnit e o Cucumber configurarem e executarem os testes.
}