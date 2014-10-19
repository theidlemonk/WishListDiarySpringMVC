<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<title>My Wishes</title>
</head>
<body>
	<div class="container">
		<h1>${message}</h1>
		<c:if test="${not empty newWishItemMessage}">
			<div class="alert alert-info alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert">
					<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
				</button>
				${newWishItemMessage}
			</div>
		</c:if>
		<c:choose>
			<c:when test="${empty wishes}">
				<h3>You have not made any wishes.</h3>
			</c:when>
			<c:otherwise>
				<table class="table table-striped table-bordered">
					<tr class="success">
						<th>My Wishes</th>
					</tr>
					<c:forEach items="${wishes}" var="wish">
						<tr>
							<td>${wish.name}</td>
						</tr>
					</c:forEach>
				</table>
			</c:otherwise>
		</c:choose>

		<a href="/WishListDiary/wish/add" class="btn btn-info">More Wishes</a>
	</div>
</body>
</html>