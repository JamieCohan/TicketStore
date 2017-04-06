
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String,user:models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.55*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE HTML>
<title>"""),_display_(/*10.9*/title),format.raw/*10.14*/("""</title>

<head>
    <!-- CSS link -->
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/style.css")),format.raw/*14.83*/("""">
    <!-- Bootstrap link -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Javascript link -->
    <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
<link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    <div class="container-fluid" id="nav-top">
        <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                <a href=""""),_display_(/*29.27*/routes/*29.33*/.HomeController.index()),format.raw/*29.56*/(""""> <h1 id="logo">TC <span> Events</span></h1></a>
            </div>
            <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8" id="">
                <!--Search bar-->
                <div class="nav navbar-nav navbar-center" id="search">
                    <form class="navbar-form" role="search">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
                            <div class="input-group-btn">
                                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                            </div>
                        </div>
                    </form>
                </div>
                <!--/Search Bar-->
                <div class="nav navbar-nav navbar-right" id="nav-buttons">
                    """),_display_(/*45.22*/if(user != null)/*45.38*/{_display_(Seq[Any](format.raw/*45.39*/("""
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.HomeController.cart()),format.raw/*46.63*/("""" class="btn btn-success btn-circle btn-lg"><i class="glyphicon glyphicon-shopping-cart"></i></a>
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.LoginController.logout()),format.raw/*47.66*/("""" class="btn btn-success btn-lg round"><span class="glyphicon glyphicon-off"></span>LOGOUT</a>
                        """),_display_(/*48.26*/if(user.getRole.equals("admin"))/*48.58*/ {_display_(Seq[Any](format.raw/*48.60*/("""
                            """),format.raw/*49.29*/("""<div class="dropdown" id="adminOptions">
                                <button class="btn btn-success btn-circle btn-lg" data-toggle="dropdown"><i class="glyphicon glyphicon-cog"></i>Admin Options</button>
                                <ul class="dropdown-menu">
                                    <li><a href=""""),_display_(/*52.51*/routes/*52.57*/.HomeController.addEvent()),format.raw/*52.83*/("""">Add event</a></li>
                                    <li><a href=""""),_display_(/*53.51*/routes/*53.57*/.HomeController.addTicket()),format.raw/*53.84*/("""">Add ticket</a></li>
                                </ul>
                            </div>
                        """)))}),format.raw/*56.26*/("""
                    """)))}/*57.22*/else/*57.26*/{_display_(Seq[Any](format.raw/*57.27*/("""
                        """),format.raw/*58.25*/("""<a href=""""),_display_(/*58.35*/routes/*58.41*/.LoginController.login()),format.raw/*58.65*/("""" class="btn btn-success btn-circle btn-lg"><i class="glyphicon glyphicon-user"></i>Login</a>
                        <a href=""""),_display_(/*59.35*/routes/*59.41*/.HomeController.signUp()),format.raw/*59.65*/("""" class="btn btn-success btn-lg round"><span class="glyphcon glyphicon-pencil"></span>Sign up</a>
                    """)))}),format.raw/*60.22*/("""
                """),format.raw/*61.17*/("""</div>
            </div>
        </div>
        <div id="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="nav-bottom">
                    <a href=""""),_display_(/*67.31*/routes/*67.37*/.HomeController.index),format.raw/*67.58*/("""">HOME</a>
                    <a href=""""),_display_(/*68.31*/routes/*68.37*/.HomeController.events(0)),format.raw/*68.62*/("""">EVENTS</a>
                    <a href=""""),_display_(/*69.31*/routes/*69.37*/.HomeController.aboutUs),format.raw/*69.60*/("""">ABOUT US</a>
                    <a href=""""),_display_(/*70.31*/routes/*70.37*/.HomeController.contact),format.raw/*70.60*/("""">CONTACT US</a>
                </div>
            </div>
        </div>
    </div>

        """),_display_(/*76.10*/content),format.raw/*76.17*/("""

"""),format.raw/*78.1*/("""<div class="container" id = "footer">
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-left">
                <a href=""""),_display_(/*81.27*/routes/*81.33*/.HomeController.index()),format.raw/*81.56*/(""""><h2>TC <span>EVENTS</h2></a>
            </div>
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" id="icon div">
                <a href="#"><i class="fa fa-3x fa-fw fa-instagram text-inverse pull-right" id="icon"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-twitter text-inverse pull-right" id="icon"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-facebook text-inverse pull-right" id="icon"></i></a>
                <a href="http://github.com/ShaneCotter/TicketStore"><i class="fa fa-3x fa-fw fa-github text-inverse pull-right" id="icon"></i></a>
            </div>
        </div>
    </div>
</body>
  
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Apr 06 14:20:04 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/main.scala.html
                  HASH: d06d6dd27023f9c8ef6028b74d04e84ea1961000
                  MATRIX: 1020->260|1168->313|1196->315|1246->339|1272->344|1372->417|1387->423|1450->465|2570->1558|2585->1564|2629->1587|3567->2498|3592->2514|3631->2515|3684->2540|3721->2550|3736->2556|3779->2578|3938->2710|3953->2716|3999->2741|4146->2861|4187->2893|4227->2895|4284->2924|4628->3241|4643->3247|4690->3273|4788->3344|4803->3350|4851->3377|5002->3497|5043->3519|5056->3523|5095->3524|5148->3549|5185->3559|5200->3565|5245->3589|5400->3717|5415->3723|5460->3747|5610->3866|5655->3883|5898->4099|5913->4105|5955->4126|6023->4167|6038->4173|6084->4198|6154->4241|6169->4247|6213->4270|6285->4315|6300->4321|6344->4344|6466->4439|6494->4446|6523->4448|6712->4610|6727->4616|6771->4639
                  LINES: 32->7|37->7|39->9|40->10|40->10|44->14|44->14|44->14|59->29|59->29|59->29|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|79->49|82->52|82->52|82->52|83->53|83->53|83->53|86->56|87->57|87->57|87->57|88->58|88->58|88->58|88->58|89->59|89->59|89->59|90->60|91->61|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|100->70|100->70|100->70|106->76|106->76|108->78|111->81|111->81|111->81
                  -- GENERATED --
              */
          