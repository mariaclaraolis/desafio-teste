package br.com.saraiva.automation.page;

public class SaraivaPage{

	//Campos da Tela Saraiva - Home
	private final String btnEntrar = "//*[@id='link-account']";
	
	private final String entrarComCliente = "//*[@id='vtexIdUI-saraiva-oauth']";
	
	//Campos da Tela Saraiva - Ainda não sou cliente
	private final String criarNovoCadastro = "//*[@class='btn btn--block btn-large m-t-15 cadastrar-usuario']";
	
	//Campos da Tela Saraiva - Faça seu cadastro
	private final String inserirDados = "//*[text()=\"Faça o seu cadastro\"]";
	private final String nome = "//*[@id='InputNome1']";
	private final String sobreNome = "//*[@id='InputSobrenome1']";
	private final String email = "//*[@id='InputEmail1']";
	private final String senha = "//*[@id='InputSenha1']";
	private final String confSenha = "//*[@id='InputConfirmeSenha1']";
	private final String cpf = "//*[@id='InputCpf1']";
	private final String sexoMasculino = "//*[@class='form-group']//*[@id='RadioMasculino1']//..//label";
	private final String sexoFeminino = "//*[@class='form-group']//*[@id='RadioFeminino1']//..//label";
	private final String dtNascimento = "//*[@id='InputDataNascimento1']";
	private final String telefone = "//*[@id='InputCelular1']";
	private final String pais = "SelectPais1";
	private final String cep = "//*[@id='InputCep1']";
	private final String estado = "//*[@id='SelectEstado1']";
	private final String cidade = "//*[@id='SelectCidade1']";
	private final String bairro = "//*[@id='InputBairro1']";
	private final String endereco = "//*[@id='InputEndereco1']";
	private final String numero = "//*[@id='InputNumero1']";
	private final String complemento = "//*[@id='InputComplemento1']";
	private final String telefoneParaContato = "//*[@id='InputTelefone1']";
	private final String pontoRefrencia = "//*[@id='InputPontoReferencia1']";
	private final String desejoReceberEmail = "//*[@id='InputOfertasPromocionais1']//..//label";
	private final String finalizar = "//*[@id='FinalizarCadastro1']";
	
	public String getBtnEntrar() {
		return btnEntrar;
	}
	public String getEntrarComCliente() {
		return entrarComCliente;
	}
	public String getCriarNovoCadastro() {
		return criarNovoCadastro;
	}
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public String getConfSenha() {
		return confSenha;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSexoMasculino() {
		return sexoMasculino;
	}
	
	public String getSexoFeminino() {
		return sexoFeminino;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getPais() {
		return pais;
	}
	public String getCep() {
		return cep;
	}
	public String getEstado() {
		return estado;
	}
	public String getCidade() {
		return cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getTelefoneParaContado() {
		return telefoneParaContato;
	}
	public String getPontoRefrencia() {
		return pontoRefrencia;
	}
	public String getDesejoReceberEmail() {
		return desejoReceberEmail;
	}
	public String getFinalizar() {
		return finalizar;
	}
	public String getInserirDados() {
		return inserirDados;
	}
}