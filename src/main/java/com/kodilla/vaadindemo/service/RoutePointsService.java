package com.kodilla.vaadindemo.service;

import com.kodilla.vaadindemo.BookType;
import com.kodilla.vaadindemo.domain.Book;
import com.kodilla.vaadindemo.domain.RoutePoint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RoutePointsService {

    private List<RoutePoint> routePoints = new ArrayList<>();

    public List<RoutePoint> getRoutePoints(){
        fillExamplePoints();
        return routePoints;
    }

    public void fillExamplePoints(){
        routePoints.add(new RoutePoint("Katowice", 0));
        routePoints.add(new RoutePoint("Chrzanów - ładowanie", 45));
        routePoints.add(new RoutePoint("Kraków", 90));
    }



}
