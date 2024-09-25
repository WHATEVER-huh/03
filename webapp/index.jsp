<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生管理系统</title>
    <style>
        /* 简单的页面布局样式 */
        #menu {
            float: left;
            width: 20%;
        }
        #content {
            float: right;
            width: 80%;
        }
    </style>
</head>
<body>
<div id="menu">
    <ul>
        <li><a href="student?action=findById">根据学号查询</a></li>
        <li><a href="student?action=findByName">根据姓名查询</a></li>
        <!-- 添加其他功能按钮 -->
    </ul>
</div>
<div id="content">
    <!-- 显示对应功能主页 -->
</div>
</body>
</html>
