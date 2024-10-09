<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.ProductPojo" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .table {
            margin-top: 20px;
        }
        .alert {
            margin-top: 20px;
        }
        .btn-secondary {
            margin-top: 20px;
        }
    </style>
</head>
<body>

<div class="container mt-5">
    <h2 class="text-center mb-4">Product List</h2>
    
    <%
        List<ProductPojo> productList = (List<ProductPojo>) request.getAttribute("productList");

        if (productList != null && !productList.isEmpty()) {
    %>
        <table class="table table-striped table-bordered table-hover">
            <thead class="table-dark">
                <tr>
                    <th>Product ID (pid)</th>
                    <th>Product Name (pname)</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (ProductPojo product : productList) {
                %>
                    <tr>
                        <td><%= product.getPid() %></td>
                        <td><%= product.getPname() %></td>
                    </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    <%
        } else {
    %>
        <div class="alert alert-warning text-center">
            No products found!
        </div>
    <%
        }
    %>

    <a href="index.jsp" class="btn btn-secondary">Back</a>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>