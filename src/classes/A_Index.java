package classes;
//---------------------		Criado por: Denilson Araujo		---------------------	//
//---------------------		       @Denilson_fa       		---------------------	//

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class A_Index extends JFrame {

	private JPanel contentPane;
	S_dados dados = new S_dados();												//Instanciando Objeto

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A_Index frame = new A_Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public A_Index() {
		setTitle("LCP JSON");
		setIconImage(Toolkit.getDefaultToolkit().getImage(A_Index.class.getResource("/sources/ic_launcher.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panelTop = new JPanel();
		JButton btnAddProduct = new JButton("Adicionar Produto");
		JPanel panelButtom = new JPanel();
		JScrollPane scrollPane = new JScrollPane();
		JTextPane textResultList = new JTextPane();
		JButton btnCreateJSON = new JButton("Gerar Arquivo JSON");
		
		panelTop.setBorder(new TitledBorder(null, "Adicionar Produto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTop.setLayout(new GridLayout(5, 1, 0, 5));
		
		JPanel panel = new JPanel();
		panelTop.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		JLabel Text01 = new JLabel("Nome do Produto:");
		panel.add(Text01);
		Text01.setFont(new Font("Consolas", Font.PLAIN, 11));
		JTextField textNomeProduct = new JTextField();
		panel.add(textNomeProduct);
		
		textNomeProduct.setFont(new Font("Consolas", Font.PLAIN, 11));
		textNomeProduct.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panelTop.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		JLabel Text02 = new JLabel("Quantidade:");
		panel_1.add(Text02);
		Text02.setFont(new Font("Consolas", Font.PLAIN, 11));
		JTextField textQuantProduct = new JTextField();
		panel_1.add(textQuantProduct);
		
		textQuantProduct.setFont(new Font("Consolas", Font.PLAIN, 11));
		textQuantProduct.setColumns(10);
				
		JPanel panel_2 = new JPanel();
		panelTop.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		JLabel Text03 = new JLabel("Tipo:");
		panel_2.add(Text03);
		Text03.setFont(new Font("Consolas", Font.PLAIN, 11));
		JComboBox<?> spinnerTipoProduct = new JComboBox();
		panel_2.add(spinnerTipoProduct);
		
		spinnerTipoProduct.setModel(new DefaultComboBoxModel(new String[] {"Unidade(s)", "kg", "Litro(s)", "Caixa(s)", "Embalagem(s)", "Gal\u00E3o(es)", "Garrafa(s)", "Lata(s)", "Pacote(s)"}));
		spinnerTipoProduct.setFont(new Font("Consolas", Font.PLAIN, 11));
		
		JPanel panel_3 = new JPanel();
		panelTop.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		JLabel Text04 = new JLabel("Categoria:");
		panel_3.add(Text04);
		Text04.setFont(new Font("Consolas", Font.PLAIN, 11));
		JComboBox<?> spinnerCategProduct = new JComboBox();
		panel_3.add(spinnerCategProduct);
		
		spinnerCategProduct.setModel(new DefaultComboBoxModel(new String[] {"Alimentos", "Carnes e Ovos", "Verduras, Legumes e Frutas", "Bebidas", "Leite e Derivados", "Padaria e Sobremesa", "Sa\u00FAde e Beleza", "Higiene e Limpeza", "Outros"}));
		spinnerCategProduct.setFont(new Font("Consolas", Font.PLAIN, 11));
				
		btnAddProduct.setFont(new Font("Consolas", Font.PLAIN, 12));
		panelTop.add(btnAddProduct);
		
		panelButtom.setBorder(new TitledBorder(null, "Lista de Produtos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelButtom.setLayout(new BorderLayout(0, 0));
				
		panelButtom.add(scrollPane);
		scrollPane.setViewportView(textResultList);
		
		textResultList.setEditable(false);
		textResultList.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		btnCreateJSON.setFont(new Font("Consolas", Font.PLAIN, 12));
		panelButtom.add(btnCreateJSON, BorderLayout.SOUTH);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHonorsVisibility(false);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelTop, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
						.addComponent(panelButtom, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panelTop, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelButtom, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
					.addGap(0))
		);
		contentPane.setLayout(gl_contentPane);
		
		//----------------------------------------------------------------------
		
		//Receber somente numeros
		textQuantProduct.addKeyListener(new java.awt.event.KeyAdapter() {
	        public void keyReleased(java.awt.event.KeyEvent evt) {
	            try {
	            	@SuppressWarnings("unused")
	                long number = Long.parseLong(textQuantProduct.getText());
	            } catch (Exception e) {
	                JOptionPane.showMessageDialog(rootPane, "Somente numeros!");
	                textQuantProduct.setText("");
	            }
	        }
	    });
		
		//----------------------------------------------------------------------
		
		//Criar lista
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textNomeProduct.getText().equals("") && textQuantProduct.getText().equals("")) {
					//Se caixas vazias
					JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
				} else {
					//Armazenando valores
					dados.setNomeProduct(textNomeProduct.getText());
					dados.setQuantProduct(Double.parseDouble(textQuantProduct.getText()));
					dados.setTipoProduct(dados.setTipoProduct(spinnerTipoProduct.getSelectedIndex()));
					dados.setCategProduct(dados.setCategProduct(spinnerCategProduct.getSelectedIndex()));
					
					//Definindo alor
					textResultList.setText( 
							dados.listProduc( 									//Criando lista
									dados.adicionarProduct(						//Adicionando produtos
											dados.getNomeProduct(),
											dados.getQuantProduct(),
											dados.getTipoProduct(),
											Integer.parseInt( String.valueOf( spinnerTipoProduct.getSelectedIndex() ) ),
											dados.getCategProduct(),
											Integer.parseInt( String.valueOf( spinnerCategProduct.getSelectedIndex() ) )
											)
									)
							);
					
					//Zerando campos
					textNomeProduct.setText("");
					textQuantProduct.setText("");
					//spinnerTipoProduct.setSelectedIndex(0);
					//spinnerCategProduct.setSelectedIndex(0);
				}
				

			}
		});
		
		//----------------------------------------------------------------------
		
		//Pegar String (JSON) e gerar listLCP.json
		btnCreateJSON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileWriter writeFile = null;

				try{
					writeFile = new FileWriter(System.getProperty("user.home")+"\\_listLCP.json");
					//Escreve no arquivo conteudo do Objeto JSON
					writeFile.write(textResultList.getText());
					writeFile.close();
				}
				catch(IOException e1){
					e1.printStackTrace();
				}

				//Ao finalizar
				JOptionPane.showMessageDialog(rootPane, "Arquivo JSON criado com Sucesso!!!\n\n\nEle encontra-se: \n"+System.getProperty("user.home")+"\\_listLCP.json");
			}
		});
		

	}

}
