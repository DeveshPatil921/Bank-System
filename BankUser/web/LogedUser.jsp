<%-- 
    Document   : LogedUser
    Created on : 27-Oct-2022, 3:11:19 pm
    Author     : patil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import ="java.io.PrintWriter" %>
<%
    try{
    accnum = (int)session.getAttribute("User");
        
    }
    catch(Exception e){response.sendRedirect("index.html");}

    if(accnum==0){
        if(response==null){
            response.sendRedirect("/closeSession");
        }
    }
     pw = response.getWriter();
%>

<%!
    Connection con = com.connection.Connector.getConnector();
    PreparedStatement ps = null;
    PreparedStatement tran_money =null;
    ResultSet rs = null;
    PrintWriter pw ;
    int accnum;
    int amount;
    
%>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>GPA Bank Home Page</title>
    <link rel="stylesheet" href="./Css/style.css">
    <link rel="stylesheet" href="./Css/tracsuction.css">
</head>

<body>
    <!-- Header Section -->

    <nav class="navBar">
        <ul class="navlist">
            <div class="logo">
                <img src="./Bank Images/Bank logo.jpg" alt="GPA Bank" width="70px" height="50px">
            </div>
            <li><a class="Activate" href="#Home">Home</a></li>
            <li><a href="#ProfileUser">Profile</a></li>
            <li><a href="#Deposite">Deposit</a></li>
            <li><a href="#Withdraw">Withdraw</a></li>
            <li><a href="#About">About</a></li>

        </ul>
        <div class="Loginarea">
            <ul><a class="button" href="/BankUser/closeSession">Logout</a></ul>
        </div>
    </nav>
    <!-- Header Section -->
    <hr>
    <!-- Intro Section -->

    <section id="Home">
        <div class="horizontal Intro">
            <div class="Intro">
               <h1> General Public Association </h1><br>

                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                    Explicabo veniam dignissimos recusandae laudantium nulla incidunt dolorum, cumque dolores omnis
                    voluptates nostrum tempore, sed reiciendis architecto veritatis asperiores excepturi vitae totam quo
                    mollitia, aliquam vel laboriosam. Enim veritatis ipsa odit, temporibus ullam dolorum? Sapiente quam
                    nam unde quisquam, reprehenderit minus? Quas consectetur, dolor natus numquam est laborum!
                    Repellendus veniam sapiente nemo fugit pariatur perspiciatis quae deleniti quo. Earum molestiae
                    maiores vel obcaecati. Dolorum corporis iusto eius cumque vitae odit adipisci expedita nam alias quo
                    quis unde soluta, non praesentium officia est. Iusto neque quidem harum impedit, consequuntur
                    suscipit at in quod eos, nostrum quam commodi reprehenderit! Quaerat illum dicta suscipit voluptatem
                    quod velit, sed fugit tempore voluptatum iste ad eos voluptates nihil quibusdam recusandae officiis
                    soluta officia magnam autem deleniti. Error pariatur, excepturi veniam rem culpa fugit beatae nemo
                    quos placeat in facilis nesciunt reprehenderit quia dicta debitis consequuntur aperiam, aliquam illo
                    libero dolores! Deserunt libero illo saepe at, exercitationem debitis minus molestiae ullam dicta
                    cum molestias! Sint quibusdam eum porro blanditiis, eveniet laboriosam repellat obcaecati odio
                    numquam iste aspernatur, quas, quasi incidunt corporis ducimus nisi accusantium aliquid quo
                    asperiores ipsam nemo ad quia quis?
                    Sint inventore reprehenderit perspiciatis id nemo explicabo quos!</p>
            </div>
            <div class="IntroImg horizontal">
                <img src="./Bank Images/bankmain.png">

            </div>
        </div>
    </section>

    <!-- Intro Section -->
    <hr>
    <!-- User Profile Form -->

    <section class="TContaner" id="ProfileUser">
        <h5>Personal Information</h5>

<%
    try{  
        ps = con.prepareStatement("Select * from customer_recorde where AccountNumber = "+accnum+" ;");
        rs = ps.executeQuery();//ps.executeQuery()
        
//        System.out.println("Account Number : "+accnum);  
    
        if(rs.next()){
//            System.out.println("data is come "); 
        }
        this.amount = rs.getInt(2);
        
%>
        <form action="none" method="post" class="Tform" style="background-color: rgb(208, 254, 239);">
            <div>
                <label for="Name">Name :</label>
                <label for="Name"><%= rs.getString(3) %></label>
            </div>
            <div>
                <label for="phone">Phone Number :</label>
                <label for="phone"><%= rs.getInt(4) %></label>
          
            </div>
            <div>
                <label for="address">Address :</label>
                <label for="address"><%= rs.getString(5) %></label>
          
            </div>
            <div>
                <label for="Date of birth">Date of Birth :</label>
                <label for="Date of birth"><%= rs.getString(6) %></label>
      
            </div>
            <div>
                <label for="gender">Gender :</label>
                <label for="gender"><%= rs.getString(7) %></label>
         
            </div>
            <div>
                <label for="balance">Available Balance :</label>
                <label for="balance"><%= this.amount %></label>
            
            </div>
            <div>
                <label for="accNumber">Account Number :</label>
                <label for="accNumber">GPA<%= rs.getInt(1) %></label>
                
            </div>
            <div>
                <label for="Password">Password : </label>
                <input type="Password" id="Password" value="<%= rs.getString(8) %>" readonly>
            </div>

        </form>
<%
    }
    catch(SQLException ex){}
