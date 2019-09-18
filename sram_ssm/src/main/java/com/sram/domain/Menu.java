package com.sram.domain;

public class Menu {
    private int id;    //菜单名称
    private String menu_name;  //菜单名称
    private String menu_url;  //菜单路径
    private int menu_disable;   //菜单可见性  类似逻辑删除
    private int menu_parent;   //菜单所属级（一级菜单 、二级菜单）

   private int start;
    private int pageSize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public int getMenu_disable() {
        return menu_disable;
    }

    public void setMenu_disable(int menu_disable) {
        this.menu_disable = menu_disable;
    }

    public int getMenu_parent() {
        return menu_parent;
    }

    public void setMenu_parent(int menu_parent) {
        this.menu_parent = menu_parent;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Menu(int id, String menu_name, String menu_url, int menu_disable, int menu_parent) {
        this.id = id;
        this.menu_name = menu_name;
        this.menu_url = menu_url;
        this.menu_disable = menu_disable;
        this.menu_parent = menu_parent;
    }

    public Menu(String menu_name, String menu_url, int menu_disable, int menu_parent) {
        this.menu_name = menu_name;
        this.menu_url = menu_url;
        this.menu_disable = menu_disable;
        this.menu_parent = menu_parent;
    }

    public Menu(int id, String menu_name, String menu_url, int menu_parent) {
        this.id = id;
        this.menu_name = menu_name;
        this.menu_url = menu_url;
        this.menu_parent = menu_parent;
    }

    public Menu(int id, String menu_name, String menu_url) {
        this.id = id;
        this.menu_name = menu_name;
        this.menu_url = menu_url;
    }

    public Menu(String menu_name, String menu_url, int menu_parent) {
        this.menu_name = menu_name;
        this.menu_url = menu_url;
        this.menu_parent = menu_parent;
    }

    public Menu() {
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menu_name='" + menu_name + '\'' +
                ", menu_url='" + menu_url + '\'' +
                ", menu_disable=" + menu_disable +
                ", menu_parent=" + menu_parent +
                '}';
    }
}
