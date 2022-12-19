package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class Main {

    public static final void main(String[] args) {
        KieServices service = KieServices.Factory.get();
	    KieContainer container = service.getKieClasspathContainer();
    	KieSession session = container.newKieSession("ksession-rules");
        session.fireAllRules();
    }
}


