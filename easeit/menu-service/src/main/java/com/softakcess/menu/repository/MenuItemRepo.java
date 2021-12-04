package com.softakcess.menu.repository;

import com.softakcess.menu.domain.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepo extends JpaRepository<MenuItem, Long> {
    //todo: change to Paging and sorting
}
