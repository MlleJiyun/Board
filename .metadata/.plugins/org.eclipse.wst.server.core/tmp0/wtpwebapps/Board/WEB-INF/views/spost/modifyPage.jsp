<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@include file="../include/header.jsp" %>

<!-- Main content -->
<section class="content">
<div class="row">
<!-- left column -->
<div class="col-md-12">
<!-- general form elements -->
<div class="box box-primary">
<div class="box-header">
<h3 class="box-title">MODIFY POST</h3>
</div>
<!-- /.box-header -->

<form role="form" action="modifyPage" method="post">

<input type='hidden' name='page' value="${cri.page}"> 
<input type= 'hidden' name='perPageNum' value="${cri.perPageNum}">

<input type='hidden' name='searchType' value="${cri.searchType}">
<input type='hidden' name='keyword' value="${cri.keyword}">

<div class="box-body">

<div class="form-group">
<label for="exampleInputEmail1">POSTID</label>
<input type="text" name='postId' class="form-control" value="${postVO.postId}" readonly="readonly">
</div>

<div class="form-group">
<label for="exampleInputEmail1">TITLE</label>
<input type="text" name='postTitle' class="form-control" value="${postVO.postTitle}">
</div>

<div class="form-group"> <label for="exampleInputPassword1">CONTENT</label>
<textarea class="form-control" name="postContent" rows="3">${postVO.postContent}</textarea>
</div>

<div class="form-group">
<label for="exampleInputEmail1">WRITER</label> <input type="text"
name="userId" class="form-control" value= "${postVO.userId}">
</div>
</div>
<!-- /.box-body -->
</form>

<div class="box-footer">
<button type="submit" class="btn btn-primary">SAVE</button>
<button type="submit" class="btn btn-warning">CANCEL</button>
</div>

<script>
$(document).ready(function() {
	
	var formObj = $("form[role='form']");
	
	console.log(formObj);
	
	$(".btn-warning").on("click", function() {
		self.location="/spost/listPage?page=${cri.page}&perPageNum=${cri.perPageNum}"
				+ "&searchType=${cri.searchType}&keyword=${cri.keyword}";
	});
	
	$(".btn-primary").on("click", function() {
		formObj.submit();
	});
	
});
</script>
</div>
<!-- /.box -->
</div>
<!-- /.col (left) -->
</div>
<!-- /.row -->
</section>
<!-- /.content -->

</div>
<!-- /.content-wrapper -->
