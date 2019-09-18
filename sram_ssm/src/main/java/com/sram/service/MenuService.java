package com.sram.service;

import com.sram.domain.Menu;
import com.sram.domain.Pager;

import java.util.List;

public interface MenuService {
    public List<Menu> findAll1();
    public List<Menu> findAll2(int id);
    public List<Menu> findname(int id);
    public List<Menu> find();
    public void add(Menu menu);
//    public void add(String menu_name,String menu_url,int menu_disable,int menu_parent);
    public String check(String menu_name);
    public void delete(int id);
    public Menu findById(int id);
    public void update(Menu menu);

    public int getTotalcount1();
    public int getTotalcount2(int id);

    public Pager<Menu> pagerList1(int pageIndex, int pageSize);
    public Pager<Menu> pagerList2(int id,int pageIndex, int pageSize);

    public Pager<Menu> sousuo1(Menu menu,int pageIndex, int pageSize);
    public Pager<Menu> sousuo2(int id,Menu menu,int pageIndex, int pageSize);


}
