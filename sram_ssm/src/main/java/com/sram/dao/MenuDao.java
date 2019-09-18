package com.sram.dao;

import com.sram.domain.Menu;
import com.sram.domain.Pager;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface MenuDao {
    @Select("select * from t_menu where menu_parent=1 ")
    public List<Menu> findAll1();
    @Select("select * from t_menu where menu_parent=#{id} ")
    public List<Menu> findAll2(int id);
    @Select("select menu_name from t_menu where id=#{id} ")
    public List<Menu> findname(int id);

    @Select("select * from t_menu where id !=1 ") //where menu_parent=1
    public List<Menu> find();



    @Insert("insert into t_menu(menu_name,menu_url,menu_disable,menu_parent) values(#{menu_name},#{menu_url},#{menu_disable},#{menu_parent})")
    public void add(Menu menu);
  /*  @Insert("insert into t_menu(menu_name,menu_url,menu_disable,menu_parent) values(#{menu_name},#{menu_url},#{menu_disable},#{menu_parent})")
    public void add(String menu_name,String menu_url,int menu_disable,int menu_parent);*/

    @Select("select * from t_menu where menu_name=#{menu_name}  ")
    public Menu check(String menu_name);


    @Delete("update t_menu set menu_disable=0 where id = #{id}")
    public void delete(int id);

    @Select("select * from t_menu where id=#{id}")
    public Menu findById(int id);

    @Update("update t_menu set menu_name=#{menu_name},menu_url=#{menu_url}, menu_disable=#{menu_disable},menu_parent=#{menu_parent} where id=#{id}")
    public void update(Menu menu);


    @Select("select count(*) from t_menu where menu_parent=1 order by id asc ")
    public int getTotalcount1();
    @Select("select count(*) from t_menu where menu_parent=#{id} order by id asc ")
    public int getTotalcount2(int id);
    @Select("select * from t_menu where menu_parent=1 order by id asc limit #{param1},#{param2}")
    public List<Menu> pagerList1(int pageIndex, int pageSize);
    @Select("select * from t_menu where menu_parent=#{id} order by id asc limit #{pageIndex},#{pageSize}")
    public List<Menu> pagerList2(@Param("id") int id,@Param("pageIndex")int pageIndex, @Param("pageSize")int pageSize);



//    @SelectProvider(type = UserSqlProvider1.class ,method = "findAll")
//    public abstract List<Menu> sousuo1(Menu menu, int pageIndex,  int pageSize);
    @SelectProvider(type = UserSqlProvider1.class ,method = "findAll")
    public abstract List<Menu> sousuo1(Menu menu);
    public class UserSqlProvider1 {
       // public String findAll(Menu menu,@Param("pageIndex")int pageIndex, @Param("pageSize")int pageSize){
       public String findAll(Menu menu){
            StringBuffer sb = new StringBuffer();
            sb.append("select * from t_menu where 1=1");
            if(menu.getMenu_name() != null){
                sb.append(" and menu_name like \"%\"#{menu_name}\"%\"");
            }

            sb.append(" order by id asc limit #{start},#{pageSize}");

            return sb.toString();
        }
    }

    @SelectProvider(type = UserSqlProvider2.class ,method = "findAll")
    public abstract List<Menu> sousuo2(Menu menu,int id);
    public class UserSqlProvider2 {
        public String findAll(Menu menu){
            StringBuffer sb = new StringBuffer();
            sb.append("select * from t_menu where 1=1");
            if(menu.getMenu_name() != null){
                sb.append(" and menu_name like \"%\"#{menu_name}\"%\" and id=#{id}");
            }

            sb.append(" order by id asc limit #{start},#{pageSize}");
            return sb.toString();
        }
    }

}
