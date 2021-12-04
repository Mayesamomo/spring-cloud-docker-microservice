package com.softakcess.user.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;
import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    Page<Menu> SearchByMenuName(String name, Pageable pageable);
}
