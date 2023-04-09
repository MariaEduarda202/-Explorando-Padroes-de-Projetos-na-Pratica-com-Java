package one.digitalinnovatio.gof.SubSistema1.crm;

import one.digitalinnovatio.gof.SubSistema2.cep.CepApi;

public class CrmServic {
    private CrmServic(){
        super();
    }

    public static void gravarCliente(String nome, String cep ,String cidade, String estado){
        cidade = CepApi.getInstancia().recuperarCidade(cep);
        estado= CepApi.getInstancia().recuperarEstado(cep);
        CrmServic.gravarCliente(nome, cep, cidade, estado );
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);

    }
}
