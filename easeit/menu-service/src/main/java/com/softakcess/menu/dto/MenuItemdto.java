package com.softakcess.menu.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.softakcess.menu.domain.Menu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuItemdto {

    private Long id;
    private String name;
    private String info;
    private String imageUrl;
    private BigDecimal price;
}
