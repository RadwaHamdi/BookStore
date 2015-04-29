<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                        <li><a href="category.jsp">Books</a></li>
                        <li><a href="specials.jsp">Special Books</a></li>
                        <!--        <li><a href="myaccount.jsp">Account</a></li>
                                <li><a href="register.jsp">Register</a></li>-->
                        <!-- <li><a href="details.jsp">Prices</a></li> -->
                        <li><a href="contact.jsp">Contact</a></li>
                    </ul>
                </div>     


            </div> 


            <div class="center_content">
                <div class="left_content">
                    <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>My cart</div>

                    <div class="feat_prod_box_details">

                        <table class="cart_table">
                            <tr class="cart_title">
                                <td>Item pic</td>
                                <td>Book name</td>
                                <td>Unit price</td>
                                <td>Qty</td>
                                <td>Total</td>               
                            </tr>

                            <tr>
                                <td><a href="details.jsp"><img src="images/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" /></a></td>
                                <td>Books</td>
                                <td>100$</td>
                                <td>1</td>
                                <td>100$</td>               
                            </tr>          
                            <tr>
                                <td><a href="details.jsp"><img src="images/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" /></a></td>
                                <td>Books</td>
                                <td>100$</td>
                                <td>1</td>
                                <td>100$</td>               
                            </tr>                  
                            <tr>
                                <td><a href="details.jsp"><img src="images/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" /></a></td>
                                <td>Books</td>
                                <td>100$</td>
                                <td>1</td>
                                <td>100$</td>               
                            </tr>

                            <tr>
                                <td colspan="4" class="cart_total"><span class="red">TOTAL SHIPPING:</span></td>
                                <td> 250$</td>                
                            </tr>  

                            <tr>
                                <td colspan="4" class="cart_total"><span class="red">TOTAL:</span></td>
                                <td> 325$</td>                
                            </tr>                  

                        </table>
                        <a href="#" class="continue">&lt; continue</a>
                        <a href="UserBuyBooks" class="checkout">checkout &gt;</a>
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
                        <form action="Search">
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
                                    </html>

