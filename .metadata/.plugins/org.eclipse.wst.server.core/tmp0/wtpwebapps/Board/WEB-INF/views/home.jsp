<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="include/header.jsp"%>


  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Bulletin Board
        <small>Optional description</small>
      </h1>
    </section>

    <!-- Main content -->
    <section class="content container-fluid">

      <!--------------------------
        | Your Page Content Here |
        -------------------------->
        
    <div class="container">
    <form id="postForm" name="postForm" method="POST"> 
    <table class="table table-striped table-hover">
    <thead>
	<tr>
	<th style="width: 10px">POSTID</th>
	<th>TITLE/<th>
	<th>WRITER</th>
	<th>DATE</th>
	<th style="width: 40px">VIEW COUNT</th>
	</tr>
	</thead>
	</table>
	</form>
	</div> 
	
	
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->


 <%@include file="include/footer.jsp"%>

