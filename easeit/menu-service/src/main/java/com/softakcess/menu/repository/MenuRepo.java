package com.softakcess.menu.repository;

import com.softakcess.menu.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MenuRepo extends JpaRepository<Menu,Long> {
    Menu findByName(String name);

}
