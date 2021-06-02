package br.com.saraiva.automation.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.saraiva.automation.core.DriverFactory;
import br.com.saraiva.automation.test.CriacaoDeCadastroTest;

@RunWith(Suite.class)
@SuiteClasses({	
	CriacaoDeCadastroTest.class,
		})

public class SuiteSaraiva {

	
	 @BeforeClass
	 public static void inicializa() throws Exception {
		 System.out.println("Iniciando Teste");
	 }
	
	 @AfterClass
	 public static void finaliza() throws Exception {
	 DriverFactory.finalizaDriver();
	 }

}