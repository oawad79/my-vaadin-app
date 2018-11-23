package com.osama.app.front.vaadinfront.view;

import com.osama.app.backend.domain.City;
import com.osama.app.backend.domain.Hotel;
import com.osama.app.backend.service.CityService;
import com.osama.app.backend.service.HotelService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class MainView extends VerticalLayout {

  @Autowired
  private HotelService hotelService;

  @Autowired
  private CityService cityService;



  public MainView() {
    System.out.println("*****************");
    City c = cityService.getCity("Australia", "Sydney");
    System.out.println("abc = " + c);
    System.out.println("******************");
    //Grid<City> grid = new Grid<>();
    //grid.setItems();

    //add(grid);
  }
}
