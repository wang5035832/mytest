package com.sram.service.impl;

import com.sram.dao.MenuDao;
import com.sram.domain.Menu;
import com.sram.domain.Pager;
import com.sram.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    @Override
    public List<Menu> findAll1() {
        return menuDao.findAll1();

    }
    @Override
    public List<Menu> findAll2(int id) {
        return menuDao.findAll2(id);

    }
    @Override
    public List<Menu> findname(int id) {
        return menuDao.findname(id);

    }

    @Override
    public List<Menu> find() {
        return menuDao.find();
    }

    @Override
    public void add(Menu menu) {
         menuDao.add(menu);


    }
  /*@Override
  public void add(String menu_name,String menu_url,int menu_disable,int menu_parent) {
      menuDao.add(menu_name,menu_url,menu_disable,menu_parent);


  }*/

    @Override
    public String check(String menu_name) {
        Menu menu = menuDao.check(menu_name);
        if (menu != null){
            return "0";//存在
        }else {
            return "1";//不存在
        }



    }

    @Override
    public void delete(int id) {
         menuDao.delete(id);

    }

    @Override
    public Menu findById(int id) {
        return menuDao.findById(id);
    }

    @Override
    public void update(Menu menu) {
           menuDao.update(menu);
    }




    @Override
    public int getTotalcount1() {
        int i = menuDao.getTotalcount1();
        return i;
    }
    @Override
    public int getTotalcount2(int id) {
        int i = menuDao.getTotalcount2( id);
        return i;
    }



    @Override
    public Pager<Menu> pagerList1(int pageIndex, int pageSize) {
        int start = (pageIndex-1)*pageSize;
        int totalRecord = menuDao.getTotalcount1();
        int re = totalRecord%pageSize;
        int totalPage;
        if (re != 0){
             totalPage = totalRecord/pageSize+1;
        }else{
             totalPage = totalRecord/pageSize;
        }
        List<Menu> datas = menuDao.pagerList1(start,pageSize);
        Pager<Menu> pager = new Pager<Menu>(totalRecord,pageSize,totalPage,pageIndex,datas);
        return pager;
    }
    @Override
    public Pager<Menu> pagerList2(int id,int pageIndex, int pageSize) {

        int start = (pageIndex-1)*pageSize;
        int totalRecord = menuDao.getTotalcount2(id);
        int re = totalRecord%pageSize;
        int totalPage;
        if (re != 0){
            totalPage = totalRecord/pageSize+1;
        }else{
            totalPage = totalRecord/pageSize;
        }
        List<Menu> datas = menuDao.pagerList2(id,start,pageSize);
        Pager<Menu> pager = new Pager<Menu>(totalRecord,pageSize,totalPage,pageIndex,datas);
        return pager;
    }

    @Override
    public Pager<Menu> sousuo1(Menu menu,int pageIndex, int pageSize) {
        int start = (pageIndex-1)*pageSize;
        menu.setStart(start);
        menu.setPageSize(pageSize);
        List<Menu> datas = menuDao.sousuo1(menu);
        int totalRecord =datas.size();
        int re = totalRecord%pageSize;
        int totalPage;
        if (re != 0){
            totalPage = totalRecord/pageSize+1;
        }else{
            totalPage = totalRecord/pageSize;
        }


        Pager<Menu> pager = new Pager<Menu>(totalRecord,pageSize,totalPage,pageIndex,datas);
        return pager;
    }
    @Override
    public Pager<Menu> sousuo2(int id,Menu menu,int pageIndex, int pageSize) {
        int start = (pageIndex-1)*pageSize;
        menu.setStart(start);
        menu.setPageSize(pageSize);
        List<Menu> datas = menuDao.sousuo2(menu,id);
        int totalRecord =datas.size();
        int re = totalRecord%pageSize;
        int totalPage;
        if (re != 0){
            totalPage = totalRecord/pageSize+1;
        }else{
            totalPage = totalRecord/pageSize;
        }


        Pager<Menu> pager = new Pager<Menu>(totalRecord,pageSize,totalPage,pageIndex,datas);
        return pager;
    }

}