%>

    </section>
    <!-- User Profile Form -->
    <hr>
    <!-- Deposit Money Form -->
    
    <section class="TContaner" id="Deposite">
        <h5>Deposit Amount</h5>

        <form action="DepositeServlet" method="post" class="Tform" style="background-color: rgb(249, 208, 254);">
            <div>
                <label for="Username">Initial Amount</label>
                <input type="text" id="Amount" value=" <%= this.amount %> " readonly>
            </div>
            <div>
                <label for="Username">Amount</label>
                <input type="number" id="AmountD" name="AmountD" required>
            </div>
            <div>
                <input type="submit" id="Submit" value="Deposite">
            </div>

            
            <div class="Optresult">
                <!--<label for="">Status of Operation </label>-->
                <label for="" class="Optresult"><%= com.controller.DepositeServlet.result %></label>
                              <%= com.controller.DepositeServlet.result="" %>
            </div>
        </form>

    </section>
    <!-- Deposit Money Form -->
    <hr>
    <!-- WithDraw Money Form -->

    <section class="TContaner" id="Withdraw">
        <h5>Withdraw Amount</h5>

        <form action="WithdrawServlet" method="post" class="Tform" style="background-color: rgb(254, 208, 208);">
            <div>
                <label for="Initial Amount">Initial Amount</label>
                <input type="text" id="Amount" value=" <%= this.amount %> " readonly>
            </div>
            <div>
                <label for="Amount">Amount</label>
                <input type="number" id="AmountW" name="AmountW" required>
            </div>
            <div>
                <input type="submit" id="Submit" value="Withdraw">
            </div>
            
            <div class="Optresult">
                <label for="" ><%= com.controller.WithdrawServlet.result %></label>
                              <%= com.controller.WithdrawServlet.result="" %>
            </div>
        </form>

    </section>
    <!-- WithDraw Money Form -->
    <hr>
    <!-- Team Infomation -->
    <section id="About">
        <div>
            <div style="display: flex; flex-direction:column; justify-content: center;
            align-items: center; margin: 1%;">
                <h1 style="padding: 2%;">OUR Developer TEAM</h1>
                <div class="vertical">
                    <div class="horizontal">
                        <div class="TeamImage">
                            <img alt="team" src="./Bank Images/20CM050.jpg" >
                            <h2>Omkar Shelke</h2>
                            <h3>Project Manager</h3>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Omnis, dolor?</p>
                        </div>
                        <div class="TeamImage">
                            <img alt="team" src="./Bank Images/20CM041.jpg" >
                            <h2>Devesh Patil</h2>
                            <h3>System Developer</h3>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Omnis, dolor?</p>
                        </div>
                        <div class="TeamImage">
                            <img alt="team" src="./Bank Images/20CM018.jpeg" >
                            <h2>Kishtij Hadke</h2>
                            <h3>Tester</h3>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Omnis, dolor?</p>
                        </div>

                    </div>
                    <div class="horizontal">
                        <div class="TeamImage">
                            <img alt="team" src="./Bank Images/20CM206.jpg" >
                            <h2>Munawwar Miyan</h2>
                            <h3>Backend Developer</h3>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Omnis, dolor?</p>
                        </div>
                        <div class="TeamImage">
                            <img alt="team" src="./Bank Images/20CM049.jpeg" >
                            <h2>Karan Rathod</h2>
                            <h3>UI Designer</h3>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Omnis, dolor?</p>
                        </div>
                        <div class="TeamImage">
                            <img alt="team" src="./Bank Images/20CM013.jpeg" >
                            <h2>Karan Rathod</h2>
                            <h3>Tester</h3>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Omnis, dolor?</p>
                        </div>
                    </div>
                </div>
            </div>
    </section>
    <!-- Team Infomation -->
    <hr>
    <!-- footer Section -->
    <footer>
        <div class=" navlist ">

            <div class="logo">
                <img src="./Bank Images/Bank logo.jpg" alt="">
            </div>
            <h3>GPA Bank .</h3>
            <p> | © 2022 General Public Association Bank —
                <a>@GPA Bank</a>
            </p>
        </div>
    </footer>
    <!-- Footer Section -->

</body>

</html>