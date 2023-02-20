<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách bài viết</title>
    </head>

    <body>
        <div class="main-content">
            <div class="main-content-inner">
                <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                    <ul class="breadcrumb">
                        <li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
                                chủ</a></li>
                    </ul>
                    <!-- /.breadcrumb -->
                </div>
                <div class="page-content">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="table-responsive">
                                <table class="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th><input type="checkbox" id="checkAll"></th>
                                            <th>Tên bài viết</th>
                                            <th>Mô tả ngắn</th>
                                            <th>Thao tác</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <!-- <c:forEach var="item" items="${model.listResult}"> -->
                                        <tr>
                                            <!-- <td><input type="checkbox" id="checkbox_${item.id}" value="${item.id}">
                                                </td>
                                                <td>${item.title}</td>
                                                <td>${item.shortDescription}</td> -->
                                            <td>
                                                <c:url var="editURL" value="/admin-new">
                                                    <c:param name="type" value="edit" />
                                                    <!-- <c:param name="id" value="${item.id}" /> -->
                                                </c:url>
                                                <a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip"
                                                    title="Cập nhật bài viết" href='${editURL}'><i
                                                        class="fa fa-pencil-square-o" aria-hidden="true"></i>
                                                </a>
                                            </td>
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <ul class="pagination" id="pagination"></ul>
                                <input type="hidden" value="" id="page" name="page" />
                                <input type="hidden" value="" id="maxPageItem" name="maxPageItem" />
                                <input type="hidden" value="" id="sortName" name="sortName" />
                                <input type="hidden" value="" id="sortBy" name="sortBy" />
                                <input type="hidden" value="" id="type" name="type" />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script>
            $(function () {
                window.pagObj = $('#pagination').twbsPagination({
                    totalPages: 3,
                    visiblePages: 10,
                    startPage: 1,
                    onPageClick: function (event, page) {
                        if (currentPage != page) {
                            $('#maxPageItem').val(limit);
                            $('#page').val(page);
                            $('#sortName').val('title');
                            $('#sortBy').val('desc');
                            $('#type').val('list');
                            $('#formSubmit').submit();
                        }
                    }
                });
            });
        </script>
    </body>

    </html>