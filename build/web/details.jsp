<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
        <title>Book Store</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
        <link rel="stylesheet" href="lightbox.css" type="text/css" media="screen" />

        <script src="js/prototype.js" type="text/javascript"></script>
        <script src="js/scriptaculous.js?load=effects" type="text/javascript"></script>
        <script src="js/lightbox.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/java.js"></script>
    </head>
    <body background="images/background.jpg">
        <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>     
        <div id="wrap">

            <div class="header">
                <div class="logo"><a href="index.jsp"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>            
                <div id="menu">
                    <ul>                                               <li><a href="index.jsp">Home</a></li>
                        <li><a href="about.jsp">About us</a></li>
                        <li><a href="category.jsp">Books</a></li>
                        <li><a href="specials.jsp">Special Books</a></li>
                        <!--                        <li ><a href="myaccount.jsp">Account</a></li>
                                                <li><a href="register.jsp">Register</a></li>-->
                        <!-- <li class="selected"><a href="details.jsp">Prices</a></li> -->
                        <li><a href="contact.jsp">Contact</a></li>
                    </ul>
                </div>     


            </div> 



            <div class="center_content">
                <div class="left_content">
                    <div class="crumb_nav">

                        <a href="index.jsp">home</a> &gt;&gt; 
                    </div>
                    <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></div>

                    <div class="feat_prod_box_details">

                        <div class="prod_img"><a href="details.jsp"><img src="images/prod1.gif" alt="" title="" border="0" /></a>
                            <br /><br />
                            <a href="images/big_pic.jpg" rel="lightbox"><img src="images/zoom.gif" alt="" title="" border="0" /></a>
                        </div>
                        <c:forEach items="${result}" var="mybook" >
                            <jsp:useBean id= "mybook" scope="request" class="beanPkg.Book"/>
                            <jsp:setProperty name="mybook" property="*"/>

                            <div class="prod_det_box">
                                <div class="box_top"></div>
                                <div class="box_center">
                                    <div class="prod_title">Details</div>
                                    <p class="details"><jsp:getProperty name= "mybook" property="description" /><br />

                                    </p>
                                    <div class="price"><strong>PRICE:</strong> <span class="red"><jsp:getProperty name= "mybook" property="price" />$</span></div>
                                    <div class="price"><strong>COLORS:</strong> 
                                        <span class="colors"><img src="images/color1.gif" alt="" title="" border="0" /></span>
                                        <span class="colors"><img src="images/color2.gif" alt="" title="" border="0" /></span>
                                        <span class="colors"><img src="images/color3.gif" alt="" title="" border="0" /></span>                    </div>
                                    <a href="Cart?book=<jsp:getProperty name= "mybook" property="bookID" />" class="more"><img src="images/order_now.gif" alt="" title="" border="0" /></a>
                                    <div class="clear"></div>
                                </div>

                                <div class="box_bottom"></div>
                            </div>    
                            <div class="clear"></div>
                        </c:forEach>
                    </div>	


                    <div id="demo" class="demolayout">

                        <ul id="demo-nav" class="demolayout">
                            <li><a class="active" href="#tab1">More details</a></li>
                            <li><a class="" href="#tab2">Related books</a></li>
                        </ul>

                        <div class="tabs-container">

                            <div style="display: block;" class="tab" id="tab1">
                                <p class="more_details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.
                                </p>
                                <ul class="list">
                                    <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                                    <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                                    <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                                    <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>                                          
                                </ul>
                                <p class="more_details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.
                                </p>                           
                            </div>	

                            <div style="display: none;" class="tab" id="tab2">
                                <div class="new_prod_box">
                                    <a href="details.jsp">product name</a>
                                    <div class="new_prod_bg">
                                        <a href="details.jsp"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                                    </div>           
                                </div>

                                <div class="new_prod_box">
                                    <a href="details.jsp">product name</a>
                                    <div class="new_prod_bg">
                                        <a href="details.jsp"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                                    </div>           
                                </div>                    

                                <div class="new_prod_box">
                                    <a href="details.jsp">product name</a>
                                    <div class="new_prod_bg">
                                        <a href="details.jsp"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                                    </div>           
                                </div>    

                                <div class="new_prod_box">
                                    <a href="details.jsp">product name</a>
                                    <div class="new_prod_bg">
                                        <a href="details.jsp"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                                    </div>           
                                </div>

                                <div class="new_prod_box">
                                    <a href="details.jsp">product name</a>
                                    <div class="new_prod_bg">
                                        <a href="details.jsp"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                                    </div>           
                                </div>                    

                                <div class="new_prod_box">
                                    <a href="details.jsp">product name</a>
                                    <div class="new_prod_bg">
                                        <a href="details.jsp"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                                    </div>           
                                </div>  

                                <div class="clear"></div>
                            </div>	

                        </div>
                    </div>

                    <div class="clear"></div>
                </div><!--end of left content-->

                <div class="right_content">

                    <div class="languages_box">
                        <span class="red">Signed in as:</span>
                        <a href="EditProfile.jsp">
                            <strong> <c:out value="${email}"/></strong>
                        </a>
                        <c:if test="${email==null}">  
                            <a href="myaccount.jsp">
                                <strong>Please sign in</strong>
                            </a> 
                        </c:if>  
                        </br>
                        </br>
                        <form action="Saerch">
                            <strong>Search</strong>
                            <input type="search" name="booksearch">&ensp;&ensp;
                                <input type="submit" class="register" value="Search" >
                                    </form>
                                    </div> 

                                    <div class="cart">
                                        <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span>My cart</div>
                                        <div class="home_cart_content">

                                            <strong> <c:out value="${size}"/></strong>              
                                            <c:if test="${size==null}">  
                                                &ensp;
                                            </c:if>   x items | <span class="red">TOTAL:&ensp; </span>

                                            <strong> <c:out value="${totalPrice}"/></strong>

                                            <c:if test="${totalPrice==null}">  
                                                &ensp;
                                            </c:if>  
                                        </div>

                                        <!--      <a href="cart.jsp" class="view_cart">view cart</a>-->


                                        <c:if test="${email!=null}">  
                                            <a href="cart.jsp">
                                                <strong>View cart</strong>
                                            </a>
                                        </c:if>

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
                                    <script type="text/javascript">

                                        var tabber1 = new Yetii({
                                            id: 'demo'
                                        });

                                    </script>
                                    </html>

