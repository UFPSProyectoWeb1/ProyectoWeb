<%-- 
    Document   : login
    Created on : 20-oct-2016, 19:00:25
    Author     : Manuel Florez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <title>Login</title>

        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="/web/css/materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="/web/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>


    </head>
    <body>
        <nav>
            <div class="nav-wrapper container">
                <div class="col s12">
                    <a href="/web/index.jsp" class="breadcrumb">Home</a>
                    <a href="/web/jsp/login.jsp" class="breadcrumb">Ingresar</a>
                </div>
            </div>
        </nav>
        <div class="container">

            <form class="form-signin" action="dashboard.jsp" method="POST">
                <div class="row">
                    <div class="col s12 m7">
                        <div class="card">

                            <div class="card-content">
                                <h2 class="form-signin-heading">Por favor ingrese...</h2>
                                <div class="container">
                                    <label for="inputEmail" class="sr-only">Dirección de e-mail</label>
                                    <input name="email" type="email" id="inputEmail" class="form-control" placeholder="Dirección de e-mail" required autofocus>
                                    <label for="inputPassword" class="sr-only">Password</label>
                                    <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Contraseña" required>
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox" value="remember-me"> Recuerdame
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="card-action">
                                <!-- EL onClick es temporal -->
                                <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
                            </div>
                        </div>
                    </div>
                </div>

            </form>
        </div>
        <footer class="page-footer teal">
            <div class="container">
                <div class="row">
                    <div class="col m4 s12 center">
                        <h5 class="white-text">MinCIT</h5>
                        <p class="grey-text text-lighten-4">MiCITio Cúcuta se encuentra operando desde el 07 de Octubre de 2015. 
                            Desde su apertura se ha atendido a 134 usuarios entre empresarios, emprendedores y ciudadanos.</p>
                        <img src="/web/img/ufps.png" width="150px" height="150px" alt="UFPS" />
                    </div>
                    <div class="col m4 s12 center">
                        <h5 class="white-text">Entidades adcritas</h5>
                        <ul>
                            <li><a class="white-text" href="https://www.fiducoldex.com.co/">Fiducoldex</a></li>
                            <li><a class="white-text" href="http://www.fng.gov.co/ES">FNG</a></li>
                            <li><a class="white-text" href="http://www.sic.gov.co/drupal/acuerdodepaz/">SIC</a></li>
                            <li><a class="white-text" href="http://www.artesaniasdecolombia.com.co/PortalAC/General/template_index.jsf">Artesanias de colombia</a></li>
                            <li><a class="white-text" href="http://www.proexport.com.co/">Procolombia</a></li>
                            <li><a class="white-text" href="http://www.supersociedades.gov.co/Paginas/default.aspx">Superintendecia de sociedades</a></li>
                            <li><a class="white-text" href="http://www.inm.gov.co/">Instituto Nacional de Metrología de Colombia</a></li>
                        </ul>
                    </div>

                    <div class="col m4 s12 center">
                        <h5 class="white-text">Desarrolladores</h5>
                        <ul>
                            <li><a href="mailto:acheron_1405@hotmail.com" class="white-text">acheron_1405@hotmail.com</a></li>
                            <li><a href="mailto:manuelflorezw@outlook.com" class="white-text">manuelflorezw@outlook.com</a></li>
                        </ul>
                        <img src="/web/img/sistemasufps.png" width="150px" height="150px" alt="UFPS" />
                    </div>

                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    Realizado por <a class="brown-text text-lighten-3" href="http://materializecss.com">Manuel Florez y Erick Clair</a>
                </div>
            </div>
        </footer>
        <!--  Scripts-->
        <script src="/web/js/jquery-2.1.1.min.js"></script>
        <script src="/web/js/materialize.min.js"></script>
        <script src="/web/js/init.js"></script>
    </body>
</html>
