package com.sram.controller;

import com.sram.domain.Menu;
import com.sram.domain.Pager;
import com.sram.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
/*
    @Resource(name = "/menuService")
*/
    @Autowired
     MenuService menuService;
    @RequestMapping("/findAll1.do")
    public String findAll1(Model model,Integer pageIndex) {
        if(pageIndex == null){
            pageIndex=1;
        }
        int pageSize = 10;
       /* List<Menu> list = menuService.findAll1();

        model.addAttribute("menu", list);*/
        Pager<Menu> list = menuService.pagerList1(pageIndex,pageSize);
        model.addAttribute("page",list);
        return "menu-list";
       // return "";
    }
    @RequestMapping("/sousuo1.do")
    public String sousuo1(Model model,Menu menu,Integer pageIndex) {
        if(pageIndex == null){
            pageIndex=1;
        }
        int pageSize = 10;
       /* List<Menu> list = menuService.findAll1();

        model.addAttribute("menu", list);*/
        Pager<Menu> list = menuService.sousuo1(menu,pageIndex,pageSize);
        model.addAttribute("page",list);
        System.out.println(list.getDatas());
        return "menu-list-sousuo1";
        // return "";
    }

    @RequestMapping("/findAll2.do")
    public String findAll2(Model model,int id,Integer pageIndex) {

        if(pageIndex == null){
            pageIndex=1;
        }
        int pageSize = 10;
        Pager<Menu> list = menuService.pagerList2(id,pageIndex,pageSize);
//        List<Menu> list = menuService.findAll2(id);
        List<Menu> list1 = menuService.findname(id);
//        model.addAttribute("menu", list);
        model.addAttribute("menu1",list1);

        model.addAttribute("page",list);

        return "menu-list2";
    }


    @RequestMapping("/findAllDelete.do")
    public String findAllDelete(Model model,Integer pageIndex) {
        if(pageIndex == null){
            pageIndex=1;
        }
        int pageSize = 10;
       /* List<Menu> list = menuService.findAll1();

        model.addAttribute("menu", list);*/
        Pager<Menu> list = menuService.pagerList1(pageIndex,pageSize);
        model.addAttribute("page",list);
        return "menu-list-delete";
        // return "";
    }
    @RequestMapping("/sousuo_delete.do")
    public String sousuo_delete(Model model,Menu menu,Integer pageIndex) {
        if(pageIndex == null){
            pageIndex=1;
        }
        int pageSize = 10;
       /* List<Menu> list = menuService.findAll1();

        model.addAttribute("menu", list);*/
        Pager<Menu> list = menuService.sousuo1(menu,pageIndex,pageSize);
        model.addAttribute("page",list);
        System.out.println(list.getDatas());
        return "menu-list-delete-sousuo";
        // return "";
    }
    @RequestMapping("/findAllDelete2.do")
    public String findAllDelete2(Model model,int id,Integer pageIndex) {

        if(pageIndex == null){
            pageIndex=1;
        }
        int pageSize = 10;
        Pager<Menu> list = menuService.pagerList2(id,pageIndex,pageSize);
//        List<Menu> list = menuService.findAll2(id);
        List<Menu> list1 = menuService.findname(id);
//        model.addAttribute("menu", list);
        model.addAttribute("menu1",list1);

        model.addAttribute("page",list);

        return "menu-list-delete2";
    }

    @RequestMapping("/findAllUpdate.do")
    public String findAllUpdate(Model model,Integer pageIndex) {
        if(pageIndex == null){
            pageIndex=1;
        }
        int pageSize = 10;
       /* List<Menu> list = menuService.findAll1();

        model.addAttribute("menu", list);*/
        Pager<Menu> list = menuService.pagerList1(pageIndex,pageSize);
        model.addAttribute("page",list);
        return "menu-list-update";
        // return "";
    }
    @RequestMapping("/sousuo_update.do")
    public String ousuo_update(Model model,Menu menu,Integer pageIndex) {
        if(pageIndex == null){
            pageIndex=1;
        }
        int pageSize = 10;
       /* List<Menu> list = menuService.findAll1();

        model.addAttribute("menu", list);*/
        Pager<Menu> list = menuService.sousuo1(menu,pageIndex,pageSize);
        model.addAttribute("page",list);
        System.out.println(list.getDatas());
        return "menu-list-update-sousuo";
        // return "";
    }
    @RequestMapping("/findAllUpdate2.do")
    public String findAllUpdate2(Model model,int id,Integer pageIndex) {

        if(pageIndex == null){
            pageIndex=1;
        }
        int pageSize = 10;
        Pager<Menu> list = menuService.pagerList2(id,pageIndex,pageSize);
//        List<Menu> list = menuService.findAll2(id);
        List<Menu> list1 = menuService.findname(id);
//        model.addAttribute("menu", list);
        model.addAttribute("menu1",list1);

        model.addAttribute("page",list);

        return "menu-list-update2";
    }

    @RequestMapping("/find.do")
    public String find(Model model) {
        List<Menu> list = menuService.find();
        model.addAttribute("menu",list);

        return "menu-add";
    }

    @RequestMapping("/addcheck.do")

    @ResponseBody
    public String addcheck(String menu_name) {

        String check = menuService.check(menu_name);
        //model.addAttribute("check",check);
        return check;
    }

    @RequestMapping("/add.do")
    public String add(Menu menu) {
        System.out.println(menu);
       menuService.add(menu);

        return "redirect:/menu/findAll1.do";
    }
    /*@RequestMapping("/add.do")
    public String add(String menu_name,String menu_url,int menu_disable,int menu_parent) {

        menuService.add(menu_name,menu_url,menu_disable,menu_parent);
        return "redirect:/menu/findAll1.do";
    }*/

    @RequestMapping("/delete.do")
    public String delete(int id) {
        menuService.delete(id);
        return "redirect:/menu/findAllDelete.do";
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(int id){
        ModelAndView mv = new ModelAndView();
        Menu menu = menuService.findById(id);
        List<Menu> list = menuService.find();
        mv.setViewName("menu-update");//转发至update.jsp页面
        mv.addObject("menu",menu);//将数据一并转发到update.jsp
        mv.addObject("menu1",list);
//        System.out.println(list);
        return mv;
    }

    @RequestMapping("/update.do")
    public String update(Menu menu){
        menuService.update(menu);

        return "redirect:/menu/findAllUpdate.do";
    }

    @RequestMapping("/updatecheck.do")

    @ResponseBody
    public String updatecheck(String menu_name) {

        String check = menuService.check(menu_name);
        //model.addAttribute("check",check);
        return check;
    }


}