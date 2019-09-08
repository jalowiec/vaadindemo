package com.kodilla.vaadindemo;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.tapio.googlemaps.GoogleMap;
import javafx.scene.control.Slider;


@Route
public class FindRoute extends VerticalLayout {

    private ComboBox fromPlace = new ComboBox("Wybierz punkt wyjazdowy");
    private ComboBox toPlace= new ComboBox("Wybierz punkt docelowy");
    private ComboBox  carModel = new ComboBox("Wybierz samochód");
    private Button addCar = new Button("Dodaj samochód", new Icon(VaadinIcon.PLUS));
    private NumberField fuelLevel = new NumberField("Aktualny stan naładowania baterii");
    private RadioButtonGroup driveType = new RadioButtonGroup();
    private Button searchButton = new Button("Szukaj", new Icon(VaadinIcon.SEARCH));
    private Component mapComponent = new MapComponent();


    private final String CONTROLS_WIDTH = "250px";

    public FindRoute() {
        fromPlace.setItems("Katowice", "Kraków", "Poznań", "Warszawa");
        fromPlace.setClearButtonVisible(true);
        fromPlace.setWidth(CONTROLS_WIDTH);

        toPlace.setItems("Katowice", "Kraków", "Poznań", "Warszawa");
        toPlace.setClearButtonVisible(true);
        toPlace.setWidth(CONTROLS_WIDTH);


        carModel.setItems("Opel", "Tesla 3", "Tesla 5");
        toPlace.setClearButtonVisible(true);
        carModel.setWidth(CONTROLS_WIDTH);

        addCar.setWidth(CONTROLS_WIDTH);

        fuelLevel.setHasControls(true);
        fuelLevel.setValue(100d);
        fuelLevel.setStep(10d);
        fuelLevel.setMin(0);
        fuelLevel.setMax(100);
        fuelLevel.setWidth(CONTROLS_WIDTH);

        driveType.setLabel("Wybierz rodzaj jazdy:");
        driveType.setItems("Oszczędna", "Standard", "Dynamiczna");
        driveType.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);

        searchButton.setWidth(CONTROLS_WIDTH);


        add(fromPlace, toPlace, carModel, addCar, fuelLevel, driveType, searchButton, mapComponent);

        
    }
}
