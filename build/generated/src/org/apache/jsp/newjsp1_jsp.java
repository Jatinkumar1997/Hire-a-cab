package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title></title>\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <style>\n");
      out.write("      html, body {\n");
      out.write("        height: 100%;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("      }\n");
      out.write("      #map {\n");
      out.write("        height: 50%;\n");
      out.write("      }\n");
      out.write("      .controls {\n");
      out.write("        margin-top: 10px;\n");
      out.write("        border: 1px solid transparent;\n");
      out.write("        border-radius: 2px 0 0 2px;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        -moz-box-sizing: border-box;\n");
      out.write("        height: 32px;\n");
      out.write("        outline: none;\n");
      out.write("        box-shadow: 0 2px 6px rgba(0, 0, 0, 0.3);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #origin-input,\n");
      out.write("      #destination-input {\n");
      out.write("        background-color: #fff;\n");
      out.write("        font-family: Roboto;\n");
      out.write("        font-size: 15px;\n");
      out.write("        font-weight: 300;\n");
      out.write("        margin-left: 12px;\n");
      out.write("        padding: 0 11px 0 13px;\n");
      out.write("        text-overflow: ellipsis;\n");
      out.write("        width: 200px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #origin-input:focus,\n");
      out.write("      #destination-input:focus {\n");
      out.write("        border-color: #4d90fe;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #mode-selector {\n");
      out.write("        color: #fff;\n");
      out.write("        background-color: #4d90fe;\n");
      out.write("        margin-left: 12px;\n");
      out.write("        padding: 5px 11px 0px 11px;\n");
      out.write("        \n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #mode-selector label {\n");
      out.write("        font-family: Roboto;\n");
      out.write("        font-size: 13px;\n");
      out.write("        font-weight: 300;\n");
      out.write("      }\n");
      out.write("     .button {\n");
      out.write("    background-color: #4CAF50; /* Green */\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 25px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    \n");
      out.write("    border: 1px solid green\n");
      out.write("}\n");
      out.write(".button1 {\n");
      out.write("     background-color: #4CAF50; /* Green */\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 25px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    \n");
      out.write("    font-size: 16px;\n");
      out.write("   \n");
      out.write("        margin-top: 10px;\n");
      out.write("    border: 1px solid green\n");
      out.write("    \n");
      out.write("}\n");
      out.write("#book{\n");
      out.write("    display:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      <div id=\"form\" style=\"width:100%; height:20%\">\n");
      out.write("\t\t<table align=\"center\" valign=\"center\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"7\" align=\"center\"><b></b></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"7\">&nbsp;</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Pickup Address:</td>\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\n");
      out.write("                                <td><input id=\"origin-input\" class=\"controls\" type=\"text\" placeholder=\"Enter an origin location\"></td>\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t<td>Destination:</td>\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\n");
      out.write("                                <td><input id=\"destination-input\" class=\"controls\" type=\"text\" placeholder=\"Enter a destination location\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        \n");
      out.write("                        <tr> <td>\n");
      out.write("                        <center><select id=\"sel\" class=\"controls\">\n");
      out.write("                                 <option value=\"#\" >Select Vehicle Type</option>\n");
      out.write("                                 <option value=\"Micro\" id=\"micro\">Micro</option>\n");
      out.write("                                 <option value=\"Sedan\" id=\"sedan\">Sedan</option>\n");
      out.write("                                 <option value=\"SUV\" id=\"suv\">SUV</option>\n");
      out.write("                            </select></center>\n");
      out.write("                            </td>   \n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                  \n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"7\">&nbsp;</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<center><div id=\"cost1\" style=\"width:100%; height:10%\"></div></center>\n");
      out.write("        <center><div>\n");
      out.write("                        <button id=\"btn\" onclick=\"Cost();\" class=\"button\" >Estimate Cost</button>\n");
      out.write("                       \n");
      out.write("                        <a href=\"Success.jsp\"><input type=\"button\" id=\"book\" class=\"button1\" value=\"Book Now\"></a>\n");
      out.write("                        \n");
      out.write("            </div></center>\n");
      out.write("\t<center><div id=\"map\" style=\"width:70%; height:55%\"></div></center>\n");
      out.write("       <script>\n");
      out.write("      \n");
      out.write("     var d;\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     function showPosition(position) {\n");
      out.write("  var lat = position.coords.latitude;\n");
      out.write("  var lng = position.coords.longitude;\n");
      out.write("  map.setCenter(new google.maps.LatLng(lat, lng));\n");
      out.write("         }\n");
      out.write("      function initMap() {\n");
      out.write("        var origin_place_id = null;\n");
      out.write("        var destination_place_id = null;\n");
      out.write("        var travel_mode = 'DRIVING';\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("          mapTypeControl: true,\n");
      out.write("          center: {lat: 28.7186211, lng: 77.0685134}, \n");
      out.write("          zoom: 13\n");
      out.write("          \n");
      out.write("        });\n");
      out.write("        if (navigator.geolocation) {\n");
      out.write("         navigator.geolocation.getCurrentPosition(function (position) {\n");
      out.write("             initialLocation = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);\n");
      out.write("             map.setCenter(initialLocation);\n");
      out.write("             });\n");
      out.write("         }\n");
      out.write("        ;\n");
      out.write("        \n");
      out.write("        var directionsService = new google.maps.DirectionsService;\n");
      out.write("        var directionsDisplay = new google.maps.DirectionsRenderer;\n");
      out.write("        directionsDisplay.setMap(map);\n");
      out.write("\n");
      out.write("        var origin_input = document.getElementById('origin-input');\n");
      out.write("        var destination_input = document.getElementById('destination-input');\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        var origin_autocomplete = new google.maps.places.Autocomplete(origin_input);\n");
      out.write("        origin_autocomplete.bindTo('bounds', map);\n");
      out.write("        var destination_autocomplete =\n");
      out.write("            new google.maps.places.Autocomplete(destination_input);\n");
      out.write("        destination_autocomplete.bindTo('bounds', map);\n");
      out.write("\n");
      out.write("        // Sets a listener on a radio button to change the filter type on Places\n");
      out.write("        // Autocomplete.\n");
      out.write("        \n");
      out.write("\n");
      out.write("        function expandViewportToFitPlace(map, place) {\n");
      out.write("          if (place.geometry.viewport) {\n");
      out.write("            map.fitBounds(place.geometry.viewport);\n");
      out.write("          } else {\n");
      out.write("            map.setCenter(place.geometry.location);\n");
      out.write("            map.setZoom(17);\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        origin_autocomplete.addListener('place_changed', function() {\n");
      out.write("          var place = origin_autocomplete.getPlace();\n");
      out.write("          if (!place.geometry) {\n");
      out.write("            window.alert(\"Autocomplete's returned place contains no geometry\");\n");
      out.write("            return;\n");
      out.write("          }\n");
      out.write("          expandViewportToFitPlace(map, place);\n");
      out.write("\n");
      out.write("          // If the place has a geometry, store its place ID and route if we have\n");
      out.write("          // the other place ID\n");
      out.write("          origin_place_id = place.place_id;\n");
      out.write("          route(origin_place_id, destination_place_id, travel_mode,\n");
      out.write("                directionsService, directionsDisplay);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        destination_autocomplete.addListener('place_changed', function() {\n");
      out.write("          var place = destination_autocomplete.getPlace();\n");
      out.write("          if (!place.geometry) {\n");
      out.write("            window.alert(\"Autocomplete's returned place contains no geometry\");\n");
      out.write("            return;\n");
      out.write("          }\n");
      out.write("          expandViewportToFitPlace(map, place);\n");
      out.write("\n");
      out.write("          // If the place has a geometry, store its place ID and route if we have\n");
      out.write("          // the other place ID\n");
      out.write("          destination_place_id = place.place_id;\n");
      out.write("          route(origin_place_id, destination_place_id, travel_mode,\n");
      out.write("                directionsService, directionsDisplay);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        function route(origin_place_id, destination_place_id, travel_mode,\n");
      out.write("                       directionsService, directionsDisplay) {\n");
      out.write("          if (!origin_place_id || !destination_place_id) {\n");
      out.write("            return;\n");
      out.write("          }\n");
      out.write("          directionsService.route({\n");
      out.write("            origin: {'placeId': origin_place_id},\n");
      out.write("            destination: {'placeId': destination_place_id},\n");
      out.write("            travelMode: travel_mode\n");
      out.write("          }, function(response, status) {\n");
      out.write("            if (status === 'OK') {\n");
      out.write("              directionsDisplay.setDirections(response);\n");
      out.write("              d=response.routes[0].legs[0].distance.text;\n");
      out.write("              time=response.routes[0].legs[0].duration.text;\n");
      out.write("              \n");
      out.write("              q=parseInt(d);            \n");
      out.write("                                \n");
      out.write("            } else {\n");
      out.write("              window.alert('Directions request failed due to ' + status);\n");
      out.write("            }\n");
      out.write("          });\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("      }\n");
      out.write("      function Cost()\n");
      out.write("        {  \n");
      out.write("            var e = document.getElementById(\"sel\");\n");
      out.write("            var strUser = e.options[e.selectedIndex].value;\n");
      out.write("            \n");
      out.write("            if(strUser===\"Micro\")\n");
      out.write("            {\n");
      out.write("                var cost=25+q*3;\n");
      out.write("                cost= Math.round(cost * 100)/100;\n");
      out.write("              document.getElementById(\"cost1\").innerHTML = \"<br/>Estimated Cost is: \"+cost; \n");
      out.write("              document.getElementById(\"book\").style.display=\"block\";\n");
      out.write("                        \n");
      out.write("                      \n");
      out.write("            }\n");
      out.write("            if(strUser===\"Sedan\")\n");
      out.write("            {\n");
      out.write("                var cost=35+q*5;\n");
      out.write("                cost= Math.round(cost * 100)/100;\n");
      out.write("              document.getElementById(\"cost1\").innerHTML = \"<br/>Estimated Cost is: \"+cost;  \n");
      out.write("              document.getElementById(\"book\").style.display=\"block\";\n");
      out.write("            }\n");
      out.write("            if(strUser===\"SUV\")\n");
      out.write("            {\n");
      out.write("                var cost=50+q*10;\n");
      out.write("                cost= Math.round(cost * 100)/100;\n");
      out.write("              document.getElementById(\"cost1\").innerHTML = \"<br/>Estimated Cost is: Rs. \"+cost;  \n");
      out.write("              document.getElementById(\"book\").style.display=\"block\";\n");
      out.write("            }\n");
      out.write("             \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCM_R1n2DIt9tHWy3J-Z6HIjBF2FX2lR6I&libraries=places&callback=initMap\"\n");
      out.write("        async defer></script>\n");
      out.write("        </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
