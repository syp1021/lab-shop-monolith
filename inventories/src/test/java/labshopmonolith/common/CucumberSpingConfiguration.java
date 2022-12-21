package labshopmonolith.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopmonolith.InventoriesApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InventoriesApplication.class })
public class CucumberSpingConfiguration {}
