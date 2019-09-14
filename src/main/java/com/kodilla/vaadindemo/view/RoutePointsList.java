package com.kodilla.vaadindemo.view;

import com.kodilla.vaadindemo.domain.RoutePoint;
import com.kodilla.vaadindemo.service.RoutePointsService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoutePointsList extends VerticalLayout {

    //@Autowired
    RoutePointsService routePointsService = new RoutePointsService();

    Grid<RoutePoint> routePointGrid = new Grid<>(RoutePoint.class);
    List<RoutePoint> routePointList = routePointsService.getRoutePoints();

    public RoutePointsList() {
        routePointGrid.setItems(routePointList);
        routePointGrid.setColumns("name", "kmFromStart");
        routePointGrid.setWidthFull();
        add(routePointGrid);
    }
}
