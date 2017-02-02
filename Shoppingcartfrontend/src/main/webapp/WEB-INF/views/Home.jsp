<%@ include file="Header.jsp" %>
<body>
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
      <li data-target="#myCarousel" data-slide-to="6"></li>
     
     </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/img8.jpg" alt="blackops" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/img7.jpg" alt="Uncharted" width="500" height="345">
      </div>
    
      <div class="item">
        <img src="resources/images/img9.jpg"alt="god_of _war" width="500" height="400">
      </div>

      <div class="item">
        <img src="resources/images/img11.jpg" alt="nike" width="460" height="345">
      </div>
      
      <div class="item">
      <img src="resources/images/img10.jpg" alt="leo-Messi" width="500" height="450">
      </div>
      
      <div class="item">
        <img src="resources/images/img4.jpg" alt="Roger-Federer" width="500" height="400">
      </div>
      
      <div class="item">
        <img src="resources/images/img6.jpg" alt="Virat" width="500" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</body>
</html>