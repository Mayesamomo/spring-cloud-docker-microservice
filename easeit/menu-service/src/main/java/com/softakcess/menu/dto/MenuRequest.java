package com.softakcess.menu.dto;

import javax.persistence.Column;
import java.util.List;

public class MenuRequest {
    private Long id;
    private String menuName;
    private String info;
    private List menuItems;
}
