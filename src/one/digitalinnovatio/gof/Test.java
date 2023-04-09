package one.digitalinnovatio.gof;

import one.digitalinnovatio.gof.facade.Facade;
import one.digitalinnovatio.gof.singleton.SingletonEager;
import one.digitalinnovatio.gof.singleton.SingletonLazy;
import one.digitalinnovatio.gof.singleton.SingletonLazyHolder;
import one.digitalinnovatio.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //sigleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

         Robo robo = new Robo();
         robo.setComportamento (normal);
         robo.mover();
         robo.mover();
         robo.setComportamento (defensivo);
         robo.mover();
         robo.setComportamento (agressivo);

         //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }


}
