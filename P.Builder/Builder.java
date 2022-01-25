public class Builder {
    public static void main(String[] args){

        CasaT TituloPrincipal = new CasaT();
        TituloPrincipal.PrintEspacio();
        TituloPrincipal.setPrincipal();
        TituloPrincipal.PrintCasaT();


        Casa ModeloPrincipal = new Casa();
        ModeloPrincipal.setCocina().setCuartoLavado().setCuartoPrincipal().setCuartoVisitas().setComedor().setCuartoJuegos().setCuartoJuegos().setSala();
        ModeloPrincipal.PrintEspacio();
        ModeloPrincipal.PrintCasa();
        ModeloPrincipal.PrintEspacio();
        ModeloPrincipal.PrintEspacio();

        CasaT TituloAustero = new CasaT();
        TituloAustero.PrintEspacio();
        TituloAustero.setAustero();
        TituloAustero.PrintCasaT();

        Casa ModeloAustero = new Casa();
        ModeloAustero.setCocina().setCuartoLavado().setCuartoPrincipal().setCuartoVisitas().setComedor().setSala();
        ModeloAustero.PrintEspacio();
        ModeloAustero.PrintCasa();
        ModeloPrincipal.PrintEspacio();
        ModeloPrincipal.PrintEspacio();

        CasaT TituloEconomico = new CasaT();
        TituloEconomico.PrintEspacio();
        TituloEconomico.setEconomico();
        TituloEconomico.PrintCasaT();

        Casa ModeloEconomico = new Casa();
        ModeloEconomico.setCocina().setCuartoPrincipal().setComedor().setSala();
        ModeloEconomico.PrintEspacio();
        ModeloEconomico.PrintCasa();
        ModeloEconomico.PrintEspacio();
        ModeloEconomico.PrintEspacio();


    }
}

