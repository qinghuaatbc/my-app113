package com.example.application.views.helloworld2;

import com.example.application.components.leafletmap.LeafletMap;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import javax.annotation.security.RolesAllowed;

@PageTitle("Hello World2")
@Route(value = "hello-world", layout = MainLayout.class)
@RolesAllowed("admin")
public class HelloWorld2View extends VerticalLayout {

    private LeafletMap map = new LeafletMap();

    public HelloWorld2View() {
        setSizeFull();
        setPadding(false);
        map.setSizeFull();
        map.setView(55.0, 10.0, 4);
        add(map);
    }
}
