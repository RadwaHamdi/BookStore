<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
        <title>Book Store</title>
        <link rel="stylesheet" type="text/css" href="style.css" />

    </head>
    <body background="images/background.jpg">
        <div id="wrap">

            <div class="header">
                <div class="logo"><a href="index.jsp"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>            
                <div id="menu">
                    <ul>                                                                       
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="about.jsp">About us</a></li>
                        <li class="selected"><a href="ViewAllBooks">Books</a></li>
                        <li><a href="specials.jsp">Special Books</a></li>
                        <li ><a href="myaccount.jsp">Account</a></li>
                        <li><a href="register.jsp">Register</a></li>
                        <!-- <li><a href="details.jsp">Prices</a></li> -->
                        <li><a href="contact.jsp">Contact</a></li>
                    </ul>
                </div>     


            </div> 


            <div class="center_content">
                <div class="left_content">
                    <div class="crumb_nav">
                        <a href="index.jsp">home</a> &gt;&gt;${requestScope.catName}
                    </div>
                    <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>Category books</div>

                    <div class="new_products">

                       <c:forEach items="${sessionScope.category}" var="book" >
                            
                                <div class="feat_prod_box">

                            <div class="prod_img"><a href="details.html"><img src="images/prod1.gif" alt="" title="" border="0" /></a></div>
                                  <div class="prod_det_box">
                                <div class="box_top"></div>
                                <div class="box_center">
                                    <div class="prod_title">${book.name}</div>
                                    <p class="details">${book.author}</p>
                                    <p>Price : ${book.price}</p>
                                    <a href="DetailsServlet?book=${book.bookID}" class="more">- more details -</a>
                                    <div class="clear"></div>
                                </div>

                                <div class="box_bottom"></div>
                            </div>    
                            <div class="clear"></div>
                        </div>	
                        </c:forEach>

                        <div class="pagination">
                            <span class="disabled"><<</span><span class="current">1</span><a href="#?page=2">2</a><a href="#?page=3">3</a>…<a href="#?page=199">10</a><a href="#?page=200">11</a><a href="#?page=2">>></a>
                        </div>  

                    </div> 


                    <div class="clear"></div>
                </div><!--end of left content-->

                <div class="right_content">
                    <div class="languages_box">
                        <span class="red">Signed in as:</span>
                        <a href="myaccount.jsp">user</a>
                        </br>
                        </br>
                        <form action="Search">
                            <strong>Search</strong>
                            <input type="search" name="booksearch">&ensp;&ensp;
                                <input type="submit" class="register" value="Search" >
                                    </form>
                                    </div> 


                                    <div class="cart">
                                        <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span>My cart</div>
                                        <div class="home_cart_content">
                                            3 x items | <span class="red">TOTAL: 100$</span>
                                        </div>
                                        <a href="cart.jsp" class="view_cart">view cart</a>

                                    </div>




                                    <div class="title"><span class="title_icon"><img src="images/bullet3.gif" alt="" title="" /></span>About Our Store</div> 
                                    <div class="about">
                                        <p>
                                            <img src="images/about.gif" alt="" title="" class="right" />
                                            BookStore.com, was established in 2015 by a group of ITI trainees from Mobile Development department intake 35 as a part of their Servlet &amp; JSP course project.
                                        </p>

                                    </div>

                                    <div class="right_box">

                                        <div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>Categories</div> 

                                        <ul class="list">
                                            <li><a href="ViewBookByCategory?category=social"><span class="red"><strong>Social</strong></span></a></li>
                                            <li><a href="ViewBookByCategory?category=history"><span class="red"><strong>History</strong></span></a></li>
                                            <li><a href="ViewBookByCategory?category=culture"><span class="red"><strong>Culture</strong></span></a></li>
                                            <li><a href="ViewBookByCategory?category=kids"><span class="red"><strong>Kids</strong></span></a></li>
                                        </ul>
                                    </div>         


                                    </div><!--end of right content-->




                                    <div class="clear"></div>
                                    </div><!--end of center content-->


                                    <div class="footer">
                                        <div class="left_footer"><a href="index.jsp" title="Home"><img src="images/footer_logo.gif" alt="" title="" /></a>
                                            <!-- <br /> <a href="http://csscreme.com/freecsstemplates/" title="free templates"><img src="images/csscreme.gif" alt="free templates" title="free templates" border="0" /></a> --></div>
                                        <div class="right_footer">
                                            <a href="index.jsp">Home</a>
                                            <a href="about.jsp">About us</a>
                                            <a href="contact.jsp">Contact us</a>
                                        </div>


                                    </div>


                                    </div>

                                    </body>
                                    </html>

