package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Booking</title>\n");
      out.write("<script type=\"text/javascript\" src=\"http://maps.google.com/maps/api/js?key=AIzaSyCM_R1n2DIt9tHWy3J-Z6HIjBF2FX2lR6I&libraries=places&callback=initAutocomplete\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\tvar location1;\n");
      out.write("\tvar location2;\n");
      out.write("\t\n");
      out.write("\tvar address1;\n");
      out.write("\tvar address2;\n");
      out.write("\n");
      out.write("\tvar latlng;\n");
      out.write("\tvar geocoder;\n");
      out.write("\tvar map;\n");
      out.write("\tvar d;\n");
      out.write("\tvar distance;\n");
      out.write("        \n");
      out.write("\t\n");
      out.write("      \n");
      out.write("\n");
      out.write("    \n");
      out.write("\t// finds the coordinates for the two locations and calls the showMap() function\n");
      out.write("\tfunction initialize()\n");
      out.write("\t{\n");
      out.write("\t\tgeocoder = new google.maps.Geocoder(); // creating a new geocode object\n");
      out.write("\t\t\n");
      out.write("\t\t// getting the two address values\n");
      out.write("\t\taddress1 = document.getElementById(\"address1\").value;\n");
      out.write("\t\taddress2 = document.getElementById(\"address2\").value;\n");
      out.write("\t\t\n");
      out.write("\t\t// finding out the coordinates\n");
      out.write("\t\tif (geocoder) \n");
      out.write("\t\t{\n");
      out.write("\t\t\tgeocoder.geocode( { 'address': address1}, function(results, status) \n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif (status == google.maps.GeocoderStatus.OK) \n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\t//location of first address (latitude + longitude)\n");
      out.write("\t\t\t\t\tlocation1 = results[0].geometry.location;\n");
      out.write("\t\t\t\t} else \n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Geocode was not successful for the following reason: \" + status);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tgeocoder.geocode( { 'address': address2}, function(results, status) \n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif (status == google.maps.GeocoderStatus.OK) \n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\t//location of second address (latitude + longitude)\n");
      out.write("\t\t\t\t\tlocation2 = results[0].geometry.location;\n");
      out.write("\t\t\t\t\t// calling the showMap() function to create and show the map \n");
      out.write("\t\t\t\t\tshowMap();\n");
      out.write("                                        initAutocomplete();\n");
      out.write("\t\t\t\t} else \n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Geocode was not successful for the following reason: \" + status);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("                \n");
      out.write("\t}\n");
      out.write("\t\t\n");
      out.write("\t// creates and shows the map\n");
      out.write("\tfunction showMap()\n");
      out.write("\t{\n");
      out.write("\t\t// center of the map (compute the mean value between the two locations)\n");
      out.write("\t\tlatlng = new google.maps.LatLng((location1.lat()+location2.lat())/2,(location1.lng()+location2.lng())/2);\n");
      out.write("\t\t\n");
      out.write("\t\t// set map options\n");
      out.write("\t\t\t// set zoom level\n");
      out.write("\t\t\t// set center\n");
      out.write("\t\t\t// map type\n");
      out.write("\t\tvar mapOptions = \n");
      out.write("\t\t{\n");
      out.write("\t\t\tzoom: 1,\n");
      out.write("\t\t\tcenter: latlng,\n");
      out.write("\t\t\tmapTypeId: google.maps.MapTypeId.HYBRID\n");
      out.write("\t\t};\n");
      out.write("\t\t\n");
      out.write("\t\t// create a new map object\n");
      out.write("\t\t\t// set the div id where it will be shown\n");
      out.write("\t\t\t// set the map options\n");
      out.write("\t\tmap = new google.maps.Map(document.getElementById(\"map_canvas\"), mapOptions);\n");
      out.write("\t\t\n");
      out.write("\t\t// show route between the points\n");
      out.write("\t\tdirectionsService = new google.maps.DirectionsService();\n");
      out.write("\t\tdirectionsDisplay = new google.maps.DirectionsRenderer(\n");
      out.write("\t\t{\n");
      out.write("\t\t\tsuppressMarkers: true,\n");
      out.write("\t\t\tsuppressInfoWindows: true\n");
      out.write("\t\t});\n");
      out.write("\t\tdirectionsDisplay.setMap(map);\n");
      out.write("\t\tvar request = {\n");
      out.write("\t\t\torigin:location1, \n");
      out.write("\t\t\tdestination:location2,\n");
      out.write("\t\t\ttravelMode: google.maps.DirectionsTravelMode.DRIVING\n");
      out.write("\t\t};\n");
      out.write("                \n");
      out.write("\t\tdirectionsService.route(request, function(response, status) \n");
      out.write("\t\t{\n");
      out.write("\t\t\tif (status == google.maps.DirectionsStatus.OK) \n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tdirectionsDisplay.setDirections(response);\n");
      out.write("\t\t\t\tdistance = \"The distance between the two points on the chosen route is: \"+response.routes[0].legs[0].distance.text;\n");
      out.write("\t\t\t\tdistance += \"<br/>The aproximative driving time is: \"+response.routes[0].legs[0].duration.text;\n");
      out.write("\t\t\t\tdocument.getElementById(\"distance_road\").innerHTML = distance;\n");
      out.write("\t\t\t}\n");
      out.write("                        \n");
      out.write("\t\t});\n");
      out.write("                \n");
      out.write("\t\t\n");
      out.write("\t\t// show a line between the two points\n");
      out.write("\t\tvar line = new google.maps.Polyline({\n");
      out.write("\t\t\tmap: map, \n");
      out.write("\t\t\tpath: [location1, location2],\n");
      out.write("\t\t\tstrokeWeight: 7,\n");
      out.write("\t\t\tstrokeOpacity: 0.8,\n");
      out.write("\t\t\tstrokeColor: \"#FFAA00\"\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// create the markers for the two locations\t\t\n");
      out.write("\t\tvar marker1 = new google.maps.Marker({\n");
      out.write("\t\t\tmap: map, \n");
      out.write("\t\t\tposition: location1,\n");
      out.write("\t\t\ttitle: \"First location\"\n");
      out.write("\t\t});\n");
      out.write("\t\tvar marker2 = new google.maps.Marker({\n");
      out.write("\t\t\tmap: map, \n");
      out.write("\t\t\tposition: location2,\n");
      out.write("\t\t\ttitle: \"Second location\"\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// create the text to be shown in the infowindows\n");
      out.write("\t\tvar text1 = '<div id=\"content\">'+\n");
      out.write("\t\t\t\t'<h1 id=\"firstHeading\"></h1>'+\n");
      out.write("\t\t\t\t'<div id=\"bodyContent\">'+\n");
      out.write("\t\t\t\t'<p></p>'+\n");
      out.write("\t\t\t\t'<p>Address: '+address1+'</p>'+\n");
      out.write("\t\t\t\t'</div>'+\n");
      out.write("\t\t\t\t'</div>';\n");
      out.write("\t\t\t\t\n");
      out.write("\t\tvar text2 = '<div id=\"content\">'+\n");
      out.write("\t\t\t'<h1 id=\"firstHeading\">Second location</h1>'+\n");
      out.write("\t\t\t'<div id=\"bodyContent\">'+\n");
      out.write("\t\t\t'<p>Coordinates: '+location2+'</p>'+\n");
      out.write("\t\t\t'<p>Address: '+address2+'</p>'+\n");
      out.write("\t\t\t'</div>'+\n");
      out.write("\t\t\t'</div>';\n");
      out.write("\t\t\n");
      out.write("\t\t// create info boxes for the two markers\n");
      out.write("\t\tvar infowindow1 = new google.maps.InfoWindow({\n");
      out.write("\t\t\tcontent: text1\n");
      out.write("\t\t});\n");
      out.write("\t\tvar infowindow2 = new google.maps.InfoWindow({\n");
      out.write("\t\t\tcontent: text2\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t// add action events so the info windows will be shown when the marker is clicked\n");
      out.write("\t\tgoogle.maps.event.addListener(marker1, 'click', function() {\n");
      out.write("\t\t\tinfowindow1.open(map,marker1);\n");
      out.write("\t\t});\n");
      out.write("\t\tgoogle.maps.event.addListener(marker2, 'click', function() {\n");
      out.write("\t\t\tinfowindow2.open(map,marker1);\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// compute distance between the two points\n");
      out.write("\t\tvar R = 6371; \n");
      out.write("\t\tvar dLat = toRad(location2.lat()-location1.lat());\n");
      out.write("\t\tvar dLon = toRad(location2.lng()-location1.lng()); \n");
      out.write("\t\t\n");
      out.write("\t\tvar dLat1 = toRad(location1.lat());\n");
      out.write("\t\tvar dLat2 = toRad(location2.lat());\n");
      out.write("\t\t\n");
      out.write("\t\tvar a = Math.sin(dLat/2) * Math.sin(dLat/2) +\n");
      out.write("\t\t\t\tMath.cos(dLat1) * Math.cos(dLat1) * \n");
      out.write("\t\t\t\tMath.sin(dLon/2) * Math.sin(dLon/2); \n");
      out.write("\t\tvar c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); \n");
      out.write("\t\t d = R * c;\n");
      out.write("\t\t d= Math.round(d * 100)/100;\n");
      out.write("\t\t\n");
      out.write("                Cost();\n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("\tfunction toRad(deg) \n");
      out.write("\t{\n");
      out.write("\t\treturn deg * Math.PI/180;\n");
      out.write("\t}\n");
      out.write("        function Cost()\n");
      out.write("        {\n");
      out.write("            var e = document.getElementById(\"sel\");\n");
      out.write("            var strUser = e.options[e.selectedIndex].value;\n");
      out.write("            if(strUser===\"Micro\")\n");
      out.write("            {\n");
      out.write("                var cost=d*3;\n");
      out.write("                cost= Math.round(cost * 100)/100;\n");
      out.write("              document.getElementById(\"cost1\").innerHTML = \"<br/>Estimated Cost is: \"+cost;  \n");
      out.write("            }\n");
      out.write("            if(strUser===\"Sedan\")\n");
      out.write("            {\n");
      out.write("                var cost=d*5;\n");
      out.write("                cost= Math.round(cost * 100)/100;\n");
      out.write("              document.getElementById(\"cost1\").innerHTML = \"<br/>Estimated Cost is: \"+cost;  \n");
      out.write("            }\n");
      out.write("            if(strUser===\"SUV\")\n");
      out.write("            {\n");
      out.write("                var cost=d*10;\n");
      out.write("                cost= Math.round(cost * 100)/100;\n");
      out.write("              document.getElementById(\"cost1\").innerHTML = \"<br/>Estimated Cost is: Rs. \"+cost;  \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body bgcolor=\"#eeeeee\">\n");
      out.write("\t<div id=\"form\" style=\"width:100%; height:20%\">\n");
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
      out.write("                                <td><input type=\"text\" name=\"address1\" id=\"address1\" size=\"50\" placeholder=\"Pickup Address\"/></td>\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t<td>Destination:</td>\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\n");
      out.write("                                <td><input type=\"text\" name=\"address2\" id=\"address2\" size=\"50\" placeholder=\"Destination\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"center\">\n");
      out.write("                                <select id=\"sel\">\n");
      out.write("                                 <option value=\"#\" >Select Vehicle Type</option>\n");
      out.write("                                 <option value=\"Micro\" id=\"micro\">Micro</option>\n");
      out.write("                                 <option value=\"Sedan\" id=\"sedan\">Sedan</option>\n");
      out.write("                                 <option value=\"SUV\" id=\"suv\">SUV</option>\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"7\">&nbsp;</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"7\" align=\"center\"><input type=\"button\" value=\"Show\" onclick=\"initialize();\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<center><div style=\"width:100%; height:10%\" id=\"distance_road\"></div></center>\n");
      out.write("\t<center><div id=\"cost1\" style=\"width:100%; height:10%\"></div></center>\n");
      out.write("        <center><div id=\"booking\" >\n");
      out.write("                <input type=\"button\" onclick=\"\" ></div></center>  \n");
      out.write("\t<center><div id=\"map_canvas\" style=\"width:70%; height:54%\"></div></center>\n");
      out.write("              \n");
      out.write("</body>\n");
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
