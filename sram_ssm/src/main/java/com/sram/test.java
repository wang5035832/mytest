package com.sram;

import com.sram.domain.Menu;
import com.sram.domain.Pager;
import com.sram.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import java.util.List;

public class test {


    @Test
    public void test01() {
        //1.使用 ApplicationContext 接口，就是在获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据 bean 的 id 获取对象
        MenuService acd = (MenuService) ac.getBean("menuService");
        List<Menu> list = acd.findAll1();
        System.out.println(list);

    }

    @Test
    public void test02() {
        //1.使用 ApplicationContext 接口，就是在获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据 bean 的 id 获取对象
        MenuService acd = (MenuService) ac.getBean("menuService");
        Menu menu = new Menu(3,"aaaaaa","sram",1,1);

        acd.update(menu);

    }

    @Test
    public void test03() {
        //1.使用 ApplicationContext 接口，就是在获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据 bean 的 id 获取对象
        MenuService acd = (MenuService) ac.getBean("menuService");
        Menu menu = new Menu("qwerasdfv","sram",1,1);

        acd.add(menu);
    }


    @Test
    public void test04() {
        //1.使用 ApplicationContext 接口，就是在获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据 bean 的 id 获取对象
        MenuService acd = (MenuService) ac.getBean("menuService");
        Menu menu = new Menu(44,"aaaa","aaa");
        acd.update(menu);


    }

    @Test
    public void test0() {
        //1.使用 ApplicationContext 接口，就是在获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据 bean 的 id 获取对象
        MenuService acd = (MenuService) ac.getBean("menuService");
        /*int i = acd.getTotalcount();
        System.out.println("一共有"+i+"条数据");*/

        Pager<Menu> list = acd.pagerList1(1, 5);
        System.out.println(list);
        System.out.println("一共有"+list.getTotalRecord()+"条数据");
        System.out.println("一共有"+list.getTotalPage()+"页");
        System.out.println("每页"+list.getPageSize()+"条数据");
        System.out.println("当前是"+list.getPageIndex()+"页");
        System.out.println("本页数据："+list.getDatas());


    }

    @Test
    public void test() {
        //1.使用 ApplicationContext 接口，就是在获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据 bean 的 id 获取对象
        MenuService acd = (MenuService) ac.getBean("menuService");
        /*int i = acd.getTotalcount();
        System.out.println("一共有"+i+"条数据");*/

        Pager<Menu> list = acd.pagerList2(2,1, 10);
        System.out.println(list);
        System.out.println("一共有"+list.getTotalRecord()+"条数据");
        System.out.println("一共有"+list.getTotalPage()+"页");
        System.out.println("每页"+list.getPageSize()+"条数据");
        System.out.println("当前是"+list.getPageIndex()+"页");
        System.out.println("本页数据："+list.getDatas());


    }


    @Test
    public void testsousuo() {
        //1.使用 ApplicationContext 接口，就是在获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据 bean 的 id 获取对象
        MenuService acd = (MenuService) ac.getBean("menuService");
        /*int i = acd.getTotalcount();
        System.out.println("一共有"+i+"条数据");*/
        Menu menu = new Menu("权限管理","system_menu_list",1,1);
        //menu.setStart(1);
       // menu.setPageSize(5);
        Pager<Menu> list = acd.sousuo1(menu,2,3);
        System.out.println(list);
        System.out.println("一共有"+list.getDatas().size()+"条数据");
        System.out.println("一共有"+list.getTotalPage()+"页");
        System.out.println("每页"+list.getPageSize()+"条数据");
        System.out.println("当前是"+list.getPageIndex()+"页");
        System.out.println("本页数据："+list.getDatas());


    }
}
