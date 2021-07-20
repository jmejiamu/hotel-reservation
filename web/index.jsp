
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">-->
        <title>Reservation</title>
        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Lato:400,400i,700" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css" />

    </head>
    <body>
        
        <div id="booking" class="section">
            
            <div class="section-center">
                <div class="container">
                    <h1>New Check In</h1>
                    
                    <div class="row">
                        <div class="booking-form">
                            <form>
                                <div class="row no-margin">
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <span class="form-label">Check In</span>
                                            <input class="form-control" type="date" required>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <span class="form-label">Check Out</span>
                                            <input class="form-control" type="date" required>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <span class="form-label">Number of People</span>
                                    <select class="form-control" required>
                                        <option value="" selected hidden>Select room type</option>
                                        <option>-</option>
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>more than 3</option>
                                    </select>
                                    <span class="select-arrow"></span>
                                </div>
                                <div class="form-group">
                                    <span class="form-label">Room Type</span>
                                    <select class="form-control" required>
                                        <option value="" selected hidden>Select room type</option>
                                        <option>Single Room (1 Person)</option>
                                        <option>Double Room (2 People Max.)</option>
                                        <option>Triple Room (3 People Max.)</option>
                                        <option>Multiple Room (1, 2, 3, 4 People  or more)</option>
                                    </select>
                                    <span class="select-arrow"></span>
                                </div>
                                <div class="row no-margin">
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <span class="form-label">First Name</span>
                                            <input class="form-control" type="firstname" placeholder="Enter your First Name">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <span class="form-label">Last Name</span>
                                            <input class="form-control" type="lastname" placeholder="Enter your Last Name">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <span class="form-label">Email</span>
                                    <input class="form-control" type="email" placeholder="Enter your email">
                                </div>
                                <div class="form-group">
                                    <span class="form-label">Phone</span>
                                    <input class="form-control" type="tel" placeholder="Enter your phone number">
                                </div>
                                <div class="form-btn">
                                    <button class="submit-btn">Book Now</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
