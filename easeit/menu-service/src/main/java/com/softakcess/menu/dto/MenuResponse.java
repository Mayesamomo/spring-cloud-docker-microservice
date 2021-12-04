package com.softakcess.menu.dto;

import com.softakcess.menu.domain.MenuItem;

import javax.persistence.Column;

public class MenuResponse {
    private Long id;
    private String menuName;
    private String info;
    private MenuItem menuItem;
}
