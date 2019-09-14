package com.kodilla.vaadindemo.view;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Route
public class MainView extends HorizontalLayout {

    private LeftPanel leftPanel = new LeftPanel();
    private RoutePointsList routePointsList = new RoutePointsList();

    public MainView() {
        leftPanel.setMaxWidth("300px");
        add(leftPanel);
        add(routePointsList);

    }



}
