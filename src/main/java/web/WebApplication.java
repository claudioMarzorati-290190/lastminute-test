/* LEGAL-NOTICE
   © Copyright 2018 - Quid Informatica S.p.A. - All Rights Reserved
   https://quidinfo.it/qinetic/licence.html - "Quid Consumer Lending Platform"
   Deposito SIAE n. 012702 del 26 Luglio 2018
LEGAL-NOTICE */
package web;


import web.service.rs.BaseResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class WebApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

        classes.add(BaseResource.class);

        return classes;
    }

}
