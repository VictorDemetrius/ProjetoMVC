package Pck_Control;

import Pck_Model.ExemploModel;

public class ExemploControl {
	
	ExemploModel oExemploModel = new ExemploModel();
	
	public void inserirExemplo (String sNome) 
	{
		oExemploModel.setA01_nome(sNome);
	}
	
	public void atualizarExemplo (int iCodigo_01, String sNome) 
	{
		oExemploModel.setA01_codigo(iCodigo_01);
		oExemploModel.setA01_nome(sNome);
	}
	
	
	public void removerExemplo (int iCodigo_01) 
	{
		oExemploModel.setA01_codigo(iCodigo_01);
	}
	
}
