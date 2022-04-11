


<div class="container mt-5">

  <div class="row signup">

    <div class="col-lg-5">

      <div class="shadow p-3 mb-5 bg-body rounded">
        <h3 class="">Sign Up Page</h3>
        <form action="<%=request.getContextPath()%>/RegisterNewUser" method="post">
          <input type="hidden" name="page" value="register">
          <div class="mb-3">
            <input type="text" name="name" value="<%=request.getAttribute("name") != null ? request.getAttribute("name").toString() : ""  %>" class="form-control" placeholder="Name" aria-describedby="firstNameHelp">
            <%
              if(request.getAttribute("name") != null) {
            %>
            <div id="firstNameHelp" class="form-text text-danger"><%= request.getAttribute("name").toString() %></div>
            <%
              }
            %>
          </div>



          <div class="mb-3">
            <input type="email" name="email" value="<%=request.getAttribute("email") != null ? request.getAttribute("email").toString() : ""  %>" class="form-control" placeholder="Email" aria-describedby="emailHelp">
            <%
              if(request.getAttribute("email") != null) {
            %>
            <div id="emailHelp" class="form-text text-danger"><%= request.getAttribute("email").toString() %></div>
            <%
              }
            %>
          </div>



          <div class="mb-3">
            <input type="password" name="password" class="form-control" placeholder="Password" aria-describedby="passwordHelp">
            <%
              if(request.getAttribute("password") != null) {
            %>
            <div id="passwordHelp" class="form-text text-danger"><%= request.getAttribute("password").toString() %></div>
            <%
              }
            %>
          </div>
          <div class="d-grid">
            <button type="submit" class="btn btn-primary btn-lg">Register</button>
          </div>
        </form>
        <div class="d-grid gap-2 mt-3">
          <p class="text-center mt-2">Have An Account?</p>
          <div class="divider"></div>
          <a href= "index.jsp" class="btn btn-link text-center ">
            Login
          </a>
        </div>


      </div>

    </div>

  </div>

</div>



