package classes;
//---------------------		Criado por: Denilson Araujo		---------------------	//
//---------------------		       @Denilson_fa       		---------------------	//

public class S_dados {
	
	//Itens que serão adicionados
	private String nomeProduct;
	private double quantProduct;
	private String tipoProduct;
	private String categProduct;
	
	//Iniciando Lista
	private String list = "";
	private int idProduct = 1;
	
	//Metodo Construto
	public S_dados() {}
	
	//GETTERS E SETTERS
	public String getNomeProduct() { return nomeProduct; }
	public void setNomeProduct(String nomeProduct) { this.nomeProduct = nomeProduct; }
	
	public double getQuantProduct() { return quantProduct; }
	public void setQuantProduct(double quantProduct) { this.quantProduct = quantProduct; }
	
	public String getTipoProduct() { return tipoProduct; }
	public void setTipoProduct(String tipoProduct) { this.tipoProduct = tipoProduct; }
	
	public String getCategProduct() { return categProduct; }
	public void setCategProduct(String categProduct) { this.categProduct = categProduct; }
	
	public String getList() { return list; }
	public void setList(String list) { this.list = list; }
	
	//Metodos de finalização da lista
	public String listProduc(String list) {
			
		String listPronta = "["+list+"\n]";										//Definindo Array
		listPronta = listPronta.substring(0,1)+ listPronta.substring(1+1);		//Removendo virgula da primeira linha
		idProduct++;															//Adicionando +1 ao idProduct
		return listPronta;
		
	}
	
	//--------------------------------------------------------------------------
	public String adicionarProduct(String nomeP, double quantP, String tipoP, int tipoPID, String categP, int categPID) {
		
		//Recebendo itens e adicionando ao Objeto
		list = list
				+",   \n"
				+"  { \n"
				+"    \"idProduct\": "+idProduct+",\n"
				+"    \"nomeProduct\": \""+nomeP+"\",\n"
				+"    \"quantProduct\": "+quantP+",\n"
				+"    \"tipoProduct\": \""+tipoP+"\",\n"
				+"    \"tipoPorductID\": "+tipoPID+",\n"
				+"    \"medidaProduct\": \""+categP+"\",\n"
				+"    \"medidaProductID\": "+categPID+"\n"
				+"  }";
		
		return list;
	}
	
	//--------------------------------------------------------------------------
	public String setTipoProduct(int getSelectedItemId){
		
		//Reconhecendo o item selecionado no Spinner
        if( getSelectedItemId == 0 ) {
        	tipoProduct = "Unidade(s)";
        } else if( getSelectedItemId == 1 ) {
        	tipoProduct = "kg";
        } else if( getSelectedItemId == 2 ) {
        	tipoProduct = "Litro(s)";
        } else if( getSelectedItemId == 3 ) {
        	tipoProduct = "Caixa(s)";
        } else if( getSelectedItemId == 4 ) {
        	tipoProduct = "Embalagem(s)";
        } else if( getSelectedItemId == 5 ) {
        	tipoProduct = "Gal\u00E3o(es)";
        } else if( getSelectedItemId == 6 ) {
        	tipoProduct = "Garrafa(s)";
        } else if( getSelectedItemId == 7 ) {
        	tipoProduct = "Lata(s)";
        } else {
        	tipoProduct = "Pacote(s)";
        }
        
        return tipoProduct;
    }
	
	//--------------------------------------------------------------------------	
	public String setCategProduct(int getSelectedItemId){
		
		//Reconhecendo o item selecionado no Spinner
        if( getSelectedItemId == 0 ) {
        	categProduct = "Alimentos";
        } else if( getSelectedItemId == 1 ) {
        	categProduct = "Carnes e Ovos";
        } else if( getSelectedItemId == 2 ) {
        	categProduct = "Verduras, Legumes e Frutas";
        } else if( getSelectedItemId == 3 ) {
        	categProduct = "Bebidas";
        } else if( getSelectedItemId == 4 ) {
        	categProduct = "Leite e Derivados";
        } else if( getSelectedItemId == 5 ) {
        	categProduct = "Padaria e Sobremesa";
        } else if( getSelectedItemId == 6 ) {
        	categProduct = "Sa\u00FAde e Beleza";
        } else if( getSelectedItemId == 7 ) {
        	categProduct = "Higiene e Limpeza";
        } else {
        	categProduct = "Outros";
        }
        
        return categProduct;
    }
	
	//--------------------------------------------------------------------------
}
