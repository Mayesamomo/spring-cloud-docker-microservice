package com.softakcess.menu.service;

import com.softakcess.menu.domain.Menu;
import com.softakcess.menu.domain.MenuItem;

import java.util.List;

public interface MenuService {

    //create Menu
    void createMenu(Menu menu);

    void updateMenu(Menu menu);

    void deleteMenu(Menu menu);

    void createItemList(List<MenuItem> itemList);

    MenuItem getMenuItemByName(String name);

    //todo: create get menubyRestaurant
}
