package br.com.saraiva.automation.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.saraiva.automation.core.Framework;
import br.com.saraiva.automation.page.SaraivaPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CriacaoDeCadastroTest{

	public SaraivaPage sp = new SaraivaPage();
	public Framework fmw = new Framework();

	// Variaveis para teste
	// Atualizar os valores para criaçao do cadastro
	private static boolean imprime = true;
	private static String nome = "maria";
	private static String sobreNome = "santos";
	private static String email = "nicolau9976@uorak.com";
	private static String senha = "123456789";
	private static String confSenha = "123456789";
	private static String cpf = "390.762.500-57";
	private static String sexo = "Feminino";
	private static String dtNascimento = "03/05/1995";
	private static String telefone = "8199999999";
	private static String pais = "BRA";
	private static String cep = "89292-730";
	private static String estado = "";
	private static String cidade = "";
	private static String bairro = "";
	private static String endereco = "";
	private static String numero = "122";
	private static String complemento = "Ap 904";
	private static String telefoneParaContado = "8199999900";
	private static String pontoRefrencia = "Perto da Casa Rosada";
	
	
	@Before
	public void logarDataHoraDoTeste() {
		if (imprime) {
			System.out.println("------------------- " + Framework.getDataEHoraAtual() + " -------------------");
			imprime = false;
			fmw.telaFullscreen();
		}
	}

	/**
	 * Objetivo do teste: Criar novo cadastro.
	 */
	@Test
	public void test01_criarNovoCadastro() {
		try {
			fmw.esperarElementoVisivel(sp.getBtnEntrar());
			fmw.clicarNoElemento(sp.getBtnEntrar());
			fmw.esperarElementoVisivel(sp.getEntrarComCliente());
			fmw.clicarNoElemento(sp.getEntrarComCliente());
			fmw.mudarFocoDeWindow();
			fmw.clicarNoElemento(sp.getCriarNovoCadastro());
			fmw.esperarElementoVisivel(sp.getInserirDados());
			inserirDadosParaCadastro();
			fmw.clicarNoElemento(sp.getFinalizar());
			fmw.validarUsarioLogado();
		} catch (Exception e) {
			Assert.fail("Teste falhado !! Exception :" +e);
		}
	}

	public void inserirDadosParaCadastro() {
		fmw.escrever(sp.getNome(), nome);
		fmw.escrever(sp.getSobreNome(), sobreNome);
		fmw.escrever(sp.getEmail(), email);
		fmw.escrever(sp.getSenha(), senha);
		fmw.escrever(sp.getConfSenha(), confSenha);
		fmw.escrever(sp.getCpf(), cpf);
		if( sexo == "Masculino") {
			fmw.clicarBotao(sp.getSexoMasculino());
		} else  {
			fmw.clicarBotao(sp.getSexoFeminino());
		}
		fmw.escrever(sp.getDtNascimento(), dtNascimento);
		fmw.escrever(sp.getTelefone(), telefone);
		fmw.selecionarPais(sp.getPais(), pais);
		fmw.escrever(sp.getCep(), cep);
//		O CEP mapeia o endereço automaticamente. Descomentar caso o CEP não mapeie.
//		fmw.escrever(sp.getEstado(), estado);
//		fmw.escrever(sp.getCidade(), cidade);
//		fmw.escrever(sp.getBairro(), bairro);
//		fmw.escrever(sp.getEndereco(), endereco);
		fmw.escrever(sp.getNumero(), numero);
		fmw.escrever(sp.getComplemento(), complemento);
		fmw.escrever(sp.getTelefoneParaContado(), telefoneParaContado);
		fmw.escrever(sp.getPontoRefrencia(), pontoRefrencia);
		fmw.clicarBotao(sp.getDesejoReceberEmail());
	}
	
}
