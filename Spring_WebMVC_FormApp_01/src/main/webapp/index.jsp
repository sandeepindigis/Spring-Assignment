<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ashok IT</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>

<div class="container mt-5 mb-5">
    <h2>User Form</h2>

    <p>${smsg}</p>
    <p>${emsg}</p>

    <form action="${pageContext.request.contextPath}/user" method="post">
        <table class="table">
            <!-- Hidden Field for uid -->
            <tr>
                <td colspan="3">
                    <input type="hidden" name="uid" value="${user.uid}" />
                </td>
            </tr>

            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" class="form-control" value="${user.name}" /></td>
                <td>
                    <c:if test="${not empty errors.name}">
                        <p class="error">${errors.name}</p>
                    </c:if>
                </td>
            </tr>

            <tr>
                <td>Email:</td>
                <td><input type="email" name="email" class="form-control" value="${user.email}" /></td>
                <td>
                    <c:if test="${not empty errors.email}">
                        <p class="error">${errors.email}</p>
                    </c:if>
                </td>
            </tr>

            <tr>
                <td>Phone:</td>
                <td><input type="number" name="phoneNumber" class="form-control" value="${user.phoneNumber}" /></td>
                <td>
                    <c:if test="${not empty errors.phoneNumber}">
                        <p class="error">${errors.phoneNumber}</p>
                    </c:if>
                </td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Save" class="btn btn-primary" /></td>
            </tr>
        </table>
    </form>

    <a href="${pageContext.request.contextPath}/users" class="btn btn-link">View All Users</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

</body>
</html>