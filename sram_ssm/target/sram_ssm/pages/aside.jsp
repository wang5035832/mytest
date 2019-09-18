<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>--%>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>
					<security:authentication property="principal.username"></security:authentication>
				</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/main.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>系统管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span></a>

				<ul class="treeview-menu">
					<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
						<span>用户管理</span> <span class="pull-right-container"> <i
								class="fa fa-angle-left pull-right"></i>
				</span></a>
						<ul class="treeview-menu">
							<li id="system-setting">
								<a
										href="#"> <i
										class="fa fa-circle-o"></i>查看用户
								</a>
							</li>
							<li id="system-setting">
								<a
								href="#"> <i
									class="fa fa-circle-o"></i>添加用户
							</a>
							</li>
							<li id="system-setting">
								<a
										href="#"> <i
										class="fa fa-circle-o"></i>删除用户
								</a>
							</li>
							<li id="system-setting">
								<a
										href="#"> <i
										class="fa fa-circle-o"></i>修改用户
								</a>
							</li>
						</ul></li>
					<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
						<span>角色管理</span> <span class="pull-right-container"> <i
								class="fa fa-angle-left pull-right"></i>
				</span></a>
						<ul class="treeview-menu">
							<li id="system-setting">
								<a
										href="#"> <i
										class="fa fa-circle-o"></i>查看角色
								</a>
							</li>
							<li id="system-setting">
								<a
										href="#"> <i
										class="fa fa-circle-o"></i>添加角色
								</a>
							</li>
							<li id="system-setting">
								<a
										href="#"> <i
										class="fa fa-circle-o"></i>删除角色
								</a>
							</li>
							<li id="system-setting">
								<a
										href="#"> <i
										class="fa fa-circle-o"></i>修改角色
								</a>
							</li>
						</ul></li>
					<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
						<span>菜单管理</span> <span class="pull-right-container"> <i
								class="fa fa-angle-left pull-right"></i>
				</span></a>
						<ul class="treeview-menu">
							<li id="system-setting">
								<a
										href="${pageContext.request.contextPath}/menu/findAll1.do"> <i
										class="fa fa-circle-o"></i>查看菜单
								</a>
							</li>
							<li id="system-setting">
								<a
										href="${pageContext.request.contextPath}/menu/find.do"> <i
										class="fa fa-circle-o"></i>添加菜单
								</a>
							</li>
							<li id="system-setting">
								<a
										href="${pageContext.request.contextPath}/menu/findAllDelete.do"> <i
										class="fa fa-circle-o"></i>删除菜单
								</a>
							</li>
							<li id="system-setting">
								<a
										href="${pageContext.request.contextPath}/menu/findAllUpdate.do"> <i
										class="fa fa-circle-o"></i>修改菜单
								</a>
							</li>
						</ul></li>
				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
					<span>基础数据</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
						href="#">
							<i class="fa fa-circle-o"></i> 商品管理
					</a></li>
					<li id="system-setting"><a
							href="#">
						<i class="fa fa-circle-o"></i> 商品类型管理
					</a></li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/orders-list.jsp"> <i
							class="fa fa-circle-o"></i> 订单管理
					</a></li>

				</ul></li>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>